package com.ip.parkingspots.slots;

import java.util.UUID;

public abstract class AbstractParkingSlot {
    private Vehicle occupant;
    private final UUID id;
    SlotType type;

    public AbstractParkingSlot(SlotType type) {
        this.type = type;
        this.occupant = null;
        id = UUID.randomUUID();
    }

    public Vehicle getOccupant() {
        return occupant;
    }

    public void setOccupant(Vehicle occupant) {
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
