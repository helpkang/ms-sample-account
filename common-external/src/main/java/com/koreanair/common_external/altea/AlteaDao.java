package com.koreanair.common_external.altea;

import com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a.PNRReply;
import com.koreanair.common_external.altea.vo.pnr_retrieve_13_2_1a.PNRRetrieve;
import com.koreanair.common_external.altea.vo.ticket_processedoc_12_1_1a.TicketProcessEDoc;
import com.koreanair.common_external.altea.vo.ticket_processedocreply_12_1_1a.TicketProcessEDocReply;



public class AlteaDao {

    /**
     * PNR_Retrieve
     * @param input
     * @return
     * @throws Exception
     */
    public PNRReply pnrRetrieve(PNRRetrieve input) throws Exception{
        /*
        WebServiceInputVo inputVo = new WebServiceInputVo();
        inputVo.setOperationName("PNR_Retrieve");
        inputVo.setOutputServiceName("PNR_Reply");
        inputVo.setInputBody(input);
        inputVo.setOverride(false);
        WebServiceOutput output = alteaDelegator.callStateless(inputVo);
        PNRReply altea1A = output.getAlteaBodyMsg(PNRReply.class);
        return altea1A;
        */
        return null;
    }

    public PNRReply pnrRetrieveStateful(PNRRetrieve input) throws Exception{
        /*
        WebServiceInputVo inputVo = new WebServiceInputVo();
        inputVo.setOperationName("PNR_Retrieve");
        inputVo.setOutputServiceName("PNR_Reply");
        inputVo.setInputBody(input);
        inputVo.setOverride(false);
        WebServiceOutput output = alteaDelegator.callStateful(inputVo);
        PNRReply altea1A = output.getAlteaBodyMsg(PNRReply.class);
        return altea1A;
        */
        return null;
    }
    /**
     * 티겟 조회
     * @param input
     * @return
     * @throws Exception
     */
    public TicketProcessEDocReply ticketProcessEDoc(TicketProcessEDoc input) throws Exception {
        /*
        WebServiceInputVo inputVo = new WebServiceInputVo();
        inputVo.setOperationName("Ticket_ProcessEDoc");
        inputVo.setOutputServiceName("Ticket_ProcessEDocReply");
        inputVo.setInputBody(input);
        inputVo.setOverride(false);
        WebServiceOutput output = alteaDelegator.callStateless(inputVo);
        TicketProcessEDocReply altea1A = output.getAlteaBodyMsg(TicketProcessEDocReply.class);
        return altea1A;
        */
        return null;
    }

    public TicketProcessEDocReply ticketProcessEDocStateful(TicketProcessEDoc input) throws Exception {
        /*
        WebServiceInputVo inputVo = new WebServiceInputVo();
        inputVo.setOperationName("Ticket_ProcessEDoc");
        inputVo.setOutputServiceName("Ticket_ProcessEDocReply");
        inputVo.setInputBody(input);
        inputVo.setOverride(false);
        WebServiceOutput output = alteaDelegator.callStateful(inputVo);
        TicketProcessEDocReply altea1A = output.getAlteaBodyMsg(TicketProcessEDocReply.class);
        return altea1A;
         */
        return null;
    }


}
