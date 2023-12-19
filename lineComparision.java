package com.day4;

import java.util.Scanner;

class Line implements Comparable<Line> {
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

    // Override compareTo method to compare two lines based on length
    @Override
    public int compareTo(Line otherLine) {
        double thisLength = this.calculateLength();
        double otherLength = otherLine.calculateLength();

        // Compare lengths and return the result
        return Double.compare(thisLength, otherLength);
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

        // Compare two lines based on length
        int comparisonResult = line1.compareTo(line2);

        // Display the comparison result
        if (comparisonResult == 0) {
            System.out.println("Both lines are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 2 is greater than Line 1.");
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
