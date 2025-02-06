package ex_06_program;

import java.util.Scanner;

public class label_AgetoVote_program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to verify age");
        int age = sc.nextInt();

        if(age>=18){

            System.out.println("your eligible to vote");
        }else {
            System.out.println("not eligible to vote");
        }
    }
}
