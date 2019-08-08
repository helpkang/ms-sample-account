package koreanair.ms.msservicetest.service;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountVO {

    private String name;


    private int balance;

    List<TransferVO> transfers = new ArrayList<>();
}