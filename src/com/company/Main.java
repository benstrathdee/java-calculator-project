package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your first number.");
        double input1 = scan.nextDouble();
        System.out.println("Please input your operator (+, -, *, /, power, or sqrt)");
        String operator = scan.next();
        double input2 = 0;
        double result = 0;
        switch (operator) {
            case "+":
                System.out.println("Please input your second number.");
                input2 = scan.nextDouble();
                result = calculateAdd(input1, input2);
                outputBasic(input1, operator, input2, result);
                break;
            case "-":
                System.out.println("Please input your second number.");
                input2 = scan.nextDouble();
                result = calculateSubtract(input1, input2);
                outputBasic(input1, operator, input2, result);
                break;
            case "*":
                System.out.println("Please input your second number.");
                input2 = scan.nextDouble();
                result = calculateMultiply(input1, input2);
                outputBasic(input1, operator, input2, result);
                break;
            case "/":
                System.out.println("Please input your second number.");
                input2 = scan.nextDouble();
                result = calculateDivide(input1, input2);
                outputBasic(input1, operator, input2, result);
                break;
            case "power":
                System.out.println("Please input your second number.");
                input2 = scan.nextDouble();
                result = calculatePower(input1, input2);
                System.out.printf("The result of %f to the power of %f is %f", input1, input2, result);
                break;
            case "sqrt":
                result = Math.sqrt(input1);
                System.out.printf("The square root of %f is %f", input1, result);
                break;
            default:
                System.out.println("One or more of your inputs was incompatible.");
        }
    }

    public static double calculateAdd(double input1, double input2) {
        return input1 + input2;
    }
    public static double calculateSubtract(double input1, double input2) {
        return input1 - input2;
    }
    public static double calculateMultiply(double input1, double input2) {
        return input1 * input2;
    }
    public static double calculateDivide(double input1, double input2) {
        return input1 / input2;
    }
    public static double calculatePower(double input1, double input2) {
        return Math.pow(input1, input2);
    }

    public static void outputBasic(double input1, String operator, double input2, double result) {
        System.out.printf("The result of %f %s %f is %f", input1, operator, input2, result);
    }
}
