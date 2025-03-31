package hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(2);
        list.add(5);
        migratoryBirds(list);
    }
    
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0,maxKey = 0;
        for (Integer i : arr) {
            Integer value = map.get(i);
            int occurance = (value!=null? value:0);
            occurance = occurance+1;
            if(max<occurance || (max==occurance && maxKey>i))
            {
                maxKey=i;
                max= occurance;
            }
            map.put(i, occurance);
        }
        return maxKey;
    }
}
