package com.portfolio.app;

import com.portfolio.app.compare2.Compare2Numbers;

public class Main {
    public static void main(String[] args) {

        // Main objective code is Compare2Numbers class here in Main class we are testing it

        Compare2Numbers compare2Numbers = new Compare2Numbers();


        int a = 10;
        int b = 10;

        // this method returns higher number between given numbers (a, b)
        int result = compare2Numbers.getHigherOne(a,b);
        System.out.println("Highest number: " + result);

        // this method returns lower number between given numbers (a, b)
        int result2  = compare2Numbers.getLowerOne(a,b);
        System.out.println("Lowest one: " + result2);

        // this method checks if given 2 number are same returns true else false
        boolean check = compare2Numbers.areBothSame(a,b);
        System.out.println("'a' and 'b' are same numbers? " + check);

    }
}
