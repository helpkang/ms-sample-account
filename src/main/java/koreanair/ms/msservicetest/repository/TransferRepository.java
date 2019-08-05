package koreanair.ms.msservicetest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import koreanair.ms.msservicetest.domain.account.Transfer;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
    List<Transfer> findByFromNameOrToName(String fromName, String toName);
}