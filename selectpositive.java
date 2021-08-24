package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int inputNumberOne = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        int inputNumberTwo = scanner.nextInt();

        if(inputNumberOne > 0){
            System.out.println(inputNumberOne + " is positive");
            if (inputNumberTwo > 0){
                System.out.println(inputNumberTwo + " is positive");
            }
        }
    }
}
