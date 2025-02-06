package ex_04_progrsm;

public class Label_FIbonacci_program {

    public static void main(String[] args) {

        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 2; i <= n; ++i) {
            System.out.println(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }


        int no = 10, num1 = 0, num2 = 1;

        for (int i = 1; i <= no; i++) {

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println("," + num3);

        }
    }
}
