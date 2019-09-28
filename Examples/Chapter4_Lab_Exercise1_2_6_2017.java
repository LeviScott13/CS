//**************************************************************************
//Purpose:  1. Prompt user to enter a string as a command-line argument 
//             and display the following:
//             a. The String
//             b. Its length
//             c. first character
//             d. middle character
//             e. last character
//
//Author:      CS 1301
//
//Course:      CS 1301
//
//Date:        2/6/2017
//
//Program:     Chapter4_Lab_Exercise1_2_6_2017.java
//***************************************************************************

import java.util.Scanner;
public class Chapter4_Lab_Exercise1_2_6_2017 
{
  public static void main(String[] args) 
  {
  
    //1. declaractions
    //   declare the needed variable to hold the string,
    //   its length, first, middle, and last characters.
    String str;
    int size;
    char first, middle, last;
    
    
        
    //2. Assign the command-line argument to the string variable
   
    str = args[0];
    
    //3. Find the needed information and save their values in the appropriate 
    //   variables
    size = str.length();
    first = str.charAt(0);
    middle = str.charAt(size/2);
    last = str.charAt(size - 1);
   
   
    //4. Print the original string and all required information
    System.out.printf ("\n\t%-20s%20s", "String:          \t", str);
    System.out.printf ("\n\t%-20s%20d", "Length:          \t", size);
    System.out.printf ("\n\t%-20s%20c", "First Character: \t", first);
    System.out.printf ("\n\t%-20s%20c", "Middle Character:\t", middle);
    System.out.printf ("\n\t%-20s%20c", "Last Character:  \t", last);
    
   
   
   
   
   
   
   
   
   /* Sample output
      String:                       Valdosta                      
      Length:                               8
      First Character:                      V
      Middle Character:                     o
      Last Character:                       a   
   */
   
  }//end of main
}// end of class 