package com.koreanair.common_adapter.pid.gps.connector;

import com.kal.framework.integration.adaptor.WebServiceVo;
import com.kal.framework.integration.adaptor.support.UrlConnectionImpl;
import com.koreanair.common_adapter.pid.connector.PidAbstractConnector;
import com.koreanair.common_adapter.pid.vo.PidInputVo;

import javax.xml.bind.JAXBException;

public class GpsConnectorImpl extends PidAbstractConnector {

    @Override
    public Object call(PidInputVo vo) throws Exception {
        UrlConnectionImpl impl = new UrlConnectionImpl();
        WebServiceVo inputVo = getWebServiceVo(vo);
        String response = impl.call(inputVo);
        return getResponseObject(response, vo.getResponseClass());
    }

    private WebServiceVo getWebServiceVo(PidInputVo vo) throws JAXBException {
        WebServiceVo inputVo = getPidCommon(vo);
        inputVo.setHost(tempPropertyMap.get("gps.host"));
        inputVo.setRequestMethod("POST");
        inputVo.setMustUnderstand("0");
        inputVo.setHeaderType(4);
        return inputVo;
    }
}
