package ru.siailya.lab2.service;

import org.springframework.stereotype.Service;
import ru.siailya.lab2.model.Car;
import ru.siailya.lab2.model.NewCar;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CarService {
    private final Map<String, Car> storage = new ConcurrentHashMap<>();

    public List<Car> findAll() {
        return new ArrayList<>(storage.values());
    }

    public Optional<Car> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    public Car create(NewCar newCar) {
        String id = UUID.randomUUID().toString();
        Car car = new Car(id, newCar.getModel(), newCar.getYear());
        storage.put(id, car);
        return car;
    }

    public boolean delete(String id) {
        return storage.remove(id) != null;
    }
}
