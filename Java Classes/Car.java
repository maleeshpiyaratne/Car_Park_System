/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_01_cps;

/**
 *
 * @author Maleesh Dilshan
 */

public class Car extends Vehicle 
{

    private int noOfDoors;
    private String colour;

    public Car(String type, String idplate, String brand, DateTime entrytime,
            int noofdoors, String colour) 
    {
        super(type, idplate, brand, entrytime);
        this.noOfDoors = noofdoors;
        this.colour = colour;
    }

    public int getNoOfDoors() 
    {
        return noOfDoors;
    }

    public String getColour() 
    {
        return colour;
    }

    public void setNoOfDoors(int noOfDoors) 
    {
        this.noOfDoors = noOfDoors;
    }

    public void setColour(String colour) 
    {
        this.colour = colour;
    }

}