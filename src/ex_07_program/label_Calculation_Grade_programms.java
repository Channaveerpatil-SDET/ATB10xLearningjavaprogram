package ex_07_program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class label_Calculation_Grade_programms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Grade");
         int score = sc.nextInt();
     int grade= 0;
         if(score>=90 && score <=100){

             System.out.println(" grade is A");
         } else if (score>=80 && score <=89) {

             System.out.println(score+"grade is B");
             
         } else if (score >= 60 &&  score<=69) {

             System.out.println(score+" grade  is C");
             
         } else if (score >=50 && score <=59) {

             System.out.println(score+" grade is D");
             
         } else if (score >=40 && score <=49) {

             System.out.println(score+" grade is E");
             
         }else {
             System.out.println(score+"it is fail ");
         }

    }
}
