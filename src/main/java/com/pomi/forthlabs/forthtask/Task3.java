package com.pomi.forthlabs.forthtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> circleArray = new ArrayList<Integer>();
        System.out.println("Enter n");
        if(!scanner.hasNextInt()){
            throw new RuntimeException("Stream not have integer");
        }
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter number");
            if(!scanner.hasNextInt()){
                throw new RuntimeException("Stream not have integer");
            }
            circleArray.add(scanner.nextInt());
        }
        int i=0;
        int counter=0;
        while (circleArray.size()!=1){
            if(i>=circleArray.size()){
                i=0;
            }
            if(counter==1){
                circleArray.remove(i);
                counter=0;
                i--;
            }
            else {
                counter++;
            }
            i++;

        }
        System.out.println(circleArray.get(0));
        LinkedList<Integer> circleLinked = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        i=0;
        counter=0;
        while (circleLinked.size()!=1){
            if(i>=circleLinked.size()){
                i=0;
            }
            if(counter==1){
                circleLinked.remove(circleLinked.get(i));
                counter=0;
                i--;
            }
            else {
                counter++;
            }
            i++;

        }
        System.out.println(circleLinked.get(0));
    }
}
