package pattern.creational_design_pattern.builder.example.builders;

import pattern.creational_design_pattern.builder.example.cars.CarType;
import pattern.creational_design_pattern.builder.example.components.Engine;
import pattern.creational_design_pattern.builder.example.components.GPSNavigator;
import pattern.creational_design_pattern.builder.example.components.Transmission;
import pattern.creational_design_pattern.builder.example.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmissions(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
