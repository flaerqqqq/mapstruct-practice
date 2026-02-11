package com.example.demo.rename.mapper;

import com.example.demo.rename.model.domain.LegacyOrderRow;
import com.example.demo.rename.model.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        config = RenameMapperConfig.class
)
public interface OrderRenameMapper {

    @Mapping(source = "id", target = "orderUuid")
    @Mapping(source = "customerId", target = "custUuid")
    @Mapping(source = "createdAt", target = "crtTs")
    @Mapping(source = "updatedAt", target = "updTs")
    @Mapping(source = "paidAt", target = "payTs")
    @Mapping(source = "shippedAt", target = "shipTs")
    @Mapping(source = "total", target = "totalAmt")
    @Mapping(source = "currency", target = "currencyIso")
    @Mapping(source = "coupon", target = "promoCode")
    @Mapping(source = "paymentMethod", target = "payMethodCode")
    @Mapping(source = "shippingMethod", target = "shipMethodCode")
    @Mapping(source = "deliveryStreet", target = "addrLine")
    @Mapping(source = "deliveryCity", target = "addrCity")
    @Mapping(source = "deliveryPostalCode", target = "addrZip")
    @Mapping(source = "internalNote", target = "notesInternal")
    LegacyOrderRow toDomain(OrderDto dto);
}