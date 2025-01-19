package ex_03_Ternaryoperator;

public class label_03_Nested_program {

    public static void main(String[] args) {

        int number =15;

        String result = (number>10)?(number>20?"number is greater than 20":"number is greater than 10"):"number is less than 10";

        System.out.println(result);
    }
}
