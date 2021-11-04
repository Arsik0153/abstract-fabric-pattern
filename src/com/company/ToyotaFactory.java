package com.company;

public class ToyotaFactory implements VehicleFactory{
    @Override
    public Bike createBike() {
        return new TwoWheelBike();
    }

    @Override
    public Car createCar() {
        return new SedanCar();
    }
}
