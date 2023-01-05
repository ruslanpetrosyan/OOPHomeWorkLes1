package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean summerTyres;


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int seats) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        this.color = color;

        if (productionYear < 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;

        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;

        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "седан";
        }
        this.bodyType = bodyType;

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "х000хх000";
        }
        this.registrationNumber = registrationNumber;

        if (seats <= 0) {
            seats = 5;
        }
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "х000хх000";
        }
        this.registrationNumber = registrationNumber;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        setSummerTyres(!summerTyres);
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + ", color='" + color + '\'' + ", productionYear=" + productionYear + ", productionCountry='" + productionCountry + '\'' + ", transmission='" + transmission + '\'' + ", bodyType='" + bodyType + '\'' + ", registrationNumber='" + registrationNumber + '\'' + ", seats=" + seats + '}';
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }


}
