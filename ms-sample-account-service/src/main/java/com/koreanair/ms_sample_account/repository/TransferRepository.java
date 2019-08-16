package com.koreanair.ms_sample_account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koreanair.ms_sample_account.domain.account.Transfer;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
    List<Transfer> findByFromNameOrToName(String fromName, String toName);
}