public package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int positiveInteger = scanner.nextInt();

        if (positiveInteger % 2 != 0) {
            System.out.println("Weird");
        }

        if (positiveInteger % 2 == 0) {
            if (positiveInteger >= 2 && positiveInteger <= 5 || positiveInteger > 20) {
                System.out.println("Not Weird");
            } else if (positiveInteger >= 6 && positiveInteger <= 20) {
                System.out.println("Weird");
            }

        }

    }
}
class hackerrank1 {
    
}
