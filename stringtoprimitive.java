package com.ashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        int intValue = 42;
        var fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        var fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        var fromLong = Long.toString(longValue);
        System.out.println(fromLong);
    }
}
