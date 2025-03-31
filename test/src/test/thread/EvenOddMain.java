package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EvenOddPrime {
    int n=0,limit=10;
    public synchronized void even()
    {
        while (n<=limit)
        {
            if(n%2==0){
                System.out.println("even: "+n);
                n++;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void odd()
    {
        while (n<=limit)
        {
            if(n%2!=0){
                System.out.println("odd: "+n);
                n++;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class EvenOddMain {
    public static void main(String args[]){
        EvenOddPrime obj = new EvenOddPrime();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()-> {
            obj.even();
        });
        executorService.submit(()-> {
            obj.odd();
        });
        executorService.shutdown();
    }
}