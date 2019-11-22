package oop;

public class Person {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + name + " Last name: " + lastName + " Age: " + age);
    }

    @Override
    public boolean equals(Object other) {
        Person otherPerson = (Person)other;
        if(this != otherPerson) {
            return false;
        } else if(!this.name.equals(otherPerson.name)) {
            return false;
        } else if(!this.lastName.equals(otherPerson.lastName)) {
            return false;
        } else if(this.age != otherPerson.age) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Person: ")
                .append("Age: ")
                .append(age)
                .append(" ")
                .append("Name: ")
                .append(name)
                .append(" ")
                .append("LastName: ")
                .append(lastName);
        return stringBuilder.toString();
    }
}
