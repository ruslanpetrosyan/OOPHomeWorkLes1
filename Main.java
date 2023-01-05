import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", null, null, null, 0);
        Car audiA8 = new Car("Audi", "A8 50 L TDI", 3.0, "черный", 2020, "Германия", null, null, null, 0);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", null, null, null, 0);
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", null, null, null, 0);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", null, null, null, 0);

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);

        Human maxim = new Human(1987, "Максим", "Минск", "бренд-менеджер");

        Human anya = new Human(LocalDate.now().getYear() - 29, "Аня", "Москва", "методист");

        Human katya = new Human(LocalDate.now().getYear() - 28, "Катя", "Калининград", "продакт-менеджер");

        Human artem = new Human(LocalDate.now().getYear() - 27, "Артем", "Москва", "директор по развитию бизнеса");

        Human vladimir = new Human(LocalDate.now().getYear() - 21, "Владимир", "Казань", null);

        System.out.println();
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

        Flower rosa = new Flower("роза", "Голландия", 35.59);
        Flower hrizantema = new Flower("хризантема", null, 15);
        Flower pion = new Flower("пион", null, 69.99);
        Flower gipsophila = new Flower("гипсофила", "Турция", 19.50);

        Bouquet bouquet = new Bouquet(
                new Flower[]{
                        rosa, rosa, rosa,
                        hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                        gipsophila
                }
        );
        bouquet.printInfo();
    }

}
