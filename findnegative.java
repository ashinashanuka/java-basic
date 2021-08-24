package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inputNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        inputNumber = scanner.nextInt();

            if (inputNumber > 0)
                System.out.println(inputNumber + " is a positive number");
            else
                System.out.println(inputNumber + " is a negative number");
    }
}
