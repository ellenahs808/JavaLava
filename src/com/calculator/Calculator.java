package com.calculator;

public class Calculator {
    //constructor
    public Calculator() {
        //can leave empty but this is where you initialize values for instance field or create instructions for your class
    }

    //add method
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    //product method
    public int multiply(int a, int b) {
        return a * b;
    }

    //divide method
    public int divide(int a, int b) {
        return a/b;
    }

    //modulo method
    public int modulo(int a, int b) {
        return a % b;
    }

    //main method
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }

}
