package BasicJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unique_7element {

public static List<Integer> uniqelemts(int[] arr){

    Map<Integer,Integer> frequesc=new HashMap<>();
    for(int i :arr){
        frequesc.put(i, frequesc.getOrDefault(i,0)+1);
    }

    List<Integer> result = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : frequesc.entrySet()) {
        if (entry.getValue() == 1) {
            result.add(entry.getKey());
        }
    }
    return result;

}


    public static void main(String[] args) {

    }
}
