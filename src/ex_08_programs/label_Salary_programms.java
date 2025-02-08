package ex_08_programs;

import java.util.Scanner;

public class label_Salary_programms {


    public static void main(String[] args) {


   /*     Calculate Bonus Based on Salary and Years of Experience.
:- take the salary and Year info from the User.
        Implement Bonus Calculation Logic:
        Define the bonus structure based on salary and years of experience.
:- If years of experience is less than 1 year: No bonus.
:- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
:- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
:- If years of experience is greater than 6 years: Bonus is 15% of the salary.*/



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Salary ");
       double salary = sc.nextInt();

        System.out.println("Enter a year ");
        int  expirence  = sc.nextInt();


        double bounce = 0;

        if(salary<0){

            System.out.println("salary should not be less then zero");
        } else if (expirence <0) {
            System.out.println("expirence should not be less then zero");

        }else {

            if(expirence>= 1 &&expirence <=3){
                bounce = salary* 0.05;
            } else if (expirence>=4 && expirence <=6 ) {

                bounce = salary *0.10;

            } else if (expirence>6) {
                bounce= salary *0.15;

            }

            System.out.println("Enter your bounce amount is "+ bounce);
        }


    }
}
