package com.koreanair.ms_ibe.helper;

import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import com.koreanair.ms_ibe.service.vo.ContactPoint;
import com.koreanair.ms_ibe.service.vo.TicketInformation;
import com.koreanair.ms_ibe.service.vo.VwReservationOutput;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ReservationSearchHelper {
    public VwReservationOutput makeVwReservationOutput(CommonPnrReply reply, CommonTicketReply ticketReply) {
        VwReservationOutput vwReservationOutput = new VwReservationOutput();
        ArrayList<TicketInformation> ticketInformationList = new ArrayList<>();
        ArrayList<TicketInformation> emdTicketInformationList = new ArrayList<>();
        ArrayList<ContactPoint> contactPointList = new ArrayList<>();

        if(CollectionUtils.isNotEmpty(reply.getTicketInformationList())){
            for(com.koreanair.common_adapter.common.vo.TicketInformation adapterTicket : reply.getTicketInformationList()){
                TicketInformation ticket = new TicketInformation();
                BeanUtils.copyProperties(adapterTicket,ticket);
                ticketInformationList.add(ticket);
            }
            vwReservationOutput.setTicketInformationList(ticketInformationList);
        }
        if(CollectionUtils.isNotEmpty(reply.getEmdTicketInformationList())){
            for(com.koreanair.common_adapter.common.vo.TicketInformation adapterTicket : reply.getTicketInformationList()){
                TicketInformation ticket = new TicketInformation();
                BeanUtils.copyProperties(adapterTicket,ticket);
                emdTicketInformationList.add(ticket);
            }
            vwReservationOutput.setEmdTicketInformationList(emdTicketInformationList);
        }
        if(CollectionUtils.isNotEmpty(reply.getContactPointList())){
            for(com.koreanair.common_adapter.common.vo.ContactPoint adapterContact : reply.getContactPointList()){
                ContactPoint contactPoint = new ContactPoint();
                BeanUtils.copyProperties(adapterContact,contactPoint);
                contactPointList.add(contactPoint);
            }
            vwReservationOutput.setContactPointList(contactPointList);
        }
        BeanUtils.copyProperties(reply,vwReservationOutput);

        return vwReservationOutput;
    }
}
