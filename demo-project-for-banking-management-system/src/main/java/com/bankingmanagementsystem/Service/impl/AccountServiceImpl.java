package com.bankingmanagementsystem.Service.impl;

import com.bankingmanagementsystem.DTO.AccountDto;
import com.bankingmanagementsystem.Entity.Accounts;
import com.bankingmanagementsystem.Mapper.AccountMapper;
import com.bankingmanagementsystem.Repository.AccountRepository;
import com.bankingmanagementsystem.Service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Accounts account = AccountMapper.mapToAccount(accountDto);
        Accounts savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
