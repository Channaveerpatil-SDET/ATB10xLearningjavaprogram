package BasicProgram.BasicPrograms;

import java.util.Arrays;

public class Check_if_Two_Strings_are_Anagrams_11_Program {


    public static void main(String[] args) {

        String s1="Listen";
        String s2="silent";

        char[] a= s1.toLowerCase().toCharArray();
        char[] b=s2.toLowerCase().toCharArray();


        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){

            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
