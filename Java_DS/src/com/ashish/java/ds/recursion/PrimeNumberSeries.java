package com.ashish.java.ds.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberSeries {
    static BufferedReader br = new BufferedReader(new
            InputStreamReader(System.in));
    static final String programName = "Prime Number Series Printer";

    public static void main(String[] args)
            throws IOException {
        System.out.println("Welcome to " + programName);
        do {
            askForInputAndRetrun();
        } while (askToContinue());

        System.out.println("Thank you for using " + programName);
    }

    private static boolean askToContinue()
            throws IOException {
        System.out.println("Wish to Continue? (Y/N))");
        String input = br.readLine();

        return "Y".equalsIgnoreCase(input);


    }

    private static void askForInputAndRetrun() throws IOException {
        System.out.println("Enter an integer:");
        int input = Integer.parseInt(br.readLine());

        for (int x = 1; x <= input; x++) {
            if (isPrimeNumber(x, 2))
                System.out.print(x + ",");
        }
        System.out.println("");
    }

    private static boolean isPrimeNumber(int n, int i) {

        if (n == 1 || n == 2)
            return true;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrimeNumber(n, i + 1);

    }


}
