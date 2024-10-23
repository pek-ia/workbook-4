import com.pluralsight.hotel.Room;

public class TestTheRoomClass {
    public static void main(String[] args) {

        boolean isClean = true;
        boolean isOccupied = true;
        int numberOfBeds = 2;

        Room r = new Room(isClean, isOccupied, numberOfBeds);

        // Room should not be available
        boolean isRoomAvailable = r.isAvailable();
        if (!isRoomAvailable) {
            System.out.println("Yay my code works");
        }

        r.setOccupied(false);
        r.setClean(true);

        isRoomAvailable = r.isAvailable();
        if (isRoomAvailable) {
            System.out.println("Yay my code works");
        }

    }
}
