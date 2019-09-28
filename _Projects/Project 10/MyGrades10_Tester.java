//********************************************************************************
//Purpose:  A driver to pass student files of different number of records 
//          and tests, in order to compute grades and display students records
//
//Author:   Fares
//
//Course:   CS1301
//
//Date:     3/20/2017
//
//Program:  MyGrades10_Tester.java
//*********************************************************************************

import java.util.*;
import java.io.*;
public class MyGrades10_Tester {
   public static void main (String [] args ) throws Exception {
      Scanner scan = new Scanner (new File ("data10A.txt"));
      MyGrades10 mc = new MyGrades10 (scan);
      Scanner scan2 = new Scanner (new File ("data10B.txt"));
      MyGrades10 mc2 = new MyGrades10 (scan2);
   }
}
