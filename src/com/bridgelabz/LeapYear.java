package com.bridgelabz.basic;

public class LeapYear {
    public static void main(String[] args){
        int year=2012;


        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}