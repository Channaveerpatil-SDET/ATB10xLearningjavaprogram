package BasicProgram.BasicPrograms;

public class Sort_an_Array_Without_Using_Arrays_sort_17_Program {

    public static void main(String[] args) {

        int[] arr={5,1,4,3,2};

        int n= arr.length;

        for(int i=0; i<n-1; i++){


            for(int j=0; j<n-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted arrys");

        for(int num:arr){

            System.out.print(num+" ");
        }
    }
}
