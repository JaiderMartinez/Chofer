package com.sena.terminal.service;

import com.sena.terminal.dto.DriverRequestDto;
import com.sena.terminal.dto.DriverResponseDto;
import com.sena.terminal.dto.DriverStatusUpdateRequest;
import com.sena.terminal.dto.DriverWithoutIdResponseDto;

import java.util.List;

public interface IDriverService {

    DriverWithoutIdResponseDto saveDriver(DriverRequestDto driverRequestDto);

    DriverWithoutIdResponseDto updateStatusDriver(DriverStatusUpdateRequest driverStatusUpdateRequest);

    List<DriverResponseDto> findAllDriver();

    List<DriverResponseDto> findAllByStatusDriver();

    DriverResponseDto findByIdDriver(long idDriver);
}
