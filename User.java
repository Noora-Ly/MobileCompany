
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class User implements Cloneable, Comparable<User>, Serializable {
    private String name;
    // private String username; not in the spec
    private int userID;
    private String password;
    private Address address;
    // private ArrayList<MobilePlan> plans;
    private static int countID = 2000; // base id to be 2000
    private HashMap<Integer, MobilePlan> plans;

    public User(int userID, String name, Address address, String password) // providing ID
    {
        this.name = name;
        this.userID = userID;
        this.address = address;
        this.password = password;
        this.plans = new HashMap<>();
    }

    public User(String name, Address address, String password) // Generating ID
    {
        this.name = name;
        this.userID = countID++; // automatic ID generation
        this.address = address;
        this.password = password;
        this.plans = new HashMap<>();
    }

    // public User(User user) //copy constructor
    // {
    // name = user.name;
    // userID = user.userID;
    // password = user.password;
    // address = new Address(user.address);
    // plans =new ArrayList<MobilePlan>();
    // for (MobilePlan plan:user.plans)
    // {
    // // change this--------------------------------------------
    // plans.add(plan); // call Transaction copy constructor
    // }
    // }

    // public User clone() throws CloneNotSupportedException
    // {
    // User output = (User) super.clone();
    // output.address = address.clone();
    // output.plans = new ArrayList<MobilePlan>();
    // for(MobilePlan plan : plans)
    // {
    // output.plans.add(plan.clone());
    // }
    // return output;
    // }

    public int getID() {
        return userID;
    }

    public String getCity() {
        return address.getCity();
    }

    public String getName() {
        return this.name;
    }

    public int getUserID() {
        return this.userID;
    }

    protected String getPassword() {
        return this.password;
    }

    public void setCity(String city) {
        address.setCity(city);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    // public ArrayList<MobilePlan> getPlans()
    // {
    // return plans;
    // }

    public HashMap<Integer, MobilePlan> getPlans() {
        return plans;
    }

    public boolean validateUser(int userID, String password) // and not username as username might not be unique as we
                                                             // didn't check it
    {
        if ((this.userID == userID) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public MobilePlan findPlan(int planID) {
        // for(MobilePlan plan : plans)
        // {
        // if(plan.getId() == planID)
        // {
        // return plan;
        // }
        // }
        // return null;
        return plans.get(planID);
    }

    public boolean addPlan(int userid, String password, MobilePlan plan) {
        if (validateUser(userid, password) && findPlan(plan.getId()) == null) {
            // plans.add(plan);
            plans.put(plan.getId(), plan);
            return true;
        }
        return false;
    }

    public double calcTotalPayments(int userid, String password, double flatRate) {
        if (validateUser(userid, password)) {
            return MobilePlan.calcTotalPayments(plans, flatRate);
        }
        return 0;
    }

    public void mobilePriceRiseAll(double risePercent) {
        MobilePlan.mobilePriceRiseAll(plans, risePercent);
    }

    public boolean createPersonalPlan(int userid, String password, String username, int id, MobilePhone mobilePhone,
            int internetQuota, int capLimit,
            MyDate expiryDate, String city) throws PlanException, UserException {
        return addPlan(userid, password,
                new PersonalPlan(username, id, mobilePhone, internetQuota, capLimit, expiryDate, city));
    }

    public boolean createBusinessPlan(int userid, String password, String username, int id, MobilePhone mobilePhone,
            int internetQuota, int capLimit,
            MyDate expiryDate, int numberOfEmployees, int ABN) throws PlanException, UserException {
        return addPlan(userid, password,
                new BusinessPlan(username, id, mobilePhone, internetQuota, capLimit, expiryDate,
                        numberOfEmployees, ABN));
    }

    public ArrayList<MobilePlan> filterByMobileModel(String mobileModel) {
        ArrayList<MobilePlan> plan = new ArrayList<>();
        plans.values().stream().forEach(plan::add);
        return MobilePlan.filterByMobileModel(plan, mobileModel);
    }

    // public HashMap<Integer, MobilePlan> filterByMobileModel(String mobileModel) {
    // return MobilePlan.filterByMobileModel(plans, mobileModel);
    // }

    // public ArrayList<MobilePlan> filterByExpiryDate(MyDate date)
    // {
    // return MobilePlan.filterByExpiryDate(plans, date);
    // }

    public HashMap<Integer, MobilePlan> filterByExpiryDate(MyDate date) {
        return MobilePlan.filterByExpiryDate(plans, date);
    }

    public void printUserInformation() {
        System.out.print("User ID:" + userID + " Name:" + name);
        address.print();
    }

    public void print() {
        // System.out.println("User ID:" + userID + " Name:" + name);
        // System.out.println(" Address: ");
        // address.print();
        printUserInformation(); // instead of previous 3 lines
        MobilePlan.printPlans(plans);
    }

    public void print(double flatRate) {
        // System.out.println("User ID:" + userID + " Name:" + name);
        // System.out.println(" Address: ");
        // address.print();
        printUserInformation(); // instead of previous 3 lines
        MobilePlan.printPlans(plans, flatRate);
    }

    public String toString() {
        String output = "User ID:" + userID + " Name:" + name + " Address: " + address.toString() + " Plans: \n";
        for (MobilePlan plan : plans.values()) {
            output += plan.toString() + "\n";
        }
        return output;
    }

    public void printPlans(int userid, String password, double flatRate) {
        // MobilePlan.printPlans(plans, flatRate);
        // System.out.println("Total Monthly Payments:" + calcTotalPayments(userid,
        // password, flatRate));
        plans.values().stream().forEach(x -> x.print());
    }

    public ArrayList<String> populateDistinctMobileModels() {
        // ArrayList<String> models = new ArrayList<String>();
        // for (MobilePlan plan : plans.values()) {
        //     boolean found = false;
        //     for (String model : models) {
        //         if (plan.getHandsetModel().equals(model)) {
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (!found)
        //         models.add(plan.getHandsetModel());
        // }
        // return models;
        List<String> models = new ArrayList<String>();
        plans.values().stream().forEach(x -> models.add(x.getModel()));
        return(ArrayList<String>) models;
    }

    public int getTotalCountForMobileModel(String mobileModel) {
        // int count = 0;
        // for (MobilePlan plan : plans.values()) {
        //     if (plan.getHandsetModel().equals(mobileModel))
        //         count++;
        // }
        // return count;
        return (int) plans.values().stream().filter(x -> x.getHandsetModel().equals(mobileModel)).count();
    }

    public double getTotalPaymentForMobileModel(String mobileModel, double flatRate) {
        // double total = 0;
        // for (MobilePlan plan : plans.values()) {
        //     if (plan.getHandsetModel().equals(mobileModel))
        //         total += plan.calcPayment(flatRate);
        // }
        // return total;
        return (double) plans.values().stream().filter(x -> x.getHandsetModel().equals(mobileModel)).map(x -> x.calcPayment(flatRate)).reduce(0.0, (x,y)-> x+y);
    }

    public ArrayList<Integer> getTotalCountPerMobileModel(ArrayList<String> mobileModels) {
        //ArrayList<Integer> totalCounts = new ArrayList<Integer>();
        // int count=0;
        //for (String model : mobileModels) {
            // assuming that the other method is not done. This code was correct:
            // count=0;
            // for( MobilePlan plan:plans)
            // {
            // if(plan.getHandsetModel().equals(model))
            // count++;
            // }
            // totalCounts.add(count);

            // a better way by using the other method
        //     totalCounts.add(getTotalCountForMobileModel(model));
        // }
        // return totalCounts;

        ArrayList<Integer> totalCounts = new ArrayList<Integer>();
        mobileModels.forEach(x -> totalCounts.add(getTotalCountForMobileModel(x)));
        return totalCounts;
    }

    public ArrayList<Double> getTotalPaymentPerMobileModel(ArrayList<String> mobileModels, double flatRate) {
        //ArrayList<Double> totalPayments = new ArrayList<Double>();
        // double payment=0;
        //for (String model : mobileModels) {
            // assuming that the other method is not done. The folowwing code should have
            // been done
            // payment=0;
            // for( MobilePlan plan:plans)
            // {
            // if(plan.getHandsetModel().equals(model))
            // payment+=plan.calcPayment(flatRate);
            // }
            // totalPayments.add(payment);

            // a better way now by using the other method
        //     totalPayments.add(getTotalPaymentForMobileModel(model, flatRate));
        // }
        // return totalPayments;

        ArrayList<Double> totalPayments = new ArrayList<Double>();
        mobileModels.forEach(x -> totalPayments.add(getTotalPaymentForMobileModel(x , flatRate)));
        return totalPayments;
    }

    public void reportPaymentsPerMobileModel(ArrayList<String> mobileModels, ArrayList<Integer> counts,
            ArrayList<Double> monthlyPayments) {
        System.out.println("\n MobileModel \t \t \t Total Monthly Payments \t \t \tAverage Monthly Payment");
        for (int i = 0; i < counts.size(); i++)
            System.out.println(mobileModels.get(i) + " \t \t \t " + monthlyPayments.get(i) + " \t \t \t "
                    + monthlyPayments.get(i) / (double) counts.get(i));
    }

    // a list of given models and flatRate is sent
    public void reportPaymentsPerMobileModel(ArrayList<String> mobileModels, double flatRate) {
        ArrayList<Integer> counts = getTotalCountPerMobileModel(mobileModels);
        ArrayList<Double> monthlyPayments = getTotalPaymentPerMobileModel(mobileModels, flatRate);
        reportPaymentsPerMobileModel(mobileModels, counts, monthlyPayments); // instead of doing this again as below

        // System.out.println("\n MobileModel \t \t Total Monthly Payments \t \t Average
        // Monthly Payment");
        // for (int i=0;i<counts.size();i++)
        // System.out.println(mobileModels.get(i)+" \t \t "+monthlyPayments.get(i)+" \t
        // \t "+monthlyPayments.get(i)/(double)counts.get(i));
    }

    public void reportPaymentsPerMobileModel(double flatRate) // for all models
    {
        ArrayList<String> mobileModels = populateDistinctMobileModels();
        reportPaymentsPerMobileModel(mobileModels, flatRate); // better than below

        // ArrayList<String> mobileModels=populateDistinctMobileModels();
        // ArrayList<Integer> counts=getTotalCountPerMobileModel(mobileModels);
        // ArrayList<Double> monthlyPayments=getTotalPaymentPerMobileModel(mobileModels,
        // flatRate);
        // reportPaymentsPerMobileModel (mobileModels, counts, monthlyPayments); //
        // instead of doing this again as below
        // System.out.println("\n MobileModel \t \t Total Monthly Payments \t \t Average
        // Monthly Payment");
        // for (int i=0;i<counts.size();i++)
        // System.out.println(mobileModels.get(i)+" \t \t "+monthlyPayments.get(i)+" \t
        // \t "+monthlyPayments.get(i)/(double)counts.get(i));
    }

    // lab4------------------------------
    public User(User user) // copy constructor
    {
        name = user.name;
        userID = user.userID;
        password = user.password;
        address = new Address(user.address);
        // plans =new ArrayList<MobilePlan>();
        plans = new HashMap<Integer, MobilePlan>();
        // for (MobilePlan plan : user.plans)
        for (MobilePlan plan : user.plans.values()) {
            if (plan instanceof PersonalPlan) {
                // plans.add(new PersonalPlan((PersonalPlan)plan));
                plans.put(plan.getId(), new PersonalPlan((PersonalPlan) plan));
            } else if (plan instanceof BusinessPlan) {
                // plans.add(new BusinessPlan((BusinessPlan)plan));
                plans.put(plan.getId(), new BusinessPlan((BusinessPlan) plan));
            }
        }
    }

    public User clone() throws CloneNotSupportedException {
        User output = (User) super.clone();
        output.address = address.clone();
        // output.plans = new ArrayList<MobilePlan>();
        output.plans = deepCopyPlansHashMap();
        // for(MobilePlan plan : plans)
        // for(MobilePlan plan : plans.values())
        // {
        // //output.plans.add(plan.clone());
        // output.plans.put(plan.getId() , plan.clone());
        // }
        return output;
    }

    public static ArrayList<User> shallowCopy(ArrayList<User> users) {
        ArrayList<User> shallowCopy = new ArrayList<User>();
        // for (User user : users) {
        // shallowCopy.add(user);
        // }
        // return shallowCopy;
        users.stream().forEach(shallowCopy::add);
        return shallowCopy;
    }

    public static ArrayList<User> deepCopy(ArrayList<User> users) throws CloneNotSupportedException {
        // ArrayList<User> deepCopy = new ArrayList<>();
        // for (User user : users) {
        // deepCopy.add(user.clone());
        // }
        // return deepCopy;
        return users.stream().collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<User> shallowCopy(HashMap<Integer, User> users) {
        ArrayList<User> shallowCopy = new ArrayList<User>();
        for (User user : users.values()) {
            shallowCopy.add(user);
        }
        return shallowCopy;
    }

    public ArrayList<User> deepCopy(HashMap<Integer, User> users) throws CloneNotSupportedException {
        ArrayList<User> deepCopy = new ArrayList<User>();
        for (User user : users.values()) {
            deepCopy.add(user.clone());
        }
        return deepCopy;
    }

    public HashMap<Integer, User> shallowCopyHashMap(HashMap<Integer, User> users) {
        HashMap<Integer, User> shallowCopy = new HashMap<>();
        for (User user : users.values()) {
            shallowCopy.put(user.getID(), user);
        }
        return shallowCopy;
    }

    public HashMap<Integer, User> deepCopyHashMap(HashMap<Integer, User> users) throws CloneNotSupportedException {
        HashMap<Integer, User> deepCopy = new HashMap<>();
        for (User user : users.values()) {
            deepCopy.put(user.getID(), user.clone());
        }
        return deepCopy;
    }

    public ArrayList<MobilePlan> deepCopyPlans() throws CloneNotSupportedException {
        return MobilePlan.deepCopy(plans);
    }

    public ArrayList<MobilePlan> shallowCopyPlans() {
        return MobilePlan.shallowCopy(plans);
    }

    public HashMap<Integer, MobilePlan> deepCopyPlansHashMap() throws CloneNotSupportedException {
        return MobilePlan.deepCopyHashMap(plans);
    }

    public HashMap<Integer, MobilePlan> shallowCopyPlansHashMap() throws CloneNotSupportedException {
        return MobilePlan.shallowCopyHashMap(plans);
    }

    public int compareTo(User other) // comapre based on city
    {
        return address.compareTo(other.address);
    }

    public double compareTo1(int userid, String password, User other) throws UnsupportedOperationException // comapre
                                                                                                           // based on
                                                                                                           // total
                                                                                                           // monthly
                                                                                                           // payment
    {
        double otherPayment = other.calcTotalPayments(userid, password, 3);
        double thisPayment = calcTotalPayments(userid, password, 3);
        if (thisPayment == otherPayment) {
            return 0;
        }
        return thisPayment > otherPayment ? 1 : -1;
    }

    // public ArrayList<MobilePlan> sortPlansByDate() throws
    // CloneNotSupportedException
    // {
    // ArrayList<MobilePlan> sortPlans = deepCopyPlans();
    // Collections.sort(sortPlans);
    // return sortPlans;
    // }

    public ArrayList<MobilePlan> sortPlansByDate() throws CloneNotSupportedException {
        ArrayList<MobilePlan> sortPlans = shallowCopyPlans();
        Collections.sort(sortPlans);
        return sortPlans;
    }

    // lab5----------------------

    // public MobilePlan findPlan (int planID)
    // {
    // // for(MobilePlan plan : plans)
    // // {
    // // if(plan.getId() == planID)
    // // {
    // // return plan;
    // // }
    // // }
    // // return null;
    // return plans.get(planID);
    // }

    // public boolean addPlan (MobilePlan plan)
    // {
    // if(findPlan(plan.getId()) == null){
    // //plans.add(plan);
    // plans.put(plan.getId(), plan);
    // return true;
    // }
    // return false;
    // }

    // public HashMap<Integer , MobilePlan> getPlans()
    // {
    // return plans;
    // }

    // public HashMap<Integer,MobilePlan> filterByMobileModel (String mobileModel)
    // {
    // return MobilePlan.filterByMobileModel(plans, mobileModel);
    // }

    // public HashMap<Integer,MobilePlan> filterByExpiryDate(MyDate date)
    // {
    // return MobilePlan.filterByExpiryDate(plans, date);
    // }

    // toString
    // clone
    // copy cons

    // public ArrayList<User> shallowCopy(HashMap<Integer, User> users)
    // {
    // ArrayList<User> shallowCopy = new ArrayList<User>();
    // for(User user : users.values())
    // {
    // shallowCopy.add(user);
    // }
    // return shallowCopy;
    // }

    // public ArrayList<User> deepCopy(HashMap<Integer, User> users) throws
    // CloneNotSupportedException
    // {
    // ArrayList<User> deepCopy = new ArrayList<User>();
    // for(User user : users.values())
    // {
    // deepCopy.add(user.clone());
    // }
    // return deepCopy;
    // }

    // public HashMap<Integer,User> shallowCopyHashMap(HashMap<Integer, User> users)
    // {
    // HashMap<Integer,User> shallowCopy = new HashMap<>();
    // for(User user : users.values())
    // {
    // shallowCopy.put(user.getID(), user);
    // }
    // return shallowCopy;
    // }

    // public HashMap<Integer,User> deepCopyHashMap(HashMap<Integer, User> users)
    // throws CloneNotSupportedException
    // {
    // HashMap<Integer, User> deepCopy = new HashMap<>();
    // for(User user : users.values())
    // {
    // deepCopy.put(user.getID(), user.clone());
    // }
    // return deepCopy;
    // }

    public HashMap<String, Integer> getTotalCountPerMobileModel() {
        // HashMap<String, Integer> counts = new HashMap<>();
        // for (MobilePlan plan : plans.values()) {
        //     Integer count = counts.get(plan.getHandsetModel());
        //     if (count == null) {
        //         counts.put(plan.getHandsetModel(), 1);
        //     } else {
        //         counts.put(plan.getHandsetModel(), count + 1);
        //     }
        // }
        // return counts;

        Map<String , Integer> counts = new HashMap<String , Integer>();
        plans.values().stream().forEach(x -> counts.put(x.getHandsetModel(), getTotalCountForMobileModel(x.getHandsetModel())));
        return (HashMap<String, Integer>) counts;
    }

    public HashMap<String, Double> getTotalPaymentPerMobileModel(double flatRate) {
        // HashMap<String, Double> totalPayments = new HashMap<>();
        // for (MobilePlan plan : plans.values()) {
        //     Double payment = totalPayments.get(plan.getHandsetModel());
        //     if (payment == null) {
        //         totalPayments.put(plan.getHandsetModel(), plan.calcPayment(flatRate));
        //     } else {
        //         totalPayments.put(plan.getHandsetModel(), payment + plan.calcPayment(flatRate));
        //     }
        // }
        // return totalPayments;
        Map<String , Double> payments = new HashMap<String , Double>();
        plans.values().stream().forEach(x -> payments.put(x.getHandsetModel(), getTotalPaymentForMobileModel(x.getHandsetModel(), flatRate)));
        return (HashMap<String, Double>) payments;
    }

    public void reportPerMobileModel(HashMap<String, Double> totalPayments, HashMap<String, Integer> counts) {
        System.out.println("\nMobile Model \t \t Total Monthly Payment \t \t Average Monthly Payment");
        for (String model : totalPayments.keySet()) {
            System.out.println(model + "\t \t" + totalPayments.get(model) + "\t \t"
                    + totalPayments.get(model) / (double) counts.get(model));
        }
    }

    // lab6---------------------------------

    public static HashMap<Integer, User> load(String fileName) {
        HashMap<Integer, User> users = new HashMap<>();
        ObjectInputStream inputst = null;
        users.clear();
        try {
            inputst = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
        } catch (IOException ex) {
            System.err.println("error in create/open the file ");
            System.exit(1);
        }
        try {
            while (true) {
                User user = (User) inputst.readObject();
                users.put(user.getID(), user);
            }
        } catch (EOFException ex) {
            System.out.println("no more record!");
        } catch (ClassNotFoundException ex) {
            System.err.println("error in wrong class in the file ");
        } catch (IOException ex) {
            System.err.println("error in add object to the file ");
            // System.exit(1);
        }
        try {
            if (inputst != null)
                inputst.close();
        } catch (IOException ex) {
            System.err.println("error in close the file ");
            // System.exit(1);
        }
        return users;
    }

    public static Boolean save(HashMap<Integer, User> users, String fileName) {
        ObjectOutputStream outputst = null;
        try {
            outputst = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        } catch (IOException ex) {
            System.err.println("error in create/open the file ");
            System.exit(1);
        }
        try {
            for (User user : users.values()) {
                outputst.writeObject(user);
            }
        } catch (IOException ex) {
            System.err.println("error in adding the objects to the file ");
            // System.exit(1);
        }
        try {
            if (outputst != null)
                outputst.close();
            return true;
        } catch (IOException ex) {
            System.err.println("error in closing the file ");
            // System.exit(1);
            return false;
        }
    }

    public String toDilimatedString() {
        String output = name + "," + address.toDilimatedString() + "," + password + "," + plans.size() + ",";
        for (MobilePlan plan : plans.values()) {
            // output += plan.toDilimatedString()+" \n";
            output += plan.toDilimatedString() + ",";
        }

        return output;
    }

    public static HashMap<Integer, User> loadTextFile(String fileName)
            throws IOException, PlanException, UserException {
        HashMap<Integer, User> users = new HashMap<>();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line = in.readLine();
        // line = line.trim();
        String[] field;
        try {
            while (line != null) {
                line = line.trim();
                field = line.split(",");
                String name = field[0];
                Address address = Address.loadRecords(field[1]);
                String password = field[2];
                int numOfProjects = Integer.parseInt(field[3]);
                User user = new User(name, address, password);
                int t = 4;
                for (int i = 0; i < numOfProjects; i++) {
                    switch (field[t++]) {
                        case "p":
                            int id = Integer.parseInt(field[t++]);
                            String userName = field[t++];
                            MobilePhone handset = MobilePhone.loadRecords(field[t++]);
                            int internetQuota = Integer.parseInt(field[t++]);
                            int capLimit = Integer.parseInt(field[t++]);
                            MyDate myDate = MyDate.loadRecords(field[t++]);
                            String city = field[t++];
                            user.addPersonalPlan(UITools.creatPersonalPlan(userName, id, handset, internetQuota,
                                    capLimit, myDate, city));
                            break;
                        case "b":
                            id = Integer.parseInt(field[t++]);
                            userName = field[t++];
                            handset = MobilePhone.loadRecords(field[t++]);
                            internetQuota = Integer.parseInt(field[t++]);
                            capLimit = Integer.parseInt(field[t++]);
                            myDate = MyDate.loadRecords(field[t++]);
                            int numberOfEmployees = Integer.parseInt(field[t++]);
                            int ABN = Integer.parseInt(field[t++]);
                            user.addBusinessPlan(UITools.creatBusinessPlan(userName, id, handset, internetQuota,
                                    capLimit, myDate, numberOfEmployees, ABN));
                            break;
                    }
                }
                users.put(user.getID(), user);
                line = in.readLine();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        in.close();
        return users;
    }

    public static Boolean saveTextFile(HashMap<Integer, User> users, String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        for (User user : users.values()) {
            out.write(user.toDilimatedString() + "\n");
        }
        out.close();
        return true;
    }
    // when we return false

    public void addPersonalPlan(PersonalPlan plan) {
        plans.put(plan.getId(), plan);
    }

    public void addBusinessPlan(BusinessPlan plan) {
        plans.put(plan.getId(), plan);
    }

    public ArrayList<MobilePlan> hashmapConvertToArraylist() {
        ArrayList<MobilePlan> convertedPlans = new ArrayList<>();
        for (MobilePlan plan : plans.values()) {
            convertedPlans.add(plan);
        }
        return convertedPlans;
    }

    //old one
    // public int[] planCount(int userID, String password, int[] ranges, double flatRate) {
    //     if(validateUser(userID, password))
    //     {
    //         int[] totalCounts = new int[ranges.length];
    //         int count;
    //         for (int i = 0; i < ranges.length; i++) {
    //             count = 0;
    //             for (MobilePlan plan : plans.values()) {
    //                 if (MobilePlan.findRange(i, plan, ranges, flatRate)) {
    //                     count++;
    //                 }
    //             }
    //             totalCounts[i] = count;
    //         }
    //         return totalCounts; 
    //     }
    //     return null;
    // }

    //lambda
    public int[] planCount(int userID, String password, int[] ranges, double flatRate) {
        if(validateUser(userID, password))
        {
            ArrayList<Integer> totalCounts =new ArrayList<Integer>();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for(int i=0; i < ranges.length; i++)
            {
                numbers.add(i);
            }
            numbers.stream().forEach(x -> totalCounts.add(findRange(x, ranges, flatRate)));
            int[] counts = totalCounts.stream().mapToInt(i -> i).toArray();
            return counts;      
        }
        return null;
    }

    public int findRange(int i , int[] ranges , double flatRate)
    {
        int count = 0;
        for(MobilePlan plan : plans.values())
        {
            if(i == 0)
            {
                if((plan.calcPayment(flatRate)>= 0)&&(plan.calcPayment(flatRate)<= ranges[i]))
                {
                    count++;
                }
            }
            else if((plan.calcPayment(flatRate)>ranges[i-1])&&(plan.calcPayment(flatRate)<=ranges[i]))
            {
                count++;
            }
        }
        return count;
    }

    public HashMap<String, Integer[]> planMobileModelCount(String username, String password, int[] ranges,double flatRate) {
        HashMap<String, Integer[]> planMobileModelCount = new HashMap<>();
        for (int i = 0; i < ranges.length; i++) {
            for (MobilePlan plan : plans.values()) {
                Integer[] counts = { 0, 0, 0, 0 };
                if (MobilePlan.findRange(i, plan, ranges, flatRate))
                // if((plan.calcPayment(flatRate)>=ranges[i])&&(plan.calcPayment(flatRate)<ranges[i+1]))
                {
                    String mobileModel = plan.getHandsetModel();
                    if (planMobileModelCount.get(mobileModel) == null) {
                        counts[i] = 1;
                        planMobileModelCount.put(mobileModel, counts);
                    } else {
                        counts = planMobileModelCount.get(mobileModel);
                        counts[i] += 1;
                        planMobileModelCount.put(mobileModel, counts);
                    }
                }
            }
        }
        return planMobileModelCount;
    }
}
