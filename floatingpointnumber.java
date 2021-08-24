package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        double inputNumber = scanner.nextDouble();

        if (inputNumber > 0){
            if(inputNumber < 1)
                System.out.println(inputNumber +  " is a positive small number");
            else if (inputNumber > 1_000_00)
                System.out.println(inputNumber + " is a positive large number");
            else
                System.out.println(inputNumber + " positive number");
        }
        else if(inputNumber < 0){
            if (Math.abs(inputNumber) < 1)
                System.out.println(inputNumber + " is a negative small number");
            else if (Math.abs(inputNumber) > 1_000_000)
                System.out.println(inputNumber + " is a negative large number");
            else
                System.out.println(" negative number");
        }
        else
            System.out.println(inputNumber + " = zero");
    }
}
