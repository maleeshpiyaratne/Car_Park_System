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

    private String vehicleType;
    private String idPlate;
    private String brand;
    private DateTime entryTime;

    public Vehicle(String type, String idplate, String brand,
            DateTime entrytime) 
    {
        this.vehicleType = type;
        this.idPlate = idplate;
        this.brand = brand;
        this.entryTime = entrytime;
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

    public void setVType(String vehicleType) 
    {
        this.vehicleType = vehicleType;
    }

    public void setIDPlate(String idPlate) 
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

}