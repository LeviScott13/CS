//*******************************************************************************
//Purpose:  Learning how to use the String class and its methods to work together
//          with 2 Strings.
//			
//
//Names:    Levi Sutton
//
//Course:   CS1301
//
//Program:  MyString2
//
//Date: 	August 17, 2017
//********************************************************************************
public class MyString2 
{
	   private char[] buffer;
	      //*****************************************************************************
	      //	MyString2(String s): Method that converts String into the array buffer
	      //
	      //*****************************************************************************   
	      public MyString2 (String s)
	      {
	    	  buffer = new char[s.length()];
           for (int i = 0; i < s.length(); i++)
           buffer [i] = s.charAt(i);
         }
         //*****************************************************************************
	      //	MyString2(char[] s): Stores contents of String s into array buffer
	      //
	      //*****************************************************************************
	      public MyString2 (char[] s)
	      {
	    	  buffer = s;
	      }
         //*****************************************************************************
	      //	compare(MyString2 s): Method that compares the 2 strings in our tester and 
	      //
	      //*****************************************************************************
	      public int compare (MyString2 s)
	      {
           int value = this.toString().compareTo(s.toString());
           if (value < 0)
           {
               return -1;
           }
           if (value > 0)
           {
               return 1;
           }
           else
           {
               return 0;
           }             
	      }
         //*****************************************************************************
	      // charAt: Method that returns character at the corresponding index in the buffer array
	      //
	      //*****************************************************************************
	      public char charAt(int index)
	      {
	    	  return buffer[index];
	      }
         //*****************************************************************************
	      //	substring(int start, int end): Method that loops through the String 
         //                                and returns a substring from the corresponding
         //                                start and end index's
	      //
	      //*****************************************************************************
	      public String substring (int start, int end)
	      {
           String myString = "";
	    	  for (int i = start; i <= end; i++)
                myString += buffer[i];
           return myString;	    	  
	      }
         //*****************************************************************************
	      //	substring(int begin): Method that loops through the String 
         //                       and returns a substring from the corresponding
         //                       begin position.
	      //
	      //*****************************************************************************
	      public String substring (int begin)
	      {
           String myString2 = "";
	    	  for (int i = begin; i < buffer.length; i++)
                myString2 += buffer[i];
           return myString2;
	      }
         //*****************************************************************************
	      //	toUpperCase(): Method that returns a String to all Upper case letters
	      //
	      //*****************************************************************************
	      public MyString2 toUpperCase()
	      {
	    	  for (int i = 0; i < buffer.length; i++) 
	    		  buffer[i] = Character.toUpperCase(buffer[i]);
	    		  return this;
	      }
         //*****************************************************************************
	      //	toLowerCase(): Method that returns a String to all lower case letters
	      //
	      //*****************************************************************************
	      public MyString2 toLowerCase()
	      {
	    	  for (int i = 0; i < buffer.length; i++) 
	    		  buffer[i] = Character.toLowerCase(buffer[i]);
	    		  return this;
	      }
         //*****************************************************************************
	      //	equals(MyString2 s): Method that compares 2 Strings and returns true if the
         //                      Strings are identical and false if they are not
	      //
	      //*****************************************************************************
	      public boolean equals(MyString2 s)
	      {
           if (buffer.length != s.length())
            {
               return false;
            } 
            for(int i = 0; i < buffer.length; i++)
            {
               if( buffer[i] != s.charAt(i))
               {
                  return false;
               }
               
            }
            return true;  		 
	      }
	      //*****************************************************************************
	      //	toChar(): Method that returns a one dimensional array myArray and returns
         //           the String thats in array buffer
	      //
	      //*****************************************************************************
	      public char[] toChars()
	      {
	    	  char[] myArray = new char[buffer.length];
	    	  for (int i = 0; i < buffer.length; i++) 
	    		  myArray[i] = buffer[i];
	    	  return myArray;
	      }
         //*****************************************************************************
	      //	length(): Method that returns the length size of the String
	      //
	      //*****************************************************************************
         public int length()
         {
            return buffer.length;
         }
         //*****************************************************************************
	      //	toString(): Method that returns the 2 Strings in s and array buffer
  	      //
	      //*****************************************************************************
	      public String toString()
	      {
            String retval = "";
            for (int i = 0; i < buffer.length; i++) 
	    		  retval += buffer[i];
	    	   return retval;
         }
}
