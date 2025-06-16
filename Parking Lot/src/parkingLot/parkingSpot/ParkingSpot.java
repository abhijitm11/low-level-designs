package parkingLot.parkingSpot;

import model.Vehicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;
    private String spotType;

    public ParkingSpot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle) {
        if(isOccupied) {
            throw new IllegalStateException("Spot is already occupied!");
        }
        if(!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException("This spot is not suitable for a "+vehicle.getVehicleType());
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        if(!isOccupied) {
            throw new IllegalStateException("Spot is already vacant!");
        }
        this.vehicle = null;
        this.isOccupied = false;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSpotType() {
        return spotType;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", isOccupied=" + isOccupied +
                ", vehicle=" + vehicle +
                ", spotType='" + spotType + '\'' +
                '}';
    }


}


