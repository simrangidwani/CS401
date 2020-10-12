package assig2;
import java.util.*;
import java.io.*;
import java.util.Random;

public class Scramble {
    
    private Random rand;
    private Scanner inputFile;
    private File file;
    private boolean scrambled;
    private String lastWord;

    public Scramble(String fileName) throws IOException {
        file = new File(fileName);
        inputFile = new Scanner(file);
        rand = new Random();
        scrambled = true;
    }
    
        
    public String getRealWord() {
        if(scrambled == false)
        {
            return lastWord;
        }
        
        else if (inputFile.hasNextLine() && scrambled)
        {
            lastWord = inputFile.nextLine();
            scrambled = false;
            return lastWord;
        }
        else
            return null;
    }
 
       
    
    public String getScrambledWord() {
        
        
        char temp = 0;
        int lastWordlength = lastWord.length();
        String scrambledWord = "";
        
        if(lastWord != null)
        {
            StringBuilder sb = new StringBuilder(lastWord);
            for (int i=0; i < lastWord.length(); i++)
            {             
                
                int index1 = rand.nextInt(lastWordlength);
                int index2 = rand.nextInt(lastWordlength);
                char charac1 = sb.charAt(index1);
                char charac2 = sb.charAt(index2);
                sb.setCharAt(index1, charac2);
                sb.setCharAt(index2, charac1);

            }
            scrambled = true;
            return sb.toString();
            
        }
        else
            return null;
 
        
    }
    
    
   
    
    
}
