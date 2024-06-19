package com.examples;

public class Calculator {
    private int total;

    public void add(int value) {
        total += value;
    }

    public void reset() {
        total = 0;
    }

    public int getTotal() {
        return total;
    }
}

