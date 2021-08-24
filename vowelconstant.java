public package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a letter: ");
        char inputLetter = scanner.next().toLowerCase().charAt(0);

        switch (inputLetter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}
class vowelconstant {
    
}
