package com.employee.blz;
import java.lang.Math;

public class Employee {
    public static final int Is_Part_time = 1;
    public static final int Is_Full_time = 2;
    public static final int Employ_Rate_Per_hr = 20;
    public static final int Num_of_working_days = 20;
    public static final int Max_working_hr = 5;

    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation");

        int employ_Hr = 0;
        int employ_wage = 0;
        int Total_emp_Wage = 0;
        int totalEmployee_Hr = 0;
        int total_working_days = 0;

//Computation
        while (totalEmployee_Hr < Max_working_hr &&
                total_working_days <= Num_of_working_days){
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case Is_Part_time:
                    employ_Hr = 4;
                    break;
                case Is_Full_time:
                    employ_Hr = 8;
                    break;
                default:
                    employ_Hr = 0;
            }

            totalEmployee_Hr += employ_Hr;
            System.out.println("days:" + total_working_days + "working hour:" + employ_Hr);
        }
        employ_wage = Employ_Rate_Per_hr * totalEmployee_Hr;
        System.out.println("Total wage of employ for a month " + employ_wage);


    }
}