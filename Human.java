public class Human {

    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        if (this.yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        this.name = name;
        if (this.name == null || this.name.isEmpty()) {
            this.name = "Информация не указана";
        }
        this.town = town;
        if (this.town == null || this.town.isEmpty()) {
            this.town = "Информация не указана";
        }
        this.job = job;
        if (this.job == null || this.job.isEmpty()) {
            this.job = "Информация не указана";
        }
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth
                    + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }

}
