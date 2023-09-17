
import java.io.IOException;
import java.io.Serializable;

enum MobileType
{
    Android,
    IOS,
    Windows
}

public class MobilePhone implements Cloneable, Serializable
{
    private String model;
    private MobileType type;
    private int memorySize;
    private double price;

    public MobilePhone(String model, MobileType type, int memorySize, double price)
    {
        this.model = model;
        this.type = type;
        this.memorySize = memorySize;
        this.price = price;
    }

    // public MobilePhone(MobilePhone phone) //copy constructor
    // {
    //     model = phone.model;
    //     type = phone.type;
    //     memorySize = phone.memorySize;
    //     price = phone.price;
    // }

    // public MobilePhone clone() throws CloneNotSupportedException
    // {
    //     MobilePhone output = (MobilePhone) super.clone();
    //     //mobile type?
    //     return  output;
    // }

    public double getPrice() 
    {
        return price;
    }

    public String getModel() 
    {
        return model;
    }
    
    public int getSize() 
    {
        return memorySize;
    }

    public MobileType getType() 
    {
        return type;
    }
    
    public void setModel(String model) 
    {
        this.model = model;
    }

    public void print()
    {
        System.out.print(" Model: " + model + " Type: " + type + " MemorySize: " + memorySize + " Price: ");
        System.out.printf("%.2f", price);
    }

    public String toString()
    {
        return " Model:" + model + " Type: " + type + " MemorySize: " + memorySize + " Price: " + price;
    }

    public void priceRise(double rise)
    {    
        price*=(1+rise);
    }

    //lab4----------------------------------------
    public MobilePhone(MobilePhone phone) //copy constructor
    {
        model = phone.model;
        type = phone.type;
        memorySize = phone.memorySize;
        price = phone.price;
    }

    public MobilePhone clone() throws CloneNotSupportedException 
    {
        MobilePhone output = (MobilePhone)super.clone();
        return  output;
    }

     //lab6-----
    public String toDilimatedString()
    {
        return model + "-" + type + "-" + memorySize + "-" + price;
    }
    
    public static MobilePhone loadRecords(String line) throws IOException
    {
        line = line.trim ();
        String[] field = line.split("-"); 
        String model = field[0];
        MobileType type = MobileType.valueOf(field[1]);
        int memorySize = Integer.parseInt(field[2]);
        double price = Double.parseDouble (field[3]);
        return new MobilePhone(model, type, memorySize, price);
    }
}
