//**********************************************************************
//    Purpose:    Using JGRASP to implement if and else statements 
//                to evaluate expressions with multiple conditions
//
//    Input:      None
//    Output:     Displays shipping charges to calculculate 
//    Author:     Levi Sutton
//    Date:       1/25/2017
//    Class:      CS1301 (Section B)
//    Program:    #3 (MyShippingCharges3.java)
//**********************************************************************

//    Import packages to have the Date and Scanner classes
import java.util.Scanner;
import java.util.Date;
public class MyShippingCharges3 
{
//    Declations of static variables to be used the method of the classes
//    Declare weight and distance of type int
//    Declare costKg of type double
//    Declare name and course of type String
      public static String name;
      public static String course;
      public static Date dateCreated;
      public static int weight;
      public static int distance;
      public static double costKg;
      
//**********************************************************************
//Main:  Invoke other methods.
//       Invokes the readData, calaculations, printOutput, printHeader.
//       printFooter, and displayTable methods
//**********************************************************************      
   public static void main (String [] args)
   {
      readData();
      calculations();
      printHeader();
      printOutput();
      displayTable();
      printFooter();
   }

//**********************************************************************
//readData:   Read name, course, weight and distance
//
//**********************************************************************     
      
//Implement readData method
      public static void readData()
      {
         //Create a Scanner to help read name, course, weight. and distance
         Scanner input = new Scanner (System.in);
             
         System.out.printf ("\tEnter your Name:                          \t");
         name = input.nextLine();
         System.out.printf ("\tEnter your Course Name:                   \t");
         course = input.nextLine();
         System.out.printf ("\tEnter package weight in kg. as an integer:\t");
         weight = input.nextInt();
         System.out.printf ("\tEnter distance as an integer:             \t");
         distance = input.nextInt();  

      }

//**********************************************************************      
//Calculations:   Computes costKg using if and statements, Doubles costKg
//                if distance is greater than 1000 miles
//                Also, gets date and time from the system
//********************************************************************** 
      public static void calculations()
      {
         //Computes: costKg 
         if (weight <= 1) 
         {
            costKg =  1.70;
            if (distance > 1000)
            {
               costKg = 2 * costKg; 
            }
               
         }
         else if (weight >1 && weight <= 5)
         {  
            costKg = 2.20;
            if (distance > 1000)
            {
               costKg = 2 * costKg; 
            }
               
         }
         else if (weight >5 && weight <= 10)
         {
            costKg = 6.70;
            if (distance > 1000)
            {
              costKg = 2 * costKg; 
            }
               
         }
         else if (weight >10)
         {
            costKg = 9.80;
            if (distance > 1000)
            {
               costKg = 2 * costKg; 
            }
               
         } 
         //Computes date and time from the system
         dateCreated = new Date();  
    
      }

//********************************************************************** 
//printOutput:  Displays Shipping charge information
//
//**********************************************************************
      
      //Prints weight, distance, and costKg
      public static void printOutput()
      { 
            System.out.println ("\n\t****************************************************************");
            System.out.printf  ("\n\t%-20s%20s","Weight:    \t",weight);
            System.out.printf  ("\n\t%-20s%20s","Distance:  \t",distance);
            System.out.printf  ("\n\t%-20s%20s","Cost:      \t",costKg);
            System.out.println ("\n\t********************* Have a nice day **************************");
      }

//********************************************************************** 
//printHeader: Prints Name, Course, and Date
//
//**********************************************************************         
      public static void printHeader()
      {
         System.out.println ("\n\t********************* Shipping Report **************************");
         System.out.printf  ("\n\t%-20s%-20s","Name:        \t",name);
         System.out.printf  ("\n\t%-20s%-20s","Course Name: \t",course);
         System.out.printf  ("\n\t%-20s%-20s","Date:        \t",dateCreated);

      }
      
//********************************************************************** 
//displayTable:  Displays Shipping charges based off calculations
//
//**********************************************************************            
      public static void displayTable()
      {
        
         
         System.out.println ("\n\t********************* Table of Charges *************************");
         System.out.println ("\t\t\t\t\t\tRate per 1000                                               ");
         System.out.println ("\tWeight of Package(Kg)\t\t\tMilesShipped                               ");
         System.out.println ("\t****************************************************************");
         System.out.printf ("\n\t%-20s%20.2f","1 Kg or less:          \t",1.70);
         System.out.printf ("\n\t%-20s%20.2f","Over 1 Kg and <= 5 Kg: \t",2.20);
         System.out.printf ("\n\t%-20s%20.2f","Over 5 Kg and <= 10 Kg:\t",6.70);
         System.out.printf ("\n\t%-20s%20.2f","Over 10 Kg:            \t",9.80);
      }
//********************************************************************** 
//printFooter:  Displays Footer
//
//**********************************************************************
      public static void printFooter()
      {
     
            System.out.println ("\n\t****************************************************************");

      }
}        