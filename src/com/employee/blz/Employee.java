package com.employee.blz;
import java.lang.Math;

public class Employee {
   public static void main(String args[]){
       int full_day_hr = 8;
       int part_time_hr = 8;
       int dailywage = 20;
       int present = 1;
       int  empcheck = (int) Math.floor((Math.random()*10)%2);
       if(empcheck == present){
           System.out.println("Employee is present");
           int wage = dailywage * full_day_hr + dailywage * part_time_hr;
           System.out.println("daily wage of employee " + dailywage);
           System.out.println(wage);

       } else{
           System.out.println("Employee is Absent");
       }
   }


}
