package de.roamingthings.workbench.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import de.roamingthings.workbench.mapstruct.model.source.VehicleModel;
import de.roamingthings.workbench.mapstruct.model.targets.VehicleModelTarget;

@Mapper(uses = {VehicleMapper.class})
public abstract class VehicleModelMapper {
    public static VehicleModelMapper INSTANCE = Mappers.getMapper(VehicleModelMapper.class);

    public abstract VehicleModelTarget vehicleModelToTarget(VehicleModel vehicleModel);
}
