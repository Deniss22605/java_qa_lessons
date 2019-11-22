package oop;

public abstract class AbstractBox {

    public String boxName;

    public abstract void printProperties();

    public void printOneProperty() {
        System.out.println("Some property info!");
    }
}
