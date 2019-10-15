package com.koreanair.common_adapter.altea.helper.ticket_processedoc_12_2_1a;

import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import com.koreanair.external.altea.vo.ticket_processedoc_12_1_1a.*;
import com.koreanair.external.altea.vo.ticket_processedocreply_12_1_1a.TicketProcessEDocReply;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketProcessEdocHelper {

    public static TicketProcessEDoc makeTicketProcessEDocInput(List<String> ticketList) {
        TicketProcessEDoc input = new TicketProcessEDoc();
        MessageActionDetailsTypeI messageActionDetailsTypeI = new MessageActionDetailsTypeI();
        MessageFunctionBusinessDetailsTypeI messageFunctionBusinessDetailsTypeI = new MessageFunctionBusinessDetailsTypeI();
        messageFunctionBusinessDetailsTypeI.setMessageFunction("131");
        messageActionDetailsTypeI.setMessageFunctionDetails(messageFunctionBusinessDetailsTypeI);
        input.setMsgActionDetails(messageActionDetailsTypeI);
        List<TicketProcessEDoc.InfoGroup> infoGroupList = input.getInfoGroup();
        for (String ticketInfo : ticketList) {
            TicketProcessEDoc.InfoGroup infoGroup = new TicketProcessEDoc.InfoGroup();
            TicketNumberTypeI ticketNumberTypeI = new TicketNumberTypeI();
            TicketNumberDetailsTypeI ticketNumberDetailsTypeI = new TicketNumberDetailsTypeI();
            ticketNumberDetailsTypeI.setNumber(ticketInfo.replaceAll("-", ""));
            ticketNumberTypeI.setDocumentDetails(ticketNumberDetailsTypeI);
            infoGroup.setDocInfo(ticketNumberTypeI);
            infoGroupList.add(infoGroup);
        }
        return input;
    }

    public static void main(String[] args) {

    }

    public CommonTicketReply makeTicketProcessEDocOutput(TicketProcessEDocReply reply) {
        CommonTicketReply output = new CommonTicketReply();

        return output;
    }
}
