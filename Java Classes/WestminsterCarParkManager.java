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

public class WestminsterCarParkManager implements CarParkManager 
{
    //initialise fix array.
        Vehicle vehicle [] = new Vehicle[20];
        
    //count the number of vehicles parked
    static int count = 0;
    
    //help with user input
    Scanner sc = new Scanner(System.in);
    
    //private String[][] parkingSlots = new String[20][9];
    //int slot_num = Coursework_01_CPS.slotCount;
    //String plateid = "";
    //DateTime currentDT;
    
    public WestminsterCarParkManager() 
    {
        
        
        try{
        //intialise array
        for(int i = 0; i < 20; i++)
        {
            vehicle[i].setVehicleType(" ");
            vehicle[i].setIdPlate(" ");
            vehicle[i].setBrand(" ");
            vehicle[i].setEntryTime(new DateTime(0,0,0,0,0));
            vehicle[i].setExitTime(new DateTime(0,0,0,0,0));
        }
        }catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }

    //Used to show the menu and to help prompt information from the user.
    public void displayConsoleMenu() 
    {
        System.out.println("\n----- Welcome to the Westminster Car Park -----");
        System.out.println(" Select a command from below: ");
        System.out.println(" (Enter the number of the command to excute)\n");
        System.out.println("  1. Add a Vehicle");
        System.out.println("  2. Delete a Vehicle");
        System.out.println("  3. Print List");
        System.out.println("  4. Print Statistics");
        System.out.println("  5. Print List from Past Date");
        System.out.println("  6. Print Parking Fee");
        System.out.println(" (Enter 10 to teminate the program)");
    }

    //add car
    @Override
    public void addVehicle(String type, String idplate, String brand,
            DateTime entrytime, int noofdoors, String colour) 
    {
        //create vehicle object
        vehicle[count] = new Car(type, idplate, brand, entrytime, 
                noofdoors, colour);
        //increment counter 
        count++;
    }
    
    // add van
    @Override
    public void addVehicle(String type, String idplate, String brand,
            DateTime entrytime, double cargovol) 
    {
        //for loop to repeat
        //repetiction to allocate 2 slots for the van
        for(int i = 0; i < 2; i++){
        //create vehicle object
        vehicle[count] = new Van(type, idplate, brand, entrytime, cargovol);
        // increase the counter (repeater below)
        count++;
        }
    }
    
    //add bike
    @Override
    public void addVehicle(String type, String idplate, String brand,
            DateTime entrytime, int enginesize) 
    {
        //create vehicle object
        vehicle[count] = new Bike(type, idplate, brand, entrytime, enginesize);
        //increase the counter 
        count++;
    }

    //delete any type of vehicle
    @Override
    public void deleteVehicle(String idplate) 
    {
        //declare row identifying int
        int i = 0;
        
        //while loop to search for the right row holding the recieved id.
        while(!(vehicle[i].getIdPlate().equalsIgnoreCase(idplate))){
            i++;
        }
        
        //display what is being deleted
        System.out.println("Vehicle type: "+vehicle[i].getVehicleType()+
                " with plate ID: "+vehicle[i].getIdPlate()+" is deleted!");
        
        try{
        //if array object is a van, set a second object to null.
        if(vehicle[i].getVehicleType().equalsIgnoreCase("van"))
        {
            //set array object to null
            vehicle[i] = null;
            vehicle[i+1] = null;
            count+=2;
        }else
        {
            //set array object to null and increase count
            vehicle[i] = null;
            count++;
        }
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    //Print the parking lot with last in as fist out(LIFO)
    public void printLotInorder()
    {
        
        //int datetime_int = this.datetime_int("");
    }

    private void datetime_int(DateTime dt)
    {
        int day = dt.getDay();
        int month = dt.getMonth();
        int year = dt.getYear();
        int hour = dt.getHour();
        int minutes = dt.getMinutes();
        
        //to total the date and time into a single value in minutes
        int total_mins = 0;
        // to help access the different number of day in a month.
        int minus = 1;
        
        total_mins += minutes + (60*hour) + (60*24*day) + dt.outof365[month-1];
        
    }
    // no chonological order lot
    @Override
    public void printCurrentLot()
    {
        for(int i = 0; i < 20; i++)
        {
            System.out.print("\n");
            try
            {
            System.out.println((i+1)+vehicle[i].toString());
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void printPercentage() 
    {
        //declare counting vehicle type variables
        int carint=0;
        int vanint=0;
        int bikeint=0;
        try{
        //go through the whole array
        for(int i=0; i<20;i++)
        {
            //if conditions to increment the right int variable count.
            if(vehicle[i].getVehicleType().equalsIgnoreCase("car"))
            {
                carint++;
            }
            else if(vehicle[i].getVehicleType().equalsIgnoreCase("van"))
            {
                vanint++;
            }
            else if(vehicle[i].getVehicleType().equalsIgnoreCase("bike"))
            {
                bikeint++;
            }
        }
        }catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        //convert value to out of 100 per cent
        carint = (carint/20)*100;
        vanint = (vanint/20)*100;
        bikeint = (bikeint/20)*100;
        
        //display the percentages to console
        System.out.println("Percentage of Cars: "+carint+"%");
        System.out.println("Percentage of Vans: "+vanint+"%");
        System.out.println("Percentage of Bikes:    "+bikeint+"%");
    }

    @Override
    public void printLongestPark() {
        genCurrentTime();
        //casting 
        
    }

    @Override
    public void printLastParked() {
        //casting
    }

    // print vehicle parked on date promt by user
    @Override
    public void printDate(DateTime dt) 
    {
        for(int i = 0; i <20; i++)
        {
            // if dateTime date is equalt to date of vehicle entry date print 
            //to console.
            if(vehicle[i].getEntryTime().getYear() == dt.getYear())
            {
                if(vehicle[i].getEntryTime().getMonth() == dt.getMonth())
                {
                    if(vehicle[i].getEntryTime().getDay() == dt.getDay())
                    {
                        System.out.println(vehicle[i].toString());
                    }
                }
            }
        }
        
    }

    @Override
    public void genFee(String idPlate) 
    {
        
        String plateid = idPlate;
        genCurrentTime();
                
    }
    private void genCurrentTime()
    {
        int d;
        int m;
        int y;
        int h;
        int mins;
        
        System.out.println("Please enter date and time right now: ");
        System.out.println("Day: ");
        d = sc.nextInt();
        System.out.println("Month: ");
        m = sc.nextInt();
        System.out.println("Year: ");
        y = sc.nextInt();
        System.out.println("Hour: ");
        h = sc.nextInt();
        System.out.println("Minutes: ");
        mins = sc.nextInt();
        
        //currentDT = new DateTime(d,m,y,h,mins);
    }
    
    public void displayAvailability()
    {
        //declare and initiale int value
        //required to handle the if condition and print statement
        int available = 20;
        available -= count;
        
        if(available == 0)
        {
            System.out.println("Sorry there is no available space in the lot.");
        }
        System.out.println("There are "+available+" paking slots available.");
        
    }
    /*public String returnVType(String id)
    {
        int row = 0;
        
        while(!(parkingSlots[row][2].equalsIgnoreCase(id))){
            row++;
        }
        
        return parkingSlots[row][1];
    }*/
    // compare entered id with ids in the array
    public boolean checkForExistingId(String id)
    {
        //declare and initialise for if condition pupose
        boolean exist = false;
        int i = 0;
        
        try
        {
        do
        {
            //check if the id matches stored id.
            if(vehicle[i].getIdPlate().equalsIgnoreCase(id))
            {
                exist = true;
            }
            //to end the loop after finding the id
            if(exist == true){break;}
            i++;
            
        }while(i < 20);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        if (exist)
        {
            System.out.println("Sorry this id exists, pleese enter a new one.");
            return true;
        }else
        {
            return false;
        }
        
    }
}
