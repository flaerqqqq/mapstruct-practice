package com.example.demo.basic.mapper;

import com.example.demo.basic.model.domain.Customer;
import com.example.demo.basic.model.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(
        config = BasicMapperConfig.class,
        uses = {
                ContactInfoMapper.class,
                AddressMapper.class,
                AccountMapper.class
        }
)
public interface CustomerMapper {

    CustomerDto toDto(Customer domain);

    Customer toDomain(CustomerDto dto);
}