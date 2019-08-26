package com.koreanair.ms_sample_account.domain.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.koreanair.ddd.DomainType;

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
    private String fromName;

    @Column
    private String toName;

    @Column
    private int amount;

    @Builder
    public Transfer(String fromName, String toName, int amount) {
        this.fromName = fromName;
        this.toName = toName;
        this.amount = amount;
    }

}