package com.koreanair.ms_ibe.repository;

import com.koreanair.ms_ibe.domain.rp.Transfer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
    // @Query( ""
    //     +"select transfer from Account account inner join account.transfers transfer where account = :account"
    // )
    // public Page<Transfer> findBy(@Param("account") Account parent, Pageable pageable);


    @Query( ""
        +"select transfer from Transfer transfer where transfer.fromAccount = :account or transfer.toAccount = :account "
    )
    public Page<Transfer> findByFromAccount(
        @Param("account") String account, 
        Pageable pageable); 
        
}