package BasicProgram.BasicPrograms;

public class Maximum_and_Minimum_Element_in_an_Array_14_program {

    public static void main(String[] args) {

        int[] arr={3, 9, 1, 14, 7};
        int n=arr.length;

        for(int i=0; i<= n-1; i++){

            for(int j=i; j<=n-1; j++){

                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        int max=arr[arr.length-1];
        System.out.println("maximum number is: "+ max);
        System.out.println("Minimum number i : " +arr[0]);

    }
}
