package com.day4;

import java.util.Scanner;

public class lineComparision {
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("Welcome to Line Comparison Computation Program!");

        // Input for point 1
        System.out.println("Enter coordinates for Point 1:");
        double x1 = getUserInput("x1");
        double y1 = getUserInput("y1");

        // Input for point 2
        System.out.println("Enter coordinates for Point 2:");
        double x2 = getUserInput("x2");
        double y2 = getUserInput("y2");

        // Calculate length of the line
        double length = calculateLength(x1, y1, x2, y2);

        // Display the calculated length
        System.out.println("Length of the Line: " + length);
    }

    /*
     @desc: Function to get user input for coordinates
     @params:string- Message to display
     @return:double-input
     */
    private static double getUserInput(String coordinate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + coordinate + ": ");
        return scanner.nextDouble();
    }

    /*
     @desc: Function to calculate length of the line
     @params:coordinates of points
     @return:double-length of line
     */
    private static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
