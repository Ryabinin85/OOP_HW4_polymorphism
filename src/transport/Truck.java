package transport;

public class Truck extends  Car implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void startDriving() {
        System.out.println("start driving");
    }
    public void stopDriving() {
        System.out.println("stop driving");
    }
    @Override
    public void pitStop() {
        System.out.println("Truck in pitstop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("bestLapTime = 5'30\"");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed = 155 km/h");
    }
    @Override
    public String toString() {
        return String.format ("%s %s:\nОбъем двигателя: %.01f л\n",
                getBrand(), getModel(), getEngineVolume());
    }
}