package com.chayan;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
    }

    public static class MultiAL {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }
    //        add elements
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(in.nextInt());
                }
            }
            System.out.println(list);
        }
    }

    public static class ArrayLists {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
        }
    }
}