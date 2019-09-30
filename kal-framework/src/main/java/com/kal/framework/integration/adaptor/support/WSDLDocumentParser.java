package com.kal.framework.integration.adaptor.support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.wsdl.Definition;
import javax.wsdl.Operation;
import javax.wsdl.PortType;
import javax.wsdl.WSDLException;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.xml.namespace.QName;

/**
 * WSDL Document Parser.
 * 
 * @author 조인호
 * @version 1.0
 * @since 2012-03-23
 */
public class WSDLDocumentParser {

	private Map<String,String> namespaceMap;
	private Map<String,String> serviceInfoMap;
	private Map<String,String> portInfoMap;
	private Map<String,ArrayList> operationInfoMap;
	
	public void wsdlParse(String _wsdlUrl){
		// first get the definition object got the WSDL impl
		try{
			WSDLFactory factory = WSDLFactory.newInstance();
	        WSDLReader reader = factory.newWSDLReader();
	        Definition def = reader.readWSDL(_wsdlUrl);
	        
	        /** Extract Namespace Info from WSDL URL*/
	        Map namespaces = def.getNamespaces();
	        for (Iterator iter = namespaces.keySet().iterator(); iter.hasNext();) {
	        	 String uri = (String)iter.next();
	        	 namespaceMap.put(uri, (String)namespaces.get(uri));
	        }
	        
	        /** Extract Service Info from WSDL URL */ 
	        Map svcInfo = def.getServices();
	        for (Iterator iter = svcInfo.keySet().iterator(); iter.hasNext();) {
	        	QName qName = (QName)iter.next();
	        	serviceInfoMap.put(qName.getLocalPart(), qName.getNamespaceURI());
	        }
	        
	        /** Extract Port Info from WSDL URL */
	        Map portTypes = def.getPortTypes();
	        for (Iterator iter = portTypes.keySet().iterator(); iter.hasNext();) {
	            QName qName = (QName) iter.next();
	            portInfoMap.put(qName.getLocalPart(), qName.getNamespaceURI());
	            PortType portType = (PortType) portTypes.get(qName);

	            /** Extract Operation Info from Port info */
	            List operations = portType.getOperations();
	            ArrayList operationInfo = new ArrayList();
	            for (Iterator iterator = operations.iterator(); iterator.hasNext();) {
	                Operation operation = (Operation) iterator.next();
	                operationInfo.add(operation.getName());
	            }
	            operationInfoMap.put(qName.getLocalPart(), operationInfo);
	        }
		}catch(WSDLException e){
			e.printStackTrace();
		}
	}
}