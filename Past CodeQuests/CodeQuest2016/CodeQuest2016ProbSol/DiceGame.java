
/**
 * DiceGame:  
 * 
 * You were relaxing and rolling some dice and started thinking
 * "I wonder how many times I would have to roll 3 dice until
 * the values that are facing up are all different."
 * 
 * You decide to write a program that will count how many times
 * 3 six-sided dice must be rolled until the values showing are
 * all different.
 * 
 * DeMorgan's law will be useful, see video on R:\Programming\Videos
 * 
 * On paper, write down what will be true when the loop is done.
 * Negate your assertion and you should have the loop boundary
 * condition. Include your notes as documentation of your
 * source code. 
 * 
 * Example:
 * 
 * 2 1 4
 * Count = 1
 * 
 * Run again:
 * 
 * 4 6 4
 * 6 6 2
 * 5 4 3
 * Count = 3 
 * 
 * @author (Stone) 
 * @version (2017)
 */
import java.util.*;
public class DiceGame
{
    public static void main(String[]args)
    {
        int count =0, dice1=0, dice2=0, dice3=0;
        do
        {
            Random gen = new Random();
            dice1=1+gen.nextInt(6);
            dice2=1+gen.nextInt(6);
            dice3=1+gen.nextInt(6);
            System.out.printf("%s %s %s%n", dice1, dice2, dice3);
            count++;
        }
        while(!(dice1 != dice2 && dice1 != dice3 && dice2 != dice3));
        System.out.printf("Count = %d%n", count);
    }
}
