package ex_11_progam;

import java.util.Scanner;

public class label_03_multiplication_program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for multiplication ");

        int number = sc.nextInt();

        for(int i =1; i<=10; i++){

            System.out.println(number+ " * "+ i +" = "+(number * i));
        }
        sc.close();
    }
}
