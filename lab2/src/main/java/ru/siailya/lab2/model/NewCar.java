package ru.siailya.lab2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NewCar
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-16T16:06:53.232937100+03:00[Europe/Moscow]", comments = "Generator version: 7.13.0")
public class NewCar {

    private String model;

    private Integer year;

    public NewCar() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NewCar(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public NewCar model(String model) {
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

    public NewCar year(Integer year) {
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
        NewCar newCar = (NewCar) o;
        return Objects.equals(this.model, newCar.model) &&
                Objects.equals(this.year, newCar.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewCar {\n");
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

