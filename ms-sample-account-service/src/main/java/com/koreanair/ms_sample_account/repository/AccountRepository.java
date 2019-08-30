package com.koreanair.ms_sample_account.repository;

import com.koreanair.ms_sample_account.domain.account.Account;
import com.koreanair.ms_sample_account.domain.account.Transfer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, String> {


    @Query( ""
        +"select transfer from Account account inner join account.transfers transfer where account = :account"
    )
    public Page<Transfer> findBy(@Param("account") Account parent, Pageable pageable);

}