package BasicProgram.BasicPrograms;

public class Largestnumber_04_Program {

    public static void main(String[] args) {


        int a = 20, b = 45, c = 30;

        if (a > b && a > c) {

            System.out.println("a is largest number : " + a);
        } else if (b > a && b > c) {
            System.out.println("b is largest number : " + b);
        } else if (c > a && c < b) {
            System.out.println("c is largest number: " + c);
        } else {
            System.out.println(" No value is greater ");
        }
    }
}
