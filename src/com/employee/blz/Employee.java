package com.employee.blz;
import java.lang.Math;

public class Employee {
   public static void main(String args[]){
       int present = 1;
       int  empcheck = (int) Math.floor((Math.random()*10)%2);
       if(empcheck == present){
           System.out.println("Employee is present");

       } else{
           System.out.println("Employee is Absent");
       }
   }


}
