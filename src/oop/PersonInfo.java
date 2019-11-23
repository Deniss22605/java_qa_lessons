package oop;

public class PersonInfo {

    public static void main(String[] args) {
        Person sveta = new Person("Olya", "Volkova", 21);
        sveta.printPersonInfo();

        Person veronika = new Person("Veronika", "Volkova", 25);
        veronika.printPersonInfo();

        Person roman = new Person("Roman", "Popov");
        roman.printPersonInfo();

        Person denys = new Person();
        denys.setAge(21);
        denys.setName("Denys");
        denys.setLastName("Shcherbina");

        Person denys_1 = new Person();
        denys.setAge(21);
        denys.setName("Denys");
        denys.setLastName("Shcherbina");
    }
}
