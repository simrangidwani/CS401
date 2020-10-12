package assig2;
import java.util.*;
import java.io.*;

        

public class Results {
        private int rounds;
        private int wins;
        private int losses;
        private PrintWriter outputFile;
        
    
    public Results(String fileName) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
        
        Scanner inputFile = new Scanner(file);
        
        try {
            rounds = inputFile.nextInt();
            wins = inputFile.nextInt();
            losses = inputFile.nextInt();
        } 
        catch (NoSuchElementException e )
        {
            rounds = 0;
            wins = 0;
            losses = 0;
        }
        
        inputFile.close();
        
        outputFile = new PrintWriter(fileName);
    }   
    
        //increments the number of wins and then prints that to the results.txt file
        public void won()
        {           
           wins++;
           rounds++;
        }
    
        //increments the number of losses and prints that to the results.txt file
        public void lost()
        {    
           losses++;
           rounds++;
        }
  
        //saves the information above to the file
        public void save()
        {
           outputFile.println(rounds);
           outputFile.println(wins);
           outputFile.println(losses);      
           outputFile.flush();
        }
    
    public String toString()
    {
        StringBuilder S = new StringBuilder();
        S.append("These are your results\n");
        S.append("Rounds: " + rounds + "\n");
        S.append("Wins: " + wins + "\n");
        S.append("Losses: " + losses + "\n");
        return S.toString();
    }
 }

