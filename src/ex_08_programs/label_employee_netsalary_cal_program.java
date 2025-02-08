package ex_08_programs;

import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class label_employee_netsalary_cal_program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a basicsalary ");

      double basicpay = sc.nextDouble();

      double da = 0.50 *basicpay;
      double hra  =0.20 * basicpay;

      double grossalary = basicpay +da+hra;

      double tax =0;

      if(grossalary>1000000){

          tax =0.30*grossalary;
      } else if (grossalary>500000) {

          tax= 0.20* grossalary;
      } else if (grossalary>250000) {
          tax =0.50 * grossalary;

      }
        double netsalary = grossalary+tax;

        System.out.println("Gross salary RS: " + grossalary);
        System.out.println("Tax amount is RS: " + tax);
        System.out.println("Net salary is RS : "+ netsalary);
    }
}
