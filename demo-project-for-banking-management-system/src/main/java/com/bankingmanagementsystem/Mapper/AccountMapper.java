package com.bankingmanagementsystem.Mapper;

import com.bankingmanagementsystem.DTO.AccountDto;
import com.bankingmanagementsystem.Entity.Accounts;

public class AccountMapper {
    public static Accounts mapToAccount(AccountDto accountDto){
        Accounts account = new Accounts(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );

        return account;
    }
    public static AccountDto mapToAccountDto(Accounts account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
