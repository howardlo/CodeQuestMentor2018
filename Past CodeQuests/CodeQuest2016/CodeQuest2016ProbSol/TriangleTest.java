
/**
 *TriangleInequalityTheorem 
 *  Do you know the Triangle Inequality Theorem? The sum of the legnths of any two sides of a triangle is greater than
 * the legnth of the third side.
* That sounds easy enough right? Your job is to write a program that can idnetify valid triangles. Not only do you
* need to determine if the three sides can form a triangle - you also have to tell what type it is. There are three
* classifications of triangles:
* Equilateral
* Isosceles
* Scalene
* Program input: 
* The first line will contain a positive T integer denoting the number of test cases that follow.
* Each test case will have the following output:
* A single line with threee sides seperated by a comma and a space
* 4
* 20, 20, 23
* 20, 20, 20
* 20, 21, 22
* 13, 14, 30
* 
* Program output: 
* For each test case your prgram ill output one of the following four possibilities:
* Not a triangle
* Equilateral
* Isosceles
* Scalene
* 
* 
 * @author (Muhammad Keen) 
 * @version (4/28/17)
 */
import java.util.*;
import java.io.*;
public class TriangleTest
{
    private static final String INPUT_FILE_NAME ="Prob03.in.txt";
    private static final String INPUT_FILE_NAME="Triangle_Notes.txt";
    private static final String EQUAL="Equilateral Traingle";
    private static final String ISO="Isosceles Triangle";
    private static final String SCA="Scalene Triangle";
    private static final String NONE="Not a Triangle";
    public static void main(String[]args)
    {
        try
        {
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            int T = Integer.parseInt(br.readLine());
            while(T-->0)
            {
                String sides = br.readLine();
                String [] tokens = sides.split(", ");
                System.out.println(sides);
                int side1 = Integer.parseInt(tokens[0]);
                int side2 = Integer.parseInt(tokens[1]);
                int side3 = Integer.parseInt(tokens[2]);
                if(side1+side2<side3 || side2+side3<side1 || side1+side3<side2)
                {
                    System.out.println(NONE);
                }
                else if(side1==side2 && side1==side3)
                {
                    System.out.println(EQUAL);
                }
                else if (side1==side2 || side1==side3 || side2==side3)
                {
                    System.out.println(ISO);
                }
                else if (side1!=side2 || side1!=side3 || side2!=side3)
                {
                    System.out.println(SCA);
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
