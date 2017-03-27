package com.ip.parkingspots;


import com.ip.parkingspots.slots.AbstractParkingSlot;

import java.util.ArrayList;
import java.util.List;

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

    public void addParkingSlot(AbstractParkingSlot slot){
        parkingSlots.add(slot);
    }

    public List<AbstractParkingSlot> getAvailableSlots(SlotType type){
        ArrayList<AbstractParkingSlot> slots = new ArrayList<>();
        for (AbstractParkingSlot slot : parkingSlots){
            if (slot.isAvailable() && slot.getType() == type){
                slots.add(slot);
            }
        }

        return slots;
    }

}
