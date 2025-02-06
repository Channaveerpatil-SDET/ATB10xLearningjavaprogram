package ex_06_program;

import java.util.Scanner;

public class label_even_odd_program {

    public static void main(String[] args) {


        int i=100;

        if(i%2==0)
        {

            System.out.println("it is even number");
        }else{
            System.out.println("it is a odd number");
        }

//below program using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();

        if(a%2==0){

            System.out.println(" it is even number");
        }else {
            System.out.println(" it is a odd number");
        }
    }
}
