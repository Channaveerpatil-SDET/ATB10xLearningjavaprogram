package ex_09_programms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class label_number_divisible_programms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
       int num = sc.nextInt();
       
       if(num%5==0 && num%11 ==0){

           System.out.println(num + ": number is divisible by 5  and 11 ");
       } else  {

           System.out.println(num +": number is not divisible by 5 and 11");
           
       }
       sc.close();
    }
}
