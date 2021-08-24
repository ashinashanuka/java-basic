public package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int inputNumber1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int inputNumber2 = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int inputNumber3 = scanner.nextInt();

        if (inputNumber1 > inputNumber2 && inputNumber1 > inputNumber3)
            System.out.println(inputNumber1 + " is the greatest number.");
        else if (inputNumber2 > inputNumber1 && inputNumber2 >inputNumber3)
            System.out.println(inputNumber2 + " is the greatest number.");
        else
            System.out.println(inputNumber3 + " is the greatest number.");
        }
    }
class greatestnumber {
    
}
