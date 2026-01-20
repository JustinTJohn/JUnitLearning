package org.example;

public class SimpleCalculator {
    public int add(int a, int b){
        return a + b;
    }

    public int divide(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Any number divided by 0 returns Infinity!");
        }
        return a/b;
    }
}
