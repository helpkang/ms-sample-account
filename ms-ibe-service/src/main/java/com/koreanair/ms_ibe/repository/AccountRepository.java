package com.koreanair.ms_ibe.repository;


import com.koreanair.ms_ibe.domain.rp.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {




}