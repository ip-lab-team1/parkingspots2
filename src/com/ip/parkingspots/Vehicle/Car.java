package com.ip.parkingspots.Vehicle;
import com.ip.parkingspots.person.AbstractPerson;

import java.util.Random;

/**
 * Created by Costelski on 3/27/2017.
 */
public class Car implements IVehicle {

    AbstractPerson owner;
    Random random = new Random();
    int id;

    public Car(){
        id = random.nextInt(10000);
    }

    @Override
    public AbstractPerson getOwner() {
        return owner;
    }

    @Override
    public void setOwner(AbstractPerson owner) {
        this.owner = owner;
    }
}
