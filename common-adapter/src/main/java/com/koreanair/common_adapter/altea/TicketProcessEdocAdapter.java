package com.koreanair.common_adapter.altea;

import com.koreanair.common_adapter.altea.connector.AlteaConnector;
import com.koreanair.common_adapter.altea.helper.ticket_processedoc_12_2_1a.TicketProcessEdocHelper;
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
    private TicketProcessEdocHelper ticketProcessEdocHelper;

    public CommonTicketReply ticketProcessEdoc(ArrayList<String> ticketList, boolean stateful)throws Exception{
        TicketProcessEDoc ticketinput = ticketProcessEdocHelper.makeTicketProcessEDocInput(ticketList);
        AlteaInputVo alteainput = new AlteaInputVo();
        alteainput.setInputBody(ticketinput);
        alteainput.setOperationName("TicketProcess_Edoc");
        alteainput.setResponseClass(TicketProcessEDocReply.class);
        AlteaConnector adapter = new AlteaConnector();
        TicketProcessEDocReply reply = (TicketProcessEDocReply) adapter.call(alteainput);
        CommonTicketReply output = ticketProcessEdocHelper.makeTicketProcessEDocOutput(reply);
        return output;
    }
}