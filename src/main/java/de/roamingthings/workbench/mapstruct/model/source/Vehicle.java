package de.roamingthings.workbench.mapstruct.model.source;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Vehicle {
    private Integer weight;
    private Integer width;
    private Integer height;
    private Integer length;
}
