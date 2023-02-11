public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String job;

    public Human(int yearOfBirth, String name, String town, String job) {

        setYearOfBirth(yearOfBirth);

        this.name = name;
        if (this.name == null || this.name.isEmpty()) {
            this.name = "Информация не указана";
        }

        setTown(town);

        this.job = job;
        if (this.job == null || this.job.isEmpty()) {
            this.job = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        if (this.yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        if (this.town == null || this.town.isEmpty()) {
            this.town = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth
                + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }

}
