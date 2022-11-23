package transport;

public class Bus extends Car implements Competing{
    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("Bus in pitstop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("bestLapTime = 3'30\"");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed = 175 km/h");
    }
    @Override
    public String toString() {
        return String.format ("%s %s:\nОбъем двигателя: %.01f л\n",
                getBrand(), getModel(), getEngineVolume());
    }
}