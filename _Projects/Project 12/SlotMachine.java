import java.util.*;

public class SlotMachine
{
   public static void main (String [] args)
   {
      int amount;
      boolean keepPlay = true;
      
      Random num = new Random();
      Scanner input = new Scanner (System.in);
      
     
      while(keepPlay)
      {
         System.out.println ("Insert money to play:\n\t");
         amount = input.nextInt();  
      
         Random x = new Random();
      
         for (int i = 0; i <= 2; i++)
         {
            int number = x.nextInt(5);
         
            switch (number)
            {
               case 0:     System.out.println ("Cherries");
                           break;
               case 1:     System.out.println ("Oranges");
                           break;
               case 2:     System.out.println ("Plums");
                           break;
               case 3:     System.out.println ("Melons");
                           break;
               case 4:     System.out.println ("Bells");
                           break;
               case 5:     System.out.println ("Bars");
                           break;
               default:    System.out.println ("Invalid");
                           break;
            }
         }     
      }//end of while
   }
}            