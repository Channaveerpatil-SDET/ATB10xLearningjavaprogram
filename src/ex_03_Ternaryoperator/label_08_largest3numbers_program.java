package ex_03_Ternaryoperator;

public class label_08_largest3numbers_program {

    public static void main(String[] args) {

        int a=40, b=500,c=600;

        int largestno =(a>b)?(a>c?a:c):(b>c?b:c);
        String largestNumber = (a>b)?(a>c?"a is greater value":"c is greater value"):(b>c? "b is greater value":"c is the greater value");


        System.out.println(largestno);
        System.out.println(largestNumber);
    }
}
