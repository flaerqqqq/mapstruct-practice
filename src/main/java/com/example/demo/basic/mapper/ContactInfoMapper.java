package com.example.demo.basic.mapper;

import com.example.demo.basic.model.domain.ContactInfo;
import com.example.demo.basic.model.dto.ContactInfoDto;
import org.mapstruct.Mapper;

@Mapper(
        config = BasicMapperConfig.class
)
public interface ContactInfoMapper {

    ContactInfoDto toDto(ContactInfo domain);

    ContactInfo toDomain(ContactInfoDto dto);
}