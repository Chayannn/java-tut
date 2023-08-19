package com.assignment.conditionalLoops;

import java.util.Scanner;

public class AreaOfTriangel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base ");
        int base = in.nextInt();
        System.out.println("Enter the height");
        int height = in.nextInt();
        int Area = ((1 / 2) * (base * height));
        System.out.println("Area of Triangel is" + Area);
    }
}
