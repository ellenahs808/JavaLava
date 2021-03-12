package com;

public class MathEquation {
    double leftVal;  //field
    double rightVal;
    char opCode;
    double result;

    public MathEquation() { } // default constructor


    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    void execute() {
        switch (opCode) {
            case ('a'):
                result += leftVal + rightVal;
                break;
            case ('s'):
                result -= leftVal - rightVal;
                break;
            case ('m'):
                result *= leftVal - rightVal;
                break;
            case ('d'):
                result /= leftVal - rightVal;
                break;
            default:
                System.out.println("Invalid operation code: " + opCode);
                result = 0.0d;
                break;
        }
    }
}
