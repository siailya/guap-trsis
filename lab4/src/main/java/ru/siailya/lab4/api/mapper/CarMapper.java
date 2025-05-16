package ru.siailya.lab4.api.mapper;

import org.mapstruct.Mapper;
import ru.siailya.lab4.api.dto.CarDto;
import ru.siailya.lab4.entity.CarEntity;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDto toDto(CarEntity entity);

    CarEntity toEntity(CarDto dto);
}