package BasicProgram.BasicPrograms;

public class
Count_Vowels_Consonants_02_Program {



        //Input: "Java Programming"
       // Vowels: 5
        //Consonants: 9

        public static void main(String[] args) {

            String s="Java programing";
            s= s.toLowerCase();
            int  vowelcount=0, constanstcount=0;

            for(int i=0; i<s.length(); i++){

                char ch=s.charAt(i);

                if(ch >='a' && ch <='z'){

                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                        vowelcount++;
                    }else{
                        constanstcount++;
                    }
                }

            }


            System.out.println("vowels: "+ vowelcount);

            System.out.println("constanst: "+ constanstcount);
        }
    }
