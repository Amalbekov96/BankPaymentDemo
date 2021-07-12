package com.example.demo.Mapper;

import com.example.demo.Model.Accounts;
import com.example.demo.Model.Dto.AccountsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountsMapper {

    AccountsMapper INSTANCE = Mappers.getMapper(AccountsMapper.class);
    Accounts toAccounts(AccountsDto accountsDto);
    AccountsDto toAccountsDto(Accounts accounts);
}
