package com.sena.terminal.service.implementacion;

import com.sena.terminal.dto.DriverRequestDto;
import com.sena.terminal.dto.DriverResponseDto;
import com.sena.terminal.dto.DriverStatusUpdateRequest;
import com.sena.terminal.dto.DriverWithoutIdResponseDto;
import com.sena.terminal.entity.Driver;
import com.sena.terminal.mapper.IDriverEntityMapper;
import com.sena.terminal.repository.IDriverRepository;
import com.sena.terminal.service.IDriverService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class DriverServiceImpl implements IDriverService {

    @Autowired
    private IDriverRepository driverRepository;
    @Autowired
    private IDriverEntityMapper driverEntityMapper;


    @Override
    public DriverWithoutIdResponseDto saveDriver(DriverRequestDto driverRequestDto) {
        return driverEntityMapper.toDriverWithoutIdResponse(
                driverRepository.save(driverEntityMapper.toDriverEntity(driverRequestDto)));
    }

    @Override
    public DriverWithoutIdResponseDto updateStatusDriver(DriverStatusUpdateRequest driverStatusUpdateRequest) {
        Driver driverEntity = driverRepository.findById(driverStatusUpdateRequest.getId()).orElse(null);
        return driverEntityMapper.toDriverWithoutIdResponse(
                driverRepository.save(driverEntity));
    }

    @Override
    public List<DriverResponseDto> findAllDriver() {
        return driverEntityMapper.toListDriverResponseDto(driverRepository.findAll());
    }

    @Override
    public List<DriverResponseDto> findAllByStatusDriver() {
        return null;
    }

    @Override
    public DriverResponseDto findByIdDriver(long idDriver) {
        return null;
    }
}
