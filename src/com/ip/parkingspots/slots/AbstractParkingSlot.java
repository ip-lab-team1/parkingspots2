package com.ip.parkingspots.slots;

import com.ip.parkingspots.SlotType;
import com.ip.parkingspots.Vehicle.IVehicle;

import java.util.UUID;

public abstract class AbstractParkingSlot {
    private IVehicle occupant;
    private final UUID id;
    SlotType type;

    public AbstractParkingSlot(SlotType type) {
        this.type = type;
        this.occupant = null;
        id = UUID.randomUUID();
    }

    public IVehicle getOccupant() {
        return occupant;
    }

    public void setOccupant(IVehicle occupant) {
        this.occupant = occupant;
    }

    public SlotType getType(){
        return type;
    }

    public boolean isAvailable(){
        return occupant == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractParkingSlot)) return false;

        AbstractParkingSlot that = (AbstractParkingSlot) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
