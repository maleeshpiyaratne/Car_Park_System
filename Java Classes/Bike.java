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

    private int engineSize;

    public Bike(String type, String idplate, String brand, DateTime entrytime,
            int enginesize) 
    {
        super(type, idplate, brand, entrytime);
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

}
