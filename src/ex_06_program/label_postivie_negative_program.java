package ex_06_program;

import java.util.Scanner;

public class label_postivie_negative_program {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        if(num==0){

            System.out.println("it is positive number");
        }else if(num!=0){

            System.out.println(" it is negative number");
        }else{

            System.out.println(" it is not a number ");
        }
    }
}
