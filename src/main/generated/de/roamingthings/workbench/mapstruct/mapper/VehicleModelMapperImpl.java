package de.roamingthings.workbench.mapstruct.mapper;

import de.roamingthings.workbench.mapstruct.model.source.VehicleModel;
import de.roamingthings.workbench.mapstruct.model.targets.VehicleModelTarget;
import javax.annotation.processing.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-08T11:31:55+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class VehicleModelMapperImpl extends VehicleModelMapper {

    private final VehicleMapper vehicleMapper = Mappers.getMapper( VehicleMapper.class );

    @Override
    public VehicleModelTarget vehicleModelToTarget(VehicleModel vehicleModel) {
        if ( vehicleModel == null ) {
            return null;
        }

        VehicleModelTarget vehicleModelTarget = new VehicleModelTarget();

        vehicleModelTarget.setVehicle( vehicleMapper.toVehicleTarget( vehicleModel.getVehicle() ) );

        return vehicleModelTarget;
    }
}
