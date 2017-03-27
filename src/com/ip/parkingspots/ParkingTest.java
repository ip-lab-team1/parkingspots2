package com.ip.parkingspots;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by iilie on 3/27/2017.
 */
public class ParkingTest {
    @Test
    public void getParking() throws Exception {
        assertTrue(Parking.getParking() == null);
    }

    @Test
    public void getParkingSlots() throws Exception {
        assertTrue(Parking.getParking().getParkingSlots() == null);
    }

    @Test
    public void getAvailableSlots() throws Exception {
        // assertTrue(Parking.getParking().getAvailableSlots() == null);
    }

}