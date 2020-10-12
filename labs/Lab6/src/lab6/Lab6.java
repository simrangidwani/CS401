
package lab6;
import java.util.*;
        
public class Lab6 {
    public static Scanner inScan = new Scanner(System.in);
    
    public static double max(double [] data)
    {
        double max = data[0];
        for (int i = 1; i < data.length; i++){
            if (data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
    
    public static double min(double [] data)
    {
        double min = data[0];
        
        for (int i = 1; i < data.length; i++)
        {
            if (data[i] < min){
                min = data[i];
            }
        }
      
        return min;
    }
    
    public static double sum(double [] data)
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++)
        {
           sum += data[i]; 
        }
        return sum;
    }
    public static double ave(double [] data)
    {
        double ave;
        
        ave = sum(data) / (data.length);
        
        return ave;
    }
    
    public static void main(String[] args) {
        int items;
        double [] data = null;
        System.out.println("How many items are you entering?: ");
        items = inScan.nextInt();
        data = new double [items];
        
        for (int i = 0; i <data.length; i++)
        {
            System.out.println("Enter number " + i + ": ");
            data[i] = inScan.nextDouble();
 
        }
       
        System.out.println("Your minimum value is: " + min(data));
        System.out.println("Your maximum value is: " + max(data));
        System.out.println("The sum of your data is: " + sum(data));
        System.out.println("The average of your data is: " + ave(data));
                 
            
        
        
        
        
    }
    
}
