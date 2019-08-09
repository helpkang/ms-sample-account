package koreanair.ms.msservicetest.service;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountVO {

    private String name;


    private int balance;

    List<TransferVO> transfers = new ArrayList<>();

    @Builder
    public AccountVO(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

}