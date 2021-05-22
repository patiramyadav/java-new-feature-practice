package org.patiram.lambda;

public class TestRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("This is thread");
        runnable.run();
    }
}
