package ru.siailya.lab4.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.siailya.lab4.api.dto.CarDto;
import ru.siailya.lab4.service.CarService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarsApiController {

    private final CarService service;

    @GetMapping
    public ResponseEntity<List<CarDto>> listCars() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getCar(@PathVariable String id) {
        CarDto dto = service.findById(id);
        return dto == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<CarDto> createCar(@RequestBody CarDto payload) {
        CarDto created = service.create(payload);
        return ResponseEntity.created(URI.create("/api/cars/" + created.id())).body(created);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable String id) {
        return service.delete(id) ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
