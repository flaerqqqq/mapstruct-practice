package com.example.demo.ignore.mapper;

import com.example.demo.ignore.model.domain.User;
import com.example.demo.ignore.model.dto.UserCreateRequestDto;
import com.example.demo.ignore.model.dto.UserResponseDto;
import com.example.demo.ignore.model.dto.UserUpdateRequestDto;
import org.mapstruct.*;

@Mapper(
        config = IgnoreMapperConfig.class,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface UserMapper {

    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "publicId", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "roles", ignore = true)
    User toDomain(UserCreateRequestDto createRequestDto);

    @Mapping(target = "publicId", ignore = true)
    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "roles", ignore = true)
    void update(UserUpdateRequestDto updateRequestDto, @MappingTarget User domain);

    @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    UserResponseDto toResponseDto(User domain);
}