package BasicProgram.BasicPrograms;

public class First_Non_Repeated_Character_in_aString_12_program {

    public static void main(String[] args) {

        String s="success";

        for(int i=0; i<s.length(); i++){

            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                System.out.println(ch);
                return;
            }
        }
    }
}
