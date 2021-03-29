package builder.example_guru.builders;

import builder.example_guru.cars.CarType;
import builder.example_guru.components.Engine;
import builder.example_guru.components.GPSNavigator;
import builder.example_guru.components.Transmission;
import builder.example_guru.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}