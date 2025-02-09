package ex_10_for_while_loop_program;

public class label_07_while_loop_even_number_program {

    public static void main(String[] args) {

        int i=1;

        while (i<=10){

            if(i%2==0){

                System.out.println(i + " it is a even number ");
            }else {
                System.out.println(i + "  it is a odd number ");
            }
            i++;
        }
    }
}
