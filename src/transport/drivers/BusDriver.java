package transport.drivers;

import transport.Bus;

public class BusDriver <C extends Bus> extends Driver {
    public BusDriver(String name, boolean driverLicense, int drivingExperience, C car) {
        super(name, driverLicense, drivingExperience, car);
    }
//    public void startDrive(C car) {
//        System.out.println("Start drive" + car);
//    }
//    public void stopCar(C car) {
//        System.out.println("Stop " + car);
//    }
//    public void refillCar(C car) {
//        System.out.println("Refill " + car);
//    }
//    public void race (C car) {
//        System.out.printf("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.\n",
//                getName(), car.getBrand(), car.getModel());
//    }
}