package se.lexicon.lecture.part2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OverloadingDemo {
    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded: Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Overloaded: Add multiple integers using Varargs
    // The term **Varargs** is short for "variable-length arguments." It allows a method to accept zero or more arguments of a specified type.
    public static int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }


    void main() {
        IO.println(add(2, 3));
        IO.println(add(2.5, 3.5));
        IO.println(add(1, 2, 3));
    }

}