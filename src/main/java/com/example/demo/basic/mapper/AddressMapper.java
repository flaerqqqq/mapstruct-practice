package com.example.demo.basic.mapper;

import com.example.demo.basic.model.domain.Address;
import com.example.demo.basic.model.dto.AddressDto;
import org.mapstruct.Mapper;

@Mapper(
        config = BasicMapperConfig.class
)
public interface AddressMapper {

    AddressDto toDto(Address domain);

    Address toDomain(AddressDto dto);
}