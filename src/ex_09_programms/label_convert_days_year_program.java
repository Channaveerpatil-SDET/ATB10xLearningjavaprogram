package ex_09_programms;

import java.util.Scanner;

public class label_convert_days_year_program {

    public static void main(String[] args) {

       //Convert Days into Years, Months, and Days.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a days");
        int days =sc.nextInt();

        int years = days/365;
        int remaining_days = days % 365;

        int months = remaining_days / 30;
        int  days_left = remaining_days % 30;

        System.out.println( days +" days = "+ years + "years," + months+ " months, and " +days_left + " days");
        sc.close();
    }
}
