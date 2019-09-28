//*******************************************************************************
//Purpose:  Manipulates a text file and counts different types of characters,
//          tokens, and finds the shortest and longest tokens.
//
//Input:    Team number, team members, course name, date created, and data text file
//
//Output:   Longest token, shortest token, number of digits, number of lower case,
//          number of upper case, number of other characters, list of other characters
//
//Authors:  Levi Sutton, Cameron M. Page
//
//Course:   CS1301
//
//Program:  MyCounts9
//
//Date: March 23, 2017
//********************************************************************************
//Import java Scanner utility package from the system
//Import java ArrayList utility package from the system
//Import java Date utility package from the system
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
//Create new class called MyCounts9
public class MyCounts9
{
   //Declare numberOfLowerCase, numberOfUpperCase, numberOfDigits, numberOfOtherCharacters,
   //and numberOfTokens of type int
   //Declare shortestToken, longestToken, and others of type String
   //Declare array called words of type String
   private int numberOfLowerCase = 0;
   private int numberOfUpperCase = 0;
   private int numberOfDigits = 0;
   private int numberOfOtherCharacters = 0;
   private int numberOfTokens = 0;
   private String shortestToken = "";
   private String longestToken = "";
   private String [] words;
   private String others = "";
   //Declaee teamNumber of type int
   //Declare teamMember1, teamMember2, and course of type String
   //Declare Date as dateCreated
   private int teamNumber;
   private String teamMember1;
   private String teamMember2;
   private String course;
   private Date dateCreated; 
   //*****************************************************************************
   //constructor: 
   //             1. Receives a text file argument
   //             2. Reads tokens and stores in an ArrayList of type String
   //             3. Creates a one-dimensional array of type string to store tokens
   //             4. Copy the tokens from the ArrayList to the one-dimensional array 
   //*****************************************************************************
   //Implement MyCounts9 method
   public MyCounts9 (Scanner scan)
   {
          //Declare an ArrayList of type string to hold original tokens
          ArrayList <String> tokens = new ArrayList<>();
          
          //Read tokens from text file and store into the ArrayList
          while (scan.hasNext())
          {
            String word = scan.next();
            
            //Store non-empty words into the ArrayList
            if (word.length()>0)
               tokens.add(word);
          }
          
          //Declare a one-Dimensional array of type string
          numberOfTokens = tokens.size();
          words = new String [numberOfTokens];
          
          //Copy words from tokens ArrayList to words array
          for (int i = 0; i < tokens.size(); i++)
            words[i] = tokens.get(i); 
    }//end of MyCounts9 method
    //********************************************************************************
    //myTeamInformation:
    //               1: Assigns your group number to teamNumber
    //               2: Assigns your name to teamMember1
    //               3: Assigns your partner's name to teanMember2
    //               4: Assigns your course to course
    //               5: Assign System's date to dateCreated
    //********************************************************************************
    //Implement myTeamInformation method
    public void myTeamInformation()
    {
      teamNumber = 5;
      teamMember1 = "Levi Sutton";
      teamMember2 = "Cameron Paige";
      course = "CS1301";
      dateCreated = new Date();
    }//end myTeamInformation method
    //********************************************************************************
    //longestoken:  
    //               1: Finds the longest word in the string array and saves in longestToken.
    //              
    //********************************************************************************
    //Implement longestToken method
    public void longestToken()
    {
      int token = 0;
      for (int i = 1; i < words.length; i++) 
      {
         if (words[i].length() > token)
         {
            token = words[i].length();
            longestToken = words[i];
         }
      }
    }//end longestToken method
    //********************************************************************************
    //shortestWord:   1: Finds the shortest word in the string array and saves in shortestToken.
    //********************************************************************************
    //Implement shortestToken method
    public void shortestToken()
    {
      int token = 999;
      for (int i = 1; i < words.length; i++) 
      {
         if (words[i].length() < token)
         {
            token = words[i].length();
            shortestToken = words[i];
         }
      }
    }//end shortestToken method
    //********************************************************************************
    //countChars:   
    //               1: Processes all tokens in the string array to
    //               2: compute the numbers of digits
    //               3: compute the number of lowercase letters
    //               4: compute the number of uppercase letters
    //               5: compute the number of other characters
    //               6: accumulate all other characters
    //********************************************************************************
    //Implement countChars method
    public void countChars ()
    {
      for (int i = 0; i < words.length; i++)
      {
         for (int j = 0; j < words[i].length(); j++)
         {
            if (Character.isDigit(words[i].charAt(j)))
            {
               numberOfDigits += 1;
            }
            if (Character.isLowerCase(words[i].charAt(j)))
            {
               numberOfLowerCase += 1;
            }
            if (Character.isUpperCase(words[i].charAt(j)))
            {
               numberOfUpperCase += 1;
            }
            if (!Character.isLetterOrDigit(words[i].charAt(j)))
            {
               numberOfOtherCharacters += 1;
            }
            if (!Character.isLetterOrDigit(words[i].charAt(j)))
            {
               others += words[i].charAt(j);
            }
         }
      } 
        
    }//end of countChars
    //********************************************************************************
    //header:   
    //               1: Displays team number
    //               2: Your name
    //               3: Your partner's name
    //               4: your course
    //               5: System's date
    //               (see sample output)
    //********************************************************************************
    //Implement header method
    public void header ()
    {
       System.out.println ("\n\t************************************************************");    
       System.out.println ("\n\tTeam Number:               \t" + teamNumber);
       System.out.println ("\n\tTeam Member 1:             \t" + teamMember1);
       System.out.println ("\n\tTeam Member 2:             \t" + teamMember2);
       System.out.println ("\n\tCourse:                    \t" + course);
       System.out.println ("\n\tDate:                      \t" + dateCreated);
       System.out.println ("\n\t************************************************************");    

                
    }//end of header
    //********************************************************************************
    //displayOutput:    Displays counts, longest, and longest tokens
    //                  (see output) 
    //********************************************************************************
    //Implement displayOutput method
    public void displayOutput()
    {
       System.out.println ("\n\tLongest Token is:          \t" + longestToken);
       System.out.println ("\n\tShortest Token is:         \t" + shortestToken);
       System.out.println ("\n\tNumber of Digits:          \t" + numberOfDigits);
       System.out.println ("\n\tNumber of Lower Case:      \t" + numberOfLowerCase);
       System.out.println ("\n\tNumber of Upper Case:      \t" + numberOfUpperCase);
       System.out.println ("\n\tNumber of Other Characters:\t" + numberOfOtherCharacters);
       System.out.println ("\n\tList of Other Character:   \t" + others);
       System.out.println ("\n\t************************************************************");    
       
 
    }//end of displayOutput method
    //********************************************************************************
    //bonus:    Find and display additional information, such as number of numeric tokens, 
    //          Alphabetic tokens.
    //          This method is optional 
    //********************************************************************************
    //Implement bonus method
    public void bonus ()
    {
         int numericToken = 0;
         int alphabeticToken = 0;  
         for (int i = 0; i < words.length; i++)
         {

            if (Character.isDigit(words[i].charAt(0)) || words[i].charAt(0) == 43 || words[i].charAt(0) == 45 || words[i].charAt(0) == 46)
            {
                  numericToken += 1;
            }

            if (Character.isLetter(words[i].charAt(0))) 
            {
                  alphabeticToken += 1;
            }
         }
         System.out.println ("\n\tNumber of Numeric Tokens:   \t" + numericToken);
         System.out.println ("\n\tNumber of Alphabetic Tokens:\t" + alphabeticToken);         
    }//end of bonus  
 }//end of class               