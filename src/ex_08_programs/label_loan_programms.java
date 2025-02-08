package ex_08_programs;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ServiceLoader;

public class label_loan_programms {

    public static void main(String[] args) {

     /*   Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
* Take the below User info and store it into the variables:
        Age (integer)
        Salary (double or float)
        Credit Score (integer)
                Age Validation:
:- Check if the age is a positive integer.
:- Ensure the age is at least 18 years old.
:- Max age can be 80.
        Salary Validation:
:- Check if the salary is a positive number.
:- Define a minimum salary threshold (e.g., 30,000).
        Credit Score Validation:
:- Check if the credit score is a positive integer.
:- Define a minimum credit score threshold (e.g., 650).
:- Max credit score threshold (e.g., 850).
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Age :");
         int age =sc.nextInt();
        System.out.print("Enter a Salary :");
        double  salary =sc.nextInt();

        System.out.print("Enter a creditscore :");
        int  creditscore =sc.nextInt();


        if(age<=0){

            System.out.println("number should be positive number ");
        } else if (age<18) {
            System.out.println("minimum age should be 18");

        } else if (age>80) {
            System.out.println("maxmium age should be 80 ");
        }

        if(salary<0){
            System.out.println("salary should in positive number");
        } else if (salary<30000) {
            System.out.println("Salary should not be less then 30000");

        }

        if(creditscore<0){

            System.out.println("credit score should be postive");
        } else if (creditscore<650) {

            System.out.println(" credit score  should not be less then 650");

        } else if (creditscore>850) {
            System.out.println("maximum credit score should be 850");

        }

        if(age>=18 &&age<=80 && salary>=30000 && creditscore>=650&& creditscore<=850){

            System.out.println("your eligible for loan ");
        }else {
            System.out.println(" your not eligible for loan ");
        }
    }

}
