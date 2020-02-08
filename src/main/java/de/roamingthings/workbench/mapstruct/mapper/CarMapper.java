package de.roamingthings.workbench.mapstruct.mapper;

import de.roamingthings.workbench.mapstruct.model.source.Car;
import de.roamingthings.workbench.mapstruct.model.targets.CarTarget;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarTarget toCarTarget(Car car);
}
