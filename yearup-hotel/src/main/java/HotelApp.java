public class HotelApp {
    public static void main(String[] args){

        boolean isClean = true;
        boolean isOccupied = true;
        int numberOfBeds = 2;

        Room r = new Room(isClean, isOccupied, numberOfBeds);

        // Room should not be available
        boolean isRoomAvailable = r.isAvailable();
        if (!isRoomAvailable) {
            System.out.println("Yay my code works");
        }

        r.isOccupied = false;
        r.isClean = true;

        isRoomAvailable = r.isAvailable();
        if (isRoomAvailable) {
            System.out.println("Yay my code works");
        }





    }
}
