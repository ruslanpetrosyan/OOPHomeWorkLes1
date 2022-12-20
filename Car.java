public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        if (this.brand == null || this.brand.isEmpty()) {
            this.brand = "default";
        }
        this.model = model;
        if (this.model == null || this.model.isEmpty()) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (this.color == null || this.color.isEmpty()) {
            this.color = "Белый";
        }
        this.productionYear = productionYear;
        if (this.productionYear < 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (this.productionCountry == null || this.productionCountry.isEmpty()) {
            this.productionCountry = "default";
        }
    }

    @Override
    public String toString() {
        return "марка-" + brand + ", модель-" + model + ", двигатель-" + engineVolume + ", цвет-" + color + ", " +
                "год выпуска-" + productionYear + ", страна сборки-" + productionCountry;
    }
}
