package com.koreanair.common_adapter.altea;

import com.koreanair.common_adapter.altea.connector.AlteaConnector;
import com.koreanair.common_adapter.altea.helper.pnr_retrieve_13_2_1a.PnrRetrieveHelper;
import com.koreanair.common_adapter.altea.vo.AlteaInputVo;
import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.common_adapter.utils.JAXBFactory;
import com.koreanair.external.altea.vo.pnr_reply_13_2_1a.PNRReply;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.PNRRetrieve;
import org.springframework.stereotype.Component;

@Component
public class RetrievePnrAdapter {

    public CommonPnrReply retrievePnr(String recLoc)throws Exception{
        PNRRetrieve pnrinput =  PnrRetrieveHelper.makeRetrievePNRInput("K2MLCB");
        AlteaInputVo alteainput = new AlteaInputVo();
        alteainput.setInputBody(pnrinput);
        alteainput.setOperationName("PNR_Retrieve");
        AlteaConnector adapter = new AlteaConnector();
        String result = adapter.call(alteainput);
        result = result.substring(result.indexOf("<soapenv:Body>")+14);
        result = result.substring(0,result.indexOf("</soapenv:Body>"));
        System.out.println(result);
        PNRReply reply = JAXBFactory.unmarshal(result,PNRReply.class);
        return PnrRetrieveHelper.makeRetrievePNROutput(reply);
    }

}
