package com.employee.blz;
import java.lang.Math;

public class Employee {
    public static final int Is_Part_time = 1;
    public static final int Is_Full_time = 2;
    public static final int Employ_Rate_Per_hr = 20 ;

    public static void main(String[] args) {

        int employ_Hr = 0;
        int employ_wage = 0;
//Computation
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
        employ_wage = Employ_Rate_Per_hr * employ_Hr;
        System.out.println("daily wage of employ is "+ employ_wage);

    }

}



