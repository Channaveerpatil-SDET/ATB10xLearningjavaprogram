package BasicProgram.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_a_Map_by_Values {

    public static void main(String[] args) {

        //Apple", 5, Banana", 2, "Mango", 10, "Orange", 7

        Map<String,Integer> mapcount= new HashMap<>();

        mapcount.put("Apple",5);
        mapcount.put("Banana",2);
        mapcount.put("Mango",10);
        mapcount.put("Orange",7);

        List<Map.Entry<String,Integer>> list= new ArrayList<>(mapcount.entrySet());

        list.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted Map by Value:");

        for(Map.Entry<String,Integer> entry:list){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


    }
}
