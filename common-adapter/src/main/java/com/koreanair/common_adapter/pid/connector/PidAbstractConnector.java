package com.koreanair.common_adapter.pid.connector;

import com.kal.framework.integration.adaptor.WebServiceVo;
import com.koreanair.common.utils.JAXBFactory;
import com.koreanair.common_adapter.pid.vo.PidInputVo;
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
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public abstract class PidAbstractConnector implements PidConnector {

    protected Object getResponseObject(String response, Class<?> responseClass) throws Exception {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8)));
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

    protected WebServiceVo getPidCommon(PidInputVo vo) throws JAXBException {
        WebServiceVo inputVo = new WebServiceVo();
        String xmlBody = getXmlBody(vo);

        inputVo.setOperationName(vo.getOperationName());
        inputVo.setBodyXml(xmlBody);
        inputVo.setPipuserName(tempPropertyMap.get("pip.userName"));
        inputVo.setPippassWord(tempPropertyMap.get("pip.pwd"));
        inputVo.setPiprequestSystem(tempPropertyMap.get(""));
        inputVo.setGuid(tempPropertyMap.get("guid"));
        inputVo.setSoapAction(tempPropertyMap.get("pip.pid.soapaction.url")  + "/" + tempPropertyMap.get(vo.getOperationName()));
        return inputVo;
    }

    private String getXmlBody(PidInputVo vo) throws JAXBException {
        return JAXBFactory.marshal(vo.getInputBody(), null);
    }

    protected Map<String, String> tempPropertyMap = new HashMap<String, String>() {{
        //  pid host
        put("gps.host", "http://gpsdev.koreanair.com/GPS.SRV.WS01/V1_01");
        put("ods.host", "http://pipstg.koreanair.com/PAPODWPID01/V1_01");
        put("sss.host", "http://pipstg.koreanair.com/PAPPIWPID01/V1_01");

        //  pid operation
        put("gps.approvalRequest", "GPS_Approval_Request_1_01");
        put("ods.PNR_ListIbe", "PnrListIbe_Retrieve_01_1");
        put("sss.searchMemberInfo", "Search_MemberInfo_1_0");

        put("pip.pid.soapaction.url", "http://pip.koreanair.com");

        put("pip.userName", "WSKEIBE");
        put("pip.pwd", "aWJlcGlwcGFzc3dvcmQyNDY4");
        put("guid", "http://pip.koreanair.com");
    }};
}
