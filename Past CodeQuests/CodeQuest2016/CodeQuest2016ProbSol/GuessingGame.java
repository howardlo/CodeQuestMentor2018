
/**
 * GuessingGame
 * 
 * The computer will generate a random number from 1 - x and the player to guess within 3 tries
 * To start, first you must set the game up. Ask the user what is the range for guessing the 
 * current game. (? must be in a window pane)
 * Must provide user with the correct response based on their guess:
 * 
 * You guessed the number !
 * Your guess of ' y' is too high !
 * Your guess of 'y' is too low.
 * Sorry, you didnt guess the number within 3 tries, but the correct answer was 'answer'.
 * 
 * @author (Sydney Echols) 
 * @version (5/12/17)
 */
import java.util.*;
public class GuessingGame
{
    public static void main(String[]args)
    {
  
        Scanner sg = new Scanner(System.in);
        System.out.println("Pick a number:");
        Random gen = new Random();
        int num = gen.nextInt(5);
         int randomNumber=sg.nextInt();
       
     
     switch(randomNumber)
     { 
         case 1: System.out.println("Your guess of '1' was too low!");break;
         case 2: System.out.println("You guessed the number!");break;
         case 3: System.out.println("Sorry, you didn't guess the number within 3 tries, but the correct answer was 'answer'!");break;
         case 4: System.out.println("Your guess of '2' was too high!");break;
         default: System.out.println("Check to see if eithin number range, and try again");break;
    }
}//end main
}//end class