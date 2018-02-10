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
        System.out.println("(Please enter the date a slot at a time.)");
        System.out.println("Which day of the month is it?");
        day = sc.nextInt();
        System.out.println("Of which month?");
        month = sc.nextInt();
        System.out.println("Of which year?");
        year = sc.nextInt();
    }

    public void setTime() 
    {
        System.out.println("(Please enter the time a slot at a time.)");
        System.out.println("What hour of the day is it?\n(24 hour clock)");
        hour = sc.nextInt();
        System.out.println("How many minutes passed?");
        minutes = sc.nextInt();
    }

    public String toString() 
    
    {
        return "Date: " + day + "/" + month + "/" + year + " Time: " + hour + ":" + minutes;
    }
}
