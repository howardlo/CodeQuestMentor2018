
/**
 * Prob2_ChangeForTheWorld
 * For each dollar amount given, have your program calculate the
 * fewest number of coins necessary to arrive at that dollar amount.
 * Your program will output the following:
 * 
 * •The first line should contain the dollar amount exactly as it 
 *  appears in the input.
 * •The next line should contain the amount of quarters in the 
 *  following format: 
 *     o	Quarters=<amount of quarters calculated>
 * •The next line should contain the amount of dimes in the 
 *  following format: 
 *     o	Dimes=<amount of dimes calculated>
 * •The next line should contain the amount of nickels in the 
 *  following format:
 *     o	Nickels=<amount of nickels calculated>
 * •The next line should contain the amount of pennies in the 
 *  following format:
 *     o	Pennies=<amount of pennies calculated>
 * •NOTE: If a coin was not used, still include that coin in the
 *  output with a “0” amount (i.e. Pennies=0).
 *  
 *  Example Output:
 *  
 *  $3.87
 *  Quarters=15
 *  Dimes=1
 *  Nickels=0
 *  Pennies=2
 *   
 * @author (Stone) 
 * @version (a version number or a date)
 */


import java.io.*;
public class Prob2ChangeForTheWorld {
    private static final String INPUT_FILE_NAME = "Prob02.in.txt";
    
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
                
                //print blank line between answers
                System.out.println();
                // print the line as it is
                System.out.println(inLine);
                
                // strip the $
                inLine = inLine.substring(1);
                
                // split on the decimal - escape it because . matches everything!
                String[] tokens = inLine.split("\\.");
                
                // get dollars
                int dollars = Integer.parseInt(tokens[0]);
                
                // get cents
                int cents = Integer.parseInt(tokens[1]);
                
                // add dollars to cents
                cents = cents + (dollars * 100);
                
                int quarters = 0;
                int dimes = 0;
                int nickels = 0;
                
                // quarters
                while (cents >= 25) {
                    quarters++;
                    cents -= 25;
                }//end quarters
                System.out.println("Quarters=" + quarters);
                
                // dimes
                while (cents >= 10) {
                    dimes++;
                    cents -= 10;
                }//end dimes
                System.out.println("Dimes=" + dimes);
                
                // nickels
                while (cents >= 5) {
                    nickels++;
                    cents -= 5;
                }//end nickels
                System.out.println("Nickels=" + nickels);
                
                // pennies
                System.out.println("Pennies=" + cents);
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
