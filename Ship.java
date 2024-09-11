/*
    This program is for practicing with File IO.
    D. McCrary
    04/24/24
 */

import javax.swing.*;

public class Ship 
{
    private String name;
    private int year;
    private String country;


    public Ship(String name, int year, String country)
    {
        this.name = name;
        this.year = year;
        this.country = country;
    }
    
    public String toString()
    {
        return getName()+", "+getYear()+","+" flag: "+getCountry();
    }

    public String getName() 
    {
        return name;
    }

    public int getYear() 
    {
        return year;
    }

    public String getCountry() 
    {
        return country;
    }
}
