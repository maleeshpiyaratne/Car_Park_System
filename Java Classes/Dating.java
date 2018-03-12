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
public class Dating 
{
    //initialise all attributes
    int entry_day;
    int entry_month;
    int entry_year;
    
    int exit_day;
    int exit_month;
    int exit_year;
    
    int total_mins_entry;
    int total_mins_exit;
    int difference_in_days;
    
    int entry_hour;
    int entry_min;
    
    int exit_hour;
    int exit_min;
    
    int total_hours;
    int total_mins;
    
    int [][] days_in_month = new int [12][2];
    
    //constructor with zero attributes gathered
    // all attributes set to a default value
    public Dating()
    {
        this.entry_day = 0;
        this.entry_month = 0;
        this.entry_year = 0;
        
        this.exit_day = 0;
        this.exit_month = 0;
        this.exit_year = 0;
        
        total_mins_entry = 0;
        total_mins_exit = 0;
        difference_in_days = 0;
        
        this.entry_hour = 0;
        this.entry_min = 0;
        
        this.exit_hour = 0;
        this.exit_min = 0;
        
        total_hours = 0;
        total_mins = 0;
        
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
    }
    
    //constructor which gathers all attributes
    // and set ungathered one to default.
    public Dating(int entry_day, int entry_month, int entry_year, int entry_hour, 
            int entry_min, int exit_day, int exit_month, int exit_year, 
            int exit_hour, int exit_min)
    {
        this.entry_day = entry_day;
        this.entry_month = entry_month;
        this.entry_year = entry_year;
        
        this.exit_day = exit_day;
        this.exit_month = exit_month;
        this.exit_year = exit_year;
        
        total_mins_entry = 0;
        total_mins_exit = 0;
        difference_in_days = 0;
        
        this.entry_hour = entry_hour;
        this.entry_min = entry_min;
        
        this.exit_hour = exit_hour;
        this.exit_min = exit_min;
        
        total_hours = 0;
        total_mins = 0;
        
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
    }
    
    //initial days minutes plus the last days minutes.
    public void entry_in_minutes()
    {
        total_mins_entry += entry_min;
        total_mins_entry += 60*entry_hour;
        total_mins_entry += 60*24*entry_day;
        
        //add all days in each month through a while loop
        int count = 0;
        
        //equate to 1 so that the entry month days dont get added but 
        //all the previous month's days will be added.
        while((entry_month - count) == 1)
        {
            total_mins_entry += 60*24*days_in_month[count][1];
            count++;
        }
    }
    
    public void exit_in_minutes()
    {
        total_mins_exit += exit_min;
        total_mins_exit += 60*exit_hour;
        total_mins_exit += 60*24*exit_day;
        
        int count = 0;
        
        while(!((exit_month - count) == 1))
        {
            total_mins_exit += 60*24*days_in_month[count][1];
            count++;
        }
    }
    
    @Override
    public String toString()
    {
        return "Entry Day:"+entry_day+
               "\nEntry Month:"+entry_month+
               "\nEntry Year:"+entry_year+
               "\nEntry Hour:"+entry_hour+
               "\nEntry Minute:"+entry_min+
               "\nExit Day:"+exit_day+
               "\nExit Month:"+exit_month+
               "\nExit Year:"+exit_year+
               "\nExit Hour:"+exit_hour+
               "\nExit Minute:"+exit_min;
    }
}
