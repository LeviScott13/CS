//**********************************************************************
//    Purpose:    Using for loops to create number patterns
//
//    Input:      Pattern Selection, number of lines
//    Output:     Number Pattern (I,II,III,IV,V,VI) 
//    Author:     Levi Sutton
//    Date:       2/16/2017
//    Class:      CS1301 (Section B)
//    Program:    #5 (MyPatterns6.java)
//**********************************************************************
public class MyPatterns6 
{
   //****************************************************************************
   //MyPattern6: Empty method to be implemented in MySkeletonPattern6.
   //            MyPattern6 transfers methods to MySkeletonPattern6,which then takes 
   //            methods to TestMyPattern6 and displays results from MyPattern6
   //          
   //****************************************************************************
	public MyPatterns6() 
   {
	}
	//****************************************************************************
   //displayPatternI: for-loop for pattern 1, Displays pattern 1 in tester method
   //
   //****************************************************************************
	public void displayPatternI (int lines) 
   {
      
      System.out.println("\n\tPattern I\n");
	   
         for (int i = 1; i <= lines; i++)
         {
		      for (int j = 1; j <= i; j++)
            {
			      System.out.print (j + " " );
            }
               System.out.println();
         }
	}
   //****************************************************************************
   //displayPatternII: for-loop for pattern 2, Displays pattern 2 in tester method
   //
   //****************************************************************************
 	public void displayPatternII (int lines) 
   {

	   System.out.println("\n\tPattern II\n");

         for (int i = lines; i >= 1; i--)
         {
		      for (int j = 1; j <= i; j++)
            {
		         System.out.print ((i - j + 1) + " " );
            }
			      System.out.println();
	      }
   }
   
	//****************************************************************************
   //displayPatternIII: for-loop for pattern 3, Displays pattern 3 in tester method
   //
   //****************************************************************************
 	public void displayPatternIII (int lines) 
   {

	   System.out.println("\n\tPattern III\n");

         for (int i = lines; i > 0; i--)
         {
		      for (int j = 1; j <= i - 1; j++)
            {
               System.out.print (" ");
            }
            for (int k = lines; k >= i; k--)
            {  
               System.out.print (k);        
                  
            }
            
               System.out.println();
         }
   }
	
   //****************************************************************************
   //displayPatternIV: for-loop for pattern 4, Displays pattern 4 in tester method
   //
   //****************************************************************************
	public void displayPatternIV (int lines) 
   {
      System.out.println("\n\tPattern IV\n");
         
         int h = 1;
         for (int i = lines; i > 0; i--)
         {
		      for (int j = 1; j <= i - 1; j++)
            {
               System.out.print (" ");
            }
            for (int k = 1; k <= h; k++)
            {  
               System.out.print(k);        
            } 
            System.out.println();
            h++;
         }          
   }
	
   //****************************************************************************
   //displayPatternV: for-loop for pattern 5, Displays pattern 5 in tester method
   //
   //****************************************************************************
	public void displayPatternV (int lines) 
   {
      System.out.println("\n\tPattern V\n");
      
      for (int i = 1; i <= lines; i++)
      {
         for (int k = 1; k <= lines - i; k++)
         {  
            System.out.print("  ");      
         } 
		   for (int j = i; j >= 1; j--)
         {
            System.out.print (j + " ");
         }
         for (int k = 2; k <= i; k++)
         {  
            System.out.print(k + " ");      
         } 
            System.out.println();   
      } 
   }

	//****************************************************************************
   //displayPatternVI: for-loop for pattern 6, Displays pattern 6 in tester method
   //                  This pattern is a pattern I created 
   //
   //****************************************************************************
	public void displayPatternVI (int lines) 
   {
  		
      System.out.println("\n\tMy Pattern\n");
      
      int h = lines;
      for (int i = 1; i <= lines; i++)
      {
         for (int k = 1; k <= lines - i + 1; k++)
         {
            System.out.print (k + " ");
         } 
         for (int s = 1; s <= 2 * (i - 1); s++)
         {
            System.out.print ("  ");
         }   
         for (int k = h; k >= 1; k--)
         {
            System.out.print (k + " ");              
         }
         for (int s = 1; s <= lines - i; s++)
         {  
            System.out.print("  ");      
         } 
		   for (int k = i; k >= 1; k--)
         {
            System.out.print (k + " ");
         }
         for (int j = 2; j <= i; j++)
         {  
            System.out.print(j + " ");      
         }
         for (int s = 1; s <= lines - i; s++)
         {
            System.out.print ("  ");
         }
         for (int k = 1; k <= lines - i + 1; k++)
         {
            System.out.print (k + " ");
         } 
         for (int s = 1; s <= 2 * (i - 1); s++)
         {
            System.out.print ("  ");
         }   
         for (int k = h; k >= 1; k--)
         {
            System.out.print (k + " ");              
         }
            System.out.println();
            h--;
      }
      int m = 1;
      int n = lines;
      for (int i = 1; i <= lines; i++)
      {   
		   for (int j = 1; j <= i; j++)
         {
            System.out.print (j + " ");         
         }
         for (int k = 1; k <= (2 * n) - 2; k++) 
         {
            System.out.print ("  ");
         }
         for (int k = i; k >= 1; k--)
         {
			   System.out.print (k + " ");
         }
         for (int s = 1; s <= lines - n; s++)
         {
            System.out.print ("  ");
         }
         for (int j = n; j >= 1; j--)
         {
            System.out.print (j + " ");
         }
         for (int k = 2; k <= n; k++)
         {
            System.out.print (k + " ");
         }
         for (int s = 1; s <= lines - n; s++)
         {
            System.out.print ("  ");
         }
		   for (int j = 1; j <= i; j++)
         {
            System.out.print (j + " ");         
         }
         for (int k = 1; k <= (2 * n) - 2; k++) 
         {
            System.out.print ("  ");
         }
         for (int k = i; k >= 1; k--)
         {
			   System.out.print (k + " ");
         }         

           System.out.println();
           m++;
           n--;
      }
   }
}