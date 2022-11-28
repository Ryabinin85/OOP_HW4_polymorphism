package transport.drivers;

import transport.Car;
import transport.Validator;

public abstract class Driver<T extends Car> {

    private final String name;
    private final boolean driverLicense;
    private final int drivingExperience;
    private final T car;

    public Driver(String name, boolean driverLicense, int drivingExperience, T car) {
        this.name = Validator.validateString(name);
        this.driverLicense = Validator.validateBoolean(driverLicense);
        this.drivingExperience = Validator.validateInteger(drivingExperience);
        this.car = car;
    }
    public void startDrive() {
        System.out.printf("%s start driving %s %s\n", getName(), car.getBrand(), car.getModel());
    }
    public void stopCar() {
        System.out.printf("%s stop driving %s %s\n", getName(), car.getBrand(), car.getModel());
    }
    public void refillCar() {
        System.out.printf("%s refill %s %s\n", getName(), car.getBrand(), car.getModel());
    }
    public void race () {
        System.out.printf("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.\n",
                getName(), car.getBrand(), car.getModel());
    }
    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}