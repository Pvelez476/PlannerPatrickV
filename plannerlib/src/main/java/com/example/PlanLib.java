package com.example;

import java.util.Calendar;

import java.util.Scanner;


public class PlanLib {

    //MAIN METHOD.
    public static void main(String[] args) {



        int start = 0;
        System.out.println("Enter the Day:");
        Scanner inputFromUser = new Scanner (System.in);
        int finish;
        if (inputFromUser.hasNextLine()){

             finish = inputFromUser.nextInt();
            System.out.println("Enter the time");
        }else{
             finish =1;
            System.out.println("Error");
        }

        Scanner inputWords = new Scanner(System.in);
        String words = inputWords.nextLine();
        while (start < finish) {
            System.out.println(words);
            start +=1;
        }

        //Code to call Calendar.
       // Calendar cal = Calendar.getInstance();


       // System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
       // System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
       // System.out.println("Calendar's Day: " + cal.get(Calendar.DATE));

       // Code to call Time.
       // System.out.println("The Hour is: " + cal.get(Calendar.HOUR_OF_DAY));
       // System.out.println("The Minute is: " + cal.get(Calendar.MINUTE));
       // System.out.println("The Second is: " + cal.get(Calendar.SECOND));
        //////////////////////////////////////////////////////////////////


    }

}