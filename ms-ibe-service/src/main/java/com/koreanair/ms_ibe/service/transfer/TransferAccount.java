package com.koreanair.ms_ibe.service.transfer;

import com.koreanair.ms_ibe.domain.rp.Account;
import com.koreanair.ms_ibe.service.vo.AccountVO;

/**
 * TransferAccount
 */
public final class TransferAccount {

	public static AccountVO accountToAccountVO(Account account) {
        AccountVO accountVO = AccountVO.builder()
        .name(account.getName())
        .balance(account.getBalance())
        .build();
        
        // List<TransferVO> list = account.getTransfers().stream().map(transfer->transferToTransferVO(transfer))
        // .collect(Collectors.toList());
        // accountVO.setTransfers(list);

		return accountVO;
	}
    
    // public static TransferVO transferToTransferVO(Transfer transfer) {
    //     return TransferVO.builder()
    //     .id(transfer.getId())
    //     .fromName(transfer.getFromName())
    //     .toName(transfer.getToName())
    //     .amount(transfer.getAmount())
    //     .build();
    // }
    
}