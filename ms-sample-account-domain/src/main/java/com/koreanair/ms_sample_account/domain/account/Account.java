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
import com.koreanair.ddd.DomainType.Domain;

import org.hibernate.annotations.BatchSize;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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