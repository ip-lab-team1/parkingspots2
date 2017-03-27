package com.ip.parkingspots;

import com.ip.parkingspots.slots.AbstractParkingSlot;

import java.util.List;


public class Valet {
    public AbstractParkingSlot parkVehicle(Vehicle v, SlotType type){
        List<AbstractParkingSlot> slots = Parking.getParking().getAvailableSlots(type);
        if (slots.size() == 0){
            return null;
        }

        AbstractParkingSlot slot = slots[0];
        slot.setOccupant(v);

        return slot;
    }

    public Vehicle freeSlot(AbstractParkingSlot slot){
        Vehicle v = slot.getOccupant();
        slot.setOccupant(null);
        return v;
    }
}
