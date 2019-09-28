//**********************************************************
//Purpose: Practice with basic arithmetic operations
//
//Input: Reading two integers from keyboard
//Output: Display input values and their sum, difference,
// average, product, and remainder.
//
//Author:  Levi Sutton
//Course:  CS1301 (Section B)
//Date:    1/18/2017
//Program: Calculate1.java
//**********************************************************
import java.util.Scanner;
public class Calculate1{
   public static void main( String args[] ){
      //Declarations
      Scanner input = new Scanner( System.in );
      int number1; // first number
      int number2; // second number
      int sum; // sum of number1 and number2
      int difference; // number1 minus number2 
      int product; // product of number1 and number2
      double division; // division of numbers by number2
      double exponent; // number1 raised to number2
      int remainder; // remainder of number1 and number2
      double average; // average of numbers
      
      //Reading input data
      //1. write a series of statements to read in two integer values
      // and assign them to number1 and number2
      System.out.print ("\tEnter an interger value for number1:\t");
      number1 = input.nextInt();
      System.out.print ("\tEnter an interger value for number2:\t");
      number2 = input.nextInt();
      
      //Calculations
      //2. Compute the sum of number1 and number2 and save result
      // in variable sum. Perform other calculations and save 
      // results in the appropriate variables
      sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      division = (double)number1/number2;
      exponent = Math.pow (number1,number2); 
      remainder = number1 % number2;
      average = (double)sum / 2.0;
      //3. Display your output as specified in handout.
      System.out.println ("\n\t********** Output Report ****************");
      System.out.printf  ("\n\t%-20s%-20s","Name:","Levi Sutton");
      System.out.printf  ("\n\t%-20s%-20s","Course:","CS 1301");
      System.out.printf  ("\n\t%-20s%-20s","Date:","1/17/2017");
      System.out.println ("\n\t*****************************************");
      
      System.out.printf  ("\n\t%-20s%20d","Number1:",number1);
      System.out.printf  ("\n\t%-20s%20d","Number2:",number2);
      
      System.out.printf  ("\n\t%-20s%20d","Sum:",sum);
      System.out.printf  ("\n\t%-20s%20d","Difference:",difference);
      System.out.printf  ("\n\t%-20s%20d","Product:",product);
      System.out.printf  ("\n\t%-20s%20d","Remainder:",remainder);
      
      System.out.printf  ("\n\t%-20s%20.2f","Division:",division);
      System.out.printf  ("\n\t%-20s%20.2f","Exponent:",exponent);
      System.out.printf  ("\n\t%-20s%20.2f","Average:",average);
      
      System.out.println ("\n\t********** Have a good day **************");

   } // end main
} // end class Calculate