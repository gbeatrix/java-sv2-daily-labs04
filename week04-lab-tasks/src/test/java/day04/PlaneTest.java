package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    @Test
    void testPlane(){
        Plane plane = new Plane(4);

        assertTrue(plane.addPassenger(new Passenger("Aladár", "1111", 1)));
        assertTrue(plane.addPassenger(new Passenger("Béla", "2222", 2)));
        assertTrue(plane.addPassenger(new Passenger("Cecil", "3333", 3)));
        assertTrue(plane.addPassenger(new Passenger("Dénes", "4444", 4)));
        assertFalse(plane.addPassenger(new Passenger("Elemér", "5555", 5)));

        assertEquals(10, plane.numberOfPackages());
    }
}