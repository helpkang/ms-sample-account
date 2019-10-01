/*
 * Copyright 2011-2019 AsianaIDT Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.koreanair.common_adapter.utils;

import java.beans.Introspector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class JAXBFactory {

	@SuppressWarnings("rawtypes")
	private static Map<Class,JAXBContext> instances = new HashMap<>();

	@SuppressWarnings("rawtypes")
	public static JAXBContext getIntance(Class clazz) throws JAXBException {
		if( !instances.containsKey(clazz)) {
			instances.put(clazz, JAXBContext.newInstance(clazz));
		}
		return instances.get(clazz);
	}

	public static String marshal(Object object, String schemaLocation) throws JAXBException {
		JAXBContext jaxbContext = getIntance(object.getClass());
		Marshaller marshaller = jaxbContext.createMarshaller();
		if (schemaLocation != null) {
			marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, schemaLocation);
		}
		marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8);
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		ByteArrayOutputStream byteArr = new ByteArrayOutputStream();

		marshaller.marshal(object, byteArr);
		return byteArr.toString();
	}

	public static <T> T unmarshal(String param, Class<T> clazz) throws JAXBException {
		InputStream byteArr = new ByteArrayInputStream(param.getBytes());
		JAXBContext jaxbContext = getIntance(clazz);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Reader reader = new InputStreamReader(byteArr, StandardCharsets.UTF_8);
		T ret = (T) jaxbUnmarshaller.unmarshal(reader);
		return ret;
	}

	public static String getObjectToXML(Object obj) throws IOException {
		String str = "";
		if(obj == null) {
			return "";
		}
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
		marshal(obj, out, false);
		str = new String(out.toByteArray(), StandardCharsets.UTF_8);
		out.flush();
		out.close();
		return str;
	}

	public static String getObjectToXML(Object obj,boolean formatted) throws IOException {
		String str = "";
		if(obj == null) {
			return "";
		}
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
		marshal(obj, out, formatted);
		str = new String(out.toByteArray(), StandardCharsets.UTF_8);
		out.flush();
		out.close();
		return str;
	}

    private static String inferName(Class clazz) {
        return Introspector.decapitalize(clazz.getSimpleName());
    }

	public static void marshal( Object jaxbObject, Object xml , Boolean isFormattedOut) {
		try {
			JAXBContext context;
            if(jaxbObject instanceof JAXBElement) {
                context = getIntance(((JAXBElement<?>)jaxbObject).getDeclaredType());
            } else {
                Class<?> clazz = jaxbObject.getClass();
                XmlRootElement r = clazz.getAnnotation(XmlRootElement.class);
                context = getIntance(clazz);
                if(r==null) {
                    // we need to infer the name
                    jaxbObject = new JAXBElement(new QName(inferName(clazz)),clazz,jaxbObject);
                }
            }

			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,isFormattedOut);
			m.marshal(jaxbObject, toResult(xml));
		} catch (JAXBException | IOException e) {
			throw new DataBindingException(e);
		}
	}

	public static Result toResult(Object xml) throws IOException {
		if (xml == null)
			throw new IllegalArgumentException("no XML is given");

		if (xml instanceof String) {
			try {
				xml = new URI((String) xml);
			} catch (URISyntaxException e) {
				xml = new File((String) xml);
			}
		}
		if (xml instanceof File) {
			File file = (File) xml;
			return new StreamResult(file);
		}
		if (xml instanceof URI) {
			URI uri = (URI) xml;
			xml = uri.toURL();
		}
		if (xml instanceof URL) {
			URL url = (URL) xml;
			URLConnection con = url.openConnection();
			con.setDoOutput(true);
			con.setDoInput(false);
			con.connect();
			return new StreamResult(con.getOutputStream());
		}
		if (xml instanceof OutputStream) {
			OutputStream os = (OutputStream) xml;
			return new StreamResult(os);
		}
		if (xml instanceof Writer) {
			Writer w = (Writer) xml;
			return new StreamResult(w);
		}
		if (xml instanceof Result) {
			return (Result) xml;
		}
		throw new IllegalArgumentException("I don't understand how to handle " + xml.getClass());
	}
}

