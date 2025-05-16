package ru.siailya.lab2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Car
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-16T16:06:53.232937100+03:00[Europe/Moscow]", comments = "Generator version: 7.13.0")
public class Car {

    private String id;

    private String model;

    private Integer year;

    public Car() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Car(String id, String model, Integer year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public Car id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car model(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @NotNull
    @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car year(Integer year) {
        this.year = year;
        return this;
    }

    /**
     * Get year
     *
     * @return year
     */
    @NotNull
    @Schema(name = "year", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
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

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

