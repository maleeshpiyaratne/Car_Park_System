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

    double cargoVolume;

    public Van(String type, String idplate, String brand, DateTime entrytime,
            double cargovol) 
    {
        super(type, idplate, brand, entrytime);
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

}
