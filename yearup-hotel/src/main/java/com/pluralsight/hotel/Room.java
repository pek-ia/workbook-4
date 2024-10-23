package com.pluralsight.hotel;

public class Room {
    private boolean isClean;
    private boolean isOccupied;

    public boolean isDownForMaintenance() {
        return isDownForMaintenance;
    }

    public void setDownForMaintenance(boolean downForMaintenance) {
        isDownForMaintenance = downForMaintenance;
    }

    private boolean isDownForMaintenance;

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    private int numberOfBeds;


    public Room(boolean isClean, boolean isOccupied, int numberOfBeds){
        this.isOccupied = isOccupied;
        this.isClean = isClean;
        this.numberOfBeds = numberOfBeds;

    }

    public boolean isAvailable(){
        return isClean && !isOccupied && !isDownForMaintenance;
    }
}
