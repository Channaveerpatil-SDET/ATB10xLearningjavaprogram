package ex_05_program;

public class label_03_palindrome_program {

    public static void main(String[] args) {

       String s="AMMA";

String reverse = "";
       for(int i=s.length()-1;i>=0;i--){

            reverse+=s.charAt(i);
       }


        System.out.println(reverse);

        if(s.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("Non Palindrome");
        }

    }
}
