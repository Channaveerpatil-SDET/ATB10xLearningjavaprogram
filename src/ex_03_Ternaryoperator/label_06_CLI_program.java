package ex_03_Ternaryoperator;

public class label_06_CLI_program {

    //Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {

        String name = args[0];
        int  Age =Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println( "Name value is : "+ name);
        System.out.println( "Age value is : "+ Age);
        System.out.println( "Salary value is : "+ salary);
    }
}
