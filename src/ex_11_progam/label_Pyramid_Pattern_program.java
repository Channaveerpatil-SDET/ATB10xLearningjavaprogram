package ex_11_progam;

public class label_Pyramid_Pattern_program {

    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {

            for (int j = 1; j < i; j++) {

                if (i % 2== 0) {

                    System.out.print("*");
                }

            }
            System.out.println( );
        }
    }
}
