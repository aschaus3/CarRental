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
    }

    public boolean rentCar(Car car)
    {
        if(car.isRented())
            return false;
        else
        {
            car.setRented(true);
            return true;
        }

    }

    public boolean returnCar(Car car)
    {
        if(car.isRented())
        {
            car.setRented(false);
            return true;
        }
        else
            return false;
    }

    public void printInventory()
    {

    }
}
