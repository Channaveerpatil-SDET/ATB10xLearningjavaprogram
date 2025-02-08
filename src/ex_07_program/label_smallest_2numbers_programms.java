package ex_07_program;

import java.util.Scanner;

public class label_smallest_2numbers_programms {

    public static void main(String[] args) {
         // Find the Smallest of Two Numbers.

        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter a number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number 2 : ");
        int num2 = sc.nextInt();

        if(num1<num2){

            System.out.println(num1 + " num1 is smallest value");
        } else if (num2<num1) {
            System.out.println(num2 + " num2 is smallest value");

        }else{
            System.out.println("values are not numbers");
        }
        sc.close();

    }
}
