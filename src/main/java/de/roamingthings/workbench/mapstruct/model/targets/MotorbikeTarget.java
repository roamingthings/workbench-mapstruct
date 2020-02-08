package de.roamingthings.workbench.mapstruct.model.targets;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MotorbikeTarget extends VehicleTarget {
    private Integer maximumSpeed;

//    @Builder
//    public MotorbikeTarget(Integer maxSpeed, Integer weight, Integer width, Integer height, Integer length) {
//        super(weight, width, height, length);
//        this.maxSpeed = maxSpeed;
//    }
}
