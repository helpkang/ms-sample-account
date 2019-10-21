package com.koreanair.common_adapter.pid.gps.connector;

import com.kal.framework.integration.adaptor.WebServiceVo;
import com.kal.framework.integration.adaptor.support.UrlConnectionImpl;
import com.koreanair.common_adapter.pid.vo.PidInputVo;
import com.koreanair.common_adapter.utils.JAXBFactory;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo2;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

@Component
public class PidConnector {
    public Object call(PidInputVo vo) throws Exception {
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

    private WebServiceVo getWebServiceVo(PidInputVo vo) throws JAXBException {
        WebServiceVo inputVo = new WebServiceVo();
        String xmlBody = getXmlBody(vo);
        inputVo.setBodyXml(xmlBody);
        inputVo.setOperationName(vo.getOperationName());
        inputVo.setHost(tempPropertyMap.get("gps.host"));
        inputVo.setHeaderType(4);

        inputVo.setPipuserName(tempPropertyMap.get("pip.userName"));
        inputVo.setPippassWord(tempPropertyMap.get("pip.pwd"));
        inputVo.setPiprequestSystem(tempPropertyMap.get(""));
        inputVo.setRequestMethod("POST");
        inputVo.setMustUnderstand("0");
        inputVo.setGuid(tempPropertyMap.get("guid"));
        inputVo.setSoapAction(tempPropertyMap.get("pip.pid.soapaction.url")  + "/" + tempPropertyMap.get(vo.getOperationName()));
        return inputVo;
    }

    private String getXmlBody(PidInputVo vo) throws JAXBException {
        return JAXBFactory.marshal(vo.getInputBody(), null);
    }

    public static void main(String[] args) throws Exception {
        PidInputVo vo = new PidInputVo();
        vo.setHost("gps.direct.host");
        vo.setOperationName("gps.approvalRequest");
        vo.setResponseClass(GeneralInfo2.class);
        PidConnector connector = new PidConnector();
        GeneralInfo2 output = (GeneralInfo2) connector.call(vo);

    }
    Map<String, String> tempPropertyMap = new HashMap<String, String>() {{
        put("gps.host", "http://gpsdev.koreanair.com/GPS.SRV.WS01/V1_01");
        put("gps.approvalRequest", "GPS_Approval_Request_1_01");
        put("pip.pid.soapaction.url", "http://pip.koreanair.com");

        put("pip.userName", "IBE");
        put("pip.pwd", "aWJLcGLkcGFzc3dvcmQzNtc5");
        put("guid", "http://pip.koreanair.com");
    }};
}
