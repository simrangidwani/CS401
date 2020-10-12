/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author simrangidwani
 */
public class Assignment1 {

    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        String customer;
        String password;
        
        int pins = 0;
        int pin;
        int quaffles;
        int purchase;
        int broomstick = 0;
        int remainder = 0, quaffle1 = 0, totalquaffles = 0, totalbroomsticks = 0, totalpin= 0;
        int rpin = 0, gpin = 0, hpin = 0, spin = 0;
        boolean discount = false;
        int count = 0;
        boolean nextCustomer = false;
 
        System.out.println("Welcome to Quality Quidditch Supplies! \n"
                        +  "Hogsmeade Location");
        System.out.print("Is there a customer in line? (yes/no): ");
        customer = inScan.next();
        
        if (customer.toLowerCase().equals("yes")) {
            nextCustomer = true;
        }
        
        while (nextCustomer)
        {
            inScan.nextLine();
            System.out.print("Please enter the password: ");
            password = inScan.nextLine();
            
            if (!"harrypotter".equals(password))
            {
                discount = false;
                System.out.println("Sorry but that is not correct, try again");
                System.out.print("Please enter the password: ");
                password = inScan.nextLine();
                if (!"harrypotter".equals(password))
                {
                    System.out.println("Here is our regular price list: \n"
                           + "House pins (each)            20 Knuts\n"
                           +       "Available in Gryffindor, Slytherin, HufflePuff, and Ravenclaw\n"
                           + "Quaffles (Individual)        145 Knuts\n"
                           +          "(Box of 5)          638 Knuts\n"
                           + "Broomstick Servcie Kits      986 Knuts\n");
                }
            }
            
            else if ("harrypotter".equals(password))
            {
                discount = true;
                System.out.println("Welcome Dumbledore's Army member!\n"
                    + "You will get special discounts at WWW!\n"
                    + "Discount on 10 or more House Pins\n"
                    + "Discount on Boxes of Quaffles\n"
                    + "Discount on Broomstick Service Kit\n");
            
                System.out.println("Here is our price list: \n"
                           + "House Pins (each)             20 Knuts\n"
                           +        "Available in Gryffindor, Slytherin, HufflePuff, and Ravenclaw\n"
                           +            "(only 18 Knuts if you buy 10 or more)\n"
                           + "Quaffles (each)               145 Knuts\n"
                           + "Quaffles (box of 5)           580 Knuts\n"
                           + "Broomstick Service Kits       899 Knuts\n");
            }
           
    do {                                  
    
                    System.out.println("Please choose an option: \n"
                            + "1) Update House Pins Order\n"
                            + "2) Update Quaffles Order\n"
                            + "3) Update Broomstick Kits Order\n"
                            + "4) Show Price List\n"
                            + "5) Check Out");
                        purchase = inScan.nextInt();
                       
            
           
                switch (purchase)
                    {
                case 1:                   
                    System.out.println("For which team would you like to order pins? \n"
                            + "1) Gryffindor\n"
                            + "2) Slytherin\n"
                            + "3) Hufflepuff\n"
                            + "4) Ravenclaw\n"
                            + "5) Finished with Pin order\n");
                    
                            pins = inScan.nextInt();
                            
                            
                            switch (pins)
                            {
                                
                                case 1:                           
                                    System.out.print("How many Gryffindor pins would you like to order? ");
                                    gpin = inScan.nextInt();
                                    System.out.println("Here is the order you just placed");                                  
                                    System.out.println(gpin + " Gryffindor pins\n");
                                    
                                    break;
                                    
                                case 2:
                                    System.out.print("How many Slytherin pins would you like to order? ");
                                    spin = inScan.nextInt();
                                    System.out.println("Here is the order you just placed");                                      
                                    System.out.println(spin + " Slytherin pins\n");
                                    
                                    break;
                                    
                                case 3:
                                    System.out.print("How many Hufflepuff pins would you like to order? ");
                                    hpin = inScan.nextInt();
                                    System.out.println("Here is the order you just placed");
                                    
                                    System.out.println(hpin + " Hufflepuff pins\n");
                                    break;
                                    
                                case 4:
                                    System.out.print("How many Ravenclaw pins would you like to order? ");
                                    rpin = inScan.nextInt();
                                    System.out.println("Here is the order you just placed\n");
                                    
                                    System.out.println(rpin + " Ravenclaw pins");
                                    break;
                                    
                                case 5:
                                    continue;
                            
                            }
                            totalpin = gpin + spin + rpin+ hpin;
                            System.out.println("Here is your total number of pins ordered: ");
                            System.out.print(totalpin + "\n");
 
                                    break;
                                
                case 2:                  
                                                         
                    System.out.print("How many quaffles would you like: \n");
                            if (discount == false)
                                {
                                     System.out.println("145 Knuts each\n"
                                        + "638 Knuts per box of 5\n"
                                        + "(Please indicate only the total number you would like): ");
                                
                                }
                            else if (discount == true)
                                {
                                     System.out.println("145 Knuts each\n"
                                        + "580 Knuts per box of 5\n"
                                        + "(Please indicate only the total number you would like): ");                              
                                }
                            quaffles = inScan.nextInt();
                           
                            totalquaffles = totalquaffles + quaffles;            
                                                                                          
                            if (totalquaffles > 5)
                            
                            {                           
                                    quaffle1 = totalquaffles / 5;
                                    remainder = totalquaffles % 5; 
                        
                                    System.out.println("Here is your current order: ");
                                    System.out.println(quaffle1 + " boxes of Quaffles");
                        
                                    if (remainder >= 1)
                                     {
                                        System.out.println(remainder + " Quaffle(s)");                                
                                     }                                                                                                        
                            }
                    
                        break;
                    
                case 3:
                
                    System.out.print("How many Broomstick Service Kits would you like?: ");                    
                    broomstick = inScan.nextInt();
                    System.out.println("Here is your current order: \n");
                    totalbroomsticks = totalbroomsticks + broomstick;
                    System.out.println(totalbroomsticks + " broomstick service kit(s)");
                                        
                    break;
                case 4:
                    if (discount == true)
                    {
                        System.out.println("Here is our price list: \n"
                           + "House Pins (each)             20 Knuts\n"
                           +        "Available in Gryffindor, Slytherin, HufflePuff, and Ravenclaw\n"
                           +            "(only 18 Knuts if you buy 10 or more)\n"
                           + "Quaffles (each)               145 Knuts\n"
                           + "Quaffles (box of 5)           580 Knuts\n"
                           + "Broomstick Service Kits       899 Knuts\n");
                    }
                    if (discount == false)
                    {
                        System.out.println("Here is our regular price list: \n"
                           + "House pins (each)            20 Knuts\n"
                           +       "Available in Gryffindor, Slytherin, HufflePuff, and Ravenclaw\n"
                           + "Quaffles (Individual)        145 Knuts\n"
                           +          "(Box of 5)          638 Knuts\n"
                           + "Broomstick Servcie Kits      986 Knuts\n");
                    }

                    break;
                    
                case 5:                   
                    totalpin = spin+gpin+hpin+rpin;
                    int totalpinprice= totalpin*20;                           
                    int quaffle2 = quaffle1*638;
                    int remainder1 = remainder*145;
                    int broomstick1 = totalbroomsticks*968;
                    
                    int broomstickDprice = totalbroomsticks*899;
                    int quaffleDprice = quaffle1*580;
                    int totalr = totalpinprice + quaffle2 + remainder1+ broomstick1;
                    int totald = totalpinprice + quaffleDprice + remainder1 + broomstickDprice;
                    double totaldt= totald * .10;
                    double totaldd = totald-totaldt;
                    boolean pay = true ;                  
                            
                    int galleonsPaid;
                    int galleonsPaidInKnuts;
                    int sicklesPaid;
                    int sicklesPaidInKnuts;
                    int knutsPaid;
                    double paid;
                    double owed;
                    double returned;
                    
      
                    if (discount == false)
                    
                   
                    {
                        System.out.println("Here is your subtotal: \n");
                        System.out.println(totalpin + "House pins at 20 Knuts ea.: \t\t\t\t\t\t\t"+ totalpinprice);                                                       
                        System.out.println(quaffle1 + " boxes of quaffles at 638 Knuts ea.:\t\t\t\t\t\t" + quaffle2);
                        System.out.println(remainder + " Quaffles at 145 Knuts ea.: \t\t\t\t\t\t\t" + remainder1);
                        System.out.println(totalbroomsticks + " Broomstick Service Kits at 986 Knuts ea.: \t\t\t\t\t" + broomstick1);
                        System.out.println("\t\t\t\t\t\t\t\t\t ------------ ");
                        System.out.println("Total: \t\t\t\t\t\t\t\t\t\t" + totalr);
                        
                        
                        System.out.println("Make a payment: ");
                               
                        System.out.println("How many Galleons do you want to pay?: ");
                        galleonsPaid= inScan.nextInt();
                        
                        System.out.println("How many Sickles do you want to pay?: ");
                        sicklesPaid= inScan.nextInt();
                        
                        System.out.println("How may Knuts do you want to pay?: ");
                        knutsPaid = inScan.nextInt();
                        
                        galleonsPaidInKnuts = galleonsPaid * 493;
                        sicklesPaidInKnuts = sicklesPaid * 29;
                        
                        paid = galleonsPaidInKnuts + sicklesPaidInKnuts + knutsPaid;
                        
                        System.out.println("This is the total amount of Knuts you paid: " + paid); 
                        
                        owed = totalr - paid;
                        returned = paid - totalr;
                        
                        while (paid < totalr)
                        {
                            System.out.println("You did not give enough money");
                            System.out.println("Make another payment in knuts");
                            paid = inScan.nextInt() + paid;
                            System.out.println("This is the total amount of Knuts you paid: " + paid);
                        }
                        if (paid >= totalr)
                        {
                            System.out.println("You paid enough. Your change is " + returned + " knuts");
                            
                        }
                        
                    }
                    
                    //discounted aubtotal and payment 
                    if (discount == true)
                        
                    {
                        
                        System.out.println("Here is your subtotal: \n"
                            + totalpin + " House Pins at 20 Knuts ea.:\t\t\t\t\t\t\t" + totalpinprice);
                        System.out.println(quaffle1 + " boxes of quaffles at 580 Knuts ea.:\t\t\t\t\t\t" + quaffleDprice);
                        System.out.println(remainder + " Quaffles at 145 Knuts ea.:\t\t\t\t\t\t\t" + remainder1);
                        System.out.println(totalbroomsticks + " Broomstick Service Kits at 899 Knuts ea.: \t\t\t\t\t" + broomstickDprice);
                        System.out.println("\t\t\t\t\t\t\t\t\t ------------ ");
                        System.out.println("Total (with 10 percent discount): \t\t\t\t\t" + totaldd);           
                    
                        System.out.println("How many Galleons do you want to pay?: ");
                        galleonsPaid= inScan.nextInt();
                        
                        System.out.println("How many Sickles do you want to pay?: ");
                        sicklesPaid= inScan.nextInt();
                        
                        System.out.println("How may Knuts do you want to pay?: ");
                        knutsPaid = inScan.nextInt();
                        
                        galleonsPaidInKnuts = galleonsPaid * 493;
                        sicklesPaidInKnuts = sicklesPaid * 29;
                        
                       
                        paid = galleonsPaidInKnuts + sicklesPaidInKnuts + knutsPaid;
                        
                        System.out.println("This is the total amount of Knuts you paid: " + paid); 
                        
                        owed = totaldd - paid;
                        returned = paid - totaldd;
                        
                        while (paid < totaldd)
                        {
                            System.out.println("You did not give enough money");
                            System.out.println("Make another payment in Knuts ");
                            paid = inScan.nextInt() + paid;
                            System.out.println("This is the total amount of Knuts you paid: " + paid);
                        }
                        if (paid >= totaldd)
                        {
                            System.out.println("You paid enough. Your change is " + returned + " knuts");
                            
                        }
                        
                    }
                    
                    System.out.println("Thank you for shopping with us. \n\n");
                                      
                    System.out.print("Is there a customer in line? (yes/no): ");
                    customer = inScan.next();

                    if (customer.toLowerCase().equals("yes")) {
                        nextCustomer = true;
                    } else {
                        nextCustomer = false;
                    }
                   break;
                }
    } while (purchase != 5);
    }
      
    
           
  }
}
  


    

