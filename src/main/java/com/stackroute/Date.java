/*Write a java program to calculate first and last date of a week.
Output:
First Date of Week: Mon 24/07/2017
Last date of the week: Sun 30/07/2017*/

package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {


    public void weekdate()
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); //setting date
        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println("First Date of the week: " + df.format(c.getTime())); //printing first day
        for (int i = 0; i <6; i++) //finding last week day
        {
            c.add(Calendar.DATE, 1);
        }
        System.out.println("Last Date of the week: " + df.format(c.getTime())); //printing last day
        System.out.println();
    }
    public static void main(String []args)
    {
        Date ob = new Date();
        ob.weekdate();
    }
}