package ex_08_programs;

import java.util.Scanner;

public class label_Electricbill_programms {


    public static void main(String[] args) {

      /*  18 ) Electricity Bill Calculation (Based on Units Consumed)
:- take the input from the user of Units.
                Implement Rate Structure:
        Define the rate structure for calculating the bill based on the number of units consumed.
:- First 100 units: 0.50Rs per unit
        :- Next 100 units (101-200): 0.75Rs per unit
        :- Next 100 units (201-300): 1.20Rs per unit
        :- Above 300 units: 1.50Rs per unit*/


      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a unit number ");
        int units =sc.nextInt();

       double billamount =0;

       if(units <=0){

           System.out.println("units should not be zero");
       }else {

           if(units<=100){

               billamount = units*0.50;
           } else if (units<=200) {

               billamount = (100*0.50) +((units-100)*0.75);

           }else if (units <=300){
               billamount = (100*0.50)+(100*0.75) +((units-200)*1.20);
           }else{

               billamount =(100*0.50)+(100*0.75)+(100*1.20)+((units-300)*1.50);
           }

           System.out.println("total electricty bill is "+billamount);
       }


    }
}
