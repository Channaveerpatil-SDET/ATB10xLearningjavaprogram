package BasicProgram.BasicPrograms;

public class ReverseString_01_Program {

    public static void main(String[] args){

        //Input: "Hello World"
        //Output: "dlroW olleH"

    String s="Hello world";

    for(int i=s.length()-1; i>=0; i--)

    {

        System.out.print(s.charAt(i));
    }
    }
}
