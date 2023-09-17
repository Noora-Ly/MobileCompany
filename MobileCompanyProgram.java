

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MobileCompanyProgram 
{
    public static void main(String[] args) throws CloneNotSupportedException, PlanException, IOException, ClassNotFoundException, UserException 
    {
        MobileCompany mobileCompany = new MobileCompany("HoomanCompany", "admin", "admin", 12);
        TestCase.testCode(mobileCompany);
        // //UserInterface.mainMenu(mobileCompany);

        HashMap<Integer,MobilePlan> plans = mobileCompany.allPlans();
        ArrayList<MobilePlan> ArrayPlans = new ArrayList<>();
        plans.values().stream().forEach(ArrayPlans :: add);
        double flatRate = mobileCompany.getFlatRate();

        System.out.println("\n\n");
        plans.values().stream().forEach(x -> System.out.println("Username: " + x.getUserName()+"Payment: "+ x.calcPayment(flatRate)));
        System.out.println("\n\n");

        System.out.println("----a----");
        Predicate<MobilePlan> o1 = x -> x.getUserName().contains("123");
        plans.values().stream().filter(o1).collect(Collectors.toList())
            .forEach(x -> x.print());
        System.out.println("\n\n");

        System.out.println("----b----");
        plans.values().stream().filter(o1).collect(Collectors.toList())
            .forEach(x -> System.out.println("Username: " + x.getUserName()+" Payment: "+x.calcPayment(flatRate)));
        System.out.println("\n\n");

        System.out.println("----c----");
        System.out.println(plans.values().stream().filter(x -> 20 <= x.calcPayment(flatRate) && x.calcPayment(flatRate) <= 50)
            .findFirst().map(x -> String.format("%s %s", x.getUserName() , x.getId() , x.calcPayment(flatRate))));
        System.out.println("\n\n");

        System.out.println("----d----");
        plans.values().stream()
            .filter(e -> e.calcPayment(flatRate)>=20 && e.calcPayment(flatRate) <=50)
            .sorted(Comparator.comparing(MobilePlan::getId))
            .forEach(e -> System.out.println("Username: " + e.getUserName()+" ID: "+e.getId()+" Payment: "+e.calcPayment(flatRate)));
        System.out.println("\n\n");

        System.out.println("----e----");
        double total = MobilePlan.calcTotalPayments(new ArrayList<>(plans.values()
            .stream().filter(e -> e.calcPayment(flatRate)>=20 && e.calcPayment(flatRate) <=50).collect(Collectors.toList())), flatRate);
        System.out.println(total);
        System.out.println("\n\n");

        System.out.println("----f----");
        System.out.println("---- Username = USR000123U ----");
        Predicate<MobilePlan> c1= x -> x.getUserName().equals("USR000123U");
        ArrayList<MobilePlan> plans1= filterPlans(ArrayPlans,c1);
        MobilePlan.printPlans(plans1);
        System.out.println("\n");
        System.out.println("---- Year = 2020 ----");
        MobilePlan.printPlans (filterPlans(ArrayPlans, x->x.getExpiryDate().getYear()==2020));
        System.out.println("\n");
        System.out.println("---- Mobile Model =(contains) Iphone ----");
        MobilePlan.printPlans (filterPlans(ArrayPlans, x->x.getHandsetModel().contains("Iphone")));
        System.out.println("\n\n");

        System.out.println("----g----");
        Predicate<MobilePlan> p2 = (x -> x.getType().toString().equals("IOS"));
        filterPlans(ArrayPlans, p2).stream().sorted(Comparator.comparing(MobilePlan:: getHandsetPrice)).forEach(System.out :: println);
        System.out.println("\n\n");

        System.out.println("----h----");
        Map<Integer, List<MobilePlan>> groupByExpiryDate =
            ArrayPlans.stream().collect(Collectors.groupingBy(MobilePlan::getYear));
        groupByExpiryDate.forEach((Integer x, List<MobilePlan> e)->
            {
                System.out.println("-----Year : " + x);
                e.forEach(e1 -> System.out.println(e1 +"\n" ));
            });
        System.out.println("\n\n");

        // int[] apples1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        // int expiry1 = 1;
        // print(apples(apples1, expiry1));

        // int[] apples2 = {2, 1, 0, 1, 2, 0, 1, 2, 0, 1, 1, 2, 0, 2, 0, 1, 2, 0, 2, 0};
        // int expiry2 = 2;
        // print(apples(apples2, expiry2));
        
        // int[] apples3 = {3, 1, 0, 0, 3, 0, 0, 2, 0, 1, 1, 2, 0, 3, 0, 0, 2, 0, 2, 0};
        // int expiry3 = 3;
        // print(apples(apples3, expiry3));

        // int[] apples4 = {4, 1, 0, 0, 2, 0, 0, 2, 0, 1, 1, 2, 0, 3, 0, 0, 2, 0, 2, 0};
        // int expiry4 = 4;
        // print(apples(apples4, expiry4));
        
    }  
    
    public static ArrayList<MobilePlan> filterPlans( ArrayList<MobilePlan> plans, Predicate<MobilePlan> criteria)
    {
        Stream<MobilePlan> plansStream = plans.stream().filter(criteria);
        List<MobilePlan> filtered = plansStream.toList();
        return new ArrayList<>(filtered);
    }

    // public static int[] apple(int[] apples , int expiry)
    // {
    //     int[] answer = new int[apples.length];
    //     int lastBuy = 0;
    //     int buyfor = 10;
    //     for(int i = 0; i< apples.length ; i++)
    //     {
    //         int buy=1;
    //         if(i <= apples.length - 2 && lastBuy < expiry)
    //         {
    //             if(apples[i] < apples[i+1])
    //             {
    //                 buy += 1;
    //             }
    //         }
    //         if(i <= apples.length - 3)
    //         {
    //             if(apples[i] < apples[i+2])
    //             {
    //                 buy += 1;
    //             }
    //         }
    //         if(lastBuy > 1 || i == buyfor)
    //         {
    //             buy -= 1;
    //         }
    //         lastBuy = buy;
    //         answer[i] = buy;
    //         if(lastBuy == 3)
    //         {
    //             buyfor = i+2;
    //         }
    //     }
    //     return answer;
    // }

    // public static int[] apples(int[] apples , int expiry)
    // {
    //     int[] answer = new int[apples.length];
    //     ArrayList<Integer> buyy = new ArrayList<>();
    //     for(int i = 0; i< apples.length ; i++)
    //     {
    //         int buy=0;
    //         for(int j = 1; j< expiry ; j++)
    //         {
    //             if((i + j < apples.length) &&(apples[i] < apples[i+j]))
    //             {
    //                 if(!buyy.contains(i+j))
    //                 {
    //                     buy += 1;
    //                     buyy.add(i);
    //                 }
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //         if(!buyy.contains(i))
    //         {
    //             buy += 1;
    //             buyy.add(i);
    //         }
    //         answer [i] = buy;
    //     }
    //     return answer;
    // }

    public static void print(int[] apples)
    {
        System.out.print("{");
        for(int i = 0; i< apples.length ; i++)
        {
            System.out.print(apples[i] +", ");
        }
        System.out.println("}");

    }
}

