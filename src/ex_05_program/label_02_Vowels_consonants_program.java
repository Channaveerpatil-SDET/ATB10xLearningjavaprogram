package ex_05_program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class label_02_Vowels_consonants_program {

    public static void main(String[] args) {

       // Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
       char ch = sc.next().charAt(0);

       ch = Character.toLowerCase(ch);

       if(ch == 'a'||ch=='e'||ch =='i'||ch =='o'||ch == 'u'){

           System.out.println(ch+ " is a vowel");
       }else {
           System.out.println(ch+ "is aconstant");
       }

    }
}
