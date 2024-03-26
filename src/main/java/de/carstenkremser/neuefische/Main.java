package de.carstenkremser.neuefische;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int randomInt = (int) Math.round(Math.random()*10);
        blahblubb(randomInt);

        MathFunctions myMath = new MathFunctions();
        System.out.println("factorial(" + randomInt + ") is " + myMath.factorial(randomInt));
    }

    static void blahblubb(int n) {
        if (n%2==0) {
            System.out.println("blah");
        } else {
            System.out.println("blubb");
        }

    }
}

