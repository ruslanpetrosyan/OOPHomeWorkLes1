public class Flower {
    private final String flowerName;
    private String country;
    private final double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost) {
        if (flowerName == null || flowerName.isEmpty()) {
            flowerName = "тип цветка не указан";
        }
        this.flowerName = flowerName;

        if (country == null || country.isEmpty()) {
            country = "Россия";
        }
        this.country = country;

        if (cost <= 0) {
            cost = 1;
        }
        this.cost = cost;

        this.lifeSpan = 3;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerName + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
