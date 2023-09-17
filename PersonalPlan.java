

public class PersonalPlan extends MobilePlan 
{
    protected String city;

    public PersonalPlan(String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate expiryDate, String city) throws PlanException, UserException
    {
        super(userName,id,handset,internetQuota,capLimit, expiryDate);
        this.city = city;
    }

    // public PersonalPlan(PersonalPlan plan) //copy constructor
    // {
    //     super(plan);
    //     city = plan.city;
    // }

    public String getCity() 
    {
        return city;
    }
    
    public void setCity(String city) 
    {
        this.city = city;
    }
    
    public double calcPayment(double flatRate)
    {
        return handset.getPrice()/24 + capLimit/20 + internetQuota*5 + flatRate;
    }

    public void print()
    {
        super.print();
        System.out.println(" City:" + city);
    }

    public String toString()
    {
        return super.toString() + " City:" + city;
    }

    //lab4---------------------------
    public PersonalPlan(PersonalPlan plan) //copy constructor
    {
        super(plan);
        city = plan.city;
    }

    //lab6-----
    public String toDilimatedString()
    {
        return "p" + "," + super.toDilimatedString() + "," + city;
    }
}
