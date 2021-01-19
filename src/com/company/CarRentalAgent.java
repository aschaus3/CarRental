package com.company;
import java.util.ArrayList;
public class CarRentalAgent
{
    String companyName, Address;
    ArrayList<Car> CarInventory = new ArrayList<Car>();

    public CarRentalAgent(String CName, String Add)
    {
        companyName = CName;
        Address = Add;
    }

    public Boolean addInventory(Car car)
    {
        for(int i = 0; i < CarInventory.size(); i++)
        {
            if(CarInventory.get(i).isSameCar(car))
                return false;
        }

        CarInventory.add(car);
        return true;
    } //Adds a car to the array list which stores all the cars

    public boolean rentCar(Car car)
    {
        if(car.isRented())
            return false;
        else
        {
            car.setRented(true);
            return true;
        }
    } //Simulates someone renting a car

    public boolean returnCar(Car car)
    {
        if(car.isRented())
        {
            car.setRented(false);
            return true;
        }
        else
            return false;
    }   //Simulates the return of a car

    public void printInventory()
    {
        System.out.println("Agent Name " + companyName);
        System.out.println("Agent Address " + Address);
        System.out.println("Car Model and Make Year-color  VIN               Category");
        System.out.println("------------------ ----------- ----------------- ------------------");
        for(int i = 0; i < CarInventory.size(); i++)
        {
            System.out.println(CarInventory.get(i).toString());
        }
    }       //Prints out all the information about the car rental company and prints the list of cars
}
