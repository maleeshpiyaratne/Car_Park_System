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

public class DateTime 
{
    int day;
    int month;
    int year;
    int hour;
    int minutes;

    int total_days = 365;
    
    String [] months = {"January", "February", "March", "April", "May",
    "June", "July", "Augast", "September", "October", "November", "December"};
    
    int [] outof365 = {31,59,90,120,151,181,212,243,273,304,334,365};
    
    int int_date = 0;
    
    Scanner sc = new Scanner(System.in);

    public DateTime() 
    {
    }

    public DateTime(int d, int m, int y, int h, int mins) 
    {
        day = d;
        month = m;
        year = y;
        hour = h;
        minutes = mins;
    }

    public int getDay() 
    {
        return day;
    }
    public int getMonth() 
    {
        return month;
    }
    public int getYear() 
    {
        return year;
    }
    public int getHour() 
    {
        return hour;
    }
    public int getMinutes() 
    {
        return minutes;
    }

    public void setDate() 
    {
        System.out.println("(Please enter the date, a value at a time.)");
        System.out.println("Day:(double digit between 01 -31)");
        day = sc.nextInt();
        System.out.println("Month:(double digit between 01 - 12)");
        month = sc.nextInt();
        System.out.println("Year: (four digit between 2015 - 2018)");
        year = sc.nextInt();
    }
    public void setTime() 
    {
        System.out.println("(Please enter the time, a value at a time.)");
        System.out.println("Hour:(double digit using 24 hour clock)");
        hour = sc.nextInt();
        System.out.println("Minutes: (double digit between 00 - 59)");
        minutes = sc.nextInt();
    }
    
    public void date_as_int()
    {
        int_date += day;
        
        switch(month)
        {
            case 1:
                int_date += outof365[0];
                break;
            case 2:
                int_date += outof365[1];
                break;
            case 3:
                int_date += outof365[2];
                break;
            case 4:
                int_date += outof365[3];
                break;
            case 5:
                int_date += outof365[4];
                break;
            case 6:
                int_date += outof365[5];
                break;
            case 7:
                int_date += outof365[6];
                break;
            case 8:
                int_date += outof365[7];
                break;
            case 9:
                int_date += outof365[8];
                break;
            case 10:
                int_date += outof365[9];
                break;
            case 11:
                int_date += outof365[10];
                break;
            case 12:
                int_date += outof365[11];
                break;
        }
    }

    public String toString() 
    {
        return "Date: " + day + "/" + month + "/" + year + " Time: " + hour +
                ":" + minutes;
    }

}
