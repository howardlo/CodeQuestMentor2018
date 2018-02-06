
/**
 * Prob1_ImBoard 
 * 
 * Are you tired of traditional game boards like checker boards or chess
 * boards?  Us too!  We would like to invent a game that is played on a
 * board where every square is the same, and we need your help to 
 * construct the game board. You’ll need to write a program to help you,
 * of course.
 * 
 * Write a program which displays an N x N square board made using the 
 * pound sign (#). For example N=5 would produce:
 * 
 * # # # # #
 * # # # # #
 * # # # # #
 * # # # # #
 * # # # # #
 * 
 * Program Input: The first line of the file Prob01.in.txt will contain
 * a positive integer T denoting the number of test cases that follow.  
 * Each test case will have the following input: A single integer N
 * 
 * Example Input: 2  5  3
 * 
 * Program Output: For each test case, your program should print 
 * "Game Board Size: N x N". Your program should output the 
 * N x N board putting spaces between your pound signs, but not 
 * at the beginning or end of the line.  
 * 
 * Example Output:
 * 
 * Game Board Size: 3 x 3
 * # # #
 * # # #
 * # # #
 * 
 * @author (Stone) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Prob1_ImBoard 
{
    private static final String INPUT_FILE_NAME = "Prob01.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
            
            // loop through test cases
            while (T-- > 0) {
                // read the line of text
                inLine = br.readLine();
                
                // get N
                int n = Integer.parseInt(inLine);
                System.out.println();
                System.out.println("Game Board size: "+n+"x"+n);
                // print the board
                for (int i=0; i<n; i++) {
                    for (int j=0; j<n; j++) {
                        if (j > 0) System.out.print(" ");
                        System.out.print("#");
                    }//end inner for
                    System.out.println();
                }//end outter for                
            }//end while            
            // clean up
            br.close();
            fr.close();
        } //end try
        catch (Exception e) {
            e.printStackTrace();
        }//end catch
    }//end main
}//end class
