package de.roamingthings.workbench.mapstruct.mapper;

import de.roamingthings.workbench.mapstruct.model.source.Car;
import de.roamingthings.workbench.mapstruct.model.source.Motorbike;
import de.roamingthings.workbench.mapstruct.model.source.Vehicle;
import de.roamingthings.workbench.mapstruct.model.source.VehicleModel;
import de.roamingthings.workbench.mapstruct.model.targets.CarTarget;
import de.roamingthings.workbench.mapstruct.model.targets.MotorbikeTarget;
import de.roamingthings.workbench.mapstruct.model.targets.VehicleModelTarget;
import de.roamingthings.workbench.mapstruct.model.targets.VehicleTarget;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class VehicleModelMapperTest {

    private static final String ROOF = "da roof";
    private static final int WEIGHT = 1004;
    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;
    private static final int LENGTH = 30;
    private static final Integer MAX_SPEED = 42;

    @Test
    void should_map_car() {
        VehicleModel vehicleModel = aModelWithACar();

        VehicleModelTarget vehicleModelTarget = VehicleModelMapper.INSTANCE.vehicleModelToTarget(vehicleModel);

        assertSoftly(softly -> {
            VehicleTarget vehicle = vehicleModelTarget.getVehicle();
            softly.assertThat(vehicle).isInstanceOf(CarTarget.class);
            CarTarget carTarget = (CarTarget) vehicle;
            softly.assertThat(carTarget.getRoof()).isEqualTo(ROOF);
            softly.assertThat(carTarget.getWeight()).isEqualTo(WEIGHT);
            softly.assertThat(carTarget.getWidth()).isEqualTo(WIDTH);
            softly.assertThat(carTarget.getHeight()).isEqualTo(HEIGHT);
            softly.assertThat(carTarget.getLength()).isEqualTo(LENGTH);
        });
    }

    @Test
    void should_map_motorbike() {
        VehicleModel vehicleModel = aModelWithAMotorbike();

        VehicleModelTarget vehicleModelTarget = VehicleModelMapper.INSTANCE.vehicleModelToTarget(vehicleModel);

        assertSoftly(softly -> {
            VehicleTarget vehicle = vehicleModelTarget.getVehicle();
            softly.assertThat(vehicle).isInstanceOf(MotorbikeTarget.class);
            MotorbikeTarget motorbikeTarget = (MotorbikeTarget) vehicle;
            softly.assertThat(motorbikeTarget.getWeight()).isEqualTo(WEIGHT);
            softly.assertThat(motorbikeTarget.getWidth()).isEqualTo(WIDTH);
            softly.assertThat(motorbikeTarget.getHeight()).isEqualTo(HEIGHT);
            softly.assertThat(motorbikeTarget.getLength()).isEqualTo(LENGTH);
            softly.assertThat(motorbikeTarget.getMaximumSpeed()).isEqualTo(MAX_SPEED);
        });
    }

    private VehicleModel aModelWithACar() {
        Vehicle vehicle = new Car(ROOF, WEIGHT, WIDTH, HEIGHT, LENGTH);
        return new VehicleModel(vehicle);
    }

    private VehicleModel aModelWithAMotorbike() {
        Vehicle vehicle = new Motorbike(WEIGHT, WIDTH, HEIGHT, LENGTH, MAX_SPEED);
        return new VehicleModel(vehicle);
    }
}
