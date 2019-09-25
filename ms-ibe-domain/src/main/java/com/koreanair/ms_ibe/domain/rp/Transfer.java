package com.koreanair.ms_ibe.domain.rp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.koreanair.common.ddd.DomainType;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DomainType
@Data
public class Transfer {
    @Id
	@GeneratedValue
	int id;

    @Column
    private int amount;

    @Column(nullable = false)
    private String fromAccount;
    
    @Column(nullable = false)
    private String toAccount;

    @Builder
    public Transfer(String fromAccount, String toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

}