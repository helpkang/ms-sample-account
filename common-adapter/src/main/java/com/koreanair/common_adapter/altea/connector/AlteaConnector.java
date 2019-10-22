package com.koreanair.common_adapter.altea.connector;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import com.kal.framework.integration.adaptor.WebServiceVo;
import com.kal.framework.integration.adaptor.support.UrlConnectionImpl;
import com.koreanair.common.utils.JAXBFactory;
import com.koreanair.common_adapter.altea.vo.AlteaInputVo;

@Component
public class AlteaConnector {
    public Object call(AlteaInputVo vo) throws Exception {
        UrlConnectionImpl impl = new UrlConnectionImpl();
        WebServiceVo inputVo = getWebServiceVo(vo);
        String response = impl.call(inputVo);
        return getResponseObject(response, vo.getResponseClass());
    }

    private Object getResponseObject(String response, Class<?> responseClass) throws Exception {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(response.getBytes(Charset.forName("UTF-8"))));
        Document document = message.getSOAPBody().extractContentAsDocument();
        String responseMsg = convertDocumentToString(document);
        return JAXBFactory.unmarshal(responseMsg, responseClass);
    }

    private String convertDocumentToString(Document doc) {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer;

        try {
            transformer = tf.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
            String output = writer.getBuffer().toString();
            return output;
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return null;
    }

    private WebServiceVo getWebServiceVo(AlteaInputVo vo) throws JAXBException {
        WebServiceVo inputVo = new WebServiceVo();
        String xmlBody = JAXBFactory.marshal(vo.getInputBody(), null);
        inputVo.setBodyXml(xmlBody);
        inputVo.setOperationName(vo.getOperationName());

        inputVo.setHost(tempPropertyMap.get("altea.host"));
        inputVo.setHeaderType(1);
        inputVo.setWsap(tempPropertyMap.get("altea.wsap"));
        inputVo.setPipSourceofficeId(tempPropertyMap.get("officeId"));
        inputVo.setRequestMethod("POST");
        return inputVo;
    }

    Map<String, String> tempPropertyMap = new HashMap<String, String>() {{
        put("altea.host", "amadeus.altea.host");
        put("altea.wsap", "1ASIWGENKEU");
        put("officeId", "SELKE08IW");
    }};
}
