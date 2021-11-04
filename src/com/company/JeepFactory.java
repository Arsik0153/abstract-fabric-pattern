package com.company;

public class JeepFactory implements VehicleFactory{
    @Override
    public Bike createBike() {
        return new FourWheelBike();
    }

    @Override
    public Car createCar() {
        return new CoupeCar();
    }
}
