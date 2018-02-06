/**
 * AA_GeometryFinder 
 * 
 * You have been tasked to find the volume and surface area of a sphere,
 * cylinder, and a cone given the height and radius values from a file.
 * 
 * XYC Oil Company, produces and stores their natural resources in
 * containers stored at various locations around the U.S. Currently, the
 * company is in the process of revamping some of their containers that
 * are in disrepair. The data files Prob04_GeometryFinder.txt provides 
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
 * Sphere Volume: 164.64
 * Sphere Surface: 145.27
 * Cylinder Volume: 472.12
 * Cylinder Surface: 350.35
 * Cone Volume: 157.37
 * Cone Surface: 179.85
 * 
 * @author (Ajoke Akinseye) 
 * @version (5/3/2017)
 */
import java.io.*;
import static java.lang.Math.*;
public class AA_GeometryFinder
{
    private static final String INPUT_FILE_HERE = "Prob4_GeometryFinder.txt";
    private static int height = 0;
    private static double radius = 0.00;
    public static void main(String[]args)
    {
        try
        {
            File inFile = new File (INPUT_FILE_HERE);
            FileReader fr = new FileReader (inFile);
            BufferedReader br = new BufferedReader (fr);
            String inLine = null;
            
            int TC = Integer.parseInt(br.readLine());
            while (TC-- > 0)
            {
                inLine = br.readLine();
                String [] hr = inLine.split(", ");
                height = Integer.parseInt(hr[0]);
                radius = Double.parseDouble(hr[1]);
                System.out.println("Height = " + height);
                System.out.printf("%s %.2f%n","Radius = ",radius);
                sphereVolume();
                sphereSurfaceArea();
                cylinderVolume();
                cylinderSurfaceArea();
                coneVolume();
                coneSurfaceArea();
                System.out.println();
            }//end TC while
        }//end try
        catch (Exception e)
        {
            e.printStackTrace();
        }//end catch
    }//end main
    private static void sphereVolume()
    {
        double sVol = ((4*PI*(pow(radius,3)))/3);
        System.out.printf("%s %.2f%n","Sphere Volume: ",sVol);
    }//end sphereVolume()
    private static void sphereSurfaceArea()
    {
        double sSA = (4*PI*(pow(radius,2)));
        System.out.printf("%s %.2f%n","Sphere Surface: ",sSA);
    }//end sphereSurfaceArea()
    private static void cylinderVolume()
    {
        double cyVol = (PI*(pow(radius,2))*height);
        System.out.printf("%s %.2f%n","Cylinder Volume: ",cyVol);
    }//end cylindeVolume()
    private static void cylinderSurfaceArea()
    {
        double cySA = ((2*PI*radius*height)+(2*PI*(pow(radius,2))));
        System.out.printf("%s %.2f%n","Cylinder Surface: ",cySA);
    }//end cylinderSurfaceArea()
    private static void coneVolume()
    {
        double cVol = ((PI*(pow(radius,2))*height)/3);
        System.out.printf("%s %.2f%n","Cone Volume: ",cVol);
    }//end coneVolume()
    private static void coneSurfaceArea()
    {
        double cSA = (PI*radius*(radius+(sqrt((pow(height,2))+(pow(radius,2))))));
        System.out.printf("%s %.2f%n","Cone Surface: ",cSA);
    }//end coneSurfaceArea()
}//end class