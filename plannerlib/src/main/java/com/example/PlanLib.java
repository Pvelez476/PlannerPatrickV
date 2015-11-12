package com.example;

import java.util.*;


public class PlanLib {

    //MAIN METHOD.
    public static void main(String[] args) {


        //Code to call Calendar.
        Calendar cal = Calendar.getInstance();


        System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
        System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
        System.out.println("Calendar's Day: " + cal.get(Calendar.DATE));
        //////////////////////////////////////////////////////////////////



        //Ints to represent the days.
        int sunday = 1;
        int monday = 2;
        int tuesday = 3;
        int wednesday = 4;
        int thursday = 5;
        int friday = 6;
        int saturday = 7;

        //If Statements to call days.
        if (sunday >= 1) {
            System.out.println("Sunday");
        }

        if (monday >= 2) {
            System.out.println("Monday");
        }

        if (tuesday >= 3) {
            System.out.println("Tuesday");
        }

        if (wednesday >= 4) {
            System.out.println("Wednesday");
        }

        if (thursday >= 5) {
            System.out.println("Thursday");
        }

        if (friday >= 6) {
            System.out.println("Friday");
        }

        if (saturday >= 7) {
            System.out.println("Saturday");
        }


    }

}

