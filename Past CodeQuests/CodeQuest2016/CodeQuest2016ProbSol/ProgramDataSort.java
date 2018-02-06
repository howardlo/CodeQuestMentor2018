
/**
 * Professor Snoop Virtual Investigative Services II
 * Professor Snoop would like to merge the database of Agency II
 * with that of Agency I.  The database contains the names and addresses of
 * clients for of each Agency.  The first line contains the name of the 
 * client followed by the address.  Each of the clients lives in Lond, UK.
 * 
 * @author (Jeannie Ray-- needs work) 
 * @version (Week 17 Program)
 */

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Arrays;

public class ProgramDataSort
{
    public static void main(String[]args)
    {
        String[] agencyINames=new String[27];
        String[] agencyIINames=new String[19];
        String[] agencyIStreetAddress= new String[27];
        String[] agencyIIStreetAddress=new String[19];
        String[] newAgencyNames=new String[100];
        String[] newAgencyStreetAddress=new String[100];
        int number=0;
        
        try
        {   //reads in data from holmes.txt file
            FileReader reader = new FileReader("Prob05_DataSort.txt");
            Scanner in = new Scanner(reader);
            int i=0;
            while(in.hasNextLine())   
                {
                    agencyINames[i]=in.nextLine();
                    agencyIStreetAddress[i]=in.nextLine();
                        i++;
                }
           ProgramDataSort VIS = new ProgramDataSort();
           System.out.println("Names in Holmes File: ");
           VIS.print(agencyINames);
           System.out.println("Street Address: ");
           VIS.print(agencyIStreetAddress);
           
           //sorts the element of each array alaphabetically
          
            //list by last name first
            for (int t=0; t<agencyINames.length; t++)
           {
               String name=agencyINames[t];
                agencyINames[t]=VIS.reverseName(name);
            }
           System.out.println("New Name: ");
           VIS.print(agencyINames);
           
            //sorts the names alaphabetically
           System.out.println();
            Arrays.sort(agencyINames);
            System.out.println("Sorted Holmes Names: ");
            VIS.print(agencyINames);
            
            //sort street address based on names
            
         
           
        }//ends try
        
         catch (IOException exception)
        {
            System.out.println("Error processing file: " + exception);            
        } //ends catch
        }//ends main
        
            
            
      ///////////////////////METHODS////////////////////////////////////      
            
            //Prints all elements in an array
        public static void print(String [] agencyFile)
        {
            for (String e : agencyFile)
                System.out.println(e);
            System.out.println();
        }//ends print method
        
        
          //Sorts the data by last name
        public static String reverseName(String name)
        {
           String result="";
           String blank=" ";
           int index=name.lastIndexOf(blank);
           int i=0;
           if (index!= -1)
               result=(name.substring(index+1,name.length())+blank+(name.substring(0,index)));
           return result;
         }
               
        
        
        
        
        
    }//ends class testerSortName