package com.example.demo.nested.mapper;

import com.example.demo.nested.model.domain.Audit;
import com.example.demo.nested.model.domain.OrderAggregate;
import com.example.demo.nested.model.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        config = NestedMapperConfig.class
)
public interface NestedOrderMapper {

    @Mapping(source = "createdTs", target = "createdAt")
    @Mapping(source = "customer.firstName", target = "customer.name.given")
    @Mapping(source = "customer.lastName", target = "customer.name.family")
    @Mapping(target = "customer.name.full", ignore = true)
    @Mapping(source = "customer.contactInfo.email", target = "customer.contact.email")
    @Mapping(source = "customer.contactInfo.phone", target = "customer.contact.phoneNumber")
    @Mapping(source = "shipping.meta.carrierCode", target = "shipping.shipment.carrier")
    @Mapping(source = "shipping.meta.trackingNo", target = "shipping.shipment.trackingId")
    @Mapping(source = "shipping.meta.shippedTs", target = "shipping.shipment.shippedAt")
    @Mapping(source = "shipping.meta.deliveredTs", target = "shipping.shipment.deliveredAt")
    @Mapping(source = "billing.money.currencyIso", target = "billing.money.currency")
    @Mapping(source = "billing.money.totalCents", target = "billing.money.cents")
    @Mapping(source = "billing.payment.methodCode", target = "billing.payment.method")
    @Mapping(source = "billing.payment.invoiceNo", target = "billing.payment.invoiceId")
    @Mapping(source = "audit.createdByLogin", target = "meta.created.login")
    @Mapping(source = "audit.createdAt", target = "meta.created.at")
    @Mapping(source = "audit.updatedByLogin", target = "meta.updated.login")
    @Mapping(source = "audit.updatedAt", target = "meta.updated.at")
    @Mapping(source = "audit.createdAt", target = "meta.auditCreatedAt")
    OrderDto toDto(OrderAggregate domain);


    @Mapping(target = "first", source = "order.customer.firstName")
    @Mapping(target = "last", source = "order.customer.lastName")
    @Mapping(target = "mail", source = "order.customer.contactInfo.email")
    @Mapping(target = "phone", source = "order.customer.contactInfo.phone")
    @Mapping(target = "countryIso", source = "order.shipping.address.country")
    @Mapping(target = "cityName", source = "order.shipping.address.city")
    @Mapping(target = "zip", source = "order.shipping.address.zipCode")
    @Mapping(target = "streetLine", source = "order.shipping.address.street")
    @Mapping(target = "houseNo", ignore = true)
    @Mapping(target = "currencyIso", source = "order.billing.money.currencyIso")
    @Mapping(target = "totalCents", source = "order.billing.money.totalCents")
    @Mapping(target = "createdAt", source = "audit.createdAt")
    OrderMergeDto toMergeDto(OrderAggregate order, Audit audit);


    @Mapping(target = "billing", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdTs", ignore = true)
    @Mapping(target = "customer.firstName", source = "customer.firstName")
    @Mapping(target = "customer.lastName", source = "customer.lastName")
    @Mapping(target = "customer.contactInfo.email", source = "customer.email")
    @Mapping(target = "customer.contactInfo.phone", source = "customer.phone")
    @Mapping(target = "shipping.address.country", source = "shipping.city")
    @Mapping(target = "shipping.address.city", source = "shipping.city")
    @Mapping(target = "shipping.address.street", source = "shipping.street")
    @Mapping(target = "shipping.address.zipCode", source = "shipping.postalCode")
    @Mapping(target = "shipping.meta.carrierCode", source = "shipment.carrier")
    @Mapping(target = "shipping.meta.trackingNo", source = "shipment.trackingId")
    @Mapping(target = "audit.updatedByLogin", source = "sec.login")
    @Mapping(target = "audit.updatedAt", source = "sec.now")
    void update(CustomerPatchDto customer,
                ShippingPatchDto shipping,
                ShipmentPatchDto shipment,
                SecurityCtx sec,
                @MappingTarget OrderAggregate order);
}