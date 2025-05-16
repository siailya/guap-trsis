package ru.siailya.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.siailya.lab4.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, String> {
}
