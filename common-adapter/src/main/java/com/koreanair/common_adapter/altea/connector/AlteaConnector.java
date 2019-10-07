package com.koreanair.common_adapter.altea.connector;

import com.kal.framework.integration.adaptor.WebServiceVo;
import com.kal.framework.integration.adaptor.support.UrlConnectionImpl;
import com.koreanair.common_adapter.altea.vo.AlteaInputVo;
import com.koreanair.common_adapter.utils.JAXBFactory;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.Map;

@Component
public class AlteaConnector {
    public  String call(AlteaInputVo vo) throws Exception {
        UrlConnectionImpl impl = new UrlConnectionImpl();
        WebServiceVo inputVo = getWebServiceVo(vo);
        return impl.call(inputVo);
    }

    private  WebServiceVo getWebServiceVo(AlteaInputVo vo) throws JAXBException {
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

    Map<String, String> tempPropertyMap  = new HashMap<String, String>() {{
        put("altea.host", "amadeus.altea.host");
        put("altea.wsap", "1ASIWGENKEU");
        put("officeId", "SELKE08IW");
    }};
}
