package ex_03_Ternaryoperator;

public class Label_01_program {

    public static void main(String[] args) {

        int x= 10;
        int y= 20;

        int max = x>y?x:y;

        String result = x>y?"x is greatear":"y is greater";
        System.out.println("The maximum value is :"+max);
        System.out.println(result);
    }
}
