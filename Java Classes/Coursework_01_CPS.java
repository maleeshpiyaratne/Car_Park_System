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

    //static variables used in this class
    private static int command = 0;
    
    //protected static int slotCount = 19;

    public static void main(String[] args)
    {
        //declare the necessary objects
        Scanner sc = new Scanner(System.in);
        WestminsterCarParkManager wcpm = new WestminsterCarParkManager();
        
        //used to capture the date and time from user and set it into the method
        //and set to the dateTime of the vehicle object.
        DateTime dt = new DateTime();
        
        do 
        {
            //display menu
            wcpm.displayConsoleMenu();

            //get user command
            command = sc.nextInt();

            // will execute case depending on user input to command variable
            switch (command) 
            {
                // CASE add vehicle
                case 1:
                    
                    //Check available space
                    //if count is NOT Equal to 20, Execute.
                    if ( !(WestminsterCarParkManager.count == 20))
                    {
                        //show available parking space
                        wcpm.displayAvailability();
                        
                        //declare necessary varibale to add a vehicle
                        int vtypeInt = 0;
                        String type;
                        String idplate;
                        String brand;
                        DateTime entryTime;
                        
                        // prompt vehicle type 
                        System.out.println("\nSelect vehicle type: ");
                        System.out.println(" 1. Car\n 2. Van\n 3. Motorbike");
                        vtypeInt = sc.nextInt();
                        
                        //do while loop to check if the idplate enter is unique
                        //to the array of parked cars.
                        do{
                            
                        //prompt vehicle plate id
                        System.out.println("\nPlease enter plate id:");
                        idplate = sc.next();
                        
                        }while(wcpm.checkForExistingId(idplate));
                        
                        //prompt vehicle brand
                        System.out.println("\nPlease enter brand:");
                        brand = sc.next();
                        
                        //prompt date and time
                        dt.setDate();
                        dt.setTime();
                        entryTime = dt;
                        
                        // if car 
                        if (vtypeInt == 1) 
                        {
                            //declare necessary variables specific to car
                            type = "car";
                            int noofdoors;
                            String colour;
                            
                            //prompt number of doors
                            System.out.println("Please enter the Number of Doors"
                                    + " on your car:");
                            noofdoors = sc.nextInt();
                            
                            //prompt the colour of the vehicle
                            System.out.println("Please enter the colour of your"
                                    + " car:");
                            colour = sc.next();
                            
                            //pass gathered info through manager object
                            wcpm.addVehicle(type, idplate, brand, entryTime,
                                    noofdoors, colour);
                            
                            // show user available space after parking vehicle
                            wcpm.displayAvailability();
                        } 
                        else if (vtypeInt == 2) 
                        {
                            if(!(WestminsterCarParkManager.count == 19))
                            {
                                //declare necessary variables specific to van                            
                                type = "van";
                                double cargovol;

                                //prompt cargo volume of the van
                                System.out.println("Please enter the cargo volume "
                                                + "of your van:");
                                cargovol = sc.nextDouble();

                                //pass gathered info through manager object
                                wcpm.addVehicle(type, idplate, brand, entryTime, 
                                               cargovol);
                            
                                // show user available space after parking vehicle
                                wcpm.displayAvailability();
                            }
                        } 
                        else if (vtypeInt == 3) 
                        {
                            //declare the necessary variable unique to bike
                            type = "bike";
                            int enginesize;

                            //prompt for the bike's engine size
                            System.out.println("Please enter the engine size"
                                    + " your motorbike:");
                            enginesize = sc.nextInt();

                            //enter the gather vehicle information into the manager object
                            wcpm.addVehicle(type, idplate, brand, entryTime, 
                                    enginesize);
                            
                            // show user available space after parking vehicle
                            wcpm.displayAvailability();
                        }
                        else{
                            System.out.println("Sorry you have selected vehicle"
                                    + " type incorrectly. RESTART AND TRY AGAIN.");
                        }
                    }else 
                    {
                        // if slot count is < 1 display below nessage.
                        System.out.println("Sorry, the car park is FULL at the moment");
                    }
                    break;
                    
                // CASE delete vehicle
                case 2:
                    ///prompt id plate to uniquely identify vehicle for deletion.
                    System.out.println("Please enter the vehicle id plate for deletion:");
                    String idplate = sc.next();
                    
                    // pass the id plate and call the delete method of the car park manager
                    wcpm.deleteVehicle(idplate);
                    
                    //show the available space after vehicle left.
                    wcpm.displayAvailability();
                    break;
                    
                // CASE Print list in chronological order
                case 3:
                    wcpm.printCurrentLot();
                    break;
                    
                //CASE Print the statistics of the array
                case 4:
                    wcpm.printPercentage();
                    System.out.println("Parked Longest: ");
                    System.out.println("Parked Last: ");
                    break;
                    
                // print vehicles on a specific date
                case 5:
                    dt.setDate();
                    wcpm.printDate(dt);
                    break;
            }
        } while (command != 10);

    }

}
