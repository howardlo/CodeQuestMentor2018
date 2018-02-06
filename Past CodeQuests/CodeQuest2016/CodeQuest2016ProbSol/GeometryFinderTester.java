    
/**
 * GeometryFinder.
 * You have been tasked to find the volume and surface area of a sphere,
 * cylinder, and a cone given the height and radius values from a file.
 * 
 * XYC Oil Company, producers and store their natural resources in
 * containers stored at various locations around the U.S. Currently the 
 * company is in the process of revamping some of their containers that
 * are in disrepair. The data files Prob_GeometryFinder.txt provides
 * the height & radius of each container. In order to find the most cost
 * efficent replacement container, The company needs to determine the 
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
 * Height = 13
 * Radius = 3.40
 * Sphere volume: 164.64
 * Shpere surface: 145.27
 * Cylinder volume: 472.12
 * Cylinder surface: 350.35
 * Cone volume: 157.37
 * Cone surface: 179.85
 * 
 * @author (Lauren) 
 * @version (May 2nd 2017)
 */
import java.io.*;
import java.util.*;
import java.lang.Math.*;
import static java.lang.Math.*;
public class GeometryFinderTester
{
   private static final String INPUT_FILE_NAME = "Prob4_GeometryFinder.txt";
    public static void main(String[]args)
   {
       try{
       File inFile = new File(INPUT_FILE_NAME);
       FileReader fr = new FileReader(inFile);
       BufferedReader br = new BufferedReader(fr);
       String inLine = null;
       int T = Integer.parseInt(br.readLine());
       while(T-->0)
       {
       String d = (br.readLine());
       String[]num = d.split(", ");
       double radi = Double.parseDouble(num[1]);
       int height = Integer.parseInt(num[0]);
       System.out.println("Radius= " + radi);
       System.out.println("Height= " + height);
       System.out.printf("Sphere Volume: %.2f%n", sv(radi));
       System.out.printf("Cylinder Volume: %.2f%n", cv(radi,height));
       System.out.printf("Cone Volume: %.2f%n", cov(radi,height));
       System.out.printf("Sphere Volume: %.2f%n", ss(radi));
       System.out.printf("Cylinder Volume: %.2f%n", cs(radi,height));
       System.out.printf("Cone Volume: %.2f%n", cos(radi,height));
      }
    }//end try
      catch(Exception e)
      {
          e.printStackTrace();
       }//end catch
    }//end main
   private static double sv(double r)
      {
        double SphereVolume = Math.PI*Math.pow(r,3)*4/3;
        return SphereVolume;
   }
   private static double cv(double r , int h)
      {
        double CylinderVolume = Math.PI*Math.pow(r,2)*h;
        return CylinderVolume;
    }
    private static double cov(double r, int h)
      {
        double ConeVolume = Math.PI*Math.pow(r,2)*h*1/3;
        return ConeVolume;
   }
     private static double ss(double r)
      {
        double SphereSurface = 4*Math.pow(r,2)*Math.PI;
        return SphereSurface;
   }
     private static double cs(double r, int h)
      {
        double CylinderSurface = 2*Math.PI*Math.pow(r,2)+ 2*r*Math.PI*h;
        return CylinderSurface;
   }
     private static double cos(double r, int h)
      {
        double ConeSurface = Math.PI*r*Math.sqrt(Math.pow(r,2)+ Math.pow(h,2));
        return ConeSurface;
   }
    
}//end class 
