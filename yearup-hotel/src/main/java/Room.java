public class Room {
    boolean isClean;
    boolean isOccupied;
    int numberOfBeds;


    public Room(boolean isClean, boolean isOccupied, int numberOfBeds){
        this.isOccupied = isOccupied;
        this.isClean = isClean;
        this.numberOfBeds = numberOfBeds;

    }

    boolean isAvailable(){
        return isClean && !isOccupied;
    }
}
