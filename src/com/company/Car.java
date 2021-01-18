package com.company;
public class Car implements Comparable
{
    String make, model, colour, year, VIN;
    int noOfDoors, noOfSeats, noOfSuitcases, noOfBags;
    boolean rented;

    public Car(String Cmake, String Cmodel, String Ccolour, String Cyear)
    {
        make = Cmake;
        model = Cmodel;
        colour = Ccolour;
        year = Cyear;
        rented = false;
    }

    public void setVIN(String vin)
    {
        VIN = vin;
    }  //Allows the user to set the VIN of the car

    public void setSize(int door, int seat)
    {
        noOfDoors = door;
        noOfSeats = seat;
    }  //Allows the user to set the number of doors and seats

    public void setLuggage(int suitcase, int bag)
    {
        noOfSuitcases = suitcase;
        noOfBags = bag;
    }  //Allows the user to se the number of suitcases and bags

    public void setRented(boolean status)
    {
        rented = status;
    }

    public String getCarInfo()
    {
        return make + ", " + model + " " + year + "-" + colour;
    }

    public boolean isSameCar(Car car)
    {
        if(car.VIN == this.VIN)
            return true;
        else
            return false;
    }

    public String getCatagory()
    {
        if(noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 1 && noOfBags ==1)
            return "Economy";
        else if(noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 1 && noOfBags ==2)
            return "Compact";
        else if(noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 2 && noOfBags ==1)
            return "Mid-size(Standard)";
        else if(noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 2 && noOfBags ==2)
            return "Full-size(Premium)";
        else
            return "Convertible";
    }

    public boolean isRented()
    {
        return rented;
    }
}
