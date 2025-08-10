package BasicProgram.BasicPrograms;

import java.util.LinkedHashSet;

public class Count_the_Frequency_EachCharacter_08_Program {

    public static void main(String[] args) {

        String s="Selenium";

        LinkedHashSet<Character> set= new LinkedHashSet<>();

        for (int i=0; i<s.length(); i++){

            set.add(s.charAt(i));
        }

        for(char ch: set){
            int count =0;

            for (int i=0; i<s.length(); i++){

                if(ch==s.charAt(i)){

                    count++;
                }
            }
            System.out.println(ch+":"+" "+count);
        }
    }
}
