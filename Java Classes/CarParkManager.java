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
    public abstract void addVehicle(String type, String idPlate, String brand,
            DateTime entrytime, int noofdoors, String colour);

    //add van
    public abstract void addVehicle(String type, String idPlate, String brand,
            DateTime entrytime, double cargovol);

    // add bike
    public abstract void addVehicle(String type, String idPlate, String brnad,
            DateTime entrytime, int enginesize);

    public abstract void deleteVehicle(String idPlate);

    public abstract void printCurrentLot();

    public abstract void printPercentage();

    public abstract void printLongestPark();

    public abstract void printLastParked();

    public abstract void printDate(DateTime dt);

    public abstract void genFee(String idPlate);

}
