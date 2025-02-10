package ex_11_progam;

public class label_04_factorial_number_program {

    public static void main(String[] args) {

        int num =5 , factorial=1;

        for(int i=1; i<=num; i++){

            factorial= factorial*i;
        }

        System.out.println(factorial);
    }
}
