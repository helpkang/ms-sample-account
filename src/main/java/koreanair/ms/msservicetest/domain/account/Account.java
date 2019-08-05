package koreanair.ms.msservicetest.domain.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Account {
    @Id
    private String name;

    @Column
    private int balance;

 
    @Setter
    @Transient
    List<Transfer> transfers = new ArrayList<>();
  
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

    public Transfer transfer(Account to, int amount) {
        if( amount <=0){
            throw new RuntimeException("이체금액은 0보다 커야 합니다.");
        }
        if(balance < amount){
            throw new RuntimeException("잔액이 부족합니다.");
        }
        
        this.reduceBalance(amount);
        to.incrementBalance(amount);

        return Transfer.builder().fromName(name).toName(to.name).amount(amount).build();
    }

}