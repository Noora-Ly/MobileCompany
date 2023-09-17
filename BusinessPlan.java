

public class BusinessPlan extends MobilePlan
{
    protected int numberOfEmployees;
    protected int ABN;

    public BusinessPlan(String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate expiryDate, int numberOfEmployees, int ABN) throws PlanException, UserException
    {
        super(userName,id,handset,internetQuota, capLimit, expiryDate);
        this.numberOfEmployees = numberOfEmployees;
        this.ABN = ABN;
    }

    // public BusinessPlan(BusinessPlan plan) //copy constructor
    // {
    //     super(plan);
    //     numberOfEmployees = plan.numberOfEmployees;
    //     ABN = plan.ABN;
    // }
    
    public int getABN() 
    {
        return ABN;
    }
    
    public int getNumbOfEmployees() 
    {
        return numberOfEmployees;
    }
    
    public void setABN(int ABN) 
    {
        this.ABN = ABN;
    }
    
    public void setNumberOfEmployees(int numberOfEmployees) 
    {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public double calcPayment(double flatRate)
    {
        double payment = handset.getPrice()/24 + capLimit/10 + internetQuota*10 + flatRate;
        if(numberOfEmployees > 10){
            payment += (numberOfEmployees-10)*50;
        }
        return payment;
    }

    public void print()
    {
        super.print();
        System.out.println(" Number Of Employees: " + numberOfEmployees + " ABN: " + ABN);
    }

    public String toString(){
        return super.toString() + " Number Of Employees: " + numberOfEmployees + " ABN: " + ABN;
    }

    //lab4------------------------------------------------
    public BusinessPlan(BusinessPlan plan) //copy constructor
    {
        super(plan);
        numberOfEmployees = plan.numberOfEmployees;
        ABN = plan.ABN;
    }

    //lab6-----
    public String toDilimatedString()
    {
        return "b" + "," +super.toDilimatedString() + "," + numberOfEmployees + "," + ABN;
    }
}
