package com.pomi.forthlabs.simpletask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix implements Arithmetic {
    private int array[][];

    public  Matrix(int arr[][]){
        array=arr;
    }
    public Matrix() throws Exception{
        createMatrix();
        generationMatrix();
    }
    private void createMatrix() throws Exception {
        int n=0;
        int m=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        if(scanner.hasNextInt()){
            n=scanner.nextInt();
        }else {
            throw new Exception("Error input");
        }
        System.out.println("Enter m");
        if(scanner.hasNextInt()){
            m=scanner.nextInt();
        }else {
            throw new Exception("Error input");
        }
        array = new int[n][m];
    }
    private void generationMatrix(){
        Random random  = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
               array[i][j]=random.nextInt(10);
            }
        }
    }
    public int getIndex(int i, int j) throws Exception {
        if(i>=array.length||j>=array[0].length){
            throw new Exception("Index of bound!");
        }
        return array[i][j];
    }
    public void division(int n){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]/=n;
            }
        }
    }

    public void addition() throws Exception {
        Matrix newMatrix = new Matrix();
        if(newMatrix.array.length!=array.length){
            throw new Exception("You entered not equals length");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]+=newMatrix.array[i][j];
            }
        }

    }

    public boolean comparison() throws Exception {
        Matrix newMatrix = new Matrix();
        if(newMatrix.array.length!=array.length){
            throw new Exception("You entered not equals length");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j]!=newMatrix.array[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
       String result="";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result+=array[i][j]+" ";
            }
            result+="/n";
        }
        return result;
    }
}
