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
        alteainput.setResponseClass(PNRReply.class);
        AlteaConnector adapter = new AlteaConnector();
        PNRReply reply = (PNRReply) adapter.call(alteainput);
        return PnrRetrieveHelper.makeRetrievePNROutput(reply);
    }
}
