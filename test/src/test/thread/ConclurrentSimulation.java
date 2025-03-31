package test.thread;

import java.util.ArrayList;
import java.util.List;

public class ConclurrentSimulation {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Thread t1 = new Thread(()-> {
            list.remove(0);
        },"t1");
        Thread t2 = new Thread(()-> {
            list.add(4);
        },"t2");
        t1.start();
        t2.start();
        list.stream().forEach(System.out::println);
    }
}
