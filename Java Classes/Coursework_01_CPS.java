/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_01_cps;

import java.util.Scanner;

/**
 *
 * @author Maleesh Dilshan
 */
public class Coursework_01_CPS 
{

    /**
     * @param args the command line arguments
     */
    static int command = 0;
    static int slotCount = 20;

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        WestminsterCarParkManager wcps = new WestminsterCarParkManager();

        DateTime dt = new DateTime();
        do 
        {
            //display menu
            wcps.displayConsoleMenu();

            //get command selection
            command = sc.nextInt();

            switch (command) 
            {
                // CASE add vehicle
                case 1:
                    //Check available space
                    if (slotCount >= 1) 
                    {
                        System.out.println("\nThere are " + slotCount + " avaliable");

                        int vtypeInt = 0;
                        String type;
                        String idplate;
                        String brand;
                        DateTime entryTime;

                        System.out.println("\nSelect vehicle type: ");
                        System.out.println(" 1. Car\n 2. Van\n 3. Motorbike");
                        vtypeInt = sc.nextInt();
                        System.out.println("\nPlease enter plate id:");
                        idplate = sc.next();
                        System.out.println("\nPlease enter brand:");
                        brand = sc.next();
                        dt.setDate();
                        dt.setTime();
                        entryTime = dt;
                        
                        if (vtypeInt == 1) 
                        {
                            type = "car";
                            int noofdoors;
                            String colour;

                            System.out.println("Please enter the Number of Doors on your car:");
                            noofdoors = sc.nextInt();
                            System.out.println("Please enter the colour of your car:");
                            colour = sc.next();
                            wcps.addVehicle(type, idplate, brand, entryTime,
                                    noofdoors, colour);
                            slotCount -= 1;
                        } 
                        else if (vtypeInt == 2) 
                        {
                            type = "van";
                            double cargovol;

                            System.out.println("Please enter the cargo volume of your van:");
                            cargovol = sc.nextDouble();

                            wcps.addVehicle(type, idplate, brand, entryTime, 
                                    cargovol);
                            slotCount -= 2;
                        } 
                        else if (vtypeInt == 3) 
                        {
                            type = "bike";
                            int enginesize;

                            System.out.println("Please enter the engine size your motorbike:");
                            enginesize = sc.nextInt();

                            wcps.addVehicle(type, idplate, brand, entryTime, 
                                    enginesize);
                            slotCount -= 1;
                        }
                    } 
                    else 
                    {
                        System.out.println("Sorry, the car park is FULL at the moment");
                    }
                    break;
                // CASE delete vehicle
                case 2:
                    System.out.println("Please enter the vehicle id plate for deletion:");
                    String idplate = sc.next();
                    wcps.deleteVehicle(idplate);
                    slotCount++;
                    System.out.println("There are "+slotCount+" available now.");
                    break;
                // CASE Print Stats
                case 3:
                    System.out.println("Percentage of Cars: ");
                    System.out.println("Percentage of Vans: ");
                    System.out.println("Percentage of Motorbikes: ");
                    System.out.println("Parked Longest: ");
                    System.out.println("Parked Last: ");
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (command != 10);

    }

}
