package parking;

public class ParkingPlace {

    private Car someCar;

    public void addCar(Car car) {
        this.someCar = car;
    }

    public Car getCurrentCar() {
        return someCar;
    }
}
