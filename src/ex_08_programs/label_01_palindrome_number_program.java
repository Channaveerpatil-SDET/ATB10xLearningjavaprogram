package ex_08_programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class label_01_palindrome_number_program {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome");
        int num= sc.nextInt();

        int rev =0;
        int temp=num;

        while(temp!=0){

            rev=rev*10+ temp%10;

            temp =temp/10;
        }

        if(num==rev){

            System.out.println(num +"it is a palindrome number");
        }else {
            System.out.println(num+ "it is not a palindrome number ");
        }
    }
}
