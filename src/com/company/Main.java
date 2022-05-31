package com.company;

public class Main {

    public static void main(String[] args) {
        printLoop(1, 5);
        printLoop(1, 8);
        printLoopExecpt(1, 10, 4);
        printStringWithout("banana", "a");

    }


    public static void printLoop(int start, int end) {
        for (int i = start; i < end + 1; i++) {
            System.out.println(i);
        }
    }

    public static void printLoopExecpt ( int start, int end, int skip){
        for (int i = start; i < end + 1; i++) {
            if (i != 4) {
                System.out.println(i);
            }
        }
    }

    public static void printStringWithout (String str, String letter) {
        for (int i = 0; i < str.length()-1; i++) {
            if (!str.substring(i, i+1).equals(letter)) {
                System.out.print(str.substring(i, i+1));
            }
        }

    }
}

