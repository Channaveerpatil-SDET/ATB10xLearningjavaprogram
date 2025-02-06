package ex_06_program;

import java.util.Scanner;

public class label_max_2numbers_program {

    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for A");
        int a =s.nextInt();
        System.out.println("Enter a number for B");
        int b =s.nextInt();

        if(a>b){

            System.out.println("a is  mamimum value");
        } else if(b<a){

            System.out.println("B is maximum value");
        }else if(a==b){

            System.out.println("both are equals");
        }else{

            System.out.println("A and b are not a number");
        }

    }
}
