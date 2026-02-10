package com.example.demo.basic.mapper;

import com.example.demo.basic.model.domain.Subscription;
import com.example.demo.basic.model.dto.SubscriptionDto;
import org.mapstruct.Mapper;

@Mapper(
        config = BasicMapperConfig.class
)
public interface SubscriptionMapper {

    SubscriptionDto toDto(Subscription domain);

    Subscription toDomain(SubscriptionDto dto);
}