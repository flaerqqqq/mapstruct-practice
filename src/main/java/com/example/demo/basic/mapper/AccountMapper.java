package com.example.demo.basic.mapper;

import com.example.demo.basic.model.domain.Account;
import com.example.demo.basic.model.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(
        config = BasicMapperConfig.class,
        uses = {
                SubscriptionMapper.class
        }
)
public interface AccountMapper {

    AccountDto toDto(Account domain);

    Account toDomain(AccountDto dto);
}