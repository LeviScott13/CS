//********************************************************************
//Purpose:  Computes bank account information and charges
//
//Input:    Reading name, course, initial balance, and number of checks written
//
//Output:   Account infomation. See sample output below
//
//Author:   
//
//Course:   CS1301
//
//Date:     1/24/2017
//
//Program:  BankCharges.java
//*******************************************************************

/* Problem description

A bank charges $10 per month plus the following check fees for a commercial checking account:

   $0.10 for each check if less than 21 checks were written
   $0.08 for each check if number of checks 21 through 40 checks were written
   $0.06 for each check if number of checks 41 through 60 checks were written
   $0.04 for each check if number of checks is greater than 60

   The bank also charges an extra $15 if the account balance falls below $400 (before any
   check fees are applied). Design a class that reads name, course, initial balance, checks total amount,
   deposit total amount, and number of checks written. Also, it gets the date from the system's clock.
   
   Compute fees and current balance and display output as show in the sample run below.
*/

import java.util.Scanner;
import java.util.Date;
public class BankCharges{
   //declaring static variables to be shared by different methods
   private static String name;
   private static String course;
   private static Date dateCreated;
   private static double balance;
   private static double currentBalance;
   private static double checksAmount;
   private static double depositsAmount;
   private static int numberOfChecks;
   private static final int BASIC_FEE = 10;
   private static final int LOW_BALANCE_FEE = 15;
   private static double fees;
   
   //****************************************************************
   //main:  invokes readData, calculations, and displayOutput methods
   //****************************************************************
   public static void main (String [] args){
      readData();
      calculations();
      displayOutput();
   }
   
   //***************************************************************
   //1.  readData:   Creates a Scanner object, reads name, course, initial balance,
   //                checks amount, deposit amount, 
   //                and number of checks written. Also, it gets the system's date.
   //***************************************************************
   public static void readData(){
      
      Scanner scan = new Scanner (System.in);
      
      System.out.printf ("\tName:                  \t");
      name = scan.nextLine();
      System.out.printf ("\tCourse Name:           \t");
      course = scan.nextLine();
      System.out.printf ("\tEnter Initial Balance: \t");
      balance = scan.nextDouble();
      System.out.printf ("\tEnter Checks Total:    \t");
      checksAmount = scan.nextDouble();
      System.out.printf ("\tDeposit Amount:        \t");
      depositsAmount = scan.nextDouble();
      System.out.printf ("\tEnter Number of Checks:\t");
      numberOfChecks = scan.nextInt();

      dateCreated = new Date();
   
      System.out.println ("\n\treadData to be implemented");
  
   }//end of readData method
   
   
   //***************************************************************
   //calculations:   Computes fees and current balance.
   //***************************************************************
   public static void calculations ()
   {
       currentBalance = balance;
       
       fees = BASIC_FEE;
       
       if (balance < 400) 
       {
         fees += LOW_BALANCE_FEE;
       }
       currentBalance += depositsAmount - checksAmount;
       if (numberOfChecks <= 20)
       {
         fees += numberOfChecks * 0.10;
       }
       else if (numberOfChecks <= 40)
       {
         fees += numberOfChecks * 0.08;
       }
       else if (numberOfChecks <= 60)
       {
         fees += numberOfChecks * 0.06;
       }
       else
         fees += numberOfChecks * 0.04;
       {
         currentBalance -= fees;
       }  
 
   }//end of calculations method
   
   //***************************************************************
   //displayOutput:  invokes printHeader, display input and computed results
   //                invokes displayFooter.
   //***************************************************************
   public static void displayOutput (){
      printHeader();
          
      System.out.printf ("\n\t%-30s%10.2f", "Original Balance:", balance);
      System.out.printf ("\n\t%-30s%10.2f", "Checks Amount:", checksAmount);
      System.out.printf ("\n\t%-30s%10.2f", "Deposits Amount:", depositsAmount);
      System.out.printf ("\n\t%-30s%7d", "Number of checks:", numberOfChecks);
      System.out.printf ("\n\t%-30s%10.2f", "Fees Paid:", fees);
      System.out.printf ("\n\t%-30s%10.2f", "Current Balance:", currentBalance);
     
      printFooter();
   }//end of displayOutput

   //***************************************************************
   //printHeader:  displays name, course, and date
   //***************************************************************
   public static void printHeader(){
      System.out.printf ("\n\t%-60s","**************  Bank Report  ************************");
      System.out.printf ("\n\t%-30s%-13s","Name:", name);
      System.out.printf ("\n\t%-30s%-13s","Course:", course);
      System.out.printf ("\n\t%-30s%-13s","Date:", dateCreated);
      System.out.printf ("\n\t%-60s\n","*****************************************************");
   }//end of printHeader method
   
   //***************************************************************
   //printFooter:  displays end of report
   //***************************************************************
   public static void printFooter(){
      System.out.printf ("\n\t%-60s","*****************************************************");
      System.out.printf ("\n\t%1s%-54s%1s","*","","*");
       System.out.printf ("\n\t%-60s","************  Have a good day ***********************");
   }//end of printHeader method
   
   /*  
   Enter your name:              	John Smith
	Enter Course and section:     	CS 1301
	Enter initial Balance:        	1000
	Enter checks total amount:    	550
	Enter deposits total amount:  	250
	Enter Number of Checks:  	25

	**************  Bank Report  ************************       
	Name:                         John Smith   
	Course:                       CS 1301      
	Date:                         Tue Jan 24 11:32:25 EST 2017
	*****************************************************       

	Original Balance:                1000.00
	Checks Amount:                    550.00
	Deposits Amount:                  250.00
	Number of checks:                  25
	Fees Paid:                         12.00
	Current Balance:                  688.00
	*****************************************************       
	*                                                      *
	************  Have a good day ***********************       
        
   */
}//end of class