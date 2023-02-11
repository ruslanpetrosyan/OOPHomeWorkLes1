package transport.driver;

import transport.Car;
import transport.Transport;
import transport.Truck;

public class DriverC extends Driver<Truck>{

    public DriverC(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + transport.getBrand());
    }
}
