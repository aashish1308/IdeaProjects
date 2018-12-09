package com.ashish.java.ds.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciCalculatorLong {
    static BufferedReader br = new BufferedReader(new
            InputStreamReader(System.in));

    public static void main(String[] args)
            throws IOException {
        System.out.println("Welcome to Fibonacci Calculator");
        do {
            askForInputAndRetrun();
        } while (askToContinue());

        System.out.println("Thank you for using Fibonacci Calculator");
    }

    private static boolean askToContinue()
            throws IOException {
        System.out.println("Wish to Continue? (Y/N))");
        String input = br.readLine();

        return "Y".equalsIgnoreCase(input);


    }

    private static void askForInputAndRetrun() throws IOException {
        System.out.println("Enter an integer:");
        long input = Long.parseLong(br.readLine());

        long fibonacci = calculateFibonacci(input);

        System.out.println("Fibonacci for given number is: " + fibonacci);
    }

    private static long calculateFibonacci(long input) {

        if (input == 0)
            return 1;
        else {
            return input * calculateFibonacci(input - 1);
        }
    }


}
