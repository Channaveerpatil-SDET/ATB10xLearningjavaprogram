package ex_04_progrsm;

public class Label_Palindrome_program {

    public static void main(String[] args) {


        String str = "AmmA";

        StringBuilder rev= new StringBuilder(str).reverse();

        if(str.equals(rev.toString())){

            System.out.println("Givem string is palindrome");
        }else{

            System.out.println("Given string is not a palindrome");
        }

        String str2 ="channaver";

        StringBuilder rev2 = new StringBuilder(str2).reverse();

        if(str2.equals(rev2.toString())){

            System.out.println("given string is  a palindrome");
        }
        else{

            System.out.println("Given Sting is not a palindrome");
        }
    }
}
