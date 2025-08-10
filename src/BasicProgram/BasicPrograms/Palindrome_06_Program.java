package BasicProgram.BasicPrograms;

public class Palindrome_06_Program {

    public static void main(String[] args) {

        String s="Race car";

        String s1=s.replace(" ","").toLowerCase();

        String rev="";

        for (int i=s1.length()-1; i>=0;i--){

            rev+=s1.charAt(i);
        }

        if(s1.equals(rev)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
