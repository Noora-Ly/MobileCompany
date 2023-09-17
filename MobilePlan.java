


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public abstract class MobilePlan implements Cloneable, Comparable<MobilePlan>, Serializable
{
    protected String userName;
    protected int id;
    protected MobilePhone handset;
    protected int internetQuota;
    
    protected int capLimit;
    protected MyDate expiryDate;

    public MobilePlan(String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate myDate)throws PlanException, UserException
    {
        if(!validUserName(userName))
        {
            userName = "USR" + String.format( "%06d", new Random().nextInt(999999)) + "U";
            throw new UserException(userName);
        }
        this.userName = userName;
        if(!validId(id))
        {
            id = (int) ((Math.random() * (100000))+300000);
            throw new PlanException(id);
        }
        this.id = id;
        this.handset = handset;
        this.internetQuota = internetQuota;
        this.capLimit = capLimit;
        this.expiryDate = myDate;
    }

    public static boolean validId(int id)
    {
        if(id < 300000 || id > 399999)
        {
            return false;
        }
        return true;
    }

    public static boolean validUserName(String userName)
    {
        if(Pattern.matches("USR......U", userName))
        {
            return true;
        }
        return false;
    }

    // public MobilePlan(MobilePlan plan) //copy constructor
    // {
    //     userName = plan.userName;
    //     id = plan.id;
    //     internetQuota = plan.internetQuota;
    //     capLimit = plan.capLimit;
    //     handset = new MobilePhone(plan.handset);
    //     expiryDate = new MyDate(plan.expiryDate);
    // }

    // public MobilePlan clone() throws CloneNotSupportedException
    // {
    //     MobilePlan output = (MobilePlan) super.clone();
    //     output.handset = handset.clone();
    //     output.expiryDate = expiryDate.clone();
    //     return output;
    // }

    public double getHandsetPrice()
    {
        return handset.getPrice();
    }

    public String getHandsetModel()
    {
        return handset.getModel();
    }
    
    public MobileType getType()
    {
        return handset.getType();
    }
    
    public int getYear()
    {
        return expiryDate.getYear();
    }

    public int getSize() 
    {
        return handset.getSize();
    }
    
    public String getModel() 
    {
        return handset.getModel();
    }

    public int getInternetQuota() 
    {
        return internetQuota;
    }
    
    public int getCapLimit() 
    {
        return capLimit;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public String getUserName() 
    {
        return userName;
    }

    public MyDate getExpiryDate() 
    {
        return expiryDate;
    }
    
    public void setUsername(String username)
    {
        this.userName=username;
    }
    
    public void setHandsetModel(String model)
    {
        handset.setModel(model);
    }

    public void setcapLimit(int capLimit)
    {
        this.capLimit = capLimit;
    }
    
    public void setInternetQuota(int internetQuota)
    {
        this.internetQuota = internetQuota;
    }
    
    public void setCapLimit(int capLimit)
    {
        this.capLimit = capLimit;
    }
    
    public void setExpiryDate(MyDate date)
    {
        this.expiryDate = date;
    }
    
    public void setUserName(String userName)
    {
        
        this.userName = userName;
    }
    
    public void setHandset(MobilePhone handset)
    {
        this.handset = handset;
    }

    public abstract double calcPayment(double flatRate);

    // public int calcPayment(int payment)
    // {
    //     return payment;
    // }
    
    public void mobilePriceRise(double risePercent)
    {
        handset.priceRise(risePercent);
    }
    
    public void print()
    {
        System.out.print("ID:" + id + " Username:" + userName);
        handset.print();
        System.out.print(" InternetQuota: " + internetQuota + " CapLimit:" + capLimit);
        //System.out.println(" Expiry Date: " + expiryDate);
		expiryDate.print();
    }
	
    public void print(double flatRate)
    {
        print();
        System.out.print(" Monthly Payment: "+calcPayment(flatRate));
    }

    public String toString()
    {
        return "ID:" + id + " Username:" + userName + " Handset:" + handset + " InternetQuota: " + 
                internetQuota + " CapLimit: " + capLimit + " Expiry Date: "+ expiryDate;
    }

    public static void printPlans(ArrayList<MobilePlan> plans)
    {
        // for(MobilePlan plan : plans)
        // {
        //     plan.print();
        // }
        plans.forEach(System.out::println); 
    }

    public static void printPlans(HashMap<Integer, MobilePlan> plans)
    {
        // for(MobilePlan plan : plans.values())
        // {
        //     plan.print();
        // }
        plans.values().stream().forEach(System.out::println); 
    }
	
    public static void printPlans(ArrayList<MobilePlan> plans,double flatRate)
    {
        for(MobilePlan plan : plans)
        {
            plan.print(flatRate);
        }
    }

    public static void printPlans(HashMap<Integer, MobilePlan> plans,double flatRate)
    {
        for(MobilePlan plan : plans.values())
        {
            plan.print(flatRate);
        }
    }

    public static double calcTotalPayments(ArrayList<MobilePlan> plans, double flatRate){
        // double totalMonthlyPayments = 0;
        // for(MobilePlan plan : plans)
        // {
        //     totalMonthlyPayments += plan.calcPayment(flatRate);
        // }
        // return totalMonthlyPayments;
        return plans.stream().map(x->x.calcPayment(flatRate)).reduce(0.0,(x,y)->x+y);
    }
//with Hashmap
    public static double calcTotalPayments(HashMap<Integer,MobilePlan> plans, double flatRate){
        // double totalMonthlyPayments = 0;
        // for(MobilePlan plan : plans.values())
        // {
        //     totalMonthlyPayments += plan.calcPayment(flatRate);
        // }
        // return totalMonthlyPayments;
        return plans.values().stream().map(x->x.calcPayment(flatRate)).reduce(0.0,(x,y)->x+y);
    }

    public static void mobilePriceRiseAll(ArrayList<MobilePlan> plans, double risePercent)
    {
        // for(MobilePlan plan : plans)
        // {
        //     plan.mobilePriceRise(risePercent);
        // }
        plans.stream().forEach(x -> x.mobilePriceRise(risePercent));
    }
//with Hashmap
    public static void mobilePriceRiseAll(HashMap<Integer,MobilePlan> plans, double risePercent)
    {
        // for(MobilePlan plan : plans.values())
        // {
        //     plan.mobilePriceRise(risePercent);
        // }
        plans.values().stream().forEach(x -> x.mobilePriceRise(risePercent));
    }

    public static ArrayList<MobilePlan> filterByMobileModel (ArrayList<MobilePlan> plans, String mobileModel)
    {
        // ArrayList<MobilePlan> filteredPlans = new ArrayList<MobilePlan>();
        // for(MobilePlan plan : plans)
        // {
        //     //if(plan.handset.getModel().contains(mobileModel)) // bad way
        //     if(plan.getHandsetModel().contains(mobileModel))
        //     {
        //         filteredPlans.add(plan);
        //     }
        // }
        // return filteredPlans;
        return (ArrayList<MobilePlan>)(plans.stream().filter(x->x.getHandsetModel().contains(mobileModel)).collect(Collectors.toList()));

    }

    //filterByMobileModel with Hashmap
    // public static HashMap<Integer,MobilePlan> filterByMobileModel (HashMap<Integer,MobilePlan> plans, String mobileModel)
    // {
        // HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
        // for(MobilePlan plan : plans.values())
        // {
        //     //if(plan.handset.getModel().contains(mobileModel)) // bad way
        //     if(plan.getHandsetModel().contains(mobileModel))
        //     {
        //         filteredPlans.put(plan.getId(), plan);
        //     }
        // }
        // return filteredPlans;
    //}

    public static ArrayList<MobilePlan> filterByExpiryDate(ArrayList<MobilePlan> plans, MyDate date)
    {
        ArrayList<MobilePlan> filteredPlans = new ArrayList<MobilePlan>();
        // for(MobilePlan plan : plans)
        // {
        //     if(plan.expiryDate.isExpired(date))
        //     {
        //         filteredPlans.add(plan);
        //     }
        // }
        plans.stream().filter(x -> x.expiryDate.isExpired(date)).forEach(filteredPlans :: add);
        return filteredPlans;
    }

    //filterByExpiryDate with Hashmap
    public static HashMap<Integer,MobilePlan> filterByExpiryDate(HashMap<Integer,MobilePlan> plans, MyDate date)
    {
        HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
        // for(MobilePlan plan : plans.values())
        // {
        //     if(plan.expiryDate.isExpired(date))
        //     {
        //         filteredPlans.put(plan.getId(), plan);
        //     }
        // }
        // return filteredPlans;
        plans.values().stream().filter(x -> x.expiryDate.isExpired(date)).forEach(x -> filteredPlans.put(x.getId(), x));
        return filteredPlans;
    }

    ///lab4-----------------------------------------------
    public MobilePlan(MobilePlan plan) //copy constructor
    {
        userName = plan.userName;
        id = plan.id;
        internetQuota = plan.internetQuota;
        capLimit = plan.capLimit;
        handset = new MobilePhone(plan.handset);
        expiryDate = new MyDate(plan.expiryDate);
    }

    public MobilePlan clone() throws CloneNotSupportedException
    {
        MobilePlan output = (MobilePlan) super.clone();
        output.handset = handset.clone();
        output.expiryDate = expiryDate.clone();
        return output;
    }

    public static ArrayList<MobilePlan> shallowCopy(ArrayList<MobilePlan> plans)
    {
        ArrayList<MobilePlan> shallowCopy = new ArrayList<MobilePlan>();
        // for(MobilePlan plan : plans)
        // {
        //     shallowCopy.add(plan);
        // }
        // return shallowCopy;
        plans.stream().forEach(shallowCopy :: add);
        return shallowCopy;
    }

	public static ArrayList<MobilePlan> deepCopy(ArrayList<MobilePlan> plans) throws CloneNotSupportedException
    {
        // ArrayList<MobilePlan> deepCopy = new ArrayList<MobilePlan>();
        // for(MobilePlan plan: plans)
        // {
        //     deepCopy.add(plan.clone());
        // }
        // return deepCopy;
        return plans.stream().collect(Collectors.toCollection(ArrayList::new));
    }
    
    //lab5
    public static ArrayList< MobilePlan> shallowCopy(HashMap<Integer, MobilePlan> plans)
    {
        ArrayList<MobilePlan> shallowCopy = new ArrayList<MobilePlan>();
        // for(MobilePlan plan : plans.values())
        // {
        //     shallowCopy.add(plan);
        // }
        // return shallowCopy;
        plans.values().stream().forEach(shallowCopy :: add);
        return shallowCopy;
    }

    public static ArrayList< MobilePlan> deepCopy(HashMap<Integer, MobilePlan> plans) throws CloneNotSupportedException
    {
        // ArrayList<MobilePlan> deepCopy = new ArrayList<MobilePlan>();
        // for(MobilePlan plan: plans.values())
        // {
        //     deepCopy.add(plan.clone());
        // }
        // return deepCopy;
        return plans.values().stream().collect(Collectors.toCollection(ArrayList::new));
    }
    
    public static HashMap<Integer, MobilePlan> shallowCopyHashMap(HashMap<Integer, MobilePlan> plans)
    {
        HashMap<Integer, MobilePlan> shallowCopy = new HashMap<>();
        for(MobilePlan plan : plans.values())
        {
            shallowCopy.put(plan.getId(), plan);
        }
        return shallowCopy;
    }
    
    public static HashMap<Integer, MobilePlan> deepCopyHashMap(HashMap<Integer, MobilePlan> plans) throws CloneNotSupportedException
    {
        HashMap<Integer, MobilePlan> deepCopy = new HashMap<>();
        for(MobilePlan plan: plans.values())
        {
            deepCopy.put(plan.getId(), plan.clone());
        }
        return deepCopy;
    }

    public int compareTo (MobilePlan other) // comapre based on expiry date
    {   
        return this.expiryDate.compareTo(other.expiryDate);
    }

    //lab5---------------

    // public static void printPlans(HashMap<Integer, MobilePlan> plans)
    // {
    //     for(MobilePlan plan : plans.values())
    //     {
    //         plan.print();
    //     }
    // }

    // public static void printPlans(HashMap<Integer, MobilePlan> plans,double flatRate)
    // {
    //     for(MobilePlan plan : plans.values())
    //     {
    //         plan.print(flatRate);
    //     }
    // }

    // public static HashMap<Integer,MobilePlan> filterByMobileModel (HashMap<Integer,MobilePlan> plans, String mobileModel)
    // {
    //     HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
    //     for(MobilePlan plan : plans.values())
    //     {
    //         //if(plan.handset.getModel().contains(mobileModel)) // bad way
    //         if(plan.getHandsetModel().contains(mobileModel))
    //         {
    //             filteredPlans.put(plan.getId(), plan);
    //         }
    //     }
    //     return filteredPlans;
    // }

    // public static HashMap<Integer,MobilePlan> filterByExpiryDate(HashMap<Integer,MobilePlan> plans, MyDate date)
    // {
    //     HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
    //     for(MobilePlan plan : plans.values())
    //     {
    //         if(plan.expiryDate.isExpired(date))
    //         {
    //             filteredPlans.put(plan.getId(), plan);
    //         }
    //     }
    //     return filteredPlans;
    // }

    // public static double calcTotalPayments(HashMap<Integer,MobilePlan> plans, double flatRate){
    //     double totalMonthlyPayments = 0;
    //     for(MobilePlan plan : plans.values())
    //     {
    //         totalMonthlyPayments += plan.calcPayment(flatRate);
    //     }
    //     return totalMonthlyPayments;
    // }

    // public static void mobilePriceRiseAll(HashMap<Integer,MobilePlan> plans, double risePercent)
    // {
    //     for(MobilePlan plan : plans.values())
    //     {
    //         plan.mobilePriceRise(risePercent);
    //     }
    // }

    // public static ArrayList< MobilePlan> shallowCopy(HashMap<Integer, MobilePlan> plans)
    // {
    //     ArrayList<MobilePlan> shallowCopy = new ArrayList<MobilePlan>();
    //     for(MobilePlan plan : plans.values())
    //     {
    //         shallowCopy.add(plan);
    //     }
    //     return shallowCopy;
    // }

    // public static ArrayList< MobilePlan> deepCopy(HashMap<Integer, MobilePlan> plans) throws CloneNotSupportedException
    // {
    //     ArrayList<MobilePlan> deepCopy = new ArrayList<MobilePlan>();
    //     for(MobilePlan plan: plans.values())
    //     {
    //         deepCopy.add(plan.clone());
    //     }
    //     return deepCopy;
    // }
    
    // public static HashMap<Integer, MobilePlan> shallowCopyHashMap(HashMap<Integer, MobilePlan> plans)
    // {
    //     HashMap<Integer, MobilePlan> shallowCopy = new HashMap<>();
    //     for(MobilePlan plan : plans.values())
    //     {
    //         shallowCopy.put(plan.getId(), plan);
    //     }
    //     return shallowCopy;
    // }
    
    // public static HashMap<Integer, MobilePlan> deepCopyHashMap(HashMap<Integer, MobilePlan> plans) throws CloneNotSupportedException
    // {
    //     HashMap<Integer, MobilePlan> deepCopy = new HashMap<>();
    //     for(MobilePlan plan: plans.values())
    //     {
    //         deepCopy.put(plan.getId(), plan.clone());
    //     }
    //     return deepCopy;
    // }

    //lab6---------------------------------

    public static HashMap<Integer, MobilePlan> load (String fileName)
    {
        HashMap<Integer, MobilePlan> plans = new HashMap<>();
        ObjectInputStream inputst=null;
        plans.clear ();
        try
        {
            inputst = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));           
        }
        catch(IOException ex)
        {
            System.err.println("error in create/open the file ");
            System.exit(1);
        }
        try
        {
           while(true)
            {
              MobilePlan plan = (MobilePlan) inputst.readObject();
              plans.put(plan.getId(), plan);
            }
        }
        catch(EOFException ex)
        {
            System.out.println("no more record!");
        }
        catch (ClassNotFoundException ex) 
        {
            System.err.println("error in wrong class in the file ");
        } 
        catch(IOException ex)
        {
            System.err.println("error in add object to the file ");
            System.exit(1);
        }
        try
        {
            if(inputst !=null)
            inputst.close();           
        }
        catch(IOException ex)
        {
            System.err.println("error in close the file ");
            System.exit(1);
        }
        return plans;
    }

	public static Boolean save (HashMap<Integer,MobilePlan> plans, String fileName)
    {
        ObjectOutputStream outputst = null;
        try
        {
            outputst = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));           
        }
        catch(IOException ex)
        {
            System.err.println("error in create/open the file ");
            System.exit(1);
        }
        try
        {
            for (MobilePlan plan : plans.values())
            {
                outputst.writeObject(plan);
            }
        }
        catch(IOException ex)
        {
            System.err.println("error in adding the objects to the file ");
            //System.exit(1);
        } 
        try
        {
            if(outputst !=null)
            outputst.close();  
            return true;         
        }
        catch(IOException ex)
        {
            System.err.println("error in closing the file ");
            //System.exit(1);
            return false;
        }
    }

    //-----------------
    public String toDilimatedString()
    {
        return id +","+userName+ ","+ handset.toDilimatedString() +","+internetQuota+","+capLimit+","+expiryDate.toDilimatedString() ;
    }

    public static HashMap<Integer, MobilePlan> loadTextFile (String fileName) throws IOException, PlanException, UserException
    {
        //plans.clear ();
        HashMap<Integer, MobilePlan> plans = new HashMap<>();
        BufferedReader in = new BufferedReader (new FileReader (fileName));
        String line = in.readLine();
        String[] field ;
        try{
            while (line != null){
                line = line.trim ();
                field = line.split(","); 
                int id = Integer.parseInt(field[1]);
                String userName = field[2];
                MobilePhone handset = MobilePhone.loadRecords(field[3]);
                int internetQuota = Integer.parseInt(field[4]);
                int capLimit = Integer.parseInt(field[5]);
                MyDate myDate = MyDate.loadRecords(field[6]);
                switch (field[0])
                {
                    case "p":
                        String city = field[7];
                        plans.put(id, UITools.creatPersonalPlan(userName, id, handset, internetQuota, capLimit, myDate, city));
                        break;
                    case "b":
                        int numberOfEmployees = Integer.parseInt(field[7]);
                        int ABN = Integer.parseInt(field[8]);
                        plans.put(id, UITools.creatBusinessPlan(userName, id, handset, internetQuota, capLimit, myDate, numberOfEmployees, ABN));
                        break;     
                }
                line = in.readLine();
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        in.close ();
        return plans;
    }

    // public static HashMap<Integer, MobilePlan> loadTextPlan(String[] field , int counter) throws IOException, PlanException, UserException
    // {
    //     HashMap<Integer, MobilePlan> plans = new HashMap<>();
    //     int id = Integer.parseInt(field[1]);
    //     String userName = field[2];
    //     MobilePhone handset = MobilePhone.loadRecords(field[3]);
    //     int internetQuota = Integer.parseInt(field[4]);
    //     int capLimit = Integer.parseInt(field[5]);
    //     MyDate myDate = MyDate.loadRecords(field[6]);
    //     switch (field[0])
    //     {
    //         case "p":
    //             String city = field[7];
    //             plans.put(id, UITools.creatPersonalPlan(userName, id, handset, internetQuota, capLimit, myDate, city));
    //             break;
    //         case "b":
    //             int numberOfEmployees = Integer.parseInt(field[7]);
    //             int ABN = Integer.parseInt(field[8]);
    //             plans.put(id, UITools.creatBusinessPlan(userName, id, handset, internetQuota, capLimit, myDate, numberOfEmployees, ABN));
    //             break;     
    //     } 
    //     return plans;       
    // }

    public static Boolean saveTextFile (HashMap<Integer, MobilePlan> plans, String fileName) throws IOException
    {
        BufferedWriter out = new BufferedWriter (new FileWriter(fileName));
        for (MobilePlan plan : plans.values())
        {
            out.write(plan.toDilimatedString() + "\n");
        }
        out.close ();
        return true;
    }

    public static boolean findRange(int i , MobilePlan plan , int[] ranges , double flatRate)
    {
        if(i == 0)
        {
            if((plan.calcPayment(flatRate)>= 0)&&(plan.calcPayment(flatRate)<= ranges[i]))
            {
                return true;
            }
        }
        else if((plan.calcPayment(flatRate)>ranges[i-1])&&(plan.calcPayment(flatRate)<=ranges[i]))
        {
            return true;
        }
        return false;
    }
}
