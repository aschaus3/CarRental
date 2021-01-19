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
    } //returns the basic information about a car

    public boolean isSameCar(Car car)
    {
        if(car.VIN == this.VIN)
            return true;
        else
            return false;
    } //Checks if cars are equal

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
    }   //Determines the category of each car

    public boolean isRented()
    {
        return rented;
    }

    public String toString()
    {
        String MandM = String.format("%-19s",model + ", " + make);
        String YearColor = String.format("%-12s",year + "-" + colour);
        String vin = String.format("%-18s",VIN);
        String Cat = String.format("%-18s", getCatagory());
        return MandM + YearColor + vin + Cat;
    }   //Created String using string formats to make my output spaced out properly
}
