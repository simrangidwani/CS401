
package lab3;
import java.util.*;
import java.util.Random;
 
        
/**
 *
 * @author simrangidwani
 */
public class Lab3 {

    public static void main(String[] args) {
        int rolls;
        Random num = new Random();
        Scanner inScan = new Scanner (System.in);
        
        while (true)
        {
            System.out.print("Enter the desired number of rolls: ");
            rolls = inScan.nextInt();
            
            RollDice(rolls, num);
        }

    }
    
    static void RollDice(int value, Random num) 
    {
        int die1;
        int die2;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        int count11 = 0;
        int count12 = 0;
        int prob11;
        int prob2;
        int prob3;
        int prob4;
        int prob5;
        int prob6;
        int prob7;
        int prob8;
        int prob9;
        int prob10;
        int prob12;
                
        
        for (int i=0; i<value; i++) {

        die1 = num.nextInt(6)+1;
        die2 = num.nextInt(6)+1;
       
        
        switch(die1+die2)
        {
            case 2:
               count2++;
               break;
            
            case 3:
               count3++;
               break;
            
            case 4:
                count4++;
                break;
                
            case 5:
                count5++;
                break;
                
            case 6:
                count6++;
                break;
                
            case 7:
                count7++;
                break;
            
            case 8:
                count8++;
                break;
                
            case 9:
                count9++;
                break;
                
            case 10:
                count10++;
                break;
                
            case 11:
                count11++;
                break;
                
            case 12:
                count12++;
                break;
                
        }
        
        }
        prob2 = count2/value;
        
    System.out.println("Number of times 2 occured: " + count2 + " and its probability is " + count2 + "/" + value);
    
    System.out.println("Number of times 3 occured: " + count3 + " and its probability is " + count3+ "/" + value);
    System.out.println("Number of times 4 occured: " + count4 + " and its probability is " + count4 + "/" + value);
    System.out.println("Number of times 5 occured: " + count5 + " and its probability is " + count5 + "/" + value);
    System.out.println("Number of times 6 occured: " + count6 + " and its probability is " + count6 + "/" + value);
    System.out.println("Number of times 7 occured: " + count7 + " and its probability is " + count7 + "/" + value);
    System.out.println("Number of times 8 occured: " + count8 + " and its probability is " + count8 + "/" + value);
    System.out.println("Number of times 9 occured: " + count9 + " and its probability is " + count9 + "/" + value);
    System.out.println("Number of times 10 occured: " + count10 + " and its probability is " + count10 + "/" + value);
    System.out.println("Number of times 11 occured: " + count11 + " and its probability is " + count11 + "/" + value);
    System.out.println("Number of times 12 occured: " + count12 + " and its probability is " + count12 + "/" + value);

      
    }
  
}
    

