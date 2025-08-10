package BasicProgram.BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class Duplicates_in_an_Integer_Array_15_Program {


    public static  void main(String[] args) {

        int[] arr={10, 20, 30, 10, 40, 50, 20};

        Map<Integer, Integer> countmap= new HashMap<>();

        for(int num:arr){

            countmap.put(num, countmap.getOrDefault(num,0)+1);

        }

        for(Map.Entry<Integer,Integer> entry: countmap.entrySet()){

            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
