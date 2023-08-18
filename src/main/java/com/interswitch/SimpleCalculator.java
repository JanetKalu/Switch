package com.interswitch;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public double addTwoNumbers() {
        return this.firstNumber + this.secondNumber;
    }
    public double getFirstNumber() {return this.firstNumber; }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() { return secondNumber; }

    public void setSecondNumber(double secondNumber) { this.secondNumber = secondNumber; }
}
