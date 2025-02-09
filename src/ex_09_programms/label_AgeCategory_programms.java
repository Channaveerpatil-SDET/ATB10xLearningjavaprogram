package ex_09_programms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class label_AgeCategory_programms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Age number :");

        int age = sc.nextInt();

        if(age>=0 && age<=12){

            System.out.println(age + ": child category");
        } else if (age>=13 && age<=19 ) {
            System.out.println(age + ":  Teenager category ");
            
        } else if (age>=20 && age<=64) {
            System.out.println(age + ": Adult category");
            
        }else if (age>=65){
            System.out.println(age + ": Senior citizen category ");
        } else if (age<0) {
            System.out.println("it is not a number ");

        }
        sc.close();
    }
}
