package com.ashina;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter number 1: ");
        double inputOne = scanner.nextDouble();
        System.out.println("enter number 2: ");
        double inputTwo = scanner.nextDouble();

        inputOne = Math.round(inputOne * 1000);
        inputOne = inputOne / 1000;
        inputTwo = Math.round(inputTwo * 1000);
        inputTwo =inputTwo / 1000;

        if(inputOne == inputTwo)
            System.out.println("Same");
        else
            System.out.println("diff");
    }
}
