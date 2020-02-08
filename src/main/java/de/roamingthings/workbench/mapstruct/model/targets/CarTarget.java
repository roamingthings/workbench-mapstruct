package de.roamingthings.workbench.mapstruct.model.targets;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CarTarget extends VehicleTarget {
    private String roof;
}
