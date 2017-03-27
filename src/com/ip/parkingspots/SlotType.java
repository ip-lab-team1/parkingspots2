package com.ip.parkingspots;

import com.ip.parkingspots.slots.AbstractParkingSlot;

/**
 * Created by ebudaca on 27-Mar-17.
 */
public class SlotType {
    private int price;
    private String id;
    public SlotType(int price, String id){
        this.price=price;
        this.id=id;
    }

    public int getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
