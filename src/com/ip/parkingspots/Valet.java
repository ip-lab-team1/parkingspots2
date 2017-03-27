package com.ip.parkingspots;

import com.ip.parkingspots.Vehicle.IVehicle;
import com.ip.parkingspots.slots.AbstractParkingSlot;

import java.util.List;


public class Valet {
    public AbstractParkingSlot parkVehicle(IVehicle v, SlotType type){
        List<AbstractParkingSlot> slots = Parking.getParking().getAvailableSlots(type);
        if (slots.size() == 0){
            return null;
        }

        AbstractParkingSlot slot = slots.get(0);
        slot.setOccupant(v);

        return slot;
    }

    public IVehicle freeSlot(AbstractParkingSlot slot){
        IVehicle v = slot.getOccupant();
        slot.setOccupant(null);
        return v;
    }
}
