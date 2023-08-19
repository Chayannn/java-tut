package com.assignment.firstjava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if (value % 2 == 0){
            System.out.println("Its a even number");
        }
        else {
            System.out.println("Its a odd number");
        }
    }
}
