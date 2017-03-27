package com.ip.parkingspots;


public class Parking {
    private static Parking parking;

    public static Parking getParking(){
        if (parking == null){
            parking = new Parking();
        }

        return parking;
    }

    private List<AbstractParkingSlot> parkingSlots;

    public List<AbstractParkingSlot> getParkingSlots(){
        return parkingSlots;
    }
}
