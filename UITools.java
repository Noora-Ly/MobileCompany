


import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

public class UITools 
{
    //User UI methods
    
    public static void validateUser(User user, int userID, String password)
    {
        if(user.validateUser(userID, password))
        {
            System.out.println("User Login Successful");
        }
        else
        {
            System.out.println("User Login Unsuccessful");
        }
    }

    public static void addPlan(int userid, String password, User user,MobilePlan plan)
    {
        if(user.addPlan(userid, password, plan))
        {
            System.out.println("The plan has been added successfully");
        }
        else
        {
            System.out.println("The plan can't be added ID already exists");
        }
    }

    // public static void addBusinessPlan(User user, String userName, int planID, MobilePhone mobile, int internetQuota, int capLimit, MyDate expiryDate, int numOfEmployees, int ABN) throws PlanException, UserException
    // {

    //     if(user.createBusinessPlan(userName, planID, mobile, internetQuota, capLimit, expiryDate, numOfEmployees, ABN))
    //     {
    //         System.out.println("The plan was added successfully");
    //     }
    //     else 
    //     {
    //         System.out.println("The plan can't be added. A plan with the same ID exists");
    //     }
    // }

    // public static void addPersonalPlan(User user, String userName, int planID, MobilePhone mobile, int internetQuota, int capLimit, MyDate expiryDate, String city) throws PlanException, UserException
    // {
    //     if(user.createPersonalPlan(userName, planID, mobile, internetQuota, capLimit, expiryDate, city))
    //     {
    //         System.out.println("The plan was added successfully");
    //     }
    //     else 
    //     {
    //         System.out.println("The plan can't be added. A plan with the same ID exists");
    //     }
    // }

    //Company UI methods
	
    public static void validateAdmin(MobileCompany mobileCompany, String username, String password)
    {
        if(mobileCompany.validateAdmin(username, password))
        {
            System.out.println("Admin Login Successful");
        }
        else
        {
            System.out.println("Admin Login Unsuccessful");
        }
    }

    public static void addUser(MobileCompany mobileCompany, User user)
    {
        if(mobileCompany.addUser(user))
        {
            System.out.println("The user has been added successfully");
        }
        else
        {
            System.out.println("The user can't be added ID already exists");
        }
    }

    public static void addUser(MobileCompany mobileCompany, String name, int id, Address address, String password)
    {
        if(mobileCompany.addUser(name, id, address,password))
        {
            System.out.println("The user has been added successfully");
        }
        else
        {
            System.out.println("The user can't be added ID already exists");
        }
    }

    public static void addPlan(String adminUsername, String adminPassword ,int userID,MobileCompany mobileCompany, MobilePlan plan)
    {
        if(mobileCompany.addPlan(adminUsername, adminPassword, userID, plan))
        {
            System.out.println("The plan was added successfully");
        }
        else
        {
            System.out.println("The plan can't be added. A plan with the same ID exists");
        }
    }

    public static void addBusinessPlan(int userid, String password, MobileCompany mobileCompany, int userID, String userName, int planID, MobilePhone mobile, int internetQuota, int capLimit, MyDate expiryDate, int numOfEmployees, int ABN) throws PlanException, UserException
    {
        try{
            printMessageForAddingBPlan(userid, password, mobileCompany, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, numOfEmployees, ABN);
        }catch(UserException e){
            userName = e.getUserName();
            try{
                printMessageForAddingBPlan(userid, password, mobileCompany, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, numOfEmployees, ABN);
            }catch(PlanException k){
                userID = k.getId();
                printMessageForAddingBPlan(userid, password, mobileCompany, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, numOfEmployees, ABN);
            }
        }
    }

    public static void addPersonalPlan(int userid, String password, MobileCompany mobileCompany, int userID, String userName, int planID, MobilePhone mobile, int internetQuota, int capLimit, MyDate expiryDate, String city) throws PlanException, UserException
    {
        try{
            printMessageForAddingPPlan(userid, password, mobileCompany, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, city);
        }catch(UserException e){
            userName = e.getUserName();
            try{
                printMessageForAddingPPlan(userid, password, mobileCompany, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, city);
            }catch(PlanException k)
            {
                userID = k.getId();
                printMessageForAddingPPlan(userid, password, mobileCompany, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, city);
            }
        }
    }
	
    public static void mobilePriceRise(MobileCompany mobileCompany, int userID, double risePercent)
    {
        if(mobileCompany.mobilePriceRise(userID, risePercent))
        {
            System.out.println("The price rise has been applied successfully");
        }
        else 
        {
            System.out.println("The user has not been found");
        }
    }
    
    //scanner and user input methods
    
    public static Address getAddress()
    {
        System.out.println("Address:");
        boolean success = false;
        while(!success)
        {
            try{
                System.out.println("Enter Street Number:");
                int steetNum = UserInterface.getInt();
                System.out.println("Enter Street Name:");
                String streetName = UserInterface.getString();
                System.out.println("Enter Suburb:");
                String suburb = UserInterface.getString();
                System.out.println("Enter City:");
                String city = UserInterface.getString();
                success = true;
                return new Address(steetNum, streetName, suburb, city);
            }
            catch (InputMismatchException e) {
                System.out.println("error in input: " + e);
                System.out.println("please enter again");
            }
        }
        return null;
    }
    
    public static User getUser()
    {
        boolean success = false;
        while(!success)
        {
            try{
                System.out.println("---Create User---");
                System.out.println("Enter User ID:");
                int userID = UserInterface.getInt();
                System.out.println("Enter Name:");
                String name = UserInterface.getString();
                System.out.println("Enter Password:");
                String password = UserInterface.getString();
                Address address=UITools.getAddress();
                success = true;
                return new User(userID, name, address, password);
            }
            catch (InputMismatchException e) {
                System.out.println("error in input: " + e);
                System.out.println("please enter again");
            }
        }
        return null;
    }
    
    public static MobilePhone getMobilePhone()
    {
        System.out.println("Mobile Phone:");
        System.out.println("Enter Model:");
        String model = UserInterface.getString();
        System.out.println("Enter Type a number between 0-2");
        System.out.println("0. Android");
        System.out.println("1. IOS");
        System.out.println("2. Windows");
        int type = UserInterface.getInt();
        MobileType phoneType = MobileType.values()[type];
        //or this one by reading the string and not a number
        // phoneType=MobileType.valueOf(sc.next());
        System.out.println("Enter Memory Size:");
        int memorySize = UserInterface.getInt();
        System.out.println("Enter Price:");
        double price = UserInterface.getInt();
        return new MobilePhone(model, phoneType, memorySize, price);
    }
    
    public static MyDate getDate()
    {
        System.out.println("Expiry Date--");
        System.out.println("Enter Day:");
        int day = UserInterface.getInt();
        System.out.println("Enter Month:");
        int month = UserInterface.getInt();
        System.out.println("Enter Year:");
        int year = UserInterface.getInt();
        return new MyDate(year, month, day);
    }

    public static PersonalPlan getPersonalPlan() throws PlanException, UserException
    {
        System.out.println("--- Personal Plan---");
        boolean success = false;
        while(!success)
        {
            try{
                System.out.println("Enter Plan Username:");
                String userName = UserInterface.getString();
                System.out.println("Enter Plan ID:");
                int planID = UserInterface.getInt();
                MobilePhone mobilePhone=UITools.getMobilePhone();
                System.out.println("Enter Internet Quota:");
                int internetQuota = UserInterface.getInt();
                System.out.println("Enter Cap Limit:");
                int capLimit = UserInterface.getInt();
                MyDate expiryDate=UITools.getDate();
                System.out.println("Enter City:");
                String city = UserInterface.getString();
                success = true;
                return creatPersonalPlan(userName, planID, mobilePhone, internetQuota, capLimit, expiryDate, city);
                //return new PersonalPlan(userName, planID, mobilePhone, internetQuota, capLimit, expiryDate, city);
            }
            catch(InputMismatchException e) 
            {
                System.out.println("error in input: " + e);
                System.out.println("please enter again");
            }
            catch(PlanException e)
            {
                System.out.println("Error: " + e);
            }
        }
        return null;
    }
    
    public static BusinessPlan getBusinessPlan() throws PlanException, UserException
    {
        System.out.println("---Business Plan---");
        boolean success = false;
        while(!success)
        {
            try
            {
                System.out.println("Enter Plan Username:");
                String userName = UserInterface.getString();
                System.out.println("Enter Plan ID:");
                int planID = UserInterface.getInt();
                MobilePhone mobilePhone=UITools.getMobilePhone();
                System.out.println("Enter Internet Quota:");
                int internetQuota = UserInterface.getInt();
                System.out.println("Enter Cap Limit:");
                int capLimit = UserInterface.getInt();
                MyDate expiryDate =UITools.getDate();
                System.out.println("Enter Number Of Employees:");
                int numOfEmployees = UserInterface.getInt();
                System.out.println("Enter ABN:");
                int ABN = UserInterface.getInt();
                success = true;
                return creatBusinessPlan(userName, planID, mobilePhone, internetQuota, capLimit, expiryDate, numOfEmployees, ABN);
                //return new BusinessPlan(userName, planID, mobilePhone, internetQuota, capLimit, expiryDate, numOfEmployees, ABN);
            }
            catch (InputMismatchException e) {
                System.out.println("error in input: " + e);
                System.out.println("please enter again");
            }
            catch(PlanException e)
            {
                System.out.println("Error: " + e);
            }
            return null;
        }
        return null;
    }

    public void removePlan(MobileCompany company, int userId , int planId)
    {
        User user = company.findUser(userId);
        if(user != null)
        {
            MobilePlan newPlan = company.findPlan(userId, planId);
            HashMap<Integer , MobilePlan> plans = user.getPlans();
            if(plans.remove(planId, newPlan))
            {
                System.out.println("The plan removed succesfully");
            }
            else{
                System.out.println("Your planid or userid is not valid");
            }
        }
    }

    public static void printUsers(ArrayList<User> users)
    {
        for(User user: users){
            user.print();
        }
    }

    public static void printUsers(HashMap<Integer,User> users)
    {
        for(User user: users.values()){
            user.print();
        }
    }

    public static User getAndFindUser(MobileCompany company)
    {
        User user = null;
        boolean success = false;
        while(!success)
        {
            try{
                System.out.println("Enter User ID:");
                int userID = UserInterface.getInt();
                user = company.findUser(userID);
                if(user != null)
                {
                    System.out.println("User has been found");
                    return user;
                }
                System.out.println("user has not been found !!");
                System.out.println("please enter again");
            }
            catch (InputMismatchException e){
                System.out.println("error in input: " + e);
                System.out.println("please enter again");
            }
        }
        return user;
    }

    public static PersonalPlan creatPersonalPlan(String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate expiryDate, String city) throws PlanException, UserException
    {
        try{
            return new PersonalPlan(userName, id, handset, internetQuota, capLimit, expiryDate, city);
        }
        catch(UserException e){
            System.out.println("Error: " + e);
            userName = e.getUserName();
            try{
                return new PersonalPlan(userName, id, handset, internetQuota, capLimit, expiryDate, city);
            }
            catch(PlanException k ){
                System.out.println("Error: " + k);
                id = k.getId();
                return new PersonalPlan(userName, id, handset, internetQuota, capLimit, expiryDate, city);
            }
        }
    }

    // public static TestPlan creatTestPlan(double payment ,String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate expiryDate) throws PlanException, UserException
    // {
    //     try{
    //         return new TestPlan(payment, userName, id, handset, internetQuota, capLimit, expiryDate);
    //     }
    //     catch(UserException e){
    //         System.out.println("Error: " + e);
    //         userName = e.getUserName();
    //         try{
    //             return new TestPlan(payment,userName, id, handset, internetQuota, capLimit, expiryDate);
    //         }
    //         catch(PlanException k ){
    //             System.out.println("Error: " + k);
    //             id = k.getId();
    //             return new TestPlan(payment,userName, id, handset, internetQuota, capLimit, expiryDate);
    //         }
    //     }
    // }

    public static BusinessPlan creatBusinessPlan(String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate expiryDate, int numberOfEmployees, int ABN) throws PlanException, UserException
    {
        try{
            return new BusinessPlan(userName, id, handset, internetQuota, capLimit, expiryDate, numberOfEmployees, ABN);
        }
        catch(UserException e){
            System.out.println("Error: " + e);
            userName = e.getUserName();
            try{
                return new BusinessPlan(userName , id, handset, internetQuota, capLimit, expiryDate, numberOfEmployees, ABN);
            }
            //return new BusinessPlan(userName , id, handset, internetQuota, capLimit, expiryDate, numberOfEmployees, ABN);
            catch(PlanException k){
                System.out.println("Error: " + k);
                id = k.getId();
                return new BusinessPlan(userName, id, handset, internetQuota, capLimit, expiryDate, numberOfEmployees, ABN);
            }
        }
    }

    public static void printMessageForAddingPPlan(int userid, String password, MobileCompany mobileCompany, int userID, String userName, int planID, MobilePhone mobile, int internetQuota, int capLimit, MyDate expiryDate, String city) throws PlanException, UserException
    {
        if(mobileCompany.createPersonalPlan(password, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, city))
        {
            System.out.println("The plan was added successfully");
        }
        else 
        {
            System.out.println("The plan can't be added. A plan with the same ID exists");
        }
    }

    public static void printMessageForAddingBPlan(int userid, String password, MobileCompany mobileCompany, int userID, String userName, int planID, MobilePhone mobile, int internetQuota, int capLimit, MyDate expiryDate, int numOfEmployees, int ABN) throws PlanException, UserException
    {
        if(mobileCompany.createBusinessPlan(password, userID, userName, planID, mobile, internetQuota, capLimit, expiryDate, numOfEmployees, ABN))
            {
                System.out.println("The plan was added successfully");
            }
            else {
                System.out.println("The plan can't be added. A plan with the same ID exists");
            }
    }

    public static void printCitiesReport(MobileCompany mobileCompany)
    {
        ArrayList<String> cities = mobileCompany.populateDistinctCityNames();
        ArrayList<Double> payments = mobileCompany.getTotalPaymentPerCity(cities);
        mobileCompany.reportPaymentPerCity(cities, payments);
    }

    public static void printArray(int[] array)
    {
        System.out.print("{");
        for(int i =0 ; i < array.length ; i++)
        {
            System.out.print(array[i] );
            if(i != array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printArrayPlanCount(int[] array , String name)
    {
        System.out.print(name + ":");
        System.out.print("{");
        for(int i =0 ; i < array.length ; i++)
        {
            System.out.print(array[i]);
            if(i != array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
    }


    public static void printArray(Integer[] array)
    {
        System.out.print("{");
        for(int i =0 ; i < array.length ; i++)
        {
            System.out.print(array[i]);
            if(i != array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printhashmap(HashMap<String, Integer[]> hashmap)
    {
        for(String string : hashmap.keySet())
        {
            System.out.print(string + ":");
            printArray(hashmap.get(string));
        }
    }

    public static void printhashmapModelCountUser(HashMap<String, Integer[]> hashmap, String name)
    {
        System.out.println(name + ":");
        for(String string : hashmap.keySet())
        {
            System.out.print(string + ":");
            printArray(hashmap.get(string));
        }
        System.out.println();
    }

    public static void printGetUsersPerCity(HashMap<String , ArrayList<User>> users)
    {
        for(String city : users.keySet())
        {
            System.out.println("----");
            System.out.println(city + ":");
            printUsers(users.get(city));
            System.out.println("----");
        }
    }

    public static void printHashMapPlans(HashMap<String , ArrayList<MobilePlan>> plans)
    {
        for(String name : plans.keySet())
        {
            System.out.println("----");
            System.out.println(name + ":");
            MobilePlan.printPlans(plans.get(name));
            System.out.println("----");
        }
    }
}