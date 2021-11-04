package com.company;

public class Main {

    static VehicleFactory vehicleFactory;
    static Car car;
    static Bike bike;

    public static void main(String[] args) {
        vehicleFactory = new ToyotaFactory();
        bike = vehicleFactory.createBike();
        car = vehicleFactory.createCar();

        bike.ride();
        car.drive();
    }
}
