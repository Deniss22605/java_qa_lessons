package oop;

public class HeavyBox extends AbstractBox {

    private int weight = 50;

    public HeavyBox(int height, int width) {
        //super(height, width);
    }

    /*@Override
    public void printBoxProperties() {
        System.out.println("This is heavy box: "
                + " " + "Height " + height
                + " " + "Width: " + width
                + " " + "Weight: " + weight);
    }*/

    @Override
    public void printProperties() {
        System.out.println("This is heavy box!");
    }
}
