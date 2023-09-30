package org.example;

public class Calcolatrice {
    public Calcolatrice(){
        a = 0;
        b = 0;
    }

    public double sum(double a, double b){
        return a + b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double subtraction(double a, double b){
        return a - b;
    }

    public double division(double, double b){
        if (b != 0){
            return a/b;
        } else {
            return 0;
        }
    }
    private double a,b;
}
