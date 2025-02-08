package ex_07_program;

import java.util.Scanner;

public class label_leap_year_programms {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year ");
       int  Leapyear = sc.nextInt();


       if(Leapyear%4==0){

           System.out.println(Leapyear +"it is a leapyear");
       } else if (Leapyear%100==0) {

           System.out.println(Leapyear + "it is not a leapyear");

       } else if (Leapyear %400==0) {

           System.out.println(Leapyear + "it is a leapyear");

       }else {

           System.out.println(" it is not leapyear");
       }


    }

}
