package transport.driver;

import transport.Car;

public class DriverB extends Driver<Car>{

    public DriverB(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Car transport) {
        transport.start();
    }

    @Override
    public void stopMove(Car transport) {
        transport.stop();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель " + getName() + " заправляет автомобиль " + transport.getBrand());
    }
}
