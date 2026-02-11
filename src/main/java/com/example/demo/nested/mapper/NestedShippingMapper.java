package com.example.demo.nested.mapper;

import com.example.demo.nested.model.domain.Shipping;
import com.example.demo.nested.model.dto.ShippingFlatDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        config = NestedMapperConfig.class
)
public interface NestedShippingMapper {

    @Mapping(target = ".", source = "address")
    @Mapping(target = "postalCode", source = "address.zipCode")
    @Mapping(target = "building", ignore = true)
    @Mapping(target = "carrier", source = "meta.carrierCode")
    @Mapping(target = "trackingId", source = "meta.trackingNo")
    @Mapping(target = "shippedAt", source = "meta.shippedTs")
    @Mapping(target = "deliveredAt", source = "meta.deliveredTs")
    ShippingFlatDto toFlatDto(Shipping domain);
}