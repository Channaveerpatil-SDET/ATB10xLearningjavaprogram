package BasicProgram.BasicPrograms;

public class SwappingofNumbers_09_Program {

    public static void main(String[] args) {


        int a=10, b=20;

       // System.out.println("Before Swapping: "+a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a : "+ a);
        System.out.println("After swapping  b: " + b);
    }
}
