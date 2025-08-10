package BasicProgram.BasicPrograms;

public class Print_Even_oddNo_07_Program {

    public static void main(String[] args) {

        int N=10;

        System.out.print("Even Numbers are: ");

        for (int i=1; i<=10; i++){

            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.print("ODD Numbers are: ");

        for(int i=1; i<=10; i++){

            if(i%2!=0){

                System.out.print(i+" ");
            }
        }
    }
}
