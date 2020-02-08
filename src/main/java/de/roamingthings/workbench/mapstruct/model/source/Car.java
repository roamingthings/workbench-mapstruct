package de.roamingthings.workbench.mapstruct.model.source;

import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Car extends Vehicle {
    private String roof;

    public Car(String roof, Integer weight, Integer width, Integer height, Integer length) {
        super(weight, width, height, length);
        this.roof = roof;
    }
}
