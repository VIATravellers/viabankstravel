/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Othman
 */
import java.util.GregorianCalendar;

/**
 *
 * @author Othman
 */
public class MyDate {
     private int day;
   private int month;
   private int year;

   public MyDate()
   {
      GregorianCalendar currentDate = new GregorianCalendar();

      int currentDay = currentDate.get(GregorianCalendar.DATE);
      int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
      int currentYear = currentDate.get(GregorianCalendar.YEAR);
      day = currentDay;
      month = currentMonth;
      year = currentYear;
   }

   public MyDate(int d, int m, int y)
   {
      day = d;
      month = m;
      year = y;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public void setDay(int day)
   {
      this.day = day;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public String toString()
   {
      return  day + "/" + month + "/" + year;

   }

   public boolean isLeapYear()
   {
      if (year % 4 == 0 && year % 100 != 0)
      {
         return true;
      }
      else if (year % 400 == 0)
      {
         return true;
      }
      else
      {
         return false;
      }

   }

   public int daysInMonth()
   {
      int daysInMonth = -1;
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12)
      {
         daysInMonth = 31;
      }
      else if (month == 4 || month == 6 || month == 9 || month == 11)
      {
         daysInMonth = 30;

      }
      else
      {
         if (isLeapYear())
         {
            daysInMonth = 29;
         }
         else
         {
            daysInMonth = 28;

         }

      }
      return daysInMonth;
   }

   

   

   public void nextDay()
   {
      if (day < daysInMonth())
      {
         day++;
      }
      else
      {
         day = 1;

         if (month == 12)
         {
            month = 1;
            year++;
         }
         else
         {
            month++;
         }
      }
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof MyDate) )
            
      {
         return false;
      }
     
      MyDate other =(MyDate)obj;
      return day==other.day&&
             month==other.month&&
             year==other.year;
      
   }

   public MyDate copy()
   {
      return new MyDate(day, month, year);
   }

   public MyDate(MyDate obj)
   {
      day = obj.getDay();
      month = obj.getMonth();
      year = obj.getYear();
   }

   public void nextDays(int days)
   {
      for (int i = 0; i <= days; i++)
      {
         nextDay();
      }

   }

   public static MyDate today()
{
  // GregorianCalendar currentDate = new GregorianCalendar();
 //  int currentDay = currentDate.get(GregorianCalendar.DATE);
//   int currentMonth = currentDate.get(GregorianCalendar.MONTH)+1;
//   int currentYear = currentDate.get(GregorianCalendar.YEAR); 
//  MyDate d = new MyDate(currentDay, currentMonth, currentYear);
//  return d;
  
  return new MyDate();
}

   public boolean isBefore(MyDate date2)
   {
      if (year < date2.year)
      {
         return true;
      }
      else if (year > date2.getYear())
      {
         return false;
      }
      else
      {
         if (month < date2.month)
         {
            return true;

         }
         else if (month > date2.month)
         {
            return false;
         }
         else
         {
            if (day < date2.day)
            {
               return true;
            }
            else
            {
               return false;
            }
         }
      }
   }
   public boolean isBetween(MyDate date1,MyDate date2)
   {

      if(date1.isBefore(this)&&this.isBefore(date2))
      {
         return true ;
      }
      return false ;
   }
 
}

