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
public class Bike extends Vehicle 
{
    // additional to the genral attribute, uniwue to bike sub class
    private int engineSize;

    //constructor which gathers all the attributes
    public Bike(String type, String idplate, String brand, DateTime entrytime,
            int enginesize) 
    {
        //set super class with attributes
        super(type, idplate, brand, entrytime);
        
        //set sub class attribute
        this.engineSize = enginesize;
    }

    public int getEngineSize() 
    {
        return engineSize;
    }

    public void setEngineSize(int engineSize) 
    {
        this.engineSize = engineSize;
    }

    public String toString()
    {
        return " "+vehicleType+" "+idPlate+" "+brand+" "+entryTime.toString()+
                " "+engineSize;
    }
}
