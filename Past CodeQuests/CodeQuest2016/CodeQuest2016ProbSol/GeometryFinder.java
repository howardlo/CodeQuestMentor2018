
/**
 * You have been tasked to find the volume and surface area of a sphere,
 * cylinder, and a cone given the height and radius values from a file.
 * 
 * XYC Oil Company, produces and stores their natural resources in 
 * containers stored at various locations around the U.S. Currently the
 * company is in the process of revamping some of their containers that 
 * are in disrepair.  The data files Prob4_GemoteryFinder.txt provides
 * the height & radius of each container. In order to find the most cost
 * efficient replacement container, the company needs to determine the 
 * volume and surface area of a sphere, cylinder, and a cone to 
 * explore all possible solutions.
 * 
 * You have been tasked with development of a user function to determine
 * the volume and surface area of a sphere, cylinder, and a cone. Output
 * is to be set at 2 decimal places. 
 * 
 * Input:
 * 5
 * 13, 3.4
 * 8, 5.1
 * 23, 1.3
 * 4, 10.5
 * 15, 4.4
 * 
 * Example output given below:
 * 
 * Height = 13
 * Radius = 3.40
 * Sphere volume: 164.64
 * Sphere surface: 145.27
 * Cylinder volume: 472.12
 * Cylinder surface: 350.35
 * Cone volume: 157.37
 * Cone surface: 179.85
 * 
 * Check student answer:
 * Height = 8
 * Radius = 5.10
 * Sphere volume: 555.65
 * Sphere surface: 326.85
 * Cylinder volume: 653.70
 * Cylinder surface: 419.78
 * Cone volume: 217.90
 * Cone surface: 233.72
 *  
 * @author (Stone) 
 * @version (m12_Program)
 * @date (5/2/17)
 */

import java.io.*;
import static java.lang.Math.*;

public class GeometryFinder
{
    private static final String INPUT_FILE_NAME = "Prob4_GeometryFinder.txt";    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
           
            while (T-- > 0) 
            {
              // read the line of text
                inLine = br.readLine();
                
                // split data into elements
                String[]  product= inLine.split(", ");
                double r = Double.parseDouble(product[1]);
                int h = Integer.parseInt(product[0]);
                //Prints height and radius
                System.out.printf("Height = %d%nRadius = %.2f%n", h, r);
                //calls the methods for volume and surface area of all the figures
                System.out.printf ("Sphere volume: %.2f\n", sphereVolume(r));   
                System.out.printf("Sphere surface: %.2f\n", sphereSurface(r));
                System.out.printf("Cylinder volume: %.2f\n", cylinderVolume(r,h));
                System.out.printf("Cylinder surface: %.2f\n", cylinderSurface(r,h));
                System.out.printf("Cone volume: %.2f\n", coneVolume(r,h));
                System.out.printf("Cone surface: %.2f\n\n", coneSurface(r,h));        
            }
    
            // clean up
            br.close();
            fr.close();
        } //end try
        catch (Exception e) {
            e.printStackTrace();
        }//end catch
    }
    
    //if make user functions 'private' they can use the variable from main without passing values
       //returns the volume of a sphere with radius "r"
    public static double sphereVolume(double r)
    {                
         //calculates & returns sphere volume
         double volume = (4.0/3.0) * PI * pow(r,3);
         return volume;
    }//end method sphereVolume
    
    //returns the surface area of a sphere with radius "r"
    public static double sphereSurface(double r)
    {
         //calculates & returns surface of sphere
         double surface = (4.0 * PI * pow(r,2));
         return surface;
    }//end method sphereSurface
        
    //returns the volume of a cylinder with radius "r" and height "h"
    public static double cylinderVolume(double r, double h)
    {
         //calculates & returns cylinder volume
         double cvolume = (PI*(pow(r,2)*h));
         return cvolume;
    }//end method cylinderVolume
        
    //returns the surface area of a cylinder with radius "r" and height "h"
    public static double cylinderSurface(double r, double h)
    {
         //calculates & returns surface of a cylinder
         double csurface = ((2*pow(r,2)*PI)+(2*PI*r*h));
         return csurface;
    }//end method cylinderSurface
        
    //returns the volume of a cone with radius "r" and height "h"
    public static double coneVolume(double r, double h)
    {
         //calculates & returns the volume of a cone
         double cnvolume = ((1.0/3.0)*PI*pow(r,2)*h);
         //alternate Math.PI*Math.pow(G,2)*H/3;
         return cnvolume;
    }//end method coneVolume
        
    //returns the surface area of a cone with radius "r" and height "h"
    public static double coneSurface(double r, double h)
    {
         //calculates & returns the surface of a cone
         double cnsurface = (PI*r)*sqrt(pow(r,2)+pow(h,2))+PI*pow(r,2);
         //alternate PI*r*(r+sqrt(pow(h,2)+pow(r,2)));
         return cnsurface;
    }//end method coneSurface
 }//end class Sphere
