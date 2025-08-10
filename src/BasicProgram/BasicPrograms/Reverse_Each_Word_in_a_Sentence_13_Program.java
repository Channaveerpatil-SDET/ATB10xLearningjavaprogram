package BasicProgram.BasicPrograms;

public class Reverse_Each_Word_in_a_Sentence_13_Program {

    public static void main(String[] args) {


        String s = "Java is fun";
        String[] s1 = s.split(" ");

        for (String words : s1) {

            for(int i=words.length()-1; i>=0; i--){

                System.out.print(words.charAt(i));
            }
            System.out.print(" ");
        }

    }
}
