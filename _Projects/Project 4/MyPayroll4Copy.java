//***************************************************************************
//    Purpose:    Program computes payroll rates and gross pay after adding
//                overtime pay (if needed) then calculates your net pay after             
//                subtracting taxes (Federal and State)                            
//
//    Input:      Your Name, course, Hours you worked, Hourly rate,
//                Federal Tax Rate, and State Tax Rate
//
//    Output:     Your Namee, course, Hours you worked, Hourly rate,
//                Federal Tax Rate, State Tax Rate, Regular Pay, 
//                Overtime Pay, Gross Pay, Federal Tax, Sate Tax, and Nat Pay
//
//    Author:     Levi Sutton
//    Date:       2/3/2017
//    Class:      CS1301 (Section B)
//    Program:    #4 (MyPayroll4Copy.java)
//***************************************************************************

//Import packages to have the Date and Scanner classes
import java.util.Scanner;
import java.util.Date;

public class MyPayroll4Copy
{
      //Declations of static variables to be used the method of the classes
      //Declare hoursWorked and hourlyRate of type int
      //Declare FED_TAX_RATE, STATE_TAX_RATE, regularPay, overtimePay,
      //        grossPay, fedTax, stateTax, netPay of type double
      //Declare name and course of type String 
      public static String name, course;
      public static Date dateCreated;
      public static int hoursWorked, hourlyRate;
      public static double FED_TAX_RATE, STATE_TAX_RATE, regularPay, overtimePay,
                           grossPay, fedTax, stateTax, netPay;
   
   //**********************************************************************
   //Main:  Invoke other methods.
   //       Invokes the readData, calaculations, printOutput
   //********************************************************************** 
   public static void main (String [] args)
   {
      readData();
      calculations();
      printOutput();
   }
   
   //**********************************************************************
   //readData:   Creat Scanner object to read name, course, hoursWorked,
   //            hourlyRate, FED_TAX_RATE, STATE_TAX_RATE
   //
   //**********************************************************************    
  
   //Implement readData method
   public static void readData()
   {
   
      Scanner input = new Scanner (System.in);
         
         System.out.print ("\tEnter Name:             \t");
         name = input.nextLine();
         System.out.print ("\tEnter Course:           \t");
         course = input.nextLine();         
         System.out.print ("\tEnter Hours Worked:     \t");
         hoursWorked = input.nextInt();
         System.out.print ("\tEnter Hourly Rate:      \t");
         hourlyRate = input.nextInt();
         System.out.print ("\tEnter Federal Tax Rate: \t");
         FED_TAX_RATE = input.nextDouble();
         System.out.print ("\tEnter State Tax Rate:   \t");
         STATE_TAX_RATE = input.nextDouble();
   }

   //**********************************************************************      
   //Calculations:   Computes regular pay and overtime pay using if statements
   //                Afterwards calculates gross pay, net pay, federal tax and state tax
   //                to get net pay by subtracting taxes
   //                Also, gets date and time from the system
   //**********************************************************************    
   public static void calculations()
   {
   
      overtimePay = (hoursWorked - 40) * hourlyRate * 1.5;
      if (hoursWorked >= 40)
         regularPay = 40 * hourlyRate;

      else
      {
         regularPay = hoursWorked * hourlyRate;
         overtimePay = 0;
      }
      
      grossPay = regularPay + overtimePay;
      
      fedTax = grossPay * FED_TAX_RATE;
      
      stateTax = grossPay * STATE_TAX_RATE;
      
      netPay = grossPay - fedTax - stateTax;
      
      dateCreated = new Date();
   
   }
  
   //********************************************************************** 
   //printOutput:  Displays payroll information (pay and taxes) 
   //              Invokes Header and Footer methods 
   //
   //**********************************************************************
   public static void printOutput()
   {
   
      printHeader();
      
      System.out.printf ("\n\t%-20s%-20d","Hours Worked:               \t", hoursWorked);
      System.out.printf ("\n\t%-20s%-20d","Hourly Rate:                \t", hourlyRate);
      System.out.printf ("\n\t%-20s%13.2f%-1s","Federal Tax Rate:      \t", FED_TAX_RATE * 100, "%");
      System.out.printf ("\n\t%-20s%12.2f%-1s","State Tax Rate:        \t", STATE_TAX_RATE  * 100, "%");
      System.out.printf ("\n\t%-20s%-20.2f","Regular Pay:              \t", regularPay);
      System.out.printf ("\n\t%-20s%-20.2f","Overtime Pay:             \t", overtimePay);
      System.out.printf ("\n\t%-20s%-20.2f","Gross Pay:                \t", grossPay);
      System.out.printf ("\n\t%-20s%-20.2f","Federal Tax:              \t", fedTax);
      System.out.printf ("\n\t%-20s%-20.2f","StaeTax:                  \t", stateTax);
      System.out.printf ("\n\t%-20s%-20.2f","Net Pay:                  \t", netPay);
      System.out.println ("\n\t*******************************************************************");      
      
      printFooter();
      
   }

   //********************************************************************** 
   //printHeader: Prints Name, Course, and Date
   //
   //**********************************************************************     
   public static void printHeader()
   {
   
      System.out.println ("\n\t**************************Payroll Report***************************");
      System.out.printf ("\n\t%-20s%20s","Name:  \t", name);
      System.out.printf ("\n\t%-20s%20s","Course:\t", course);
      System.out.printf ("\n\t%-20s%20s","Date:  \t", dateCreated);
      System.out.println ("\n\t*******************************************************************");

   }

   //********************************************************************** 
   //printFooter:  Displays Footer
   //
   //**********************************************************************   
   public static void printFooter()
   {
      System.out.println ("\n\n\t**************************Have A Nice Day**************************");
   
   }
}
       
      
   