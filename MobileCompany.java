
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MobileCompany implements Cloneable, Serializable
{
    private String name;
    private String adminUsername;
    private String adminPassword;
    private double flatRate;
    //private ArrayList<User> users;
    private HashMap<Integer , User> users;
    
    public MobileCompany(String name, String adminUsername, String adminPassword, int flatRate)
    {
        this.name = name;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.flatRate = flatRate;
        //this.users = new ArrayList<User>();
        this.users = new HashMap<>();
    }

    // public MobileCompany(MobileCompany company) //copy constructor
    // {
    //     name = company.name;
    //     adminUsername = company.adminUsername;
    //     adminPassword = company.adminPassword;
    //     flatRate = company.flatRate;
    //     ArrayList<User> users = new ArrayList<>();
    //     for(User user: users)
    //     {
    //         users.add(new User(user));
    //     }
    // }

    // public MobileCompany clone() throws CloneNotSupportedException
    // {
    //     MobileCompany output = (MobileCompany) super.clone();
    //     output.users = new ArrayList<User>();
    //     for(User user: users)
    //     {
    //         output.users.add(user.clone());
    //     }
    //     return  output;
    // }

    public double getFlatRate() 
    {
        return flatRate;
    }

    public String getAdminUsername()
    {
        return adminUsername;
    }

    public String getAdminPassword()
    {
        return adminPassword;
    }

    public String getName()
    {
        return name;
    }

    // public ArrayList<User> getUsers()
    // {
    //     return users;
    // }

    public HashMap<Integer, User> getUsers()
    {
        return users;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public boolean validateAdmin(String username, String password)
    {
        if(adminUsername.equals(username) && adminPassword.equals(password))
	{
            return true;
        }
        else 
        {
            return false;
        }
    }

    public User validateUser(int userID, String password)
    {
//        for(User user : users) // a bad way
//        {
//            if(user.validateUser(userID, password))
//            {
//                return user;
//            }
//        }
//        return null;
        
        // Correct way by using findUser
        User user=findUser(userID);
        if ((user!= null) && user.validateUser(userID, password))
        {
            return user;
        }
        else
            return null;
    }
    
    public User findUser(int userID)
    {
        // for(User user : users)
        // {
        //     if(user.getUserID() == userID)
        //     {
        //         return user;
        //     }
        // }
        // return null;
        return users.get(userID);
    }
    
    public boolean addUser(User user)
    {
        if(findUser(user.getID()) == null)
        {
            //users.add(user);
            users.put(user.getID(), user);
            return true;
        }
        else 
        {
            return false;
        }
    }

    public boolean addUser(String name, int userID, Address address, String password)
    {
        User user = new User(userID, name, address, password);
        return addUser(user);
    }
    
    public boolean addUser(String name, Address address, String password) //automatic ID generation
    {
        User user = new User(name, address, password); // user constructor to generate ID automatically
        return addUser(user);
    }
    
    public boolean addPlan(String adminUsername, String adminPassword, int userid , MobilePlan plan)
    {
        if(validateAdmin(adminUsername, adminPassword)){
            User user = findUser(userid);
            if(user != null)
            {
                return user.addPlan(userid, user.getPassword(), plan);
            }
        }
        return false;
    }

    public MobilePlan findPlan(int userID, int planID)
    {
        User user = findUser(userID);
        if(user != null)
        {
            return user.findPlan(planID);
        }
        else
            return null;
    }

    public void printPlans(String password,int userID)
    {
        User user = findUser(userID);
        if(user != null)
        {
            user.printPlans(userID, password, flatRate);
        }
    }
    
    public void printUser(int userID) //added for UI
    {
        User user = findUser(userID);
        if(user != null)
        {
            user.print(flatRate);
        }
    }

    public  boolean createPersonalPlan(String password ,int userID, String username, int id, MobilePhone mobilePhone, int internetQuota, int caplimit, MyDate expiryDate, String city) throws PlanException, UserException
    {
        User user = findUser(userID);
        if(user != null)
        {  
            return user.createPersonalPlan(userID, password, username, id, mobilePhone, internetQuota, caplimit, expiryDate, city);
        }
        return false;
    }

    public  boolean createBusinessPlan(String password ,int userID, String username, int id, MobilePhone mobilePhone, int internetQuota, int caplimit, MyDate expiryDate, int numberOfEmployees, int ABN) throws PlanException, UserException
    {
        User user = findUser(userID);
        if(user != null)
        {
            return user.createBusinessPlan(userID, password, username, id, mobilePhone, internetQuota, caplimit, expiryDate, numberOfEmployees, ABN);
        }
        return false;
    }

    public double calcTotalPayments(String adminUsername, String adminPassword, int userID, String userPass)
    {
        if(validateAdmin(adminUsername, adminPassword)){
            User user = findUser(userID);
            if(user != null)
            {
                return user.calcTotalPayments(userID, userPass, flatRate);
            }
        }
        return 0;
    }

    public double calcTotalPayments()
    {
        // double totalPayment = 0;
        // //for(User user : users)
        // for(User user : users.values())
        // {
        //    totalPayment += user.calcTotalPayments(user.getID(), user.getPassword(), flatRate);
        // }
        // return totalPayment;
        return users.values().stream().mapToDouble(x -> x.calcTotalPayments(x.getID(), x.getPassword(), flatRate)).reduce(0, (x , y)-> x+y);
    }

    public boolean mobilePriceRise(int userID, double risePercent)
    {
        User user = findUser(userID);
        if(user != null){
            user.mobilePriceRiseAll(risePercent);
            return true;
        }
        return false;
    }
    
    public void mobilePriceRise(double risePercent)
    {
        //for(User user : users)
        // for(User user : users.values())
        // {
        //     user.mobilePriceRiseAll(risePercent);
        // }
        users.values().stream().forEach((x -> x.mobilePriceRiseAll(risePercent)));
    }

    // public ArrayList<MobilePlan> allPlans()
    // {
    //     ArrayList<MobilePlan> allUserPlans = new ArrayList<MobilePlan>();
    //     for(User user : users.values())
    //     {
    //         for(MobilePlan plan: user.getPlans().values())
    //         {
    //             allUserPlans.add(plan); 
    //         }
    //     }
    //     return allUserPlans;
    // }

    public HashMap<Integer,MobilePlan> allPlans()
    {
        HashMap<Integer,MobilePlan> allUserPlans = new HashMap<>();
        for(User user : users.values())
        {
            for(MobilePlan plan:user.getPlans().values())
            {
                allUserPlans.put(plan.getId(), plan); 
            }
        }
        return allUserPlans;
    }

    public ArrayList<MobilePlan> filterByMobileModel(int userID, String mobileModel)
    {
        User user = findUser(userID);
        if(user != null){
            return user.filterByMobileModel(mobileModel);
        }
        return new ArrayList<MobilePlan>();
    }

    // public HashMap<Integer,MobilePlan> filterByMobileModel(int userID, String mobileModel)
    // {
    //     User user = findUser(userID);
    //     if(user != null){
    //         return user.filterByMobileModel(mobileModel);
    //     }
    //     return new HashMap<>();
    // }

    // public ArrayList<MobilePlan> filterByExpiryDate(int userID, MyDate date)
    // {
    //     User user = findUser(userID);
    //     if(user != null){
    //         return user.filterByExpiryDate(date);
    //     }
    //     return new ArrayList<MobilePlan>();
    // }

    public HashMap<Integer,MobilePlan> filterByExpiryDate(int userID, MyDate date)
    {
        User user = findUser(userID);
        if(user != null){
            return user.filterByExpiryDate(date);
        }
        return new HashMap<>();
    }

    public ArrayList<MobilePlan> filterByMobileModel(String mobileModel)
    {
        ArrayList<MobilePlan> filteredPlans = new ArrayList<MobilePlan>();
        // for(User user : users.values())
        // {
        //     ArrayList<MobilePlan> userFilteredPlans = user.filterByMobileModel(mobileModel);
        //     for(MobilePlan plan : userFilteredPlans)
        //     {
        //         filteredPlans.add(plan);
        //     }
        // }
        //return filteredPlans;
        users.values().stream().forEach(x -> x.filterByMobileModel(mobileModel).forEach(filteredPlans :: add));
        return filteredPlans;
    }

    // public HashMap<Integer,MobilePlan> filterByMobileModel(String mobileModel)
    // {
    //     HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
    //     for(User user : users.values())
    //     {
    //         HashMap<Integer,MobilePlan> userFilteredPlans = user.filterByMobileModel(mobileModel);
    //         for(MobilePlan plan : userFilteredPlans.values())
    //         {
    //             filteredPlans.put(plan.getId(), plan);
    //         }
    //     }
    //     return filteredPlans;
    // }

    // public ArrayList<MobilePlan> filterByExpiryDate(MyDate date)
    // {
    //     ArrayList<MobilePlan> filteredPlans = new ArrayList<MobilePlan>();
    //     for(User user : users)
    //     {
    //         ArrayList<MobilePlan> userFilteredPlans = user.filterByExpiryDate(date);
    //         for(MobilePlan plan : userFilteredPlans)
    //         {
    //             filteredPlans.add(plan);
    //         }
    //     }
    //     return filteredPlans;
    // }

    public HashMap<Integer,MobilePlan> filterByExpiryDate(MyDate date)
    {
        HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
        for(User user : users.values())
        {
            HashMap<Integer,MobilePlan> userFilteredPlans = user.filterByExpiryDate(date);
            for(MobilePlan plan : userFilteredPlans.values())
            {
                filteredPlans.put(plan.getId(), plan);
            }
        }
        return filteredPlans;
    }
    
    public void print()
    {
        System.out.println("Company name: "+name+" Flat Rate: "+flatRate);
        //for(User user : users)
        for(User user : users.values())
        {
            //user.print(); // WRONG not based on the spec
            
            // user.printUserInformation() ; // correct but duplicate
            // user.printPlans(flatRate);
            
            user.print(flatRate); // add this to user and make it better than previous 2 lines
        }
    }

    public String toString()
    {
        String printString = "Company name: "+name+" Flat Rate: "+flatRate+"\n";
        //for(User user : users)
        for(User user : users.values())
        {
            printString += user.toString()+"\n";
        }
        return printString;
    }
    
    public ArrayList<String> populateDistinctCityNames()
    {
        // ArrayList<String> cities =new ArrayList<String>();
        // //for(User user : users)
        // for(User user : users.values())
        // {
        //     boolean found=false;
        //     for (String city:cities)
        //     {
        //         if (user.getCity().equals(city))
        //         {
        //             found=true;
        //             break;
        //         }
        //     }
        //     if (!found)
        //         cities.add(user.getCity());
        // }
        // return cities; 

        List<String> cities =new ArrayList<String>();
        users.values().stream().forEach(x -> cities.add(x.getCity()));
        return (ArrayList<String>) cities; 
    }

    public double getTotalPaymentForCity(String city)
    {
        // double totalPaymentForCity = 0;
        // //for(User user : users)
        // for(User user : users.values())
        // {
        //     if(user.getCity().equals(city))
        //     {
        //         totalPaymentForCity += user.calcTotalPayments(user.getID(), user.getPassword(), flatRate);
        //     }
        // }
        // return totalPaymentForCity;
        return users.values().stream().filter(x -> x.getCity().equals(city))
            .mapToDouble(x -> x.calcTotalPayments(x.getUserID(), x.getPassword(), flatRate)).sum();
    }

    public ArrayList<Double> getTotalPaymentPerCity(ArrayList<String> cities)
    {
        // ArrayList<Double> totalPerCity = new ArrayList<>();
        // for(String city : cities)
        // {
        //     totalPerCity.add(getTotalPaymentForCity(city));
        // }
        // return totalPerCity;

        ArrayList<Double> totalPerCity = new ArrayList<>();
        cities.forEach(x -> totalPerCity.add(getTotalPaymentForCity(x)));
        return totalPerCity;
    }

    public void reportPaymentPerCity(ArrayList<String> cities, ArrayList<Double> payments) // it is in the spec but not good
    {
        String format = "%1$-20s%2$-20s\n";
        System.out.format(format, "City Name", "Total Monthly Payment");
        for (int i=0;i<cities.size();i++)
        {
            System.out.format(format, cities.get(i), payments.get(i));
        }
    }
    
    public void reportPaymentPerCity(ArrayList<String> cities) // for a list of given cities
    {
        ArrayList<Double> payments= getTotalPaymentPerCity(cities);
        String format = "%1$-20s%2$-20s\n";
        System.out.format(format, "City Name", "Total Monthly Payment");
        for (int i=0;i<cities.size();i++)
        {
            System.out.format(format, cities.get(i), payments.get(i));
        }
    }
    
    public void reportPaymentPerCity() // for all cities
    {
        ArrayList<String> cities=populateDistinctCityNames();
        ArrayList<Double> payments=getTotalPaymentPerCity(cities);
        String format = "%1$-20s%2$-20s\n";
        System.out.format(format, "City Name", "Total Monthly Payment");
        for (int i=0;i<cities.size();i++)
        {
            System.out.format(format, cities.get(i), payments.get(i));
        }
    }
    
    public ArrayList<String> populateDistinctMobileModels()
    {
        //ArrayList<String> allModels =new ArrayList<String>();
        //for(User user : users)
        // for(User user : users.values())
        // {
        //     ArrayList<String> userModels =user.populateDistinctMobileModels();
        //     for (String userModel:userModels)
        //     {
        //         boolean found=false;
        //         for (String model:allModels)
        //         {
        //             if (model.equals(userModel))
        //             {
        //                 found=true;
        //                 break;
        //             }
        //         }
        //         if (!found)
        //             allModels.add(userModel);
        //     }
        // }
        // return allModels; 

        List<String> allModels = new ArrayList<String>();
        users.values().stream().forEach(x -> allModels.addAll(x.populateDistinctMobileModels()));
        return(ArrayList<String>) allModels;       
    }
	
    public ArrayList<Integer> getTotalCountPerMobileModel (ArrayList<String> mobileModels)
    {
        // ArrayList<Integer> totalCounts=new ArrayList<Integer>();
        // for (int i=0;i<mobileModels.size();i++)
        // {
        //     totalCounts.add(0);// initial values with 0
        // }
        // //for(User user : users)
        // for(User user : users.values())
        // {
        //     ArrayList<Integer> userCounts=user.getTotalCountPerMobileModel(mobileModels);
        //     for(int i=0;i<userCounts.size();i++)
        //     {
        //         totalCounts.set(i,totalCounts.get(i)+userCounts.get(i));//for each element of total add the user count
        //     }	
        // }
        // return totalCounts;

        ArrayList<Integer> totalCounts=new ArrayList<Integer>();
        mobileModels.forEach(x -> totalCounts.add(getTotalCountForMobileModel(x)));
        return totalCounts;
    }

    public int getTotalCountForMobileModel (String mobileModel)
    {
        return users.values().stream().map(x -> x.getTotalCountForMobileModel(mobileModel)).reduce(0, (x,y)-> x+y);
    }
	
    public ArrayList<Double> getTotalPaymentPerMobileModel (ArrayList<String> mobileModels)
    {
        // ArrayList<Double> totalPayments=new ArrayList<Double>();
        // for (int i=0;i<mobileModels.size();i++)
        // {
        //     totalPayments.add(0.0);// initial values with 0
        // }

        // //for(User user : users)
        // for(User user : users.values())
        // {
        //     ArrayList<Double> userTotalPayments=user.getTotalPaymentPerMobileModel(mobileModels,flatRate);
        //     for(int i=0;i<userTotalPayments.size();i++)
        //     {
        //         totalPayments.set(i,totalPayments.get(i)+userTotalPayments.get(i));
        //     }	
        // }
        // return totalPayments;

        ArrayList<Double> totalPayments=new ArrayList<Double>();
        mobileModels.forEach(x -> totalPayments.add(getTotalPaymentForMobileModel(x)));
        return totalPayments;
    }
		
    public double getTotalPaymentForMobileModel(String mobileModel)
    {
        return users.values().stream().map(x -> x.getTotalPaymentForMobileModel(mobileModel, flatRate)).reduce(0.0, (x,y)-> x+y);
    }

    public void reportPaymentsPerMobileModel (ArrayList<String> mobileModels, ArrayList<Integer>counts, ArrayList<Double> monthlyPayments)
    {
        System.out.println("\n MobileModel \t \t \t Total Monthly Payments \t \t \t Average Monthly Payment");
        for (int i=0;i<counts.size();i++)
            System.out.println(mobileModels.get(i)+" \t \t \t "+monthlyPayments.get(i)+" \t \t \t "+monthlyPayments.get(i)/(double)counts.get(i));  
    }

    //a list of given models 
    public void reportPaymentsPerMobileModel (ArrayList<String> mobileModels)
    {
        ArrayList<Integer> counts=getTotalCountPerMobileModel(mobileModels);
        ArrayList<Double> monthlyPayments=getTotalPaymentPerMobileModel(mobileModels);
        reportPaymentsPerMobileModel (mobileModels, counts, monthlyPayments); 
    }

    public void reportPaymentsPerMobileModel () // for all models
    {
        ArrayList<String> mobileModels=populateDistinctMobileModels();
        reportPaymentsPerMobileModel (mobileModels);
    }

    //lab 4--------------------------------
    public MobileCompany(MobileCompany company) //copy constructor
    {
        name = company.name;
        adminUsername = company.adminUsername;
        adminPassword = company.adminPassword;
        flatRate = company.flatRate;
        ArrayList<User> users = new ArrayList<>();
        for(User user: users)
        {
            users.add(new User(user));
        }
    }

    public MobileCompany() {
    }

    public MobileCompany clone() throws CloneNotSupportedException
    {
        MobileCompany output = (MobileCompany) super.clone();
        //output.users = new ArrayList<User>();
        output.users = new HashMap<>();
        // for(User user: users)
        // {
        //     output.users.add(user.clone());
        // }
        // return output;
        output.deepCopyUsers();
        return output;
    }

    public ArrayList<User> deepCopyUsers() throws CloneNotSupportedException
    {
        ArrayList<User> deepCopy = new ArrayList<>();
        //for(User user: users)
        for(User user: users.values())
        {
            deepCopy.add(user.clone());
        }
        return deepCopy;
    }

    public ArrayList<User> shallowCopyUsers()
    {
        ArrayList<User> shallowCopy = new ArrayList<>();
        //for(User user: users)
        for(User user: users.values())
        {
            shallowCopy.add(user);
        }
        return shallowCopy;
    }

    public HashMap<Integer, User> deepCopyUsersHashMap() throws CloneNotSupportedException
    {
        HashMap<Integer, User> deepCopy = new HashMap<>();
        for(User user: users.values())
        {
            deepCopy.put(user.getID() ,user.clone());
        }
        return deepCopy;
    }

    public HashMap<Integer, User> shallowCopyUsersHashMap()
    {
        HashMap<Integer, User> shallowCopy = new HashMap<>();
        for(User user: users.values())
        {
            shallowCopy.put(user.getID() , user);
        }
        return shallowCopy;
    }

    public ArrayList<User> sortUsers()
    {
        ArrayList<User> sortUsers = shallowCopyUsers();
        Collections.sort(sortUsers);
        return sortUsers;
    }

    //lab5--------------------------------

    // public HashMap<Integer, User> getUsers()
    // {
    //     return users;
    // }

    // public HashMap<Integer,MobilePlan> allPlans()
    // {
    //     HashMap<Integer,MobilePlan> allUserPlans = new HashMap<>();
    //     for(User user : users.values())
    //     {
    //         for(MobilePlan plan:user.getPlans().values())
    //         {
    //             allUserPlans.put(plan.getId(), plan); 
    //         }
    //     }
    //     return allUserPlans;
    // }

    // public HashMap<Integer,MobilePlan> filterByMobileModel(int userID, String mobileModel)
    // {
    //     User user = findUser(userID);
    //     if(user != null){
    //         return user.filterByMobileModel(mobileModel);
    //     }
    //     return new HashMap<>();
    // }

    // public HashMap<Integer,MobilePlan> filterByExpiryDate(int userID, MyDate date)
    // {
    //     User user = findUser(userID);
    //     if(user != null){
    //         return user.filterByExpiryDate(date);
    //     }
    //     return new HashMap<>();
    // }

    // public HashMap<Integer,MobilePlan> filterByMobileModel(String mobileModel)
    // {
    //     HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
    //     for(User user : users.values())
    //     {
    //         HashMap<Integer,MobilePlan> userFilteredPlans = user.filterByMobileModel(mobileModel);
    //         for(MobilePlan plan : userFilteredPlans.values())
    //         {
    //             filteredPlans.put(plan.getId(), plan);
    //         }
    //     }
    //     return filteredPlans;
    // }

    // public HashMap<Integer,MobilePlan> filterByExpiryDate(MyDate date)
    // {
    //     HashMap<Integer,MobilePlan> filteredPlans = new HashMap<>();
    //     for(User user : users.values())
    //     {
    //         HashMap<Integer,MobilePlan> userFilteredPlans = user.filterByExpiryDate(date);
    //         for(MobilePlan plan : userFilteredPlans.values())
    //         {
    //             filteredPlans.put(plan.getId(), plan);
    //         }
    //     }
    //     return filteredPlans;
    // }

    public HashMap<String, Double> getTotalPaymentPerCity()
    {
        // HashMap<String , Double> totalPayments = new HashMap<>();
        // for(User user : users.values())
        // {
        //     String city = user.getCity();
        //     Double payment = totalPayments.get(city);
        //     if(payment == null)
        //     {
        //         totalPayments.put(city, user.calcTotalPayments(user.getID(), user.getPassword(), flatRate));
        //     }
        //     else
        //     {
        //         totalPayments.put(city, payment + user.calcTotalPayments(user.getID(), user.getPassword(), flatRate));
        //     }
        // }
        // return totalPayments;
        HashMap<String,Double> paymentPerCity = new HashMap<>();
        users.values().stream().forEach(x -> paymentPerCity.put(x.getCity(), x.calcTotalPayments(x.getUserID(), x.getPassword(), flatRate)));
        return paymentPerCity;
    }

    public HashMap<String, Integer> getTotalCountPerMobileModel()
    {
        // HashMap<String, Integer> counts = new HashMap<>();
        // for(User user : users.values())
        // {
        //     HashMap<String, Integer> userPlans = user.getTotalCountPerMobileModel();
        //     for(String model : userPlans.keySet())
        //     {
        //         Integer count = userPlans.get(model);
        //         if(counts.get( model) == null)
        //         {
        //             counts.put(model, count);
        //         }
        //         else
        //         {
        //             counts.put(model,counts.get( model) + count);
        //         }
        //     }
        // }
        // return counts;
        HashMap<String, Integer> countPerModel = new HashMap<>();
        ArrayList<String> models = populateDistinctMobileModels();
        models.stream().forEach(x -> countPerModel.put(x, getTotalCountForMobileModel(x)));
        return countPerModel;
    } 

    public HashMap<String,Double> getTotalPaymentPerMobileModel()
    {
        // HashMap<String , Double> totalPayments = new HashMap<>();
        // for(User user : users.values())
        // {
        //     HashMap<String,Double> totalPaymentPerUser = user.getTotalPaymentPerMobileModel(flatRate);
        //     for(String model : totalPaymentPerUser.keySet())
        //     {
        //         Double payment = totalPaymentPerUser.get(model);
        //         if(totalPayments.get(model) == null)
        //         {
        //             totalPayments.put(model, payment);
        //         }
        //         else
        //         {
        //             totalPayments.put(model, totalPayments.get(model) + payment);
        //         }
        //     }
        // }
        // return totalPayments;
        HashMap<String, Double> paymentPerModel = new HashMap<>();
        ArrayList<String> models = populateDistinctMobileModels();
        models.stream().forEach(x -> paymentPerModel.put(x, getTotalPaymentForMobileModel(x)));
        return paymentPerModel;
    } 

    public void reportCity(HashMap<String , Double> payments)
    {
        System.out.println("\nCity Name \t \t Total Monthly Payments ");
        for(String city : payments.keySet())
        {
            System.out.println(city+"\t \t"+payments.get(city));
        }
    }

    public void reportMobileModel(HashMap<String , Double> totalPayments, HashMap<String , Integer> counts)
    {
        System.out.println("\nMobile Model \t \t Total Monthly Payment \t \t Average Monthly Payment");
        for(String model : totalPayments.keySet())
        {
            System.out.println(model+"\t \t"+totalPayments.get(model)+"\t \t"+totalPayments.get(model)/(double)counts.get(model));
        }
    }

    public Boolean load (String fileName) throws ClassNotFoundException
    {
        ObjectInputStream inputst=null;
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
                MobileCompany company = (MobileCompany)inputst.readObject();
                name = company.name;
                adminUsername = company.adminUsername;
                adminPassword = company.adminPassword;
                flatRate = company.flatRate;
                users = company.users;
                // for(User user: company.getUsers().values())
                // {
                //     this.users.put(user.getID() , new User(user));
                // }
            }
        }
        catch(IOException ex)
        {
            System.err.println("error in add object to the file ");
            //System.exit(1);
        }
        try
        {
            if(inputst !=null)
            inputst.close(); 
            return true;          
        }
        catch(IOException ex)
        {
            System.err.println("error in close the file ");
            //System.exit(1);
            return false;
        }
    }

	public Boolean save (String fileName)
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
            outputst.writeObject(this);
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

    public String toDilimatedString()
    {
        String output =name + "," + adminUsername + "," + adminPassword + "," + flatRate + "," + users.size() +  ",";
        for(User user : users.values())
        {
            output += user.toDilimatedString();
        }
        return output;
    }

    // public String toDilimatedString2()
    // {
    //     String output =name + "," + adminUsername + "," + adminPassword + "," + flatRate + ",";
    //     for(User user : users.values())
    //     {
    //         output += user.getID();
    //     }
    //     return output;
    // }


    public Boolean loadTextFile (String fileName) throws IOException, PlanException, UserException
    {
        this.users = new HashMap<>();
        BufferedReader in = new BufferedReader (new FileReader(fileName));
        String line = in.readLine();
        String[] field;
        User user ;
        while (line != null) {
            line = line.trim ();
            field = line.split(",");
            this.name = field[0];
            this.adminUsername = field[1];
            this.adminPassword = field[2];
            this.flatRate =Double.parseDouble(field[3]);
            int numberOfUsers = Integer.parseInt(field[4]);
            int j = 5;
            for(int t = 0 ; t < numberOfUsers ; t++){
                String name = field[j++];
                Address address = Address.loadRecords(field[j++]);
                String password = field[j++];
                int numOfProjects = Integer.parseInt(field[j++]);
                //User user = new User(name, address, password);
                user = new User(name, address, password);
                for(int i = 0 ; i < numOfProjects ; i++){
                    //j++;
                    // int id = Integer.parseInt(field[j++]);
                    // String userName = field[j++];
                    // MobilePhone handset = MobilePhone.loadRecords(field[j++]);          
                    // int internetQuota = Integer.parseInt(field[j++]);
                    // int capLimit = Integer.parseInt(field[j++]);
                    // MyDate myDate = MyDate.loadRecords(field[j++]);
                    //switch (field[j-7])
                    switch (field[j++])
                    {
                        case "p":
                            int id = Integer.parseInt(field[j++]);
                            String userName = field[j++];
                            MobilePhone handset = MobilePhone.loadRecords(field[j++]);          
                            int internetQuota = Integer.parseInt(field[j++]);
                            int capLimit = Integer.parseInt(field[j++]);
                            MyDate myDate = MyDate.loadRecords(field[j++]);
                            String city = field[j++];
                            user.addPersonalPlan(UITools.creatPersonalPlan(userName, id, handset, internetQuota, capLimit, myDate, city));
                            break;
                        case "b":
                            id = Integer.parseInt(field[j++]);
                            userName = field[j++];
                            handset = MobilePhone.loadRecords(field[j++]);          
                            internetQuota = Integer.parseInt(field[j++]);
                            capLimit = Integer.parseInt(field[j++]);
                            myDate = MyDate.loadRecords(field[j++]);
                            int numberOfEmployees = Integer.parseInt(field[j++]);
                            int ABN = Integer.parseInt(field[j++]);
                            user.addBusinessPlan(UITools.creatBusinessPlan(userName, id, handset, internetQuota, capLimit, myDate, numberOfEmployees, ABN));
                            break;     
                    }
                }
                this.users.put(user.getID(), user);
            }
            line = in.readLine();
        }
        try{
            if(in != null)
            {
                in.close ();
            }
            return true;
        }
        catch(IOException e){
            System.out.println(e + "File is null");
        }
        return false;
    }

	public Boolean saveTextFile (String fileName) throws IOException
    {
        BufferedWriter out = new BufferedWriter (new FileWriter(fileName));
        out.write(toDilimatedString());
        try{
            if(out != null)
            {
                out.close ();
            }
            return true;
        }
        catch(IOException e){
            System.out.println(e + "File is null");
        }
        //out.close ();
        return false;
    }
//Assignment ||
    public class compareUser implements Comparator<User>
    {
        public int compare(User u1 , User u2)
        {
            double u1Payment = u1.calcTotalPayments(u1.getID() , u1.getPassword(), flatRate);
            double u2Payment = u2.calcTotalPayments(u2.getID() , u2.getPassword(),flatRate);
            if(u1Payment == u2Payment)
            {
                return 0;
            }
            return u1Payment > u2Payment ? 1 : -1;
        }
    }
    
    public class compareUsername implements Comparator<User>
    {
        public int compare(User u1 , User u2)
        {
            return u1.getName().compareTo(u2.getName());
        }
    }
    
    public ArrayList<User> sortUsersByMonthlyPayment() 
    {
        ArrayList<User> users = shallowCopyUsers();
        Collections.sort(users, new compareUser());
        return users;
    }

    public ArrayList<User> sortUsersByUsername() 
    {
        ArrayList<User> users = shallowCopyUsers();
        Collections.sort(users, new compareUsername());
        return users;
    }
    
    public HashMap<String , ArrayList<User>> getUsersPerCity()
    {
        // ArrayList<String> cities = populateDistinctCityNames();
        // HashMap<String , ArrayList<User>> usersPerCity = new HashMap<>();
        // for(String city : cities)
        // {
        //     ArrayList<User> usersOfCity = new ArrayList<User>();
        //     for(User user : users.values())
        //     {
        //         if(user.getCity().equals(city))
        //         {
        //             usersOfCity.add(user);
        //         }
        //     }
        //     usersPerCity.put(city, usersOfCity);
        // }
        // return usersPerCity;

        HashMap<String , ArrayList<User>> usersPerCity = new HashMap<>();
        ArrayList<String> cities = populateDistinctCityNames();
        cities.stream().forEach(x -> usersPerCity.put(x, getUsersForCity(x)));
        return usersPerCity;
    } 

    public ArrayList<User> getUsersForCity(String city)
    {
        return users.values().stream().filter(x -> x.getCity().equals(city)).collect(Collectors.toCollection(ArrayList::new));
    }

    public HashMap<String , ArrayList<MobilePlan>> filterPlansByExpiryDate (MyDate expiryDate)
    {
        HashMap<String , ArrayList<MobilePlan>> filteredPlans = new HashMap<>();
        for(User user : users.values())
        {
            filteredPlans.put(user.getName(), MobilePlan.filterByExpiryDate(user.hashmapConvertToArraylist(), expiryDate));
        }
        return filteredPlans;
    }

    public int []  planCount(String adminUsername, String adminPassword, int[] ranges)
    {
        int [] totalCounts = new int[ranges.length];
        //int [] userPlanscount = new int[ranges.length];  
        //for(User user: users.values())
        users.values().stream().forEach
        (
            x -> 
            {
                int [] userPlanscount = x.planCount(x.getUserID(), x.getPassword(), ranges, 4);
                for(int i=0; i< ranges.length-1 ; i++)
                {
                    totalCounts[i] += userPlanscount[i];
                }
            }
        );
        return totalCounts;
    }

    public HashMap<String,Integer[]> planCityCount(String adminUsername, String adminPassword, int[] ranges)
    {
        HashMap<String , Integer[]> planCityCount = new HashMap<>();
        Integer [] counts = new Integer[4];
        int[] userPlanscount = new int[4]; 
        for(User user : users.values())
        {
            userPlanscount = user.planCount(user.getUserID(), user.getPassword(), ranges, 4);
            String city = user.getCity();
                if(planCityCount.get(city) == null)
                {
                    Integer[] userPlans = Arrays.stream( userPlanscount ).boxed().toArray( Integer[]::new );
                    planCityCount.put(city, userPlans);
                }
                else
                {
                    counts = planCityCount.get(city);
                    for(int i=0; i< ranges.length-1 ; i++)
                    {
                        counts[i] += userPlanscount[i];
                    }
                    planCityCount.put(city, counts);
                }
        }
        return planCityCount;
    }

    public int[] userCount(String adminUsername, String adminPassword, int[] ranges)
    {
        int [] totalCounts = new int[4];
        //int [] userPlanscount = new int[4];  
        //for(User user: users.values())
        users.values().stream().forEach
        (
            user -> {
                int [] userPlanscount = user.planCount(user.getUserID(), user.getPassword(), ranges, 4);
                for(int i=0 ; i< 4 ; i++){
                    if(userPlanscount[i] != 0)
                    {
                        totalCounts[i]++ ;
                    }
                }
            }
        );
        return totalCounts;
    }

    public HashMap <String, Integer[]> userMobileModelCount(String adminUsername, String adminPassword, int[] ranges, double flatRate) 
    {
        HashMap <String, Integer[]> userMobileModelCount = new HashMap<>();
        //Integer[] plansCount= new Integer[4];
        Integer[] modelCount= new Integer[4];
        for(User user : users.values())
        {
            HashMap<String, Integer[]> userModelCount = user.planMobileModelCount(adminUsername, adminPassword, ranges, flatRate);
            for(String model : userModelCount.keySet())
            {
                Integer[] counts = {0,0,0,0};
                modelCount = userMobileModelCount.get(model);
                if(modelCount == null)
                {
                    modelCount = userModelCount.get(model);
                    for(int i=0; i< ranges.length; i++)
                    {
                        if(modelCount[i] != 0){
                            counts[i] = 1;
                        }
                    }
                    userMobileModelCount.put(model, counts);
                }
                else
                {
                    counts = userMobileModelCount.get(model);
                    modelCount = userModelCount.get(model);
                    for(int i=0; i< ranges.length ; i++)
                    {
                        if(modelCount[i] != 0){
                            counts[i] += 1;
                        }
                    }
                    userMobileModelCount.put(model, counts);
                }
            }
        }
        return userMobileModelCount;
    }

    public HashMap <String, Integer[]> planMobileModelCount(String adminUsername, String adminPassword, int[] ranges, double flatRate)
    {
        HashMap<String , Integer[]> planMobileModelCount = new HashMap<>();

        Integer [] counts = new Integer[4];
        HashMap<String , Integer[]> userMobileModels = new HashMap<>();
        Integer[] userMobileModelcount = new Integer[4]; 
        for(User user : users.values())
        {
            userMobileModels = user.planMobileModelCount(user.getName(), user.getPassword(), ranges, flatRate);
            for(String model : userMobileModels.keySet())
            {
                userMobileModelcount = userMobileModels.get(model);
                if(planMobileModelCount.get(model) == null)
                {
                    planMobileModelCount.put(model, userMobileModelcount);
                }
                else
                {
                    counts = planMobileModelCount.get(model);
                    counts[0] += userMobileModelcount[0];
                    counts[1] += userMobileModelcount[1];
                    counts[2] += userMobileModelcount[2];
                    counts[3] += userMobileModelcount[3];
                    planMobileModelCount.put(model, counts);
                }
            }
        }
        return planMobileModelCount;
    } 
}