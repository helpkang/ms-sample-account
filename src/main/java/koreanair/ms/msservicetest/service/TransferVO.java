package koreanair.ms.msservicetest.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferVO {

    int id;
    
    private String fromName;

    private String toName;

    private int amount;

}