package com.sena.terminal.mapper;

import com.sena.terminal.dto.DriverRequestDto;
import com.sena.terminal.dto.DriverResponseDto;
import com.sena.terminal.dto.DriverWithoutIdResponseDto;
import com.sena.terminal.entity.Driver;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IDriverEntityMapper {

    Driver toDriverEntity(DriverRequestDto driverRequestDto);

    DriverWithoutIdResponseDto toDriverWithoutIdResponse(Driver driver);

    List<DriverResponseDto> toListDriverResponseDto(List<Driver> listDriver);
}
