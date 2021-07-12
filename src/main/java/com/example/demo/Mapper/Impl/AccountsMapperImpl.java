package com.example.demo.Mapper.Impl;

import com.example.demo.Mapper.AccountsMapper;
import com.example.demo.Model.Accounts;
import com.example.demo.Model.Dto.AccountsDto;
import org.springframework.stereotype.Service;


@Service
public class AccountsMapperImpl implements AccountsMapper {

    @Override
    public Accounts toAccounts(AccountsDto accountsDto) {
        Accounts accounts = AccountsMapper.INSTANCE.toAccounts(accountsDto);
        return accounts;
    }

    @Override
    public AccountsDto toAccountsDto(Accounts accounts) {
        AccountsDto accountsDto = AccountsMapper.INSTANCE.toAccountsDto(accounts);
        return accountsDto;
    }
}
