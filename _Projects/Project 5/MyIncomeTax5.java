//**********************************************************************
//    Purpose:    Using JGRASP to implement if and else statements 
//                to evaluate expressions with multiple conditions
//                and emplementing a switch staement to evaluate multiple cases
//                Also using these methods to calculate annual income 
//                and taxes due for an individual filing for taxes under
//                a certain conditiong
//
//    Input:      Name, status, and annual income
//    Output:     Displays Income tax information once calculated 
//    Author:     Levi Sutton
//    Date:       2/10/2017
//    Class:      CS1301 (Section B)
//    Program:    #4 (MyIncomeTax5.java)
//**********************************************************************
public class MyIncomeTax5
{
   //Declarations
   public static String name;
   public static int status;
   public static String statusName;
   public static double annualIncome;
   public static double taxDue;
   
   //**********************************************************************
   //Main:  Invoke other methods.
   //       Invokes the readArguments, computeTax, and printOutput methods
   //**********************************************************************
   public static void main (String [] args)
   {
      readArguments(args);
      computeTax();
      printOutput();
   }
   
   //**********************************************************************
   //readArguments:  Implement the command line to read arguements
   //                Reads name argument at comand line [0]
   //                Reads status argument at command line [1]
   //                Reads annual income at command line [2]       
   //**********************************************************************
   public static void readArguments(String [] args)
   {
   
      //Assign arguments to name, status, and annual income
      name = args[0];
      status = Integer.parseInt(args[1]);
      annualIncome = Double.parseDouble(args[2]);
      System.out.println(" ");
        
   }
   
   //**********************************************************************
   //computeTax:  Computes tax by using a switch statement to invoke the 
   //             appropriate method and assign a value to statusName.
   //**********************************************************************   
   public static void computeTax()
   {
   
      switch (status)
      {
         
         case 0:  statusName = ("Single Filer");
                  computeSingleFilers();
                  break;
         case 1:  statusName = ("Married Filing Jointly or Qualifying Widow(er)");
                  computeMarriedFilingJointly();
                  break;
         case 2:  statusName = ("Married Filing Seperately");
                  computeMarriedFilingSeparately();
                  break;
         case 3:  statusName = ("Head of Household");
                  computeHeadOfHousehold();
                  break;
         default: System.out.println (status + "Invalid Status");
                  System.exit(1);
                  break;
      }   
   }
  
   //*********************************************************************      
   //compuetSingleFilers:   Computes Single Filers
   //                       annual income and taxes due by comparing
   //                       the inputed annual income in the comand line 
   //                       to the corresponding if statements to get the 
   //                       correct calculation for how much tax is due
   //*********************************************************************     
   public static void computeSingleFilers()
   { 
     
      if(annualIncome >= 0 && annualIncome <= 9275)
      { 
         taxDue = annualIncome * .10;   
      }
      else
      {
         if(annualIncome >= 9276 && annualIncome <= 37650)
         {
            taxDue = (annualIncome - 9275) * 0.15 + 927.50;
         }
         if(annualIncome >= 37651 && annualIncome <= 91150)
         {
            taxDue = (annualIncome - 37650) * .25 + 5183.75;
         }
         if(annualIncome >= 91151 && annualIncome <= 190150)
         {
            taxDue = (annualIncome - 91150) * .28 + 18558.75;
         }
         if(annualIncome >= 190151 && annualIncome <= 413350)
         {
            taxDue = (annualIncome - 190150) * .33 + 46278.75;
         }
         if(annualIncome >= 413351 && annualIncome <= 415050)
         {
            taxDue = (annualIncome - 413350) * .35 + 119934.75;
         }
         if(annualIncome > 415051)
         {
            taxDue = (annualIncome - 415050) * .396 + 120529.75;  
         }
      }
   }
  
   //*******************************************************************************      
   //computeMarriedFilingJointly:   Computes Married Filing Jointly
   //                               annual income and taxes due by comparing
   //                               the inputed annual income in the comand line 
   //                               to the corresponding if statements to get the 
   //                               correct calculation for how much tax is due
   //*******************************************************************************        
   public static void computeMarriedFilingJointly()
   {
   
      if(annualIncome >= 0 && annualIncome <= 18550)
      { 
         taxDue = annualIncome * .10;
      }
      
      else
      {
         if(annualIncome >= 18551 && annualIncome <= 75300)
         {
            taxDue = (annualIncome - 18550) * .15 + 1855;
         }
         if(annualIncome >= 75301 && annualIncome <= 151900)
         {
            taxDue = (annualIncome - 75300) * .25 + 10367.50;
         }
         if(annualIncome >= 151901 && annualIncome <= 231450)
         {
            taxDue = (annualIncome - 151900) * .28 + 29517.50;
         }
         if(annualIncome >= 231451 && annualIncome <= 413350)
         {
            taxDue = (annualIncome - 231450) * .33 + 51791.50;
         }
         if(annualIncome >= 413351 && annualIncome <= 466950)
         {
            taxDue = (annualIncome - 413350) * .35 + 111818.50;
         }
         if(annualIncome > 466951)
         {
            taxDue = (annualIncome - 466950) * .396 + 130578.50;
         }
      }
   }
   
   //********************************************************************************      
   //computeMarriedFilingSeperately:   Computes Married Filing Seperately
   //                                  annual income and taxes due by comparing
   //                                  the inputed annual income in the comand line 
   //                                  to the corresponding if statements to get the 
   //                                  correct calculation for how much tax is due
   //********************************************************************************    
   public static void computeMarriedFilingSeparately()
   {
     
      if(annualIncome >= 0 && annualIncome <= 9275)
      { 
         taxDue = annualIncome * .10;
      }
      
      else
      {
         if(annualIncome >= 9276 && annualIncome <= 37650)
         {
            taxDue = (annualIncome - 9275) * .15 + 927.50;
         }
         if(annualIncome >= 37651 && annualIncome <= 75950)
         {
            taxDue = (annualIncome - 37650) * .25 + 5183.75;
         }
         if(annualIncome >= 75951 && annualIncome <= 115725)
         {
            taxDue = (annualIncome - 75950) * .28 + 14758.75;
         }
         if(annualIncome >= 115726 && annualIncome <= 206675)
         {
            taxDue = (annualIncome - 115725) * .33 + 25895.75;
         }
         if(annualIncome >= 206676 && annualIncome <= 233475)
         {
            taxDue = (annualIncome - 206675) * .35 + 55909.25;
         }
         if(annualIncome > 233476)
         {
            taxDue = (annualIncome - 233475) * .396 + 65289.25;
         }
      }
   }  

   //**********************************************************************      
   //Compute Head of Household:   Computes Head of Household annual income 
   //                             and taxes due by comparing the inputed 
   //                             annual income in the comand line to the 
   //                             corresponding if statements to get the 
   //                             correct calculation for how much tax 
   //                             is due
   //**********************************************************************     
   public static void computeHeadOfHousehold()
   {
      
      if(annualIncome >= 0 && annualIncome <= 13250)
      { 
         taxDue = annualIncome *.10;
      }
      
      else
      {
         if(annualIncome >= 13251 && annualIncome <= 50400)
         {
            taxDue = (annualIncome - 13250) * .15 + 1325;
         }
         if(annualIncome >= 50401 && annualIncome <= 130150)
         {
            taxDue = (annualIncome - 50400) * .25 + 6897.50;
         }
         if(annualIncome >= 130151 && annualIncome <= 210800)
         {
            taxDue = (annualIncome - 130150) * .28 + 26835;
         }
         if(annualIncome >= 210801 && annualIncome <= 413350)
         {
            taxDue = (annualIncome - 210800) * .33 + 49417;
         }
         if(annualIncome >= 413351 && annualIncome <= 441000)
         {
            taxDue = (annualIncome - 413350) * .35 + 116258.50;
         }
         if(annualIncome > 441001)
         {
            taxDue = (annualIncome - 441000) * .396 + 125936;  
         }
      }
   }

   //********************************************************************** 
   //printOutput:  Displays Income Tax information
   //
   //**********************************************************************      
   public static void printOutput()
   {
   
      displayHeader();
      
      System.out.printf ("\n\t%-20s%20s","Name:                    \t", name);
      System.out.printf ("\n\t%-20s%20s","Status:                  \t", statusName);
      System.out.printf ("\n\t%-20s%28.2f","Annual Income:         \t", annualIncome);
      System.out.printf ("\n\t%-20s%28.2f","2016 estimated tax due:\t", taxDue);
   
   
      displayFooter();
   }

   //********************************************************************** 
   //printHeader: Prints Name, Course, and Date
   //
   //********************************************************************** 
   public static void displayHeader()
   {
      
      System.out.println ("\t**********************************************************");
      System.out.println ("\t**                                                \t**");
      System.out.println ("\t**\tEstimating 2016 Personal Federal Income Tax     **");
      System.out.println ("\t**                                                \t**");
      System.out.println ("\t**\tCS1301                                          **");
      System.out.println ("\t**                                                \t**");
      System.out.println ("\t**\t2/1/2017                                        **");
      System.out.println ("\t**                                                \t**");
      System.out.println ("\t**********************************************************");
   }
   
   //********************************************************************** 
   //printFooter:  Displays Footer
   //
   //********************************************************************** 
   public static void displayFooter()
   {
    
      System.out.println ("\n\n\t**********************************************************");
      System.out.println ("\t**                                                 \t**");
      System.out.println ("\t**\tIt is needed but not fun to pay taxes           **");
      System.out.println ("\t**                                                 \t**");
      System.out.println ("\t**\tHave a good day                                 **");
      System.out.println ("\t**                                                 \t**");      
      System.out.println ("\t**********************************************************");
   
   }

}