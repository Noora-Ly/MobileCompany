

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestCase implements Serializable
{
    public static void testCode(MobileCompany mobileCompany) throws CloneNotSupportedException, PlanException, IOException, ClassNotFoundException, UserException
    {
        double flatRate=12;
        System.out.println("---Test Code---");

        MobilePhone mobilePhone = new MobilePhone("Galaxy S10", MobileType.Android,8, 350);
        MobilePhone mobilePhone1 = new MobilePhone("Iphone X", MobileType.IOS,4, 450);
        MobilePhone mobilePhone2 = new MobilePhone("LG S50", MobileType.Windows,16, 400);
        MobilePhone mobilePhone3 = new MobilePhone("Iphone X", MobileType.Windows,16, 480);
        MobilePhone mobilePhone4 = new MobilePhone("Iphone X", MobileType.IOS,16, 390);

        //Initialize plan objects
        // 365498
        // 375964
        // 364315
        // 395684
        // 311426
        // 322564
        // MobilePlan plan0 = UITools.creatPersonalPlan("OP123",365,mobilePhone,120, 22, new MyDate(2000, 5, 14), "Wollongong");
        // MobilePlan plan1 = UITools.creatPersonalPlan("Sara12",374,mobilePhone,30, 38, new MyDate(1999, 4, 34),"Sydney");
        // MobilePlan plan2 = UITools.creatPersonalPlan("John342",3615,mobilePhone1,100, 20, new MyDate(2004, 3, 23),"Dubbo");
        // MobilePlan plan3 = UITools.creatBusinessPlan("Alex123",384,mobilePhone1,50, 80, new MyDate(2020, 6, 21),20, 123568);
        // MobilePlan plan4 = UITools.creatBusinessPlan("Gh546",316,mobilePhone2,20, 30, new MyDate(2021, 7, 29),10, 666555);
        // MobilePlan plan5 = UITools.creatBusinessPlan("S9845",3264,mobilePhone2,200, 46, new MyDate(2024, 2, 17),200, 222333);
        // MobilePlan plan6 = UITools.creatPersonalPlan("jo12",3854,mobilePhone3,32, 38, new MyDate(2015, 4, 34),"Sydney");

        MobilePlan plan0 = UITools.creatPersonalPlan("USR000123U",310368,mobilePhone,0, 10, new MyDate(2000, 5, 14), "Wollongong");
        MobilePlan plan1 = UITools.creatPersonalPlan("USR000459U",310374,mobilePhone,1, 9, new MyDate(1999, 4, 34),"Sydney");
        MobilePlan plan2 = UITools.creatPersonalPlan("USR012356U",303695,mobilePhone1,8, 12, new MyDate(2004, 3, 23),"Dubbo");
        MobilePlan plan3 = UITools.creatBusinessPlan("USR000639U",345884,mobilePhone4,1, 10, new MyDate(2020, 6, 21),20, 123568);
        MobilePlan plan4 = UITools.creatBusinessPlan("USR120123U",365968,mobilePhone2,1, 6, new MyDate(2021, 7, 29),10, 666555);
        MobilePlan plan5 = UITools.creatBusinessPlan("USR000985U",310963,mobilePhone2,1, 4, new MyDate(2004, 2, 17),200, 222333);
        MobilePlan plan6 = UITools.creatPersonalPlan("USR000164U",386536,mobilePhone3,1, 8, new MyDate(2015, 4, 34),"Sydney");

        User user0 = new User("John Smith", new Address(12, "Princs Hwy", "Fairy Meadow", "Wollongong"),"password1");
        User user1 = new User("Sara Lawson", new Address(43, "Illawara Avenue", "Gwynneville", "Wollongong"), "password1");
        User user2 = new User("Robert London", new Address(22, "Edward st", "Coniston", "Wollongong"), "123");
        User user3 = new User("Alex Niton", new Address(330, "Smith st", "Liverpool", "Sydney"), "12345");
        User user4 = new User("Joe Tomson", new Address(20, "Rose st", "North Sydney", "Sydney"), "123");
        User user5 = new User("Allison Bird", new Address(41, "Grey st", "Monavale", "Melbourne"), "password123");

	//lab1 ---Test the Plan Class---------------------------------------------------------------------------------
        
        ArrayList<MobilePlan> plans = new ArrayList<>(); //ArrayList of parent class
        plans.add(plan1); //adding plans to the list 
        plans.add(plan2);
        plans.add(plan3);
        plans.add(plan4);
        plans.add(plan5);
        
        for (MobilePlan plan : plans) 
        {
            plan.print();                 //print using print method
        }
		
        for (MobilePlan plan : plans) 
        {
            System.out.println(plan); //print using toString method
        }
		
        double total = 0;
        for (MobilePlan plan : plans) 
        {    
            total += plan.calcPayment(flatRate);
        }
        System.out.println("Total pay = " + total);
		
	//lab2 -----------Test the User class-----------------------------------------------------------------------
  
        //add plans to user
        UITools.addPlan(user1.getID(), "password1" ,user1, plan1);
        UITools.addPlan(user1.getID(), "password1" ,user1, plan2);
        UITools.addPlan(user1.getID(), "password1" ,user1, plan3);
        //call print() method for user1
        user1.print();
        //print user1 using toString
        System.out.println(user1.toString());
        //Find a plan by using findPlan() to invalid ID
        MobilePlan foundPlan = user1.findPlan(12345);
        if (foundPlan == null)//---------------------12345 is not valid
        {
            System.out.println("Plan has not been found");
        }
        else 
        {
            foundPlan.print();
        }
		
        foundPlan = user1.findPlan(122);
        if (foundPlan == null)
        {
            System.out.println("Plan has not been found");
        }
        else 
        {
            foundPlan.mobilePriceRise(0.1);
            foundPlan.setUsername("Robert");
            foundPlan.setHandsetModel("Iphone X MAX");
            foundPlan.print();
        }
        
        user1.setCity("Wollongong"); //instead of user1.getAddress().setCity("Wollongong");
        user1.print(); 
        //ask customer to enter a new address
        //COMENTED FOR ASSIGNEMNT I 
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the new street number: ");
//        int newStreetNum = scan.nextInt();
//        System.out.print("Enter the new street name: ");
//        String newStreetName = scan.next();
//        System.out.print("Enter the new suburb: ");
//        String newSuburb = scan.next();
//        System.out.print("Enter the new city: ");
//        String newCity = scan.next();
//        Address newAddress = new Address(newStreetNum, newStreetName, newSuburb, newCity); // by using scanner
	    // Address newAddress = new Address(31, "Gray Street", "Liverpool", "Sydney");// hardcoded for assigment I
        // user1.setAddress(newAddress);
        //user1.print();
        //print the total monthly payment of the user 
        System.out.printf("The total monthly payment of user: %.3f%n",  user1.calcTotalPayments(365756, "password1" ,flatRate));
        //add 10% to the price of mobile phones for all the plans this user owns and print again
        user1.mobilePriceRiseAll(0.1);
        System.out.printf("The new total monthly payment of user: %.3f%n",  user1.calcTotalPayments(365756, "password1" ,flatRate));
        
	//ask customer to enter a mobileModel 
        //System.out.print("Enter a mobile model: ");
        String userMobileModel = "Iphone";//scan.next(); // change scanner to hardcoded
		
        //call filterByMobileModel method for the user and store the filtered list
        //ArrayList<MobilePlan> filteredPlans = user1.filterByMobileModel(userMobileModel);
        ArrayList<MobilePlan> filteredPlans = user1.filterByMobileModel(userMobileModel);
        //print the filtered list by calling the static method inside MobilePlan
        MobilePlan.printPlans(filteredPlans);
        
		
	// ------ lab 3 testing the company --------------------------------------------------------------------------------
		
	//one  object of MobileCompany class
        //MobileCompany mobileCompany = new MobileCompany("Hooman Company", "admin", "admin", 20); // we get it as an input parameter now
        
        // Log in once successfull and once not successfull
        UITools.validateAdmin(mobileCompany,"andy", "andy12"); // not successfull login
		
	if(!mobileCompany.validateAdmin("admin", "admin"))
	{
            System.out.println("Admin Login unsuccessful");
        }
        else // login successfull
        {
            System.out.println("------------------------------------");
            // Add users to the mobile company with both methods
            
            //Add users
            UITools.addUser(mobileCompany, user3);
            UITools.addUser(mobileCompany, user4);
            UITools.addUser(mobileCompany, user0);
            UITools.addUser(mobileCompany, user1);
            UITools.addUser(mobileCompany, user2);
            UITools.addUser(mobileCompany, user5);
            UITools.addUser(mobileCompany, user0);
            //UITools.addUser(mobileCompany, "Mark", 56236, new Address(9, "Wind St", "West Wollongong", "Wollongong"), "pass123");

            System.out.println("-------------------------------------");
            
            //Add plans to users

//            mobileCompany.addPlan(1, plan1);  //wrong not checkign the output of the boolean method
//            mobileCompany.addPlan(33, plan4); // wrong not checking the output

            //correct way of adding plans as below

            //User0
            UITools.addPlan(user0.getID(), "password1" , user0, plan0);
            UITools.addPlan(user0.getID() , "password1" , user0, plan2);
            UITools.addPlan(user0.getID(), user0.getPassword(),user0 , plan6);
            

            //User1
            UITools.addPlan(user1.getID(), "password1" , user1, plan3);
            UITools.addPlan(user1.getID() , "password1" , user1, plan5);

            //User2
            UITools.addPlan(user2.getID(),"123", user2, plan1);
            UITools.addPlan(user2.getID(), "123", user2, plan4);

            UITools.addPlan(user3.getID(), "12345",user3, plan3); //direct userID
            UITools.addPlan(user3.getID(), "12345",user3, plan1);
            UITools.addPlan(user3.getID(), "12345",user3, plan5);
            UITools.addPlan(user4.getID(), "123",user4, plan3);
            UITools.addPlan(user4.getID(), "123",user4, plan2);
            UITools.addPlan(user4.getID(), "123",user4, plan4);

            UITools.addPlan(user5.getID(), "password123",user5, plan0);
            UITools.addPlan(user5.getID(), "password123",user5, plan1);
            UITools.addPlan(user5.getID(), "password123",user5, plan2);
            UITools.addPlan(user5.getID(), "password123",user5, plan5);
            
            // Add several plans to some users by calling createPersonalPlan() and createBusinessPlan() 

//            mobileCompany.createPersonalPlan(1, "User3", 333, mobilePhone, 29, 11, new MyDate(2019, 9, 14), "Wollongong");// wrong
//            mobileCompany.createBusinessPlan(1, "User2", 111, mobilePhone, 233, 2, new MyDate(2019, 9, 14), 75, 123);     // wrong

            //correct ways by using the UI methods to check the Boolean

            // UITools.addPersonalPlan(user3.getID(), "12345" ,mobileCompany, user3.getID(), "Frank", 12314, mobilePhone, 25, 2, new MyDate(2019, 9, 14), "Churchville");
            // UITools.addPersonalPlan(user3.getID(), "12345" , mobileCompany, user3.getID(), "Wanqing", 90909, mobilePhone1, 30, 50, new MyDate(2021, 10, 18), "Springfield");
            // UITools.addPersonalPlan(user4.getID(), "123", mobileCompany, user4.getID(), "Natasha", 88978, mobilePhone2, 140, 57, new MyDate(2021, 11, 22), "Wuhan");

            // UITools.addBusinessPlan(user4.getID(), "123", mobileCompany, user4.getID(), "Edward", 89900, mobilePhone1, 8, 2, new MyDate(2019, 8, 11), 150, 1212121);
            // UITools.addBusinessPlan(user5.getID(), "password123", mobileCompany, user5.getID(), "Micheal", 45674, mobilePhone, 200, 34, new MyDate(2020, 9, 31), 4000, 3434344);
            // UITools.addBusinessPlan(user5.getID(), "password123", mobileCompany, user5.getID(), "Mary", 67656, mobilePhone2, 5000, 80, new MyDate(2020, 12, 1), 2000, 5656565);
            
            // //Duplicate Plan
            // UITools.addBusinessPlan(user0.getID() , "password1" ,mobileCompany, user0.getID(), "qw123", 122, mobilePhone, 25, 2, new MyDate(2020, 9, 14), 150, 1212121);

            System.out.println();

            System.out.println("--------------------------------------");

            // Ask customer to enter a userID and and print the user and all of his plans by using methods inside mobileCompany
            System.out.println("--------------------------------------");
            //Scanner scan = new Scanner(System.in);
            //System.out.print("Enter a userID: ");
            int userID = user3.getID(); //scan.nextInt();//change it to hardcoded rather than scanner
            mobileCompany.printPlans("12345",userID);

            //or finding the user and user methods

            //Test user ID
            System.out.println("User ID find test and print");
//            int testUserID = user0.getID();
//            User user = mobileCompany.findUser(testUserID); // to get user ID
            User user = mobileCompany.findUser(user0.getID()); //direct numebr for userID
            
            if(user!=null)
            {
                user.print();
                user.printPlans(user0.getID() ,"password1" , flatRate);
                System.out.println();
            }
            else
            {
                System.out.println("User has not been found");
            }

            /*
            Ask customer to enter a userID and planID and find a plan with the given planID for that userID by calling findPlan (int userID ,int policyID) and then print the plan. 
            */

            System.out.println("--------------------------------------");
            System.out.println("Find plan Test");
            System.out.print("Enter a userID: ");
            userID = user0.getID();//scan.nextInt();
            System.out.print("Enter a planID: ");
            int planID = 122; //scan.nextInt();
            foundPlan=mobileCompany.findPlan(userID, planID); 

            if (foundPlan == null)
            {
                System.out.println("Plan has not been found");
            }
            else 
            {
                foundPlan.print();
            }

            System.out.println("--------------------------------------");
            // print all users inside the company
            System.out.println("Print the Company including All users");
            mobileCompany.print();
            System.out.println();

            System.out.println("Print company information with ToString()");
            System.out.println(mobileCompany);
            System.out.println();

            // Print the total payments for a given userID by calling calcTotalPayments (int userID) 
            // System.out.print("Enter a userID: ");                                      
            // int userID = scan.nextInt();
            // System.out.printf("Total payments for this user: %.2f%n", mobileCompany.calcTotalPayments(userID));

            System.out.println("Total payments for user user3.getId()");
            System.out.printf("Total payments for this user: %.2f%n", mobileCompany.calcTotalPayments());
            System.out.println();

            // Print the total payments for all users in the company 
            System.out.println("Total monthly payment for of all users inside the company: ");
            //System.out.println(mobileCompany.calcTotalPayments());
            System.out.printf("Total payments for all users in company: %.2f\n", mobileCompany.calcTotalPayments());
            // you also can move these messages and prints to a method inside UITOOLS
            
            System.out.println();

            System.out.println("----------------All Plans----------------------");
            // Call allPlans() for the mobileCompany and store it in an ArrayList and print the list by using MobilePlan.printPlans()
            //ArrayList<MobilePlan> mobileCompPlans = mobileCompany.allPlans();
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            HashMap<Integer, MobilePlan> mobileCompPlans = mobileCompany.allPlans();
            MobilePlan.printPlans(mobileCompPlans);
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111111111111");

            System.out.println("--------------------------------------");
            mobileCompany.mobilePriceRise(0.1);
            System.out.printf("The TotalMonthlyPayment of users after 10 percent rise: %.2f%n",  mobileCompany.calcTotalPayments());
            System.out.println("Print All the users after mobile price rise");
            mobileCompany.print();

            System.out.println("Print a user after mobile price rise");
//            mobileCompany.mobilePriceRise(user0.getID(),0.1); //wrong as it does not check the output
//            UITools.mobilePriceRise(mobileCompany,489123,0.1); //or
            UITools.mobilePriceRise(mobileCompany,user3.getID(),0.1);
            user3.print();

            //For a given userID and expiry date call filterByExpiryDate (int userID, MyDate date), store the filtered list and print the list by using MobilePlan.printPlans()
            System.out.println("-----------------filter a user plans by Expiry Date--------------------");
            //ArrayList<MobilePlan> filteredByExpiryDatePlans1 = mobileCompany.filterByExpiryDate(user3.getUserID(),new MyDate(2020, 7, 15));
            HashMap<Integer, MobilePlan> filteredByExpiryDatePlans1 = mobileCompany.filterByExpiryDate(user3.getID(),new MyDate(2020, 7, 15));
            MobilePlan.printPlans(filteredByExpiryDatePlans1);
            System.out.println();

            // For a given mobile model and userID call mobileCompany.filterByMobileModel (String mobileModel) and print the filtered list 	
            System.out.println("-----------------filter a user plans by Mobile Model------------------");
            MobilePlan.printPlans(mobileCompany.filterByMobileModel(user4.getID(),"Iphone")); //Without the seperate list
            System.out.println();

            //For the whole company call filterByExpiryDate
            //ArrayList<MobilePlan> filteredByExpriyDatePlans = mobileCompany.filterByExpiryDate(new MyDate(2015, 6, 15));
            HashMap<Integer, MobilePlan> filteredByExpriyDatePlans = mobileCompany.filterByExpiryDate(new MyDate(2015, 6, 15));
            System.out.println("Filter By Expiry Date");
            MobilePlan.printPlans(filteredByExpriyDatePlans);//or no seperate list and call it directly
            System.out.println();

            //For the whole company call filterByExpiryDate and print the list
            //ArrayList<MobilePlan> mobileModelPlans = mobileCompany.filterByMobileModel("Galaxy S10");
            ArrayList<MobilePlan> mobileModelPlans = mobileCompany.filterByMobileModel("Galaxy S10");
            System.out.println("Plans by Mobile Model");
            MobilePlan.printPlans(mobileModelPlans);
            System.out.println();

            // Ask user to enter a date (year, month, and day) and call filterByExpiryDate (MyDate date) and print the filtered list   
            //commneted for assigment I
//            System.out.println("--------------------------------------");
//            System.out.print("Enter a year: ");
//            int year = scan.nextInt();
//            System.out.print("Enter a month: ");
//            int month = scan.nextInt();
//            System.out.print("Enter a day: ");
//            int day = scan.nextInt();
//            MyDate userDate = new MyDate(year, month, day);
//            ArrayList<MobilePlan> filteredList = mobileCompany.filterByExpiryDate(userDate);
//            MobilePlan.printPlans(filteredList);



            // Find a user with the given ID (valid) and save it in a user object. Ask user to provide a new address and change the current address for the given user 
            System.out.println("--------------------------------------");
            // User foundUser = mobileCompany.findUser(489123); 
            // Address address = new Address(114, "Sara St", "Bondi", "Sydney");// instead of scanner
            // if(foundUser!=null)
            // {
            //     System.out.println("Found User:" + foundUser.getID());
            //     foundUser.setAddress(address);
            //     System.out.println("New Address:" + foundUser.getAddress());
            //     System.out.println();
            // }
            // else
            // {
            //     System.out.println("User has not been found");
            // }

            // standard test

            //Populate Distinct City Names
            System.out.println("---PopulateDistinctCityNames---");
            ArrayList<String> uniqueCities = mobileCompany.populateDistinctCityNames();
            
            for(String city : uniqueCities)
            {
                System.out.print(city+" , ");
            }
            System.out.println();

            //Get the total payments for a city
            System.out.println("---Get Total Payment For a City (Wollongong)---");
            double totalPaymentForACity = mobileCompany.getTotalPaymentForCity("Wollongong");
            System.out.println("Total payments for City Wollongong:" + totalPaymentForACity);
            System.out.println();

            //Get the total payments for each city in a list
            System.out.println("---Get Total Payment for all City---");
            //Uses unique cities form test above
            ArrayList<Double> totalPaymentForAllCity = mobileCompany.getTotalPaymentPerCity(uniqueCities);

            //Prints the city payment report
            System.out.println("---Report Total Payments for all Cities---");
            mobileCompany.reportPaymentPerCity(uniqueCities, totalPaymentForAllCity);

            //use the other report method without the need to send the seperate list
            System.out.println("---Report Total Payments for all Cities report method with no parameters---");
            mobileCompany.reportPaymentPerCity();      

            //Advanced Test Case

            //Populate Distinct Mobile Models for all users inside the company
            System.out.println("---Populate Distinct Mobile Models---");
            ArrayList<String> uniqueModels = mobileCompany.populateDistinctMobileModels();
            for(String model : uniqueModels)
            {
                System.out.print(model+" , ");
            }
            
            System.out.println();

            //Get the total payments for each model in a list
            System.out.println("---Get Total Payment for all models---");
            //Uses unique models form test above
            ArrayList<Double> totalPaymentForAllModels = mobileCompany.getTotalPaymentPerMobileModel(uniqueModels);

            //Get the count for each model in a list
            System.out.println("---Get count for all models---");
            //Uses unique models form test above
            ArrayList<Integer> countForAllModels = mobileCompany.getTotalCountPerMobileModel(uniqueModels);  


            //Prints the city payment report
            System.out.println("---Report Total and average Payments for all Models---");
            mobileCompany.reportPaymentsPerMobileModel(uniqueModels, countForAllModels,totalPaymentForAllModels);
            
            // or using the report with no parameter
            System.out.println("---Report Total and average Payments for all Models with the report method with no parameters---");
            mobileCompany.reportPaymentsPerMobileModel();

            //Populate Distinct Mobile Models for one user 
            System.out.println("---Populate Distinct Mobile Models for user 3 ---");
            uniqueModels = user3.populateDistinctMobileModels();
            
            for(String model : uniqueModels)
            {
                    System.out.print(model+" , ");
            }
            
            System.out.println();

            //Get the total payments for a mobile model
            System.out.println("---Get Total Payment For a mobile model user 3---");
            double totalPaymentForAModel = user3.getTotalPaymentForMobileModel("Iphone X",flatRate);
            System.out.println("Total payment for Iphone X : user 3 : " + totalPaymentForAModel);
            System.out.println();

            //Get the total count for a mobile model
            System.out.println("---Get the count For a mobile model user 3---");
            int countForAModel = user3.getTotalCountForMobileModel("Iphone X");
            System.out.println("Count for Iphone X : user 3 : " + countForAModel);
            System.out.println();

            //Get the total payments for each model in a list
            System.out.println("---Get Total Payment for all models -  user3: ---");
            //Uses unique models form test above
            totalPaymentForAllModels = user3.getTotalPaymentPerMobileModel(uniqueModels,flatRate);

            //Get the count for each model in a list
            System.out.println("---Get count for all models - user3: ---");
            //Uses unique models form test above
            countForAllModels = user3.getTotalCountPerMobileModel(uniqueModels);

            //Prints the city payment report
            System.out.println("---Report Total and average Payments for all mobile models user 3: ---");
            user3.reportPaymentsPerMobileModel(uniqueModels, countForAllModels, totalPaymentForAllCity);
            
            // or using the report with no parameter
            System.out.println("---Report Total and average Payments for all mobile models user 3: with the report method with no parameters---");
            user3.reportPaymentsPerMobileModel(flatRate);

//Lab4------------------------
            ArrayList<MobilePlan> shallowCopyPlans =  user1.shallowCopyPlans();
            ArrayList<MobilePlan> deepCopyPlans =  user1.deepCopyPlans();
            System.out.println("\n\n");
            System.out.println("---Original list---");
            System.out.println("\n\n");
            MobilePlan.printPlans(user1.getPlans());
            System.out.println("\n\n");
            
            //make changes
            //user1.setCity("New York");
            // MobilePlan plan = user1.findPlan(375964); //plan1
            // if(plan != null){
            //     plan.setcapLimit(50);
            // }
            // user1.addPlan(365768 , "123", plan4);
            // plan = user1.findPlan(679);
            // if(plan != null){
                //plan.setHandsetModel("Iphone 10");
                //MyDate newDate = new MyDate(2020, 1, 1);
                //plan.setExpiryDate(newDate);
            //}
            
            //sort plans by date
            System.out.println("\n\n");
            System.out.println("Sort plans: ");
            ArrayList<MobilePlan> sortPlansByDate = user1.sortPlansByDate();
            MobilePlan.printPlans(sortPlansByDate);

            //print original, shallow copy and deep copy of user plans
            System.out.println("\n\n");
            System.out.println("---Original list---");
            System.out.println("\n\n");
            MobilePlan.printPlans(user1.getPlans());
            System.out.println("\n\n");
            System.out.println("---Shallow copy---");
            System.out.println("\n\n");
            MobilePlan.printPlans(shallowCopyPlans);
            System.out.println("\n\n");
            System.out.println("---Deep copy---");
            System.out.println("\n\n");
            MobilePlan.printPlans(deepCopyPlans);
            System.out.println("\n\n");

            ArrayList<User> shallowCopyUsers = mobileCompany.shallowCopyUsers();
            ArrayList<User> deepCopyUsers = mobileCompany.deepCopyUsers();
            //Address addAddress = new Address(24, "Laleh", "Tehran", "Tehran");
            //mobileCompany.addUser("Nava", addAddress , "1234");
            user = mobileCompany.findUser(387899);
            //user.setCity("London");

            //sort users
            System.out.println("\n\n");
            System.out.println("---Sort user company---");
            System.out.println("\n\n");
            ArrayList<User> sortUsers = mobileCompany.sortUsers();
            UITools.printUsers(sortUsers); 
            System.out.println("\n\n");
            System.out.println("---Original list company---");
            System.out.println("\n\n");
            UITools.printUsers(mobileCompany.getUsers());
            System.out.println("\n\n");
            System.out.println("---Shallow copy---");
            System.out.println("\n\n");
            UITools.printUsers(shallowCopyUsers);
            System.out.println("\n\n");
            System.out.println("---Deep copy---");
            System.out.println("\n\n");
            UITools.printUsers(deepCopyUsers);
            System.out.println("\n\n");

            //make a clone and test it
            mobileCompany.clone();
            MobileCompany compnyClone = mobileCompany.clone();
            mobileCompany.setName("company");
            System.out.println("\n\n");
            System.out.println("we change the original one: ");
            System.out.println(mobileCompany.getName());
            System.out.println("Deep copy: ");
            System.out.println(compnyClone.getName());

    //---lab5---
            //mobilePlan metods test
            System.out.println("\n");
            System.out.println("--Print plans,shallow copy,deep copy with hash map--");
            HashMap<Integer, MobilePlan> user3Plans = user3.getPlans();
            System.out.println("User 3 plans original one");
            MobilePlan.printPlans(user3Plans);
            System.out.println("\n\n");
            //user3.setCity("Tehran");
            System.out.println("User 3 plans shallow copy");
            System.out.println("\n");
            MobilePlan.printPlans(MobilePlan.shallowCopy(user3Plans));
            System.out.println("\n\n");
            System.out.println("User 3 plans deep copy");
            System.out.println("\n");
            MobilePlan.printPlans(MobilePlan.deepCopy(user3Plans));

            //reports test
            System.out.println("\n\n");
            System.out.println("Report by mobile model:");
            HashMap<String,Integer> counts = user1.getTotalCountPerMobileModel();
            HashMap<String,Double> payments = user1.getTotalPaymentPerMobileModel(flatRate);
            user1.reportPerMobileModel(payments, counts);

            System.out.println("\n\n");
            System.out.println("Report per city :");
            HashMap<String,Double> paymentPerCity = mobileCompany.getTotalPaymentPerCity();
            mobileCompany.reportCity(paymentPerCity);

            System.out.println("\n\n");
            System.out.println("Report by mobile model:");
            HashMap<String, Integer> countPerMobile = mobileCompany.getTotalCountPerMobileModel();
            HashMap<String,Double> paymentPerModel = mobileCompany.getTotalPaymentPerMobileModel();
            mobileCompany.reportMobileModel(paymentPerModel, countPerMobile);
            System.out.println("\n");



        //test case lab6
            //plans binary file
            System.out.println("\n\n\n");
            System.out.println("-------testing binary file and list of plans-------");
            MobilePlan.save(mobileCompany.allPlans() ,"plans.ser");
            HashMap<Integer,MobilePlan> testPlans = MobilePlan.load("plans.ser");
            MobilePlan.printPlans(testPlans);
            System.out.println("\n\n\n");
            testPlans.put( 12,UITools.creatPersonalPlan("WP156",365,mobilePhone,56, 35, new MyDate(2014, 5, 26), "Tehran"));
            MobilePlan.save(testPlans , "plans.ser");
            plans.clear();
            testPlans =MobilePlan.load("plans.ser");
            MobilePlan.printPlans(testPlans);
            
            //users binary file
            System.out.println("\n\n\n");
            System.out.println("-------testing binary file and list of users-------");
            User.save(mobileCompany.getUsers() , "users.ser");
            HashMap<Integer,User> users = User.load("users.ser");
            UITools.printUsers(users);
            System.out.println("\n\n\n");
            Address addressTest = new Address(12, "Princs Hwy", "Fairy Meadow", "Wollongong");
            User user6 = new User(148843, "Mike Smith", addressTest ,"pass");
            PersonalPlan plan7 = UITools.creatPersonalPlan("USR302",395,mobilePhone,160, 24, new MyDate(2006, 1, 20), "Wollongong");
            user6.addPlan(user3.getID(), "12345" , plan7);
            users.put(140,user6);
            User.save(users , "users.ser");
            users.clear();
            users = User.load("users.ser");
            UITools.printUsers(users);
            
            // //mobileCompany binary file
            System.out.println("\n\n\n");
            System.out.println("-------testing binary file of company--------");
            mobileCompany.save("company.ser");
            MobileCompany mobileCompany1=new MobileCompany();
            mobileCompany1.load("company.ser");
            System.out.println(mobileCompany1);
            System.out.println("\n\n\n");
            mobileCompany1.addUser(user1);
            mobileCompany1.addPlan("admin", "admin" , 365756 , plan4);
            mobileCompany1.save("company.ser");
            MobileCompany mobileCompany2=new MobileCompany();
            mobileCompany2.load("company.ser");
            System.out.println(mobileCompany2);

            // //------------------------------------------------------------
            //testing text file and list of plans with toDilimitedString
            System.out.println("\n\n\n");
            System.out.println("-------testing text file and list of plans with toDilimitedString-------");
            MobilePlan.saveTextFile(mobileCompany.allPlans() , "plans.txt");
            HashMap<Integer,MobilePlan> planstest=MobilePlan.loadTextFile("plans.txt");
            MobilePlan.printPlans(planstest);
            System.out.println("\n\n\n");
            planstest.put(12 , plan5);
            MobilePlan.saveTextFile(planstest , "plans.txt");
            plans.clear();
            planstest=MobilePlan.loadTextFile("plans.txt");
            MobilePlan.printPlans(planstest);

            // //testing text file and list of users with toDilimitedString
            System.out.println("\n\n\n");
            System.out.println("-------testing text file and list of users with toDilimitedString-------");
            User.saveTextFile(mobileCompany.getUsers() , "users.txt");
            HashMap<Integer,User> usersTesting = User.loadTextFile("users.txt");
            UITools.printUsers(usersTesting);
            System.out.println("\n\n\n");
            user3.addPlan(user3.getID(), "12345" , plan5);
            usersTesting.put(user1.getID(),user1);
            User.saveTextFile(usersTesting , "users.txt");
            usersTesting.clear();
            usersTesting=User.loadTextFile("users.txt");
            UITools.printUsers(usersTesting);
        
            // //mobileCompany and text file
            System.out.println("\n\n\n");
            System.out.println("-------mobileCompany and text file------");
            mobileCompany.saveTextFile("company.txt");
            MobileCompany mobileCompany4 =new MobileCompany();
            mobileCompany4.loadTextFile("company.txt");
            System.out.println(mobileCompany4);
            System.out.println("\n\n\n\n\n");
            // mobileCompany4.addUser(user5);
            // mobileCompany4.addPlan("admin", "admin" , user5.getID() , plan3);
            mobileCompany4.saveTextFile("company.txt");
            MobileCompany mobileCompany3=new MobileCompany();
            mobileCompany3.loadTextFile("company.txt");
            System.out.println(mobileCompany3);

            try 
            {
                MobilePlan.save(mobileCompany1.allPlans(),"plans.ser");
                HashMap<Integer,MobilePlan> plans2 =MobilePlan.load("plans.ser");
                System.out.println("Printing a list of plans loaded from binary file");
                MobilePlan.printPlans(plans2);
            }
            catch(NullPointerException e)
            {
                System.err.println(e);
            }

//-----------------------------------------------------------------------------------
//testing the save and load plans in/from TEXT FILE

            try 
            {
                MobilePlan.saveTextFile(mobileCompany1.allPlans(),"plans.txt");
                HashMap<Integer,MobilePlan> plans2 =MobilePlan.loadTextFile("plans.txt");
                System.out.println("Printing a list of plans loaded from Text file");
                MobilePlan.printPlans(plans2);
            }
            catch(IOException e)
            {
                System.err.println(e);
            }

//-----------------------------------------------------------------------------------
//testing the save and load users in/from BINARY FILE

        try 
        {
            User.save(mobileCompany1.getUsers(),"users.ser");
            HashMap<Integer,User> users2 =User.load("users.ser");
            System.out.println("Printing a list of users loaded from binary file");
            System.out.println(users2.values());
        }
        catch(NullPointerException e)
        {
            System.err.println(e);
        }

//-----------------------------------------------------------------------------------
//testing the save and load users in/from TEXT FILE

        try 
        {
            User.saveTextFile(mobileCompany1.getUsers(),"users.txt");
            HashMap<Integer,User> users2=User.loadTextFile("users.txt");
            System.out.println("Printing a list of users loaded from Text file");
            System.out.println(users2.values());
        }
        catch(IOException e)
        {
            System.err.println(e);
        }


//-----------------------------------------------------------------------------------
//testing the save and load MobileCompany in/from BINARY FILE

        try 
        {
            mobileCompany1.save("company.ser");
            MobileCompany mobileCompany7=new MobileCompany();
            mobileCompany7.load("company.ser");
            System.out.println("Printing the mobile company loaded from binary file");
            System.out.println(mobileCompany7);
        }
        catch(NullPointerException e)
        {
            System.err.println(e);
        }

//-----------------------------------------------------------------------------------
//testing the save and load MobileCompany in/from Text FILE

        try 
        {
            mobileCompany1.saveTextFile("company.txt");
            MobileCompany mobileCompany8 =new MobileCompany();
            mobileCompany8.loadTextFile("company.txt");
            System.out.println("Printing the mobile company loaded from text file");
            System.out.println(mobileCompany8);
        }
        catch(IOException e)
        {
            System.err.println(e);
        } 


//-----------------------------------------------------------------------------------
// Assignment || test code
        //test comperator

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("check sort users by monthly payment");
        System.out.print("Montly Payment" + user2.getID());
        System.out.println(MobilePlan.calcTotalPayments(user2.getPlans(), flatRate));
        System.out.print("Montly Payment" + user0.getID());
        System.out.print(MobilePlan.calcTotalPayments(user0.getPlans(), flatRate));
        System.out.println("Montly Payment" + user4.getID());
        System.out.print(MobilePlan.calcTotalPayments(user4.getPlans(), flatRate));
        System.out.println("Montly Payment" + user3.getID());
        System.out.print(MobilePlan.calcTotalPayments(user3.getPlans(), flatRate));
        System.out.println("Montly Payment" + user5.getID());
        System.out.print(MobilePlan.calcTotalPayments(user5.getPlans(), flatRate));
        System.out.println("Montly Payment" + user1.getID());
        System.out.print(MobilePlan.calcTotalPayments(user1.getPlans(), flatRate));


        System.out.println("\n\n");
        System.out.println("----Sort Users By Monthly Payment----");
        UITools.printUsers(mobileCompany.sortUsersByMonthlyPayment());

        System.out.println("\n\n");
        System.out.println("----Get users per City ----");
        UITools.printGetUsersPerCity((mobileCompany.getUsersPerCity()));

        System.out.println("\n\n");
        System.out.println("----filter Plans By Expiry Date----");
        UITools.printHashMapPlans(mobileCompany.filterPlansByExpiryDate(plan6.getExpiryDate()));

        // for creat test case
        System.out.println("\n\n\n\n");
        System.out.println(plan0.calcPayment(flatRate));
        System.out.println(plan1.calcPayment(flatRate));
        System.out.println(plan2.calcPayment(flatRate));
        System.out.println(plan3.calcPayment(flatRate));
        System.out.println(plan4.calcPayment(flatRate));
        System.out.println(plan5.calcPayment(flatRate));
        System.out.println(plan6.calcPayment(flatRate));
        System.out.println("\n\n\n\n");
//Advanced
        System.out.println("-------------------------------- Test Case Noora----------------------------------------------");
        int[] ranges = {400 , 800 , 1000 , 12000};
        //int[] ranges2 = {10 , 30 , 60 , 200};
        System.out.println("\n");
        System.out.println("----Plan count User----");
        UITools.printArrayPlanCount(user0.planCount(user0.getUserID(), user0.getPassword() , ranges, 4) , user0.getName());
        UITools.printArrayPlanCount(user1.planCount(user1.getUserID(), user1.getPassword() , ranges, 4) , user1.getName());
        UITools.printArrayPlanCount(user2.planCount(user2.getUserID(), user2.getPassword() , ranges, 4) , user2.getName());
        UITools.printArrayPlanCount(user3.planCount(user3.getUserID(), user3.getPassword() , ranges, 4) , user3.getName());
        UITools.printArrayPlanCount(user4.planCount(user4.getUserID(), user4.getPassword() , ranges, 4) , user4.getName());
        UITools.printArrayPlanCount(user5.planCount(user5.getUserID(), user5.getPassword() , ranges, 4) , user5.getName());

        System.out.println("\n");
        System.out.println("----Plan count Company----");
        UITools.printArray(mobileCompany.planCount("admin", "admin", ranges));

        System.out.println("\n");
        System.out.println("----Plan City count Company----");
        UITools.printhashmap(mobileCompany.planCityCount("admin", "admin", ranges));

        System.out.println("\n");
        System.out.println("----User count Company----");
        UITools.printArray(mobileCompany.userCount("admin", "admin", ranges));

        System.out.println("\n");
        System.out.println("----User Mobile Model count Company----");
        UITools.printhashmap(mobileCompany.userMobileModelCount("admin", "admin", ranges, 4));

        System.out.println("\n");
        System.out.println("----Plan Mobile Model Count User----");
        UITools.printhashmapModelCountUser(user0.planMobileModelCount(user0.getName(),user0.getPassword(),ranges,4),user0.getName());
        UITools.printhashmapModelCountUser(user1.planMobileModelCount(user1.getName(),user1.getPassword(),ranges,4),user1.getName());
        UITools.printhashmapModelCountUser(user2.planMobileModelCount(user2.getName(),user2.getPassword(),ranges,4),user2.getName());
        UITools.printhashmapModelCountUser(user3.planMobileModelCount(user3.getName(),user3.getPassword(),ranges,4),user3.getName());
        UITools.printhashmapModelCountUser(user4.planMobileModelCount(user4.getName(),user4.getPassword(),ranges,4),user4.getName());
        UITools.printhashmapModelCountUser(user5.planMobileModelCount(user5.getName(),user5.getPassword(),ranges,4),user5.getName());

        System.out.println("\n");
        System.out.println("----Plan Mobile Model Count Company----");
        UITools.printhashmap(mobileCompany.planMobileModelCount("admin", "admin", ranges, 4));

        MobilePhone IphoneX = new MobilePhone("Iphone X", MobileType.IOS, 10, 10);
        MobilePhone LGT65 = new MobilePhone("LG T65", MobileType.IOS, 10, 10);
        MobilePhone SamsungGalaxyS10 = new MobilePhone("Samsung Galaxy S10", MobileType.IOS, 10, 10);
        MobilePhone NokiaS78 = new MobilePhone("Nokia S78", MobileType.IOS, 10, 10);
        MobilePhone GooglePixel5 = new MobilePhone("Google Pixel 5", MobileType.IOS, 10, 10);

        //"OP123",365,mobilePhone,120, 22, new MyDate(2000, 5, 14), "Wollongong"
        MyDate date = new MyDate(2020, 7, 20);
        TestPlan test1 = new TestPlan(20,"USR123456U", 300001, IphoneX, 120, 22, date);
        TestPlan test2 = new TestPlan(50,"USR234567U", 300002, IphoneX, 120, 22, date);
        TestPlan test3 = new TestPlan(30,"USR456325U", 300003, IphoneX, 120, 22, date);
        TestPlan test4 = new TestPlan(100,"USR458885U", 300004, LGT65, 120, 22, date);

        User user10 = new User("sara",new Address(12, "xxx", "xxx", "Wollongong"), "1234");
        User user20 = new User("John",new Address(12, "xxx", "xxx", "Wollongong"), "1234");
        User user30 = new User("Robert",new Address(12, "xxx", "xxx", "Sydney"), "1234");
        User user40 = new User("Alex",new Address(12, "xxx", "xxx", "Melbourne"), "1234");

        MobileCompany company = new MobileCompany("RGR", "admin", "admin", 30);


        user10.addPlan(user10.getID(), user10.getPassword(), test1);
        user10.addPlan(user10.getID(), user10.getPassword(), test2);
        user10.addPlan(user10.getID(), user10.getPassword(), test3);
        user10.addPlan(user10.getID(), user10.getPassword(), test4);

        MobilePlan test5 = new TestPlan(50,"USR123123U", 300005, LGT65, 120, 22, date);
        MobilePlan test6 = new TestPlan(10,"USR789789U", 300006, IphoneX, 120, 22, date);
        MobilePlan test7 = new TestPlan(100,"USR777777U", 300007, LGT65, 120, 22, date);
        MobilePlan test8 = new TestPlan(200,"USR999999U", 300008, SamsungGalaxyS10, 120, 22, date);

        user20.addPlan(user20.getID(), user20.getPassword(), test5);
        user20.addPlan(user20.getID(), user20.getPassword(), test6);
        user20.addPlan(user20.getID(), user20.getPassword(), test7);
        user20.addPlan(user20.getID(), user20.getPassword(), test8);

        MobilePlan test9 = new TestPlan(15,"USR564565U", 300009, SamsungGalaxyS10, 120, 22, date);
        MobilePlan test10 = new TestPlan(100,"USR759684U", 300010, LGT65, 120, 22, date);
        MobilePlan test11 = new TestPlan(500,"USR222555U", 300011, IphoneX, 120, 22, date);
        MobilePlan test12 = new TestPlan(40,"USR956956U", 300012, NokiaS78, 120, 22, date);

        user30.addPlan(user30.getID(), user30.getPassword(), test9);
        user30.addPlan(user30.getID(), user30.getPassword(), test10);
        user30.addPlan(user30.getID(), user30.getPassword(), test11);
        user30.addPlan(user30.getID(), user30.getPassword(), test12);

        MobilePlan test13 = new TestPlan(50,"USR959959U", 300013, GooglePixel5, 120, 22, date);
        MobilePlan test14 = new TestPlan(100,"USR226666U", 300014, LGT65, 120, 22, date);

        user40.addPlan(user40.getID(), user40.getPassword(), test13);
        user40.addPlan(user40.getID(), user40.getPassword(), test14);

        company.addUser(user10);
        company.addUser(user20);
        company.addUser(user30);
        company.addUser(user40);

        System.out.println("-------------------------------- Test Case Hooman----------------------------------------------");
        int[] range = {20, 50, 100, 1000};

        System.out.println("testing plan count:");
        for (User usr : company.getUsers().values()) {
//            int[] planCount = usr.planCount(usr.getID(), usr.getPasscode(), range, company.getFlatRate());
            int[] planCount = usr.planCount(usr.getUserID(), usr.getPassword(), range, company.getFlatRate());
            System.out.println(usr.getID() + "  " + Arrays.toString(planCount));
        }
        System.out.println("\n testing plan count in mobile company:");
        int[] planCount = company.planCount(company.getAdminUsername(), company.getAdminPassword(), range);
        System.out.println(Arrays.toString(planCount));

        System.out.println("\n testing plan city count:");
        HashMap<String, Integer[]> planCityCount = company.planCityCount(company.getAdminUsername(), company.getAdminPassword(), range);
        for (String cty : planCityCount.keySet()) {
            System.out.println(cty + "   " + Arrays.toString(planCityCount.get(cty)));
        }
        System.out.println("\n testing user count:");
        int[] userCount = company.userCount(company.getAdminUsername(), company.getAdminPassword(), range);
        System.out.println(Arrays.toString(userCount));

        System.out.println("\n testing user mobile model count:");
        HashMap<String, Integer[]> userMobileModelCount = company.userMobileModelCount(company.getAdminUsername(), company.getAdminPassword(), range, flatRate);
        for (String mdl : userMobileModelCount.keySet()) {
            System.out.println(mdl + "    " + Arrays.toString(userMobileModelCount.get(mdl)));
        }

        System.out.println("\n testing plan mobile model count:");
        for (User usr : company.getUsers().values()) {
            HashMap<String, Integer[]> planMobileModelCount = usr.planMobileModelCount(usr.getName(), usr.getPassword(), range, flatRate);
            System.out.print("\n" + usr.getID() + ":");
            for (String mdl : planMobileModelCount.keySet()) {
                System.out.print("     " + mdl + "  " + Arrays.toString(planMobileModelCount.get(mdl)));
            }
        }

        System.out.println("\n\n testing plan mobile model count in company:");
        HashMap<String, Integer[]> planMobileModelCount = company.planMobileModelCount(company.getAdminUsername(), company.getAdminPassword(), range , flatRate);
        for (String mdl : planMobileModelCount.keySet()) {
            System.out.println(mdl + "      " + Arrays.toString(planMobileModelCount.get(mdl)));
        }
        
System.out.println("------------------------------------------------------------------------------");
        }
    }

    public static class TestPlan extends MobilePlan{
        double monthlyPayment;

        public TestPlan(double payment,String userName, int id, MobilePhone handset, int internetQuota, int capLimit, MyDate myDate) throws PlanException, UserException 
        {
            super(userName, id, handset, internetQuota, capLimit, myDate);
            this.monthlyPayment = payment;
        }

        @Override
        public double calcPayment(double flatRate) {
            return monthlyPayment;
        }
    }
}
