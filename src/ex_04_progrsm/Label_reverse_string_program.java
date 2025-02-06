package ex_04_progrsm;

public class Label_reverse_string_program {

    public static void main(String[] args) {

        String str = "Automation";
        StringBuilder   reverse = new StringBuilder(str).reverse();

        System.out.println(reverse);


        String str2  = "CHannaveer";

        StringBuilder revv = new StringBuilder(str2).reverse();

        System.out.println(revv);
    }
}
