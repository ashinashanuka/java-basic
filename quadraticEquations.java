package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double QuadraticEquationsX1 = 0;
        double QuadraticEquationsX2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Quadratic Equations a: ");
        double QuadraticEquationsA = scanner.nextFloat();
        System.out.println("Enter the value of Quadratic Equations b: ");
        double QuadraticEquationsB = scanner.nextFloat();
        System.out.println("Enter the value of Quadratic Equations c: ");
        double QuadraticEquationsC = scanner.nextFloat();

        double result = (QuadraticEquationsB * QuadraticEquationsB) - (4.0 * (QuadraticEquationsA * QuadraticEquationsC));

        if(result > 0.0)
        {
            QuadraticEquationsX1 = ((-QuadraticEquationsB) + (Math.sqrt(result))) / (2.0 * QuadraticEquationsA);
            QuadraticEquationsX2 = ((-QuadraticEquationsB) - (Math.sqrt(result))) / (2.0 * QuadraticEquationsA);

            System.out.println("The QuadraticEquations X1 value :" + QuadraticEquationsX1);
            System.out.println("The QuadraticEquations X2 value :" + QuadraticEquationsX2);
        }
        else if (result == 0)
        {
            QuadraticEquationsX1 = ((-QuadraticEquationsB) / (2.0 * QuadraticEquationsA));
            System.out.println("The QuadraticEquations X1 value :" + QuadraticEquationsX1);
        }
        else
        {
            System.out.println("The equation has no real roots.");
        }

    }
}
