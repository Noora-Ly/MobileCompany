
import java.io.Serializable;

public class MyDate implements Cloneable, Comparable<MyDate>, Serializable
{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // public MyDate(MyDate date) //copy constructor
    // {
    //     year = date.year;
    //     month = date.month;
    //     day = date.day;
    // }

    // public MyDate clone() throws CloneNotSupportedException
    // {
    //     MyDate output = (MyDate) super.clone();
    //     return  output;
    // }

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

    public String toString()
    {
        return year + "/" + month + "/" + day;
    }
	public void print()
	{
		System.out.print( " "+year + "/" + month + "/" + day+" ");
	}

    public Boolean isExpired(MyDate expiryDate)
    {
        if(year < expiryDate.year)
        {
            return false;
        }
        else if(year == expiryDate.year)
        {
            if(month < expiryDate.month)
            {
                return false;
            }
            else if(month == expiryDate.month)
            {
                if(day < expiryDate.day)
                {
                    return false;
                }
            }
        }
        return true;
    }

    //lab4-----------------------------------------
    public MyDate(MyDate date) //copy constructor
    {
        year = date.year;
        month = date.month;
        day = date.day;
    }

    public MyDate clone() throws CloneNotSupportedException
    {
        MyDate output = (MyDate) super.clone();
        return  output;
    }
    
    public int compareTo (MyDate other)
    {
        if(year < other.year)
        {
            return -1;
        }
        else if(year == other.year)
        {
            if(month < other.month)
            {
                return -1;
            }
            else if(month == other.month)
            {
                if(day < other.day)
                {
                    return -1;
                }else if(day == other.day)
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    //lab6-----

    public String toDilimatedString()
    {
        return year + "/" + month + "/" + day;
    }

    // private void saveRecords (String filename) throws IOException 
    // {
    //     BufferedWriter out = new BufferedWriter (new FileWriter (filename));
    //     out.write (rec.toDelimitedString () + "\n");
        
    //     out.close ();
    // }
    //nmidanam
    
    public static MyDate loadRecords(String line) 
    {
        line = line.trim ();
        String[] field = line.split("/");
        int year = Integer.parseInt(field[0]); 
        int month = Integer.parseInt(field[1]); 
        int day = Integer.parseInt(field[2]); 
        return new MyDate(year, month, day);
    }
    
}
