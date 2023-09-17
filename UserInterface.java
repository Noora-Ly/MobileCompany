

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

public class UserInterface // cleaned up version
{
    public static void displayMainMenu()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("---Main Menu---");
        System.out.println("(1) Admin Login");
        System.out.println("(2) User Login");
        System.out.println("(3) Save your data and plans");
        System.out.println("(4) Exit");
        System.out.println("\n\nSelect and Option from 1-3");
    }

    public static void mainMenu(MobileCompany mobileCompany) throws CloneNotSupportedException, PlanException, IOException, ClassNotFoundException, UserException
    {
        //Scanner sc = new Scanner(System.in);
        int input = 0;
        while(input != 3)
        {
            displayMainMenu();
            input = getInt();
            switch (input)
            {
                case 1:
                    adminLogin(mobileCompany);
                    break;
                case 2:
                    userLogin(mobileCompany);
                    break;
                case 3 :
                    //save
                case 4:
                    pressEnterToContinue();
                    break;
                default:
                    System.out.println("Wrong Option. Please enter a number between 1-3");
                    pressEnterToContinue();
            }
        }
    }
    //main menu options
    
    public static void adminLogin(MobileCompany mobileCompany) throws CloneNotSupportedException, PlanException, IOException, ClassNotFoundException, UserException
    {
        boolean loggedIn = false;
        String username;
        String password;

        while (!loggedIn)
        {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("--Admin Login---");
            System.out.println("Enter Username(or Q to return to main menu) :");
            username = getString();
            if (username.equals("Q"))
                return; // return to main menu again
            System.out.println("Enter Password:");
            password = getString();
            if(mobileCompany.validateAdmin(username,password))
            {
                loggedIn = true;
                System.out.println("Login Successful");
            }
            else 
            {
                System.out.println("Login Unsuccessful");
            }
        }
        //login successfull
        adminMenu(mobileCompany);
    }
    
    public static void userLogin(MobileCompany mobileCompany) throws PlanException, UserException, ClassNotFoundException, CloneNotSupportedException, IOException
    {
        boolean loggedIn = false;
        int userID;
        String password;
        User user=null;
        while (!loggedIn)
        {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("--User Login---");
            System.out.println("Enter UserID ( or 0 to return to main menu) : ");
            userID = getInt();
            if (userID==0)
                return; // return to main menu again
            System.out.println("Enter Password:");
            password = getString();
            user = mobileCompany.validateUser(userID,password);
            if(user != null)
            {
                loggedIn = true;
                System.out.println("Login Successful");
                userMainMenu(userID , password , user);
            }
            else 
            {
                System.out.println("Login Unsuccessful");
            }
        }
        mainMenu(mobileCompany);
    }
    
    public static void displayAdminMainMenu()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("---Admin Menu---");
        System.out.println("(1) Test Code");
        System.out.println("(2) Create User");
        System.out.println("(3) Create Personal Plan");
        System.out.println("(4) Create Business Plan");
        System.out.println("(5) Print User Information");
        System.out.println("(6) Filter By Mobile Model");
        System.out.println("(7) Filter By Expiry Date");
        System.out.println("(8) Update Address");
        System.out.println("(9) report Mobile Model,Total Monthly Payment,Average Monthly Payment");
        System.out.println("(10) report City Name,Total Monthly Payments across all users");
        System.out.println("(11) report Mobile Model,Total Monthly Payment,Average Monthly Payment across all users");
        System.out.println("(12) Save company ");
        System.out.println("(13) Load company ");
        System.out.println("(14) Save user ");
        System.out.println("(15) Load user ");
        System.out.println("(16) Save all plans ");
        System.out.println("(17) Load all plans ");
        System.out.println("(18) shallow copy Users");
        System.out.println("(19) deep copy Users");
        System.out.println("(20) sort Users By Payment ");
        System.out.println("(21) data aggregation ");
        System.out.println("(22) Log Out");
        System.out.println("\n\nSelect and Option from 1-9");
        //check this
    }
    
    public static void adminMenu(MobileCompany mobileCompany) throws CloneNotSupportedException, PlanException, IOException, ClassNotFoundException, UserException
    {
        int option = 0;
        while (option != 12){
            displayAdminMainMenu();
            option = getInt();
            switch (option){
                case 1:
                    TestCase.testCode(mobileCompany);
                    break;
                case 2:
                    createUser(mobileCompany);
                    break;
                case 3:
                    createPersonalPlan(mobileCompany);
                    break;
                case 4:
                    createBusinessPlan(mobileCompany);
                    break;
                case 5:
                    printUserInformation(mobileCompany);
                    break;
                case 6:
                    filterByMobileModel(mobileCompany);
                    break;
                case 7:
                    filterByExpiryDate(mobileCompany);
                    break;
                case 8:
                    updateAddress(mobileCompany);
                    break;
                case 9:
                    reportPerMobileModel(mobileCompany);
                    break;
                case 10:
                    reportCity(mobileCompany);
                    break;
                case 11:
                    reportMobileModel(mobileCompany);
                    break;
                case 12:
                    saveCompany(binaryOrText(), mobileCompany, getFileName());
                    break;
                case 13:
                    loadCompany(binaryOrText(), mobileCompany, getFileName());
                    break;
                case 14:
                    saveUser(binaryOrText(), null, getFileName());
                    break;
                case 15:
                    loadUser(binaryOrText(), null, getFileName());
                    break;
                case 16:
                    savePlan(binaryOrText(), getFileName(), mobileCompany.allPlans());
                    break;
                case 17:
                    loadPlan(binaryOrText(), getFileName(), mobileCompany.allPlans());
                    break;
                case 18:
                    shallowCopyUsers(mobileCompany);
                    break;
                case 19:
                    deepCopyUsers(mobileCompany);
                    break;
                case 20:
                    sortUserByPayment(mobileCompany);
                    break;
                case 21:
                    dataAggregationReport(mobileCompany);
                    break;
                case 22:
                    System.out.println("---loged out---");
                    break;
                default:
                    System.out.println("That option doesn't exist try a number within 1-9");
            }
            pressEnterToContinue();
        }
    }
   
    public static void displayUserMainMenu()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("---User Menu---");
        System.out.println("(1) Print All Plans and Total Monthly Payments");
        System.out.println("(2) Create Personal Plan");
        System.out.println("(3) Create Business Plan");
        System.out.println("(4) Print User Information");
        System.out.println("(5) Update Address");
        System.out.println("(6) Log Out");
        System.out.println("\n\nSelect and Option from 1-6");
    }
	
    public static void userMainMenu(int userId , String password , User user) throws PlanException, UserException
    {
        int input = 0;
        while (input != 7)
        {
            displayUserMainMenu();
            input = getInt();
            switch (input)
            {
                case 1:
                    printUser(user);
                    break;
                case 2:
                    createPersonalPlan(userId , password, user);
                    break;
                case 3:
                    createBusinessPlan(userId, password, user);
                    break;
                case 4:
                    printUser(user);
                    break;
                case 5:
                    updateAddress(user);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("That option doesn't exist try a number within 1-6");
            }
            pressEnterToContinue();
        }	
    }

    // admin menu options

    
    public static void createUser(MobileCompany mobileCompany) //good way
    {
        UITools.addUser(mobileCompany,UITools.getUser());
    }
    
    public static void createPersonalPlan(MobileCompany mobileCompany) throws PlanException // good way
, UserException
    {
        System.out.println("---Create Personal Plan---");
        System.out.println("Enter a UserID to add Plan to:");
        int userID = getInt();
        System.out.println("Enter the user pass:");
        String userPass = getString();
        UITools.addPlan(userID,userPass, mobileCompany.findUser(userID),UITools.getPersonalPlan() );
    }
   
    public static void createBusinessPlan(MobileCompany mobileCompany) throws PlanException // Good way
, UserException
    {
        System.out.println("---Create Business Plan---");

        System.out.println("Enter User Id to add Plan to:");
        int userID = getInt();
        System.out.println("Enter the user pass:");
        String userPass = getString();
        UITools.addPlan( userID,userPass, mobileCompany.findUser(userID), UITools.getBusinessPlan());
    }
    
    public static void printUserInformation(MobileCompany mobileCompany)
    {
        System.out.println("---Print User Information---");
        System.out.println("Enter User ID:");
        int userID = getInt();
        //mobileCompany.printPlans(userID); // does not print user info
        mobileCompany.printUser(userID);// better    
    }
    
    public static void filterByMobileModel(MobileCompany mobileCompany)
    {
        System.out.println("---Filter By Mobile Model---");
        System.out.println("Enter Mobile Model:");
        String mobileModel = getString();
        //ArrayList<MobilePlan> filteredPlans = mobileCompany.filterByMobileModel(mobileModel);
        ArrayList<MobilePlan> filteredPlans = mobileCompany.filterByMobileModel(mobileModel);
        System.out.println("Filtered Plans--");
        MobilePlan.printPlans(filteredPlans);
        double totalMonthlyPayments = MobilePlan.calcTotalPayments(filteredPlans, mobileCompany.getFlatRate());
        System.out.println("Total Monthly Payments:$" + totalMonthlyPayments);
    }

    public static void filterByExpiryDate(MobileCompany mobileCompany)
    {
        System.out.println("---Filter By Expiry Date---");
        MyDate expiryDate=UITools.getDate();
        System.out.println("Enter User ID:");
        int userId = getInt();
        //ArrayList<MobilePlan> filteredPlans = mobileCompany.filterByExpiryDate(userId, expiryDate);
        HashMap<Integer , MobilePlan> filteredPlans = mobileCompany.filterByExpiryDate(userId, expiryDate);
        System.out.println("Expired Plans--");
        MobilePlan.printPlans(filteredPlans);
    }

    public static void updateAddress(MobileCompany mobileCompany)
    {
        System.out.println("---Update Address---");
        System.out.println("Enter User ID for Address to be changed:");
        int userId = getInt();
        Address newAddress=UITools.getAddress();
        User user = mobileCompany.findUser(userId);
        if (user!=null)
        {
            user.setAddress(newAddress);
            System.out.println("New Address:");
            System.out.println(user.getAddress());
        }
        else
        {
           System.out.println("User has not been found"); 
        }
    }
    
    //User menu options
    public static void createPersonalPlan(int userid, String password,User user) throws PlanException, UserException
    {
        UITools.addPlan(userid ,password, user,UITools.getPersonalPlan());    
    }

    public static void createBusinessPlan(int userid, String password,User user) throws PlanException, UserException
    {
        UITools.addPlan(userid ,password, user, UITools.getBusinessPlan());
    }
   
    public static void printUser(User user)
    {
        System.out.println("---User Information---");
        user.print();
    }

    public static void updateAddress(User user)
    {
        System.out.println("---Update Address---");
        user.setAddress(UITools.getAddress());
        System.out.println("New Address:");
        System.out.println(user.getAddress()); 
    }
	
    public static void pressEnterToContinue()
    {
        System.out.println("Press Enter Key to Continue...");
        try 
        {
            System.in.read();
        }
        catch (Exception e)
        {
            
        }
    } 
    
    public static void reportPerMobileModel(MobileCompany company)
    {
        User user = UITools.getAndFindUser(company);
        user.reportPerMobileModel(user.getTotalPaymentPerMobileModel(company.getFlatRate()), user.getTotalCountPerMobileModel());
    }

    public static void reportCity(MobileCompany company)
    {
        company.reportCity(company.getTotalPaymentPerMobileModel());
    }

    public static void reportMobileModel(MobileCompany company)
    {
        company.reportMobileModel(company.getTotalPaymentPerMobileModel(),company.getTotalCountPerMobileModel());
    }

    public static int getInt() throws InputMismatchException
    {
            int input = 0;
            boolean success = false;
            while(!success)
            {
                try{
                    input = UserInterface.getInt();
                    success = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("error in input: " + e);
                    System.out.println("please enter again: ");
                    break;
                }
            }
            return input;
    }

    public static String getString() throws InputMismatchException
    {
            String input = null;
            boolean success = false;
            while(!success)
            {
                try{
                    input = UserInterface.getString();
                    success = true;
                }
                catch (InputMismatchException e)
                {
                    System.out.println("error in input: " + e);
                    System.out.println("please enter again: ");
                    break;
                }
            }
            return input;
    }

    public static void saveCompanyBinary(String fileName , MobileCompany company) throws ClassNotFoundException, IOException
    {
        if(company.saveTextFile(fileName))
        {
            System.out.println("Binary file for company crearet");
        }
        else
        {
            System.out.println("Could not create binary file for company!");
        }
    }

    public static void loadCompanyBinary(String fileName , MobileCompany company) throws ClassNotFoundException
    {
        if(company.load(fileName))
        {
            System.out.println("Binary file for company loaded");
        }
        else
        {
            System.out.println("Could not load binary file for company!");
        }
    }

    public static void saveUserBinary(String fileName , HashMap<Integer,User> users) throws ClassNotFoundException
    {
        if(User.save(users , fileName))
        {
            System.out.println("Binary file for users crearet");
            
        }
        else
        {
            System.out.println("Could not create binary file for users!");
        }
    }

    public static HashMap<Integer,User> loadUserBinary(String fileName) throws ClassNotFoundException
    {
        HashMap<Integer,User> users = User.load(fileName);
        if(users != null)
        {
            return users;
        }
        return null;
        //ask
    }

    public static void savePlanBinary(String fileName , HashMap<Integer, MobilePlan> plans) throws ClassNotFoundException
    {
        if(MobilePlan.save(plans , fileName))
        {
            System.out.println("Binary file for plans crearet");
            
        }
        else
        {
            System.out.println("Could not create binary file for plans!");
        }
    }

    public static HashMap<Integer, MobilePlan> loadPlanBinary(String fileName ) throws ClassNotFoundException
    {
        HashMap<Integer, MobilePlan> plans = MobilePlan.load(fileName);
        if(plans != null)
        {
            return plans;
        }
        return null;
        //ask
    }

    //-------------------------------------------
    public static void saveCompanyText(String fileName , MobileCompany company) throws ClassNotFoundException, IOException
    {
        if(company.saveTextFile(fileName))
        {
            System.out.println("Text file for company crearet");
        }
        else
        {
            System.out.println("Could not create text file for company!");
        }
    }

    public static void loadCompanyText(String fileName , MobileCompany company) throws ClassNotFoundException, IOException, PlanException, UserException
    {
        if(company.loadTextFile(fileName) != null)
        {
            System.out.println("Text file for company loaded");
        }
        else
        {
            System.out.println("Could not load text file for company!");
        }
    }

    public static void saveUserText(String fileName , HashMap<Integer,User> users) throws ClassNotFoundException, IOException
    {
        if(User.saveTextFile(users , fileName))
        {
            System.out.println("Text file for users crearet");
        }
        else
        {
            System.out.println("Could not create text file for users!");
        }
    }

    public static HashMap<Integer,User> loadUserText(String fileName) throws ClassNotFoundException, IOException, PlanException, UserException
    {
        HashMap<Integer,User> users = User.loadTextFile(fileName);
        if(users != null)
        {
            return users;
        }
        return null;
        //ask
    }

    public static void savePlanText(String fileName , HashMap<Integer, MobilePlan> plans) throws ClassNotFoundException, IOException
    {
        if(MobilePlan.saveTextFile(plans , fileName))
        {
            System.out.println("Text file for plans crearet");
        }
        else
        {
            System.out.println("Could not create Text file for plans!");
        }
    }

    public static HashMap<Integer, MobilePlan> loadPlanText(String fileName ) throws ClassNotFoundException, IOException, PlanException, UserException
    {
        HashMap<Integer, MobilePlan> plans = MobilePlan.loadTextFile(fileName);
        if(plans != null)
        {
            return plans;
        }
        return null;
        //ask
    }

    public static String binaryOrText()
    {
        System.out.println("Do you want to save/load binary file or text file?");
        System.out.println("Enter t for text file and b for binary file");
        String userChoise = getString();
        return userChoise;
    }

    public static void saveCompany(String userChoice , MobileCompany comapny , String fileName) throws ClassNotFoundException, IOException
    {
        switch(userChoice)
        {
            case "t":
                saveCompanyText(fileName, comapny);
                break;
            case "b":
                saveCompanyBinary(fileName, comapny);
                break;
            default :
                System.out.println("something went wrong");
        }
    }

    public static void loadCompany(String userChoice , MobileCompany comapny , String fileName) throws ClassNotFoundException, IOException, PlanException, UserException
    {
        switch(userChoice)
        {
            case "t":
                loadCompanyText(fileName, comapny);
                break;
            case "b":
                loadCompanyBinary(fileName, comapny);
                break;
            default :
                System.out.println("something went wrong");
        }
    }

    public static void saveUser(String userChoice ,HashMap<Integer,User> users , String fileName) throws ClassNotFoundException, IOException
    {
        switch(userChoice)
        {
            case "t":
                saveUserText(fileName, users);
                break;
            case "b":
                saveUserBinary(fileName, users);
                break;
            default :
                System.out.println("something went wrong");
        }
    }

    public static void loadUser(String userChoice ,HashMap<Integer,User> users , String fileName) throws ClassNotFoundException, IOException, PlanException, UserException
    {
        switch(userChoice)
        {
            case "t":
                loadUserText(fileName);
                break;
            case "b":
                loadUserBinary(fileName);
                break;
            default :
                System.out.println("something went wrong");
        }
    }

    public static void savePlan(String userChoice , String fileName, HashMap<Integer,MobilePlan> plans) throws ClassNotFoundException, IOException
    {
        switch(userChoice)
        {
            case "t":
                savePlanText(fileName, plans);
                break;
            case "b":
                savePlanBinary(fileName, plans);
                break;
            default :
                System.out.println("something went wrong");
        }
    }

    public static void loadPlan(String userChoice, String fileName, HashMap<Integer,MobilePlan> plans) throws ClassNotFoundException, IOException
    {
        switch(userChoice)
        {
            case "t":
                savePlanText(fileName, plans);
                break;
            case "b":
                savePlanBinary(fileName, plans);
                break;
            default :
                System.out.println("something went wrong");
        }
    }

    public static String getFileName()
    {
        System.out.println("please enter filename");
        return getString();
    }

    public static void sortUserByPayment(MobileCompany mobileCompany)
    {
        System.out.println(mobileCompany.sortUsersByMonthlyPayment());
        
    }

    public static void shallowCopyUsers(MobileCompany mobileCompany)
    {
        System.out.println(mobileCompany.shallowCopyUsersHashMap());
    }

    public static void deepCopyUsers(MobileCompany mobileCompany) throws CloneNotSupportedException
    {
        System.out.println(mobileCompany.deepCopyUsersHashMap());
    }

    public static void dataAggregationReport(MobileCompany mobileCompany){
        System.out.println("---- Date Aggregation Report ----");
        UITools.printCitiesReport(mobileCompany);
    }
}
