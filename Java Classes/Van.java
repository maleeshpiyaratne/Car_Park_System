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

public class Van extends Vehicle 
{
    //addition to vehicle attributes.
    //unique to vehicle van
    private double cargoVolume;

    
    public Van(String type, String idplate, String brand, DateTime entrytime,
            double cargovol) 
    {
        //set the general attibutes to the super class
        super(type, idplate, brand, entrytime);
        
        //set this to this van subclass
        this.cargoVolume = cargovol;
    }

    public double getCargoVolume() 
    {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) 
    {
        this.cargoVolume = cargoVolume;
    }

    public String toString()
    {
        return " "+vehicleType+" "+idPlate+" "+brand+" "+entryTime.toString()+
                " "+cargoVolume;
    }
}
