package com.pomi.forthlabs.simpletask;

public class Main {
    public static void main(String[] args) {
        try {
            Matrix matrix = new Matrix();
            matrix.addition();
            System.out.println(matrix);
            matrix.comparison();
            System.out.println(matrix);
            matrix.division(2);
            System.out.println(matrix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
