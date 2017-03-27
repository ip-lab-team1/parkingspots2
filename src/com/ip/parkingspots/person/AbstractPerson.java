package com.ip.parkingspots.person;

import java.util.Random;
/**
 * Created by Rusu on 3/27/2017.
 */
public abstract class AbstractPerson {

    String firstName;
    String lastName;
    private Random random = new Random();
    int id = random.nextInt(1000000);

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId(){
        return id;
    }


}
