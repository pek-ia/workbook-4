package com.pluralsight.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void when_Room_isOccupied_it_is_not_available() {

        boolean isClean = true;
        boolean isOccupied = true;
        int numberOfBeds = 2;

        Room r = new Room(isClean, isOccupied, numberOfBeds);
        // Occupied room is not available
        assertFalse( r.isAvailable() );
    }

    @Test
    void when_Room_isNotClean_it_is_not_available() {

        boolean isClean = false;
        boolean isOccupied = false;
        int numberOfBeds = 2;

        Room r = new Room(isClean, isOccupied, numberOfBeds);

        assertFalse(r.isAvailable());
    }

    @Test
    void when_Room_isDownForMaintenace_it_is_not_available() {
        // Arrange
        boolean isClean = true;
        boolean isOccupied = false;
        int numberOfBeds = 2;

        Room r = new Room(isClean, isOccupied, numberOfBeds);

        // Act
        r.setDownForMaintenance(true);

        // Assert
        assertFalse(r.isAvailable());
    }

    @Test
    void when_housekeeping_cleans_room_it_isClean() {
        // Arrange
        boolean isClean = false;
        boolean isOccupied = false;
        int numberOfBeds = 2;

        Room r = new Room(isClean, isOccupied, numberOfBeds);

        Housekeeping h = new Housekeeping();
        h.cleanARoom(r);

        assertTrue(r.isClean());
    }
}