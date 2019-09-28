//**********************************************************************
//    Purpose:    Using JGRASP tu use different formulas to calculate
//                numbers and use the right format to display final 
//                calculations.
//
//    Input:      None
//    Output:     Displays daily driving cost, so that you can estimate 
//                how much money could be saved by car-pooling
//    Author:     Levi Sutton
//    Date:       1/18/2017
//    Class:      CS1301 (Section B)
//    Program:    #2 (MyCarPool2.java)
//**********************************************************************

//    Import packages to have the Date and Scanner classes
import java.util.Scanner;
import java.util.Date;
public class MyCarPool2 
{
//    Declations of static variables to be used the method of the classes
//    Declare miles and passengers of type int
//    Declare gallonCost, avgmpg, tolls, dailyCost, parkingFee, passengerCost,
//            daily, weekly, monthly, annual, tripCost of type double
//    Declare name and course of type String
   public static String name;
   public static String course;
   public static Date dateCreated;
   public static int miles, passengers;
   public static double gallonCost, avgmpg, tolls, dailyCost,parkingFee,
                         passengerCost, daily, weekly, monthly, annual, tripCost;  
                         
//**********************************************************************
//Main:  Invoke other methods.
//       Invokes the readData, calaculations, and printOutput methods
//**********************************************************************
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
         
         readData();
         calculations();
         printOutput();
    }
//**********************************************************************
//readData:   Read name, course ,miles, gallonCost, avgmpg, parkingFee, tolls, 
//            passengers
//
//**********************************************************************

//Implement readData method
    public static void readData()
    {
    //Create a Scanner to help read name and course
      Scanner scan = new Scanner (System.in);
      
         System.out.print ("Enter your Name:         \t");
         name = scan.nextLine();
         System.out.print ("Enter your Course name:  \t");
         course = scan.nextLine();
    
     //Create a Scannner to help read miles, gallonCost, avgmpg, parkingFee, tolls, passengers
      Scanner input = new Scanner (System.in);
      
      //Reading input Data
         System.out.printf ("\n\nWerlcome to the Daily Driving Cost calculator:        ");
         System.out.printf ("\n\tEnter the number of miles you drive per day:        \t");
         miles = input.nextInt();
         System.out.printf ("\tEnter the cost per gallon of gas of your vehicle:     \t");
         gallonCost = input.nextDouble();
         System.out.printf("\tEnter average miles per gallon of gas of your vehicle: \t");
         avgmpg = input.nextDouble();
         System.out.printf ("\tEnter the parking fees per day:                       \t");
         parkingFee = input.nextDouble();
         System.out.printf("\tEnter the tolls per day:                               \t");
         tolls = input.nextDouble();
         System.out.printf("\tEnter the passengers:                                  \t");
         passengers = input.nextInt();
      }

//**********************************************************************      
//Calculations:   Computes dailyCost, passengerCost, and daily, weekly, monthly,
//                and annual savings
//                Also, gets date and time from the system
//********************************************************************** 
      public static void calculations()
      {
         //Computes: dailyCost, passengerCost, and daily, weekly, monthly,
         //          and annual savings
         dailyCost = (double)(miles / avgmpg) * gallonCost + parkingFee + tolls;
         passengerCost = (double) dailyCost / passengers;
         daily = (double) dailyCost - passengerCost;
         weekly = (double) daily * 5;
         monthly = (double) daily * 22;
         annual = (double) daily * 260;
         
         //Computes date and time from the system
         dateCreated = new Date();
      }

//********************************************************************** 
//printOutput:  Invokes header and footer
//              and displays Car pool information
//
//**********************************************************************     
      public static void printOutput()
      {  
         //Invokes Header method
         printHeader();
         
         //Prints miles, gallonCost, avgmpg, parkingFee, tolls, passengers, dailyCost,
         //       passengerCost, and daily, weekly, monthly, annual savings data 
         System.out.printf  ("\n\t%-20s%20d","Daily Miles Driven:            \t", miles);
         System.out.printf  ("\n\t%-20s%20.2f","Cost per gallon:             \t", gallonCost);
         System.out.printf  ("\n\t%-20s%20.2f","Average Miles Per Gallon:    \t", avgmpg);
         System.out.printf  ("\n\t%-20s%20.2f","Parking Fees:                \t", parkingFee);
         System.out.printf  ("\n\t%-20s%20.2f","Tolls cost:                  \t", tolls);
         System.out.printf  ("\n\t%-20s%20d","Number of Passengers:          \t", passengers);
         
         System.out.printf  ("\n\n\t%-20s%20.2f","Daily Trip Cost:           \t", dailyCost);
         System.out.printf  ("\n\t%-20s%20.2f","One Passenger Daily Cost:    \t", passengerCost);
         System.out.printf  ("\n\t%-20s%20.2f","Daily Savings:               \t", daily);
         System.out.printf  ("\n\t%-20s%20.2f","Weekly Savings:              \t", weekly);
         System.out.printf  ("\n\t%-20s%20.2f","Monthly Savings:             \t", monthly);
         System.out.printf  ("\n\t%-20s%20.2f","Annual Savings:              \t", annual);
         
         //Invokes Footer line      
         printFooter();
      }
//********************************************************************** 
//printHeader:   Prints Name, Course Name, and Date
//
//********************************************************************** 
      public static void printHeader() 
      {     
         System.out.println ("\n\t****************** Car Pooling Report **************************");
         System.out.printf  ("\n\t%-20s%-20s","Name:  \t", name);
         System.out.printf  ("\n\t%-20s%-20s","Course:\t", course);
         System.out.printf  ("\n\t%-20s%-20s","Date:  \t", dateCreated);
         System.out.println ("\n\t****************************************************************");
       }
//********************************************************************** 
//printFooter:   Prints Footer line
//
//**********************************************************************        
       public static void printFooter()
       {
   
         System.out.printf  ("\n\t****************** Have a nice day *****************************");

//My Data I used
//Daily Miles Driven:         120
//Cost per gallon:            2.15
//Average Miles per Gallon:   32.90
//Parking Fees:               7.25
//Toll cost:                  5.25
//Number of Passengers:       4

   }
}

