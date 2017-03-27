package com.ip.parkingspots;

/**
 * Created by ebudaca on 27-Mar-17.
 */
public class Pass {
    private int price;
    private SlotType type;
    public Pass(int price, SlotType type){
        this.price=price;
        this.type=type;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
}
