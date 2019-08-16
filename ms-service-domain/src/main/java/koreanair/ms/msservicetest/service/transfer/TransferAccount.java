package koreanair.ms.msservicetest.service.transfer;

import java.util.List;
import java.util.stream.Collectors;

import koreanair.ms.msservicetest.domain.account.Account;
import koreanair.ms.msservicetest.domain.account.Transfer;
import koreanair.ms.msservicetest.service.vo.AccountVO;
import koreanair.ms.msservicetest.service.vo.TransferVO;

/**
 * TransferAccount
 */
public final class TransferAccount {

	public static AccountVO accountToAccountVO(Account account) {
        AccountVO accountVO = AccountVO.builder()
        .name(account.getName())
        .balance(account.getBalance())
        .build();
        
        List<TransferVO> list = account.getTransfers().stream().map(transfer->transferToTransferVO(transfer))
        .collect(Collectors.toList());
        accountVO.setTransfers(list);

		return accountVO;
	}
    
    public static TransferVO transferToTransferVO(Transfer transfer) {
        return TransferVO.builder()
        .id(transfer.getId())
        .fromName(transfer.getFromName())
        .toName(transfer.getToName())
        .amount(transfer.getAmount())
        .build();
    }
    
}