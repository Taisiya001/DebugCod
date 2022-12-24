package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            int d = 0;
            int []Array = {1,2,3,4,5,6,7,8,9};
            double caughtRes1 = Array[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        }catch(ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}