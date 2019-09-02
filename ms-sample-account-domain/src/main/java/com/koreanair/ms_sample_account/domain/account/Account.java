package com.koreanair.ms_sample_account.domain.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.koreanair.ddd.DomainType;
import com.koreanair.ddd.DomainType.Domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DomainType(Domain.AggregateRoot)
@Data
public class Account {
    @Id
    private String name;

    @Column
    private int balance;

    // @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinTable(joinColumns=@JoinColumn(name="account_name"), inverseJoinColumns = @JoinColumn(name="transfer_id") )
    // @BatchSize(size=10)
    // @EqualsAndHashCode.Exclude
    // @ToString.Exclude
    // List<Transfer> transfers = new ArrayList<>();
  
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


}