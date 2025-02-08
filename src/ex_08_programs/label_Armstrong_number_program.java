package ex_08_programs;

import java.util.Scanner;

public class label_Armstrong_number_program {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int num=sc.nextInt();

        int temp =num, sum=0, digit;

        int digitcounts = String.valueOf(num).length();

        while(temp>0){

            digit =temp %10;
            sum+=Math.pow(digit,digitcounts);
            temp/=10;
        }
        if(num==sum){
            System.out.println(num +"it is Armstrong number ");
        }else {
            System.out.println(num + "it is ArmStrong number");
        }
    }
}
