package array;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,3,3,3);
        int k=6;
        int product=1,result=1;
        for (int i = 0; i < list.size(); i++) {
            product*=list.get(i);
            if(product>k){
                result++;
                product=list.get(i);
            }
        }
        System.out.println(result);
    }
}
