package com.example.demo.rename.mapper;


import com.example.demo.rename.model.domain.LegacyCustomerRecord;
import com.example.demo.rename.model.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        config = RenameMapperConfig.class
)
public interface CustomerRenameMapper {

    @Mapping(source = "uuid", target = "id")
    @Mapping(source = "fname", target = "firstName")
    @Mapping(source = "lname", target = "lastName")
    @Mapping(source = "mail", target = "email")
    @Mapping(source = "phoneNum", target = "phone")
    @Mapping(source = "birth", target = "birthDate")
    @Mapping(source = "regTs", target = "registeredAt")
    @Mapping(source = "lastLoginTs", target = "lastLoginAt")
    @Mapping(source = "statusCode", target = "status")
    @Mapping(source = "marketingOk", target = "isMarketingConsent")
    @Mapping(source = "countryIso", target = "country")
    @Mapping(source = "cityName", target = "city")
    @Mapping(source = "zip", target = "postalCode")
    @Mapping(source = "streetLine", target = "street")
    @Mapping(source = "houseNo", target = "building")
    CustomerDto toDto(LegacyCustomerRecord domain);
}