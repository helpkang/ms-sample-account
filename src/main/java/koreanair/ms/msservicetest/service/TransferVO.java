package koreanair.ms.msservicetest.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferVO {

    int id;
    
    private String fromName;

    private String toName;

    private int amount;

    @Builder
    public TransferVO(int id, String fromName, String toName, int amount){
        this.id = id;
        this.fromName = fromName;
        this.toName = toName;
        this.amount = amount;
    }

    public TransferVO(){}

}