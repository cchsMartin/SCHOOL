package com.company;

import java.util.Scanner;

class fraction{

    double num;
    double den;


    public fraction(int num, int den){
        this.num = num;
        this.den = den;
    }

    public fraction(){
        num = 1;
        den = 2;
    }

    public void add(double numA, double denA, double numB, double denB){
        double hold = denA;
        numA *= denB;
        numB *= hold;
        denB *= hold;
        double newNum = numA + numB;
        String answer = Integer.toString((int)newNum) + " / " + (int)denB;
        System.out.println(answer);

    }

    public void multiply(double numA, double denA, double numB, double denB){
        denA *= denB;
        numA *= numB;
        String answer = Integer.toString((int)numA) + " / " + (int)denA;
        System.out.println(answer);
    }

    public void divide(double numA, double denA, double numB, double denB){
        double hold = numB;
        numB = denB;
        denB = hold;
        denA *= denB;
        numA *= numB;
        String answer = Integer.toString((int)numA) + " / " + (int)denA;
        System.out.println(answer);
    }

    public void sub(double numA, double denA, double numB, double denB){
        double hold = denA;
        denA *= denB;
        numA *= denB;
        numB *= hold;
        double newNum = numA - numB;
        String answer = Integer.toString((int)newNum) + " / " + (int)denA;
        System.out.println(answer);
    }


}

public class Main {

    public static void main(String[] args) {
        fraction one = new fraction();
        one.divide(9,1,12,1);
    }
}
