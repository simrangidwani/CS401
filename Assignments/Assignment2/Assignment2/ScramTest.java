package assig2;
import java.io.*;
import java.util.*;

public class ScramTest {
    
    public static void main(String [] args) throws IOException
    {
        Scramble theScramble = new Scramble("words.txt");
        String word = theScramble.getRealWord();
        while (word != null)
        {
            System.out.println("Real word is : " + word);
            System.out.println("Scrambled word is: " + theScramble.getScrambledWord());
            
            word = theScramble.getRealWord();
        }
        theScramble = new Scramble("words.txt");
        System.out.println("Initial call to getScrambledWord(): ");
        word = theScramble.getScrambledWord(); 
        if (word == null)
        {
            System.out.println("No scrambled word yet");
            String word1 = theScramble.getRealWord();
            String word2 = theScramble.getRealWord();
            
            System.out.println("\nTwo calls to getRealWord(): ");
            System.out.println("Word 1: " + word1);
            System.out.println("Word 2: " + word2);
            
            System.out.println("\nTwo calls to getScrambledWord(): ");
            word1 = theScramble.getScrambledWord();
            word2 = theScramble.getScrambledWord();
            
            System.out.println("Scram word 1: " + word1);
            System.out.println("Scram word 2: " + word2);
            
            System.out.println("\nNow a call to each: ");
            word1 = theScramble.getRealWord();
            word2 = theScramble.getScrambledWord();
            
            System.out.println("Word: " + word1);
            System.out.println("Scram word: " + word2);
 
        }
                
    }
    
}
//
