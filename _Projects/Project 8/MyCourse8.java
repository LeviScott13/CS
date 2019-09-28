//***************************************************************************
//Purpose: To organization student information including student number, name,
//score, and grade, as well as the name, score, and grade of the student with 
//the highest score and the astudent with the lowest score.
//
//Input: Date text file that provides student information.
//
//Output: Displays organized student class report.
//
//Author: Cameron M. Page; Levi Sutton
//
//Course: CS1301 B
//
//Date: March 9, 2017
//
//Program: MyCourse8
//**************************************************************************
//Import Scanner utility package from the system
import java.util.Scanner;
//Create new class called MyCourse8
public class MyCourse8 {
   //Declare courseName, instructorName, school, and semester of type String
   //Declare numberOfStudents, year, lowestScoreIndex, and highestScoreIndex of type int
   //Declare testAverage of type double
   //Declare names, scores, and grades of type array
   private String courseName;
   private String instructorName;
   private int numberOfStudents;
   private String school;
   private String semester;
   private int year;
   private String [] names;
   private int [] scores;
   private char [] grades;
   private double testAverage;
   private int lowestScoreIndex;
   private int highestScoreIndex;
   
   //**********************************************************************
   //Constructor: Prompts user to input courseName and instructorName
   //             Gets numberOfStudents, school, semester, and year from
   //             data text file 
   //**********************************************************************
   public MyCourse8 (Scanner scan){
            
      //reading course information
      courseName = scan.nextLine();
      instructorName = scan.nextLine();
      this.numberOfStudents = scan.nextInt();
      this.school = scan.next();
      this.semester = scan.next();
      this.year = scan.nextInt();
      
            
      //declaring needed arrays
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents];
      grades = new char [numberOfStudents];
      
      
      //reading students records
      for (int i = 0; i < numberOfStudents; i++){
         names [i] = scan.next();
         scores[i] = scan.nextInt();
         
      }//end of for
      
      //computing students totals, grades, tests averages,
      //highest total index, and lowest total index
      //computeStudentsTotals ();
      computeGrades();
      computeTestAverage ();
      findStudentWithHighestTotal();
      findStudentWithLowestTotal();
      
      //Printing output.
      displayOutput();
   }
   
   //**********************************************************************
   //computeGrades: Establishes the score boundaries for each grade
   //**********************************************************************
   public void computeGrades ()
   {
      for (int i = 0; i < scores.length; i++)
      {
         if(scores[i] >= 90)
            grades[i] = 'A';         
         else if(scores[i] >= 80)
            grades[i] = 'B';
         else if(scores[i] >= 70)
            grades[i] = 'C';
         else if(scores[i] >= 60)
            grades[i] = 'D';
         else
            grades[i] = 'F';
      }
   }

   //**********************************************************************
   //computeTestAverage: Uses a foreach loop to find the sum of the scores
   //of the entire class, and then divides that sum by the number of 
   //students
   //**********************************************************************
   public void computeTestAverage()
   {
      int sum = 0;
      for (int i:scores)
      {
         sum += i;
      }
      testAverage = sum / numberOfStudents;
   }

   //**********************************************************************
   //findStudentWithHighestTotal: Uses a for loop and an if statement to 
   //find the highets score, and then outputs the information of that
   //particular index.
   //**********************************************************************
   public void findStudentWithHighestTotal()
   {
      int max = scores[0];
      for (int i = 1; i < scores.length; i++)
      {
         if (scores[i] > max)
         {
            max = scores[i];
            highestScoreIndex = i;
         }
      }
   }

   //**********************************************************************
   //findStudentWithLowestTotal: Uses a for loop and an if statement to
   //find the lowest score, and then outputs the information of that 
   //particular index.
   //**********************************************************************
   public void findStudentWithLowestTotal()
   {
      int min = scores[0];
      for (int i = 1; i < scores.length; i++) 
      {
         if (scores[i] < min)
         { 
            min = scores[i];
            lowestScoreIndex = i;
         }
      }
   }

   //**********************************************************************
   //displayOutput: Calls for the displayHeader method, 
   //the displayStudentsRecords method, and the displayFooter method.
   //**********************************************************************  
   public void displayOutput()
   {
        
      displayHeader();
      displayStudentsRecords ();
      displayFooter ();
      
   }
   
   //**********************************************************************
   //displayHeader: Displays courseName, instructorName, semester, year, 
   //and school. 
   //**********************************************************************  
   public void displayHeader()
   {

      System.out.println ("\n\t***************************** Output Report ***************************");  
      System.out.printf ("\n\t%-20s%-20s", "Course:           \t", courseName);
      System.out.printf ("\n\t%-20s%-20s", "Instructor's Name:\t", instructorName);
      System.out.printf ("\n\t%-20s%-20s", "Semester:         \t", semester);
      System.out.printf ("\n\t%-20s%-20s", "Year:             \t", year);
      System.out.printf ("\n\t%-20s%-20s", "School:           \t", school);
      System.out.println ("\n\t***********************************************************************");  
  
   }

   //**********************************************************************
   //displayStudentsRecords: Displays four columns consisting of a 
   //student number, student name, score, and grade. Also, displays the 
   //information for the students with the highest and lowest score.
   //**********************************************************************  
   public void displayStudentsRecords()
   {
      System.out.printf ("\n\t%-20s%-20s%-20s%-20s", "Number", "Name", "Score", "Grade");
      for (int i = 0; i < scores.length; i++)
      {
         System.out.printf ("\n\t%-20d%-20s%-20d%-20s", i + 1, names[i], scores[i], grades[i]);
      }
      System.out.printf ("\n\n\t%-20s%-20.2f", "Test Average", testAverage);
      System.out.println ("\n\n\n\tStudent With Highest Score:");
      System.out.printf ("\n\t%-20s%-20d%-20s", names[highestScoreIndex], scores[highestScoreIndex], grades[highestScoreIndex]); 
      System.out.println ("\n\n\n\tStudent With Lowest Score:");
      System.out.printf ("\n\t%-20s%-20d%-20s", names[lowestScoreIndex], scores[lowestScoreIndex], grades[lowestScoreIndex]); 

   }
     
   //**********************************************************************
   //displayFooter: Displays a bottom border 
   //**********************************************************************  
   public void displayFooter ()
   {
   
      System.out.println ("\n\n\t*************************** Have A Great Day **************************");  
   
   }// end of displayFooter
 
   
}//end of class