package com.koreanair.common_adapter.altea;

import com.koreanair.common_adapter.altea.connector.AlteaConnector;
import com.koreanair.common_adapter.altea.helper.pnr_retrieve_13_2_1a.RetrievePnrInputHelper;
import com.koreanair.common_adapter.altea.vo.AlteaInputVo;
import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.external.altea.vo.pnr_reply_13_2_1a.PNRReply;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.PNRRetrieve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RetrievePnrAdapter {

    @Autowired
    private RetrievePnrInputHelper retrievePnrHelper;

    @Autowired
    private AlteaConnector connector;


    public CommonPnrReply retrievePnr(String recLoc, boolean stateful)throws Exception{
        PNRRetrieve pnrinput =  retrievePnrHelper.makeRetrievePNRInput(recLoc);
        AlteaInputVo alteainput = new AlteaInputVo();
        alteainput.setInputBody(pnrinput);
        alteainput.setOperationName("PNR_Retrieve");
        alteainput.setResponseClass(PNRReply.class);
        PNRReply reply = (PNRReply) connector.call(alteainput);
        return retrievePnrHelper.makeRetrievePNROutput(reply);
    }
}