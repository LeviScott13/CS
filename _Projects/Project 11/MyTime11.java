//**********************************************************************************************************
//Purpose: Using no argument constructors and overloaded methods to display time and time added values
//
//
//Input:   None
//
//Output:  Time and Time added values
//
//Authors: Levi Sutton
//
//Course:  CS1301
//
//Program: MyCourse10
//
//Date:    4/14/2017
//**********************************************************************************************************
class MyTime11 
{
   private int hour;
   private int minute;
   private int second;

   public MyTime11() 
   { 
      this(System.currentTimeMillis());
   }

   public MyTime11(long elapsedTime) 
   {
      setTime(elapsedTime);
   }
  
   public MyTime11(int hour, int minute, int second) 
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   public void incrementSecond()
   {
      second++;
      if (second == 60)
      {
         second = 0;
         minute++;
      } 
   }
   public void incrementSecond(int n)
   {
      second += n;
      if (second >= 60)
      {
            second = (second + n) - 60;
            minute++;
      }
   }
   public void incrementMinute()
   {
      minute++;
      if (minute == 60)
      {
         minute = 0;
         hour++;
      } 
   }
   public void incrementMinute(int n)
   {
      minute += n;
      if (minute >= 60)
      {
         minute -= 60;
         hour++;
      }
   }
   public void incrementHour()
   {
      hour++;
      if (hour == 24)
      {
         hour = 0;
      } 
   }
   public void incrementHour(int n)
   {
      hour += n;
      if (hour >= 24)
      {
         hour -= 24;
      }
   }
   public int getHour() 
   {
      return hour;
   }
   public int getMinute() 
   {
      return minute;
   }
   public int getSecond() 
   {
      return second;
   }
  
   public void setTime(long elapsedTime) 
   {
      // Obtain the total seconds since the midnight, Jan 1, 1970
      long totalSeconds = elapsedTime / 1000;

      // Compute the current second in the minute in the hour
      second = (int)(totalSeconds % 60);

      // Obtain the total minutes
      long totalMinutes = totalSeconds / 60;

      // Compute the current minute in the hour
      minute = (int)(totalMinutes % 60);

      // Obtain the total hours
      int totalHours = (int)(totalMinutes / 60);

      // Compute the current hour
      hour = (int)(totalHours % 24);
   }
}
