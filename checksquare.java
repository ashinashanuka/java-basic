package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length: ");
        double squareLength = scanner.nextDouble();
        System.out.println("Enter breadth: ");
        double squareBreadth = scanner.nextDouble();

        if (squareLength == squareBreadth){
            System.out.println("Square");
        }
        else
            System.out.println("Not a square");
    }
}
