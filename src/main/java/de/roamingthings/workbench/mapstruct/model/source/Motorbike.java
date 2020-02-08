package de.roamingthings.workbench.mapstruct.model.source;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Motorbike extends Vehicle {
    private Integer maxSpeed;

    public Motorbike(Integer weight, Integer width, Integer height, Integer length, Integer maxSpeed) {
        super(weight, width, height, length);
        this.maxSpeed = maxSpeed;
    }
}
