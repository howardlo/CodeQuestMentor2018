/**
 * Lambdas
 * 
 * enables functional programming
 * readable and concise code
 * easier-to-use APIs and libraries
 * enables support for parallel processing
 * 
 * @author (Ajoke Akinseye)
 * @version (4/8/2018)
 */
import Greeting;

 public class Greeter
 {
     public void greet(Greeting greeting)
     {
         greeting.perform();
     }//end method

     public static void main(String[]args)
     {
         System.out.println("Hey there");
         Greeter greeter = new Greeter();
         // greeter.greet();
     }//end main
 }//end class 
