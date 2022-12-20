import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI", 3.0, "черный", 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);

        Human maxim = new Human(1987, "Максим", "Минск", "бренд-менеджер");

        Human anya = new Human(LocalDate.now().getYear() - 29, "Аня", "Москва", "методист");

        Human katya = new Human(LocalDate.now().getYear() - 28,"Катя", "Калининград", "продакт-менеджер");

        Human artem = new Human(LocalDate.now().getYear() - 27, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println();
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);

    }

}
