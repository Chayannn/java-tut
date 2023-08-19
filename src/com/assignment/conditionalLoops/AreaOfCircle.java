package com.assignment.conditionalLoops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = in.nextInt();
        double Area = (3.14 * (radius * radius));
        System.out.println("Area of the circle is " + Area + "cm");
    }
}
