package de.roamingthings.workbench.mapstruct.mapper;

import de.roamingthings.workbench.mapstruct.model.source.Car;
import de.roamingthings.workbench.mapstruct.model.source.Motorbike;
import de.roamingthings.workbench.mapstruct.model.source.Vehicle;
import de.roamingthings.workbench.mapstruct.model.targets.MotorbikeTarget;
import de.roamingthings.workbench.mapstruct.model.targets.VehicleTarget;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {CarMapper.class})
public interface VehicleMapper {
    default VehicleTarget toVehicleTarget(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return CarMapper.INSTANCE.toCarTarget((Car) vehicle);
        }
        return toMotorbikeTarget((Motorbike) vehicle);
    }

    @Mapping(target = "maximumSpeed", source = "maxSpeed")
    MotorbikeTarget toMotorbikeTarget(Motorbike motorbike);
}
