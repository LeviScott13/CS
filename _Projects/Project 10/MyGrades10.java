//**********************************************************************************************************
//Purpose: Computes student totals, grades, averages, and finds the student with the highest total
//         and the student witht the lowest total
//
//Input:   Date text file, course name, instructor name, semester, year, and school
//
//Output:  Student totals, grades, averages, and finds the student with the highest total
//         and the student witht the lowest total
//
//Authors: Levi Sutton and Cameron Paige
//
//Course:  CS1301
//
//Program: MyCourse10
//
//Date:    4/3/2017
//**********************************************************************************************************
//Import java Scanner utility package from the system
import java.util.Scanner;
//Create new class called MyGrades10
public class MyGrades10 
{
   //Dcelare courseName,instructorName, semester, and school of type String
   //Declare year, numberOfStudents, numberOfTests, lowestScoreIndex, and highestScoreIndex of type int
   //Declare array called names of type String
   //Declare arrays called scores and studentTotals of type int
   //Declare array called grades of type char
   //Declare array called testsAverages of type double
   //Declare infile of type Scanner
   Scanner scan = new Scanner (System.in);
   
   private String courseName;
   private String instructorName;
   private String semester;
   private int year;
   private String school;
   private int numberOfStudents;
   private int numberOfTests;
   private String [] names;
   private int [][] scores;
   private int [] studentTotals;
   private char [] grades;
   private double [] testsAverages;
   private int lowestScoreIndex;
   private int highestScoreIndex;
   private Scanner infile;
   //*******************************************************************************************************
   //Constructor:
   //             1. Recieves text file argument
   //             2. Uses number of students and number of tests to create arrays for names, scores, grades, 
   //                studentTotals, and testsAverages
   //             3. Assigns recieved Scanner object to global infile variable
   //             4. Invokes the following methods: readCourseInfor, readRecords, computeStudentsTotals,
   //                computeGrades, computeTestsAverages, findStudentWithHighestTotal, findStudentWithLowestTotal,
   //                printHeader, displayStudentRecords, and printFooter
   //*******************************************************************************************************
   //Implement MyGrades10 method
   public MyGrades10 (Scanner scan){
         
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents][numberOfTests];
      grades = new char [numberOfStudents];
      studentTotals = new int [numberOfStudents];
      testsAverages = new double [numberOfStudents];
      
      infile = scan;
      
      readCourseInfo();
      readRecords();
      computeStudentsTotals();
      computeGrades();
      computeTestsAverages();
      findStudentWithHighestTotal();
      findStudentWithLowestTotal();
      printHeader();
      displayStudentsRecords();
      printFooter();
   }//End of MyGrades10 method
   //******************************************************************************************************
   //readCourseInfo:
   //                1. Reads courseName, instructorName, school, semester, year, numberOfStudents, and
   //                   numberOfTests
   //                2. Creates names, scores, grades, studentTotals, and testsAverages arrays
   //******************************************************************************************************
   //Implement readCourseInfo method
   public void readCourseInfo() 
   {               
      courseName = infile.nextLine();
      instructorName = infile.nextLine();
      school = infile.nextLine();
      semester = infile.nextLine();
      year = infile.nextInt();
      numberOfStudents = infile.nextInt();
      numberOfTests = infile.nextInt();
      
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents][numberOfTests];
      grades = new char [numberOfStudents];
      studentTotals = new int [numberOfStudents];
      testsAverages = new double [numberOfStudents];
   }//End of readCourseInfo method
   //******************************************************************************************************
   //readRecords:
   //             1. Reads students' records and populates the arrays of names and scores
   //******************************************************************************************************
   //Implement readRecords method
   public void readRecords () 
   {   
      for (int r = 0; r < numberOfStudents; r++)
      { 
         names [r] = infile.next();
         for (int c = 0; c < numberOfTests; c++)
         {
            scores[r][c] = infile.nextInt();
         }
      }
   }//End of readRecords method
   //******************************************************************************************************
   //computeStudentsTotals: 
   //                      1. computes student totals and stores them in a one-dimensional array
   //******************************************************************************************************
   //Implement compteStudentsTotals method
   public void computeStudentsTotals()
   {
      for (int r = 0; r < scores.length; r++) 
      {
         int sum = 0;
         for (int c = 0; c < scores[r].length; c++)
         { 
            sum += scores[r][c];
         }
         studentTotals[r] = sum;
      }
   }//End of computeStudentsTotals method
   //******************************************************************************************************
   //computeGrades:
   //              1. Uses the standard grading system to compute the grades and stores them in the grades array
   //******************************************************************************************************
   //Implement computeGrades method
   public void computeGrades() 
   {
      for (int r = 0; r < scores.length; r++) 
      {
         for (int c = 0; c < scores[r].length; c++) 
         {
            if(scores[r][c] >= 90 && scores[r][c] <= 100 )
            grades[r] = 'A';         
            else if(scores[r][c] >= 80 && scores[r][c] <= 89)
            grades[r] = 'B';
            else if(scores[r][c] >= 70 && scores[r][c] <= 79)
            grades[r] = 'C';
            else if(scores[r][c] >= 60 && scores [r][c] <= 69)
            grades[r] = 'D';
            else
            grades[r] = 'F';
         }
      }
   }//End of computeGrades method
   //*******************************************************************************************************
   //computeTestsAverages:
   //                      1. Computes the tests averages and stores them in the testsAverages array
   //*******************************************************************************************************
   //Implement computeTestsAverages method
   public void computeTestsAverages() 
   {
      int sum[] = new int[numberOfTests];
      for (int r = 0; r < scores.length; r++) 
      {
         for (int c = 0; c < scores[r].length; c++)
         {
            sum[c] += scores[r][c];
         }
      } 
      for (int i = 0; i < numberOfTests; i++)
         testsAverages[i] = (double) sum[i] / scores.length;
   }//End of computeTestsAverages method
   //*******************************************************************************************************
   //findStudentWithHighestTotal:
   //                            1. Finds the student with the highest total and stores its index in 
   //                               highestScoreIndex
   //*******************************************************************************************************
   //Implement findStudentWithHighestTotal method
   public void findStudentWithHighestTotal() 
   {
      int max = scores[0][0];
      for (int i = 1; i < studentTotals.length; i++)
      {
         if (studentTotals[i] > max)
         {
            max = studentTotals[i];
            highestScoreIndex = i;
         }
      }
   }//End of findStudentWithHighestTotal method
   //*******************************************************************************************************
   //findStudentWithLowestTotal:
   //                            1. Finds the student witht he lowest total and stores its index in 
   //                               lowestScoreIndex
   //*******************************************************************************************************
   //Implement findStudentWithLowestTotal method
   public void findStudentWithLowestTotal()
   {
      int min = scores[0][0];
      for (int i = 1; i < studentTotals.length; i++)
      {
         if (studentTotals[i] < min)
         {
            min = studentTotals[i];
            lowestScoreIndex = i;
         }
      }
   }//End of findStudentWithLowestTotal method
   //*******************************************************************************************************
   //printHeader:
   //             1. Prints report header with courseName, instructorName, semester, year, and school
   //*******************************************************************************************************
   //Implement printHeader method
   public void printHeader()
   {

      System.out.println ("\n\t***************************** Output Report ***************************");  
      System.out.printf ("\n\t%-20s%-20s", "Course:                     \t", courseName);
      System.out.printf ("\n\t%-20s%-20s", "Instructor's Name:          \t", instructorName);
      System.out.printf ("\n\t%-20s%-20s", "School:                     \t", school);
      System.out.printf ("\n\t%-20s%-20s", "Year:                       \t", year);
      System.out.printf ("\n\t%-20s%-20s", "Semester:                   \t", semester);
      System.out.printf ("\n\t%-20s%-20d", "Number Of Students:         \t", numberOfStudents);
      System.out.printf ("\n\t%-20s%-20d", "Number of Tests:            \t", numberOfTests);
      System.out.println ("\n\t***********************************************************************");  
  
   }//End of printHeader method
   //*******************************************************************************************************
   //displayStudentsRecords:
   //                         1. Prints students' records
   //*******************************************************************************************************
   //Implement displayStudentsRecords method
   public void displayStudentsRecords() 
   {
      if (scores[0].length < 3)
      System.out.printf ("\n\t%-10s%-10s%-10s%-10s%-10s%-10s", "Number", "Name", "Test 1", "Test 2", "Total", "Grade");
      else 
      System.out.printf ("\n\t%-10s%-10s%-10s%-10s%-10s%-10s%-10s", "Number", "Name", "Test 1", "Test 2", "Test 3","Total", "Grade");
      
      for (int r = 0; r < scores.length; r++) 
      { 
         System.out.printf ("\n\t%-10d%-10s", r + 1, names[r]);
         for (int c = 0; c < scores[r].length; c++)
         {
           System.out.printf ("%-10d", scores[r][c]);
         }
         System.out.printf ("%-10d%-10c", studentTotals[r], grades[r]);
      }
      System.out.printf ("\n\n\t%-20s", "Averages");
      for (int i = 0; i < numberOfTests; i++)
      {
         System.out.printf ("%-10.2f", testsAverages[i]);
      }
      if (scores[0].length < 3)
      {
         System.out.println ("\n\n\tStudent With Lowest Average:");
         System.out.printf ("\n\t%-10s%-10d%-10d%-10d%-10c", names[lowestScoreIndex],scores[lowestScoreIndex][0], scores[lowestScoreIndex][1], studentTotals[lowestScoreIndex], grades[lowestScoreIndex]);       
         System.out.println ("\n\n\tStudent With Highest Average:");
         System.out.printf ("\n\t%-10s%-10d%-10d%-10d%-10c", names[highestScoreIndex],scores[highestScoreIndex][0], scores[highestScoreIndex][1], studentTotals[highestScoreIndex], grades[highestScoreIndex]);       
      }
      else
      {
         System.out.println ("\n\n\tStudent With Lowest Average:");
         System.out.printf ("\n\t%-10s%-10d%-10d%-10d%-10d%-10c", names[lowestScoreIndex],scores[lowestScoreIndex][0], scores[lowestScoreIndex][1], scores[lowestScoreIndex][2],studentTotals[lowestScoreIndex], grades[lowestScoreIndex]);       
         System.out.println ("\n\n\tStudent With Highest Average:");
         System.out.printf ("\n\t%-10s%-10d%-10d%-10d%-10d%-10c", names[highestScoreIndex],scores[highestScoreIndex][0], scores[highestScoreIndex][1], scores[highestScoreIndex][2],studentTotals[highestScoreIndex], grades[highestScoreIndex]);       
      }
   }//End of displayStudentsRecords method
   //*******************************************************************************************************
   //printFooter:
   //             1. Prints testsAverages
   //             2. Student complete record with lowest score
   //             3. Student complete record with highest score
   //*******************************************************************************************************   
   public void printFooter () 
   {
   
      System.out.println ("\n\n\t*************************** Have A Great Day **************************");  
   
   }
}