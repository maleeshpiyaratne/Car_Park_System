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
public class Datetimestamp 
{
    // declare class variables 
    int entry_day;
    int entry_month;
    int entry_year;
    
    int exit_day;
    int exit_month;
    int exit_year;
    
    int entry_hour;
    int entry_min;
    
    int exit_hour;
    int exit_min;
    
    int [][] days_in_month = new int [12][2];
    
    Scanner sc;
    
    static double total_days;
    
    public Datetimestamp()
    {
        
        //setting initial value as zero.
        entry_day = 5;
        entry_month = 9;
        entry_year = 2017;
        
        exit_day = 13;
        exit_month = 12;
        exit_year = 2017;
        
        entry_hour = 7;
        entry_min = 35;
        
        exit_hour = 19;
        exit_min = 15;
        
        //set the number of months
        days_in_month[0][0] = 1;
        days_in_month[1][0] = 2;
        days_in_month[2][0] = 3;
        days_in_month[3][0] = 4;
        days_in_month[4][0] = 5;
        days_in_month[5][0] = 6;
        days_in_month[6][0] = 7;
        days_in_month[7][0] = 8;
        days_in_month[8][0] = 9;
        days_in_month[9][0] = 10;
        days_in_month[10][0] = 11;
        days_in_month[11][0] = 12;
        
        //set number of days in each month
        days_in_month[0][1] = 31;
        days_in_month[1][1] = 28;
        days_in_month[2][1] = 31;
        days_in_month[3][1] = 30;
        days_in_month[4][1] = 31;
        days_in_month[5][1] = 30;
        days_in_month[6][1] = 31;
        days_in_month[7][1] = 31;
        days_in_month[8][1] = 30;
        days_in_month[9][1] = 31;
        days_in_month[10][1] = 30;
        days_in_month[11][1] = 31;
        
        sc = new Scanner(System.in);
        
        total_days = 0;
    }
    
    public void setEntryDate() 
    {
        System.out.println("(Please enter the date, a value at a time.)");
        System.out.println("Day:(double digit between 01 -31)");
        entry_day = sc.nextInt();
        System.out.println("Month:(double digit between 01 - 12)");
        entry_month = sc.nextInt();
        System.out.println("Year: (four digit between 2015 - 2018)");
        entry_year = sc.nextInt();
    }
    public void setEntryTime() 
    {
        System.out.println("(Please enter the time, a value at a time.)");
        System.out.println("Hour:(double digit using 24 hour clock)");
        entry_hour = sc.nextInt();
        System.out.println("Minutes: (double digit between 00 - 59)");
        entry_min = sc.nextInt();
    }
    
    public void setExitDate() 
    {
        System.out.println("(Please enter the date, a value at a time.)");
        System.out.println("Day:(double digit between 01 -31)");
        exit_day = sc.nextInt();
        System.out.println("Month:(double digit between 01 - 12)");
        exit_month = sc.nextInt();
        System.out.println("Year: (four digit between 2015 - 2018)");
        exit_year = sc.nextInt();
    }
    public void setExitTime() 
    {
        System.out.println("(Please enter the time, a value at a time.)");
        System.out.println("Hour:(double digit using 24 hour clock)");
        exit_hour = sc.nextInt();
        System.out.println("Minutes: (double digit between 00 - 59)");
        exit_min = sc.nextInt();
    }
    
    private void calculate_duration()
    {
        if(entry_year == exit_year)
        {
            if(entry_month == exit_month)
            {
                if(entry_day == exit_day)
                {
                    //calculate time parked in mins.
                    //assuming vehicle was parked for a period within 24 hours(one day).
                    this.calulate_time_in_day();
                    
                }else
                {
                    this.calculate_time_in_month();
                }
            }else
            {
                if((entry_month - exit_month) == 1)
                {
                    //assuming vehicle was parked during a period of two different months or more;
                    int initial_month_days = days_in_month[entry_month-1][1] - entry_day;
                    int days_passed_in_total = initial_month_days + exit_day;
                    int time_mins = 60 - entry_min;
                    int time_hours = 24 - (entry_hour+1);
                    
                }else
                {
                    int num_of_months = exit_month - (entry_month + 1);
                    int initial_month_days = days_in_month[entry_month-1][1] - entry_day;
                    int time_mins = 60 - entry_min;
                    int time_hours = exit_hour - entry_hour;
                }
                
                
            }
            
        }else
        {
        }
        
    }
    
    // assuming vehicle was only parked during one day
    private void calulate_time_in_day()
    {
        int initial_hour_mins = 60 - entry_min;
        int hours_into_mins = (exit_hour - (entry_hour +1))*60;
        int total_mins = initial_hour_mins + hours_into_mins + exit_min;
        double total_hours = total_mins/60;
        double remaining_mins = total_mins%60;
    }
    
    private void calculate_time_in_month()
    {
        //assuming vehicle was parked for more than one day but within the same month.
        int initial_hour_mins = 60 - entry_min;
        int initial_day_hours_in_mins = (24 - (entry_hour + 1))*60;
        int days_passed_in_mins = ((exit_day - (entry_day + 1))*24)*60;
        int total_mins = initial_hour_mins + initial_day_hours_in_mins + 
                days_passed_in_mins + (exit_hour*60) + exit_min;
    }
    private void calculate_time_between_two_months()
    {
        int initial_hour_mins = 60 - entry_min;
        int initial_day_hours_in_mins = (24 - (entry_hour + 1))*60;
        int initial_month_days_in_mins = days_in_month[entry_month - 1][1] - entry_day;
    }
}
