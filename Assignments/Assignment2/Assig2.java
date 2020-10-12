package assig2;
import java.util.*;
import java.io.*;
        
public class Assig2 {

    public static void main(String[] args) throws IOException
    {
        //Scanner object
        Scanner inScan = new Scanner(System.in);

        String guess;
        String name;
        int tries = 0;
        boolean continue_playing = true;
        String keepPlaying;

        //introduction
        System.out.println("Welcome! What is your name? ('quit' to exit): ");
        name = inScan.nextLine();
        Scramble scramble = new Scramble("words.txt");
        Results result = new Results(name + "_results.txt");
        
        String actualWord = scramble.getRealWord();
        String scrambledWord = scramble.getScrambledWord();        

        while (continue_playing == true)
        {
            
            System.out.println(name + ", you have 3 guesses to get the Scrambled word! Good luck.");
            System.out.println(scrambledWord);
            System.out.println("What do you think the scrambled word is?: ");
            
            guess = inScan.nextLine();
            tries = 1;
            
            while (tries < 3)
            {
                if (guess.equalsIgnoreCase(actualWord))
                {
                    System.out.println("That is correct!");
                    result.won();                
                    break;
                }
                else if (guess.length() != actualWord.length())
                {
                    System.out.println("You words arent the same length");
                }
                
                else 
                {    
                    System.out.println("These are the letters you got correct");
                    for (int i=0; i < guess.length(); i++ )
                    {
                        if (Character.toLowerCase(guess.charAt(i)) == Character.toLowerCase(actualWord.charAt(i)))
                        {
                            System.out.print(guess.charAt(i));
                        }
                        else 
                            System.out.print("_");
                        
                    }
                    System.out.println("");
                }
                tries++;
                System.out.println("Guess again: ");
                guess = inScan.nextLine();

            }    
            if (tries == 3)
            {
                System.out.println("You used all your guesses, sorry!");
                result.lost();
            }
            
            actualWord = scramble.getRealWord();
            scrambledWord = scramble.getScrambledWord(); 
            
            if (actualWord != null)
            {
                System.out.println("Would you like to continue playing?: ");
                keepPlaying = inScan.nextLine();
            
                if (keepPlaying.equals("no"))
                {
                    continue_playing = false;
                } 
            }
            else 
            {
                System.out.println("There is no more words left in the file.");
                continue_playing = false;
            }
            
           
        }
        result.save();
        System.out.println(result.toString());
        
    }
}
