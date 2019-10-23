package com.koreanair.common_adapter.altea;

import com.koreanair.common_adapter.altea.connector.AlteaConnector;
import com.koreanair.common_adapter.altea.helper.ticket_processedoc_12_2_1a.TicketProcessEdocInputHelper;
import com.koreanair.common_adapter.altea.helper.ticket_processedoc_12_2_1a.TicketProcessEdocReplyHelper;
import com.koreanair.common_adapter.altea.vo.AlteaInputVo;
import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import com.koreanair.external.altea.vo.ticket_processedoc_12_1_1a.TicketProcessEDoc;
import com.koreanair.external.altea.vo.ticket_processedocreply_12_1_1a.TicketProcessEDocReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class TicketProcessEdocAdapter {

    @Autowired
    private TicketProcessEdocInputHelper ticketProcessEdocHelper;
    @Autowired
    private TicketProcessEdocReplyHelper ticketProcessEdocReplyHelper;

    public CommonTicketReply ticketProcessEdoc(ArrayList<String> ticketList, boolean stateful)throws Exception{
        TicketProcessEDoc ticketinput = ticketProcessEdocHelper.makeTicketProcessEDocInput(ticketList);
        AlteaInputVo alteainput = new AlteaInputVo();
        alteainput.setInputBody(ticketinput);
        alteainput.setOperationName("TicketProcess_Edoc");
        alteainput.setResponseClass(TicketProcessEDocReply.class);
        AlteaConnector connector = new AlteaConnector();
        TicketProcessEDocReply reply = (TicketProcessEDocReply) connector.call(alteainput);
        CommonTicketReply output = ticketProcessEdocReplyHelper.makeTicketProcessEDocOutput(reply);
        return output;
    }
}