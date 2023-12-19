package com.day4;

import java.util.Scanner;

class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Function to calculate length of a line
    public double calculateLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Override equals method to check equality of two lines based on length
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line otherLine = (Line) obj;
        double epsilon = 1e-8; // A small value to handle precision issues with doubles
        return Math.abs(this.calculateLength() - otherLine.calculateLength()) < epsilon;
    }
}

public class lineComparision {
    public static void main(String[] args) {
        /// Display welcome message
        System.out.println("Welcome to Line Comparison Computation Program!");

        // Input for line 1
        System.out.println("Enter coordinates for Line 1:");
        double x1 = getUserInput("x1");
        double y1 = getUserInput("y1");
        double x2 = getUserInput("x2");
        double y2 = getUserInput("y2");

        // Create Line 1
        Line line1 = new Line(x1, y1, x2, y2);

        // Calculate and display the length of Line 1
        System.out.println("Length of Line 1: " + line1.calculateLength());

        // Input for line 2
        System.out.println("Enter coordinates for Line 2:");
        double a1 = getUserInput("a1");
        double b1 = getUserInput("b1");
        double a2 = getUserInput("a2");
        double b2 = getUserInput("b2");

        // Create Line 2
        Line line2 = new Line(a1, b1, a2, b2);

        // Calculate and display the length of Line 2
        System.out.println("Length of Line 2: " + line2.calculateLength());

        // Check equality of two lines based on length
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }
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
