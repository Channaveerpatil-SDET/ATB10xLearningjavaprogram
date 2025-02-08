package ex_07_program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class label_Largest_three_number_programms {

    public static void main(String[] args) {

        //Find the Largest of Three Numbers.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number 1");
         int num1 = sc.nextInt();
        System.out.println("Enter a number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter a number 3");
        int num3 = sc.nextInt();


        if(num1>num2 && num1>num3){

            System.out.println(num1 +"num1 is largest value");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2+ " num2 is largest value");

        } else if (num3>num1 && num3>num2) {
            System.out.println(num3 + " is largest value");
        }else{
            System.out.println("it is not numbers");
        }

    }
}
