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

    private String[][] parkingSlots = new String[20][9];
    
    Scanner sc = new Scanner(System.in);

    int slot_num = Coursework_01_CPS.slotCount;
    
    String plateid = "";
    
    DateTime currentDT;
    
    public WestminsterCarParkManager() 
    {
        for (int i = 0; i < 20; i++) 
        {
            parkingSlots[i][0] = "INDEX NO";
            parkingSlots[i][1] = "TYPE";
            parkingSlots[i][2] = "PLATE ID";
            parkingSlots[i][3] = "BRAND";
            parkingSlots[i][4] = "ENTRY TIME";
            parkingSlots[i][5] = "Number of Doors";
            parkingSlots[i][6] = "Colour";
            parkingSlots[i][7] = "Cargo Volume";
            parkingSlots[i][8] = "Engine Size";
        }
        
    }

    public void displayConsoleMenu() 
    {
        System.out.println("---- Welcome to the Westminster Car Park ----");
        System.out.println(" Select a command from below: ");
        System.out.println(" (Enter the number of the command to excute)\n");
        System.out.println("  1. Add a Vehicle");
        System.out.println("  2. Delete a Vehicle");
        System.out.println("  3. Print Statistics");
        System.out.println("  4. Print List from Past Date");
        System.out.println("  5. Print Parking Fee");
        System.out.println(" (Enter 10 to teminate the program)");
    }

    //add car
    @Override
    public void addVehicle(String type, String idplate, String brand,
            DateTime entrytime, int noofdoors, String colour) 
    {
        Car car = new Car(type, idplate, brand, entrytime, noofdoors, colour);
        parkingSlots[slot_num][0] = Coursework_01_CPS.slotCount+"";
        parkingSlots[slot_num][1] = "car";
        parkingSlots[slot_num][2] = car.getIdPlate();
        parkingSlots[slot_num][3] = car.getBrand();
        parkingSlots[slot_num][4] = car.getEntryTime().toString();
        parkingSlots[slot_num][5] = car.getNoOfDoors()+"";
        parkingSlots[slot_num][6] = car.getColour();
        parkingSlots[slot_num][7] = null;
        parkingSlots[slot_num][8] = null;
    }
    // add van
    @Override
    public void addVehicle(String type, String idplate, String brand,
            DateTime entrytime, double cargovol) 
    {
        Van van = new Van(type, idplate, brand, entrytime, cargovol);
        parkingSlots[slot_num][0] = Coursework_01_CPS.slotCount+"";
        parkingSlots[slot_num][1] = "van";
        parkingSlots[slot_num][2] = van.getIdPlate();
        parkingSlots[slot_num][3] = van.getBrand();
        parkingSlots[slot_num][4] = van.getEntryTime().toString();
        parkingSlots[slot_num][5] = null;
        parkingSlots[slot_num][6] = null;
        parkingSlots[slot_num][7] = van.getCargoVolume()+"";
        parkingSlots[slot_num][8] = null;
        
        parkingSlots[slot_num-1][0] = Coursework_01_CPS.slotCount+"";
        parkingSlots[slot_num-1][1] = "van";
        parkingSlots[slot_num-1][2] = van.getIdPlate();
        parkingSlots[slot_num-1][3] = van.getBrand();
        parkingSlots[slot_num-1][4] = van.getEntryTime().toString();
        parkingSlots[slot_num-1][5] = null;
        parkingSlots[slot_num-1][6] = null;
        parkingSlots[slot_num-1][7] = van.getCargoVolume()+"";
        parkingSlots[slot_num-1][8] = null;
    }

    //add bike
    @Override
    public void addVehicle(String type, String idplate, String brand,
            DateTime entrytime, int enginesize) 
    {
        Bike bike = new Bike(type, idplate, brand, entrytime, enginesize);
        parkingSlots[slot_num][0] = Coursework_01_CPS.slotCount+"";
        parkingSlots[slot_num][1] = "bike";
        parkingSlots[slot_num][2] = bike.getIdPlate();
        parkingSlots[slot_num][3] = bike.getBrand();
        parkingSlots[slot_num][4] = bike.getEntryTime().toString();
        parkingSlots[slot_num][5] = null;
        parkingSlots[slot_num][6] = null;
        parkingSlots[slot_num][7] = bike.getEngineSize()+"";
        parkingSlots[slot_num][8] = null;
    }

    @Override
    public void deleteVehicle(String idplate) 
    {
        int i =0;
        this.plateid = idplate;
        System.out.println("Vehicle type: "+parkingSlots[i][1]+"with plate ID: "+idplate);
        
        while(!parkingSlots[i][2].equals(plateid))
        {
            
            parkingSlots[i][0] = "INDEX NO";
            parkingSlots[i][1] = "TYPE";
            parkingSlots[i][2] = "PLATE ID";
            parkingSlots[i][3] = "BRAND";
            parkingSlots[i][4] = "ENTRY TIME";
            parkingSlots[i][5] = "Number of Doors";
            parkingSlots[i][6] = "Colour";
            parkingSlots[i][7] = "Cargo Volume";
            parkingSlots[i][8] = "Engine Size";
                
            i++;
        }
    }
        

    @Override
    public void printCurrentLot() {
        for (int i = 0; i < 20; i++) 
        {
            System.out.print("\n");
            for (int j = 0; j < 10; j++) 
            {
                System.out.print(parkingSlots[i][j] + " ");
            }
        }
    }

    @Override
    public void printPercentage() 
    {
        int carint=0;
        int vanint=0;
        int bikeint=0;
        
        for(int i=0; i<20;i++)
        {
            if(parkingSlots[i][1].equalsIgnoreCase("car"))
            {
                carint++;
            }
            if(parkingSlots[i][1].equalsIgnoreCase("van"))
            {
                vanint++;
            }
            if(parkingSlots[i][1].equalsIgnoreCase("bike"))
            {
                bikeint++;
            }
        }
        
        carint = (carint/20)*100;
        vanint = (vanint/20)*100;
        bikeint = (bikeint/20)*100;
        
        System.out.println("Percentage of Cars: "+carint+"%");
        System.out.println("Percentage of Vans: "+vanint+"%");
        System.out.println("Percentage of Bikes: "+bikeint+"%");
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

    @Override
    public void printDate(DateTime dt) 
    {
        DateTime specificDT = new DateTime();
        //file reading writing
    }

    @Override
    public void genFee(String idPlate) 
    {
        
        String plateid = idPlate;
        genCurrentTime();
        //casting
                
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
        
        currentDT = new DateTime(d,m,y,h,mins);
    }
    
}
