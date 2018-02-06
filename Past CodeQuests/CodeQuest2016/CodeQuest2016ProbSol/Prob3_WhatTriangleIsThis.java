
/**
 * Prob3_WhatTriangleIsThis-- 
 * Do you know the Triangle Inequality Theorem?  Just in case you don’t,
 * here it is:
 * 
 * The sum of the lengths of any two sides of a triangle is greater than
 * the length of the third side.
 * 
 * That sounds easy enough, right?  Your job is to write a program that
 * can identify valid triangles.  Not only do you need to determine if 
 * the three sides can form a triangle – you also have to tell what type 
 * it is.  There are three classifications of triangles:
 * 
 * •	Equilateral triangles have three sides of equal length.
 * •	Isosceles triangles have two sides of equal length and one side 
 *      that is different.
 * •	Scalene triangles have no equal side lengths.
 * 
 * Program Input
 * 
 * The first line of the file Prob03.in.txt will contain a positive integer
 * T denoting the number of test cases that follow.  Each test case will have
 * the following input:
 * 
 * •	A single line with three side lengths separated by a comma and a space.
 * 
 * Example Input:
 * 4
 * 20, 20, 23
 * 20, 20, 20
 * 20, 21, 22
 * 13, 14, 30
 * 
 * For each test case, your program will output one of the following four 
 * output possibilities:
 * 
 * •	side1, side2, side3 = Not a Triangle
 * •	side1, side2, side3 = Equilateral
 * •	side1, side2, side3 = Isosceles
 * •	side1, side2, side3 = Scalene
 * 
 * 
 * Actual Output:(Test file:  Prob03.txt)
 * 1, 1, 9 = Not a Triangle
 * 1, 2, 10 = Not a Triangle
 * 7, 8, 9 = Scalene
 * 4, 5, 6 = Scalene
 * 1, 2, 6 = Not a Triangle
 * 1, 5, 7 = Not a Triangle
 * 2, 3, 7 = Not a Triangle
 * 4, 4, 8 = Not a Triangle
 * 6, 6, 8 = Isosceles
 * 1, 7, 7 = Isosceles

 * 
 * @author (Stone) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.Arrays;

public class Prob3_WhatTriangleIsThis{
    private static final String INPUT_FILE_NAME = "Prob03.in.txt";    
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
                
                // get the side lengths
                String[] tokens = inLine.split(", ");
                
                // get an array of ints
                int[] sides = new int[3];
                
                for (int i=0; i<3; i++) {
                    sides[i] = Integer.parseInt(tokens[i]);
                }//end for
                
                // sort it
                Arrays.sort(sides);
                
                // is the triangle viable?
                if ((sides[0] + sides[1]) <= sides[2]) {
                    // triangle doesn't work
                    System.out.printf("%d, %d, %d = Not a Triangle%n", sides[0],sides[1],sides[2]);
                } //end if
                else {
                    if ((sides[0] == sides[1]) && (sides[1] == sides[2])) {
                        // three equal sides
                        System.out.printf("%d, %d, %d = Equilateral%n", sides[0],sides[1],sides[2]);
                    }//end if 
                    else {
                        if ((sides[0] == sides[1]) || (sides[1] == sides[2]) || (sides[2] == sides[0])) {
                            // two equal sides
                            System.out.printf("%d, %d, %d = Isosceles%n", sides[0],sides[1],sides[2]);
                        } //end if
                        else {
                            // no equal sdes
                            System.out.printf("%d, %d, %d = Scalene%n", sides[0],sides[1],sides[2]);
                        }//end else
                    }//end else
                }//end else
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
