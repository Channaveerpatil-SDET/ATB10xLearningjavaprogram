package BasicProgram.Collections;

import java.util.HashSet;

public class Count_Frequency_of_Characters_Using_Map_02_Program {

    public static void main(String[] args) {

        String s = "hello world";

        HashSet<Character> set= new HashSet<Character>();

        for(int i=0; i<s.length(); i++){

             char ch=s.charAt(i);
             if(ch!=' '){
                 set.add(s.charAt(i));
             }

        }

        for(char ch:set){
            int count=0;

            for(int i=0; i<s.length(); i++){

                if(ch==s.charAt(i)){
                    count++;
                }
            }
            System.out.println(ch+" "+count);
        }

    }
}
