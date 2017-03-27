package com.ip.parkingspots.person;
import com.ip.parkingspots.Vehicle.IVehicle;

/**
 * Created by Rusu on 3/27/2017.
 */
public class Client {

    Vehicle vehicle;
    Pass pass;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Pass getPass() {
        return pass;
    }
}
