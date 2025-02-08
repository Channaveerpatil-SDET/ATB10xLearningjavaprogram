package ex_07_program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class label_ATM_program {


    /* Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:

The amount should be greater than zero.

The amount should be a multiple of 100 (common ATM rule).

The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.
*/

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  amount to withdraw:");
   int amount = sc.nextInt();

   int balance =10000;

   if(amount<0){

       System.out.println("Error: Amount should not be greater then zero");
   } else if (amount%100!=0) {

       System.out.println("Error : Amount should multiple of 100");

   }else if (amount> balance){

       System.out.println("Error: Insufficient balance.");
   }
   else{
       balance= balance-amount;
       System.out.println("withdrawal successfully remaining balance  is "+balance);
   }


    }
}
