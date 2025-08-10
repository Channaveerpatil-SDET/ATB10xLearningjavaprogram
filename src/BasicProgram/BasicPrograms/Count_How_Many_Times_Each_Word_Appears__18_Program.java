package BasicProgram.BasicPrograms;

import java.util.LinkedHashSet;

public class Count_How_Many_Times_Each_Word_Appears__18_Program {

    public static void main(String[] args) {

       String s="Java is Java and Java is powerful";
       String[] s1= s.split(" ");

        LinkedHashSet<String>set= new LinkedHashSet<>();

        for(int i=0; i<s1.length; i++){

            set.add(s1[i]);
        }

        for(String words:set){
            int count=0;

            for (int i=0; i<s1.length; i++){

                if(words.equals(s1[i])){

                    count++;
                }
            }

            System.out.println(words+" "+count);
        }




    }
}
