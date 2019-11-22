package oop;

public class Box {

    protected int height;
    protected int width;

    public Box(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printBoxProperties() {
        System.out.println("Height: " + " " + height + " " + "Width: " + " " + width);
    }
}
