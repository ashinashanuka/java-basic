package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "What is the largest planet in the solar system";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";
        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + " or " + choiceThree+".");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (correctAnswer.equals(input.toLowerCase())){
            System.out.println("congratulations That the correct answer");
        }
        else
            System.out.println("Your are incorrect. The correct answer is " + correctAnswer);
    }
}
