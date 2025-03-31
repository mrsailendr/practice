package anagram;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        Map<Integer,List<Character>> map=new HashMap<Integer,List<Character>>();
        map.put(1,Arrays.asList('A','I','J','Q','Y'));
        map.put(2,Arrays.asList('B','K','R'));
        map.put(3,Arrays.asList('C','G','L','S'));
        map.put(4,Arrays.asList('D','M','T'));
        map.put(5,Arrays.asList('E','H','N','X'));
        map.put(6,Arrays.asList('U','V','W'));
        map.put(7,Arrays.asList('O','Z'));
        map.put(8,Arrays.asList('F','P'));

        String name = "Sukul";
        int sum = name.toUpperCase().chars().mapToObj(c -> (char) c).mapToInt(c -> {
            return map.entrySet().stream().filter(e -> e.getValue().contains(c)).findFirst().get().getKey();
        }).sum();
        System.out.println(sum<=9?sum:sum%9);

    }
}
