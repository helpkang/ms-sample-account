package koreanair.ms.msservicetest.domain.account;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Account {
    @Id
    private String name;

    @Column
    private int balance;

    @Builder
    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public void incrementBalance(int ammount){
        balance += ammount;
    }

    public void reduceBalance(int ammount){
        balance -= ammount;
    }

    public void transfer(Account to, int ammount){
        if( ammount <=0){
            throw new RuntimeException("이체금액은 0보다 커야 합니다.");
        }
        if(balance < ammount){
            throw new RuntimeException("잔액이 부족합니다.");
        }
        this.reduceBalance(ammount);
        to.incrementBalance(ammount);
    }

}