package de.roamingthings.workbench.mapstruct.model.targets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class VehicleTarget {
    private Integer weight;

    private Integer width;

    private Integer height;

    private Integer length;
}
