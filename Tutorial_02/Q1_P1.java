// Simple Interest

import java.io.*;

class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;  // Principal amount
        double rate = 5;           // Interest rate per year
        double time = 2;           // Time in years

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + interest);
    }
}
