

import java.io.Serializable;

public class Address implements Cloneable, Comparable<Address>, Serializable
{
    private int streetNum;
    private String street;
    private String suburb;
    private String city;

    Address(int streetNum, String street, String suburb, String city)
    {
        this.streetNum = streetNum;
        this.street = street;
        this.suburb = suburb;
        this.city = city;
    }

    // public Address(Address address) //copy constructor
    // {
    //     streetNum = address.streetNum;
    //     street = address.street;
    //     suburb = address.suburb;
    //     city = address.city;
    // }

    // public Address clone() throws CloneNotSupportedException
    // {
    //     Address output = (Address) super.clone();
    //     return  output;
    // }

    public String getCity() 
    {
        return city;
    }
    
    
    public int getStreetNum() {
        return streetNum;
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }
    
    public void setStreetNum(int streetNum) 
    {
        this.streetNum= streetNum;
    }
    
    public void setStreet(String street) 
    {
        this.street = street;
    }
    
    public void setSuburb(String suburb) 
    {
        this.suburb = suburb;
    }

    public void print()
    {
        System.out.println(streetNum + " "  + street + ", " + suburb + ", " + city);
    }

    public String toString()
    {
        return "Street Number:" + streetNum + " Street:" + street + " Suburb:" + suburb + " City:" + city;
    }

    //lab4------------------------------------------------

    public Address(Address address) //copy constructor
    {
        streetNum = address.streetNum;
        street = address.street;
        suburb = address.suburb;
        city = address.city;
    }

    public Address clone() throws CloneNotSupportedException
    {
        Address output = (Address) super.clone();
        return  output;
    }
    
    public int compareTo (Address other)
    {
        return this.city.compareTo (other.city);
    }

    public String toDilimatedString()
    {
        return streetNum + "-" + street + "-" + suburb + "-" + city;
    }

    public static Address loadRecords(String line) 
    {
        line = line.trim ();
        String[] field = line.split("-");
        int streetNum = Integer.parseInt(field[0]);
        String street = field[1];
        String suburb = field[2];
        String city = field[3]; 
        return new Address(streetNum, street, suburb, city);
    }
}
