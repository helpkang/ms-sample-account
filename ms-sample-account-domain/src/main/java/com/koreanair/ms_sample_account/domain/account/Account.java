package com.koreanair.ms_sample_account.domain.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.koreanair.ddd.DomainType;
import com.koreanair.ddd.DomainType.Quality;

import org.hibernate.annotations.BatchSize;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DomainType(Quality.AggregateRoot)
public class Account {
    @Id
    private String name;

    @Column
    private int balance;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(joinColumns=@JoinColumn(name="account_name"), inverseJoinColumns = @JoinColumn(name="transfer_id") )
    @BatchSize(size=10)
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

    public void transfer(Account to, int amount) {
        if( amount <=0){
            throw new RuntimeException("이체금액은 0보다 커야 합니다.");
        }
        if(balance < amount){
            throw new RuntimeException("잔액이 부족합니다.");
        }

        Account from = this;
        
        from.reduceBalance(amount);
        to.incrementBalance(amount);

        Transfer transfer = Transfer.builder().fromName(from.getName()).toName(to.getName()).amount(amount).build();
        from.addTransfer(transfer);
        to.addTransfer(transfer);
    }

	public void addTransfer(Transfer transfer) {
        transfers.add(transfer);
	}

}