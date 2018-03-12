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

public abstract class Vehicle 
{

    //General attributes for a parked vehicle
    protected String vehicleType;
    protected String idPlate;
    protected String brand;
    protected DateTime entryTime;
    protected DateTime exitTime;

    //constructor that gather all attributes
    public Vehicle(String type, String idplate, String brand,
            DateTime entrytime) 
    {
        this.vehicleType = type;
        this.idPlate = idplate;
        this.brand = brand;
        this.entryTime = entrytime;
        this.exitTime = null;
    }

    public String getVehicleType() 
    {
        return vehicleType;
    }
    public String getIdPlate() 
    {
        return idPlate;
    }
    public String getBrand() 
    {
        return brand;
    }
    public DateTime getEntryTime() 
    {
        return entryTime;
    }
    public DateTime getExitTime()
    {
        return exitTime;
    }

    public void setVehicleType(String vehicleType) 
    {
        this.vehicleType = vehicleType;
    }
    public void setIdPlate(String idPlate) 
    {
        this.idPlate = idPlate;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }
    public void setEntryTime(DateTime entryTime) 
    {
        this.entryTime = entryTime;
    }
    public void setExitTime(DateTime exitTime)
    {
        this.exitTime = exitTime;
    }

    public String toString()
    {
        return " "+vehicleType+" "+idPlate+" "+brand+" "+entryTime+
                " "+exitTime;
    }
}