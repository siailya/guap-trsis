package ru.siailya.lab4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.siailya.lab4.api.dto.CarDto;
import ru.siailya.lab4.api.mapper.CarMapper;
import ru.siailya.lab4.entity.CarEntity;
import ru.siailya.lab4.repository.CarRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CarService {

    private final CarRepository repo;
    private final CarMapper mapper;

    public List<CarDto> findAll() {
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    public CarDto findById(String id) {
        return repo.findById(id).map(mapper::toDto).orElse(null);
    }

    @Transactional
    public CarDto create(CarDto in) {
        CarEntity entity = mapper.toEntity(in);
        entity.setId(UUID.randomUUID().toString());
        return mapper.toDto(repo.save(entity));
    }

    @Transactional
    public boolean delete(String id) {
        if (!repo.existsById(id)) return false;
        repo.deleteById(id);
        return true;
    }
}
