package transport.drivers;

import transport.Truck;

public class TruckDriver<D extends Truck> extends Driver {
    public TruckDriver(String name, boolean driverLicense, int drivingExperience, D car) {
        super(name, driverLicense, drivingExperience, car);
    }
//    public void startDrive(D car) {
//        System.out.println("Start drive" + car);
//    }
//    public void stopCar(D car) {
//        System.out.println("Stop " + car);
//    }
//    public void refillCar(D car) {
//        System.out.println("Refill " + car);
//    }
//    public void race (D car) {
//        System.out.printf("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.\n",
//                getName(), car.getBrand(), car.getModel());
//    }
}