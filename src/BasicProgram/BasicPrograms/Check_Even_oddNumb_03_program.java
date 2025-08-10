package BasicProgram.BasicPrograms;

public class Check_Even_oddNumb_03_program {

    public static void main(String[] args){


    /*    int num=7;

        if(num %2==0){

            System.out.print("even numb");
        }else{

            System.out.print("odd numb");
        }*/

        int num=7;

        if((num & 1)==0){
            System.out.print("even numb");

        }else {
            System.out.print("odd numb");
        }

    }
}
