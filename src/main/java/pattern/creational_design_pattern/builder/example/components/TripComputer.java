package pattern.creational_design_pattern.builder.example.components;

import pattern.creational_design_pattern.builder.example.cars.Car;

/**
 * Одна из фишек автомобиля.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is starterd");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
