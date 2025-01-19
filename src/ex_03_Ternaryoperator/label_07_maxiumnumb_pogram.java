package ex_03_Ternaryoperator;

public class label_07_maxiumnumb_pogram {

    public static void main(String[] args) {

        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.


         //values {1000,5000}
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        String result = (a>b)? "A value is greater":"B value is greater";

        System.out.println(result);

    }
}

