package com.koreanair.ms_sample_account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koreanair.ms_sample_account.domain.account.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}