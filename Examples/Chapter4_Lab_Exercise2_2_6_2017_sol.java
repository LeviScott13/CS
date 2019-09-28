//**************************************************************************
//Purpose:  1. Prompt user to enter a ssn as a command-line argument 
//             and display the following:
//             a. The original ssn
//             b. validity verification 
//                SSN should be in the format DDD-DD-DDDD, where D is a digit
//Author:      CS 1301
//
//Course:      CS 1301
//
//Date:        2/6/2017
//
//Program:     Chapter4_Lab_Exercise2_2_6_2017_sol.java
//***************************************************************************

import java.util.Scanner;
public class Chapter4_Lab_Exercise2_2_6_2017_sol {
  public static void main(String[] args) {
  
    //1. declaractions
    //   declare the needed variable to hold the SSN and
    //   another boolean variable isValid to hold the verification result.
    String ssn;
    boolean isValid;
    
        
    //2. Assign the command-line argument to the string variable
    ssn = args[0];
    
    //3. Find the needed information and save the result in isValid 
    
    isValid =   ssn.length() == 11 &&
                Character.isDigit(ssn.charAt(0)) &&
                Character.isDigit(ssn.charAt(1)) && 
                Character.isDigit(ssn.charAt(2)) && 
                ssn.charAt(3) == '-' && 
                Character.isDigit(ssn.charAt(4)) && 
                Character.isDigit(ssn.charAt(5)) && 
                ssn.charAt(6) == '-' && 
                Character.isDigit(ssn.charAt(7)) && 
                Character.isDigit(ssn.charAt(8)) && 
                Character.isDigit(ssn.charAt(9)) &&
                Character.isDigit(ssn.charAt(10));

 
    //Short cut
    isValid = ssn.matches ("[\\d]{3}-[\\d]{2}-[\\d]{4}"); 
 
   
    //4. Print the original string and all required information
    System.out.printf ("\n\t%-30s%-30s","SSN:",ssn);
    System.out.printf ("\n\t%-30s%-30b","Is it valid?",isValid);

       
   
   /* Sample output
     SSN:                          Valdosta                      
     Is it valid?                  false                            
     
     SSN:                          123-45-5678                   
     Is it valid?                  true 
   
     SSN:                          123-45-56ab                   
     Is it valid?                  false                         
   */
   
  }//end of main
}// end of class 