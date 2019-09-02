package com.koreanair.ms_sample_account.repository;

import com.koreanair.ms_sample_account.domain.account.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {




}