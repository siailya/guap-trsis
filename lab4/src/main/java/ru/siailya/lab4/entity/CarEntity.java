package ru.siailya.lab4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

/**
 * Car
 */
@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {
    @Id
    @Column(length = 36)
    private String id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private Integer year;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarEntity car = (CarEntity) o;
        return Objects.equals(this.id, car.id) &&
                Objects.equals(this.model, car.model) &&
                Objects.equals(this.year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, year);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Car {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

