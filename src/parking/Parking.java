package parking;

public class Parking {

    private ParkingPlace[] parkingPlaces = new ParkingPlace[10];

    public Parking() {
        createParkingPlaces();
    }

    public void parkNewCar(Car someCar) {
        parkingPlaces[0].addCar(someCar);
    }

    private void createParkingPlaces() {
        for (int i = 0; i < parkingPlaces.length; i++) {
            parkingPlaces[i] = new ParkingPlace();
        }
    }
}
