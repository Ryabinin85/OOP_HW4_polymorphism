package transport;

import transport.drivers.BusDriver;
import transport.drivers.PassengerCarDriver;
import transport.drivers.TruckDriver;

public class Main {
    public static void main(String[] args) {
        PassengerCar pajero = new PassengerCar("Mitsubishi", "Pajero", 3.2);
        PassengerCar pathfinder = new PassengerCar("Nissan", "Pathfinder", 3.0);
        PassengerCar outlander = new PassengerCar("Mitsubishi", "Outlander", 3.0);
        PassengerCar xTrail = new PassengerCar("Nissan", "X-Trail", 2.4);

        Bus nefaz5299 = new Bus("НефАЗ", "nefaz5299", 4.0);
        Bus maz206 = new Bus("МАЗ", "maz206", 5.0);
        Bus gazeleCity = new Bus("ГАЗель", "gazeleCity", 3.0);
        Bus bus4 = new Bus("", " ", -2.0);

        Truck valdaiNext = new Truck("Валдай", "NEXT", 2.8);
        Truck kamaz5490= new Truck("КамАЗ", "5490", 12);
        Truck manTgx = new Truck("MAN", "TGX", 12.4);
        Truck volvoFh16 = new Truck("Volvo", "FH16", 16);

        System.out.println(pajero);
        System.out.println(pathfinder);
        System.out.println(outlander);
        System.out.println(nefaz5299);
        System.out.println(maz206);
        System.out.println(gazeleCity);
        System.out.println(bus4);
        System.out.println(valdaiNext);
        System.out.println(kamaz5490);
        System.out.println(manTgx);
        System.out.println(volvoFh16);

        PassengerCarDriver<PassengerCar> hakkinen = new PassengerCarDriver<>("Hakkinen", true, 25, pajero);
        BusDriver<Bus> hamilton = new BusDriver<>("Hamilton", true, 18, gazeleCity);
        TruckDriver<Truck> schumacher = new TruckDriver<>("Schumacher", true, 36, valdaiNext);

        hakkinen.race();
        hakkinen.startDrive();
        hakkinen.stopCar();
        hakkinen.refillCar();
        hamilton.race();
        schumacher.race();
    }
}