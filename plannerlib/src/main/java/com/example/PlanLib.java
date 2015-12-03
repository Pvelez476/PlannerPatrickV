package com.example;

import java.util.Calendar;

import java.util.Scanner;


public class PlanLib {

    //MAIN METHOD.
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int start = 0;

        System.out.println("Hello! Welcome to the Planner.");
        System.out.println("");

        System.out.println("Today's Date is:");


        //Code to call Calendar.
        System.out.println(cal.get(Calendar.DATE)+"/" + cal.get(Calendar.MONTH)+"/" + cal.get(Calendar.YEAR));



        // Code to call Time.
        System.out.println("");
        System.out.println("Today's Time is:");
        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + cal.get(Calendar.AM_PM));



        System.out.println("");
        System.out.println("Enter a Date:");

        Scanner inputWords = new Scanner(System.in);


        if (inputWords.hasNextLine()) {
            System.out.println("Enter the time");
            Scanner inputTime = new Scanner(System.in);


            if (inputTime.hasNextLine()) {
                System.out.println("Enter Your Task");
                Scanner inputTask = new Scanner(System.in);


                String words = inputWords.nextLine();
                String time = inputTime.nextLine();
                String task = inputTask.nextLine();



                int finish = 1;
                {
                    while (start < finish) {
                        System.out.println("");


                        System.out.println("You will complete:  "  +  task  +   " On: " +  words  + " At " +  time  +  " ......Or else! ");
                        start = 1;
                    }





                }

            }
        }
    }
}