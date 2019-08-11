package koreanair.ms.msservicetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import koreanair.ms.msservicetest.domain.account.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}