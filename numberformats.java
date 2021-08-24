package com.ashina;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numberFo = NumberFormat.getNumberInstance();
        System.out.println("Number: " +  numberFo.format(doubleValue));

        var intFo = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intFo.format(doubleValue));

        intFo.setGroupingUsed(false);
        System.out.println("Number: " + intFo.format(doubleValue));

        var locale = Locale.getDefault();
        var localeFormatter = NumberFormat.getIntegerInstance(locale);
        System.out.println("Number: " + localeFormatter.format(doubleValue));

        var locale1 = new Locale("de", "DE");
        var localeFormatter1 = NumberFormat.getIntegerInstance(locale1);
        System.out.println("Number: " + localeFormatter1.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance(locale1);
        System.out.println(currencyFormatter.format(doubleValue));
    }
}
public class numberformats {
    
}
