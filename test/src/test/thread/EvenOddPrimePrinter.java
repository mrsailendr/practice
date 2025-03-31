package test.thread;

import java.util.concurrent.Semaphore;

public class EvenOddPrimePrinter {

    private final int limit;
    private volatile int currentNumber = 1;
    private final Semaphore semaphore = new Semaphore(1);

    public EvenOddPrimePrinter(int limit) {
        this.limit = limit;
    }

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print even numbers
    public void printEven() {
        while (currentNumber <= limit) {
            try {
                semaphore.acquire();
                if (currentNumber % 2 == 0) {
                    System.out.println("Even Thread: " + currentNumber);
                    currentNumber++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    // Method to print odd numbers
    public void printOdd() {
        while (currentNumber <= limit) {
            try {
                semaphore.acquire();
                if (currentNumber % 2 != 0) {
                    System.out.println("Odd Thread: " + currentNumber);
                    currentNumber++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    // Method to print prime numbers
    public void printPrime() {
        while (currentNumber <= limit) {
            try {
                semaphore.acquire();
                if (isPrime(currentNumber)) {
                    System.out.println("Prime Thread: " + currentNumber);
                    currentNumber++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    public static void main(String[] args) {
        EvenOddPrimePrinter printer = new EvenOddPrimePrinter(30);

        Thread evenThread = new Thread(printer::printEven);
        Thread oddThread = new Thread(printer::printOdd);
        Thread primeThread = new Thread(printer::printPrime);

        evenThread.start();
        oddThread.start();
        primeThread.start();
    }
}

