import java.util.Scanner;
   public class SphereVolume
{
      public static double radius, volume;
   
   public static void main (String[] args)
   {
      readData();
      calculations();
     displayOutput();
      
   }
   public static void readData()
   {
      Scanner input = new Scanner (System.in);
         
         System.out.print ("\tEnter the radius of the Sphere:\t");
       radius = input.nextDouble();
         
   }
   public static void calculations()
   {
    volume = (double) (4.0/3.0) * 3.14 * Math.pow(radius,3);
   }
   public static void displayOutput()
  {
    System.out.printf ("\n\t%-20s%20.2f","Radius of Sphere:\t", radius);
     System.out.printf ("\n\t%-20s%20.2f","Volume of Sphere:\t", volume);
   }
   
}

   