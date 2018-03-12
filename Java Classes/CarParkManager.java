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

public interface CarParkManager 
{
    // add car
    public abstract void addVehicle
        (String type, String idPlate, String brand, DateTime entrytime, 
                int noofdoors, String colour);

    //add van
    public abstract void addVehicle
        (String type, String idPlate, String brand, DateTime entrytime, 
                double cargovol);

    //add bike
    public abstract void addVehicle
        (String type, String idPlate, String brnad, DateTime entrytime, 
                int enginesize);

    //delete any vehicle
    public abstract void deleteVehicle(String idPlate);

    //print current parking lot list
    public abstract void printCurrentLot();

    //stats percentage of each type of vehicle
    public abstract void printPercentage();

    //find and display vehicle parked the longest
    public abstract void printLongestPark();

    //find and display vehicle parked last
    public abstract void printLastParked();

    //print parking lot in date and time order
    public abstract void printDate(DateTime dt);

    // calulate and display a fee for the parked duration
    public abstract void genFee(String idPlate);

}
