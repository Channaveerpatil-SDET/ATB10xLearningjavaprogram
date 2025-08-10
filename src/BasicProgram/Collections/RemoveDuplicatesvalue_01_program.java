package BasicProgram.Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Remove DuplicatesValues
public class
RemoveDuplicatesvalue_01_program {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("apple", "banana", "apple", "orange", "banana");


        Set<String> uniques= new LinkedHashSet<>(names);

        System.out.println("Orginial names:"+names);
        System.out.println("unqiues values:" + uniques);
    }

}
