package com.koreanair.ms_ibe.repository;

import com.koreanair.common_adapter.altea.RetrievePnrAdapter;
import com.koreanair.common_adapter.altea.connector.AlteaConnector;
import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import java.io.IOException;


@Repository
public class AlteaRepository {

    @Autowired
    private RetrievePnrAdapter pnrAdapter;

    public CommonPnrReply reservationSearch(String recLoc, boolean stateful) throws Exception {
        CommonPnrReply reply = pnrAdapter.retrievePnr(recLoc, stateful);
        return reply;
    }

}