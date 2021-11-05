package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int capacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int capacity) {
        this.capacity = capacity;
    }

    public boolean addPassenger(Passenger passenger){
        if(0<capacity){
            passengers.add(passenger);
            capacity--;
            return true;
        } else {
            return false;
        }
    }

    public int numberOfPackages(){
        int sum=0;
        for(Passenger passenger : passengers){
            sum += passenger.getPackages();
        }
        return sum;
    }
}
