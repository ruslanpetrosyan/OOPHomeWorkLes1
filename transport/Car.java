package transport;

import java.time.LocalDate;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean summerTyres;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed,
               String transmission,
               String bodyType,
               String registrationNumber,
               int seats) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);



        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;


        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;


        if (bodyType == null || bodyType.isBlank()) {
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
        return "Car{" + "brand='" + getBrand() + '\'' + ", model='" + getModel() + '\'' + ", engineVolume="
                + engineVolume + ", color='" + getColour() + '\'' + ", productionYear=" + getProductionYear()
                + ", productionCountry='" + getProductionCountry() + '\'' + ", transmission='" + transmission
                + '\'' + ", maxSpeed='" + getMaxSpeed() + '\'' + ", bodyType='" + bodyType + '\''
                + ", registrationNumber='" + registrationNumber
                + '\'' + ", seats=" + seats + '}';
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
