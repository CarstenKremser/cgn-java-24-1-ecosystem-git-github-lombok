package de.carstenkremser.neuefische;

public class MathFunctions {

    long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
