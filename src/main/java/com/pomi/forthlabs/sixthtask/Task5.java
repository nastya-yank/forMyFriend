package com.pomi.forthlabs.sixthtask;

import java.util.Arrays;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,8,9,8,7,6,5,4,3,2,1,12));
        int i=0;
        while (list.size()!=1){
            if(i>=list.size()){
                i=0;
            }
            for (int j = 0, k=j+1; j < list.size()-1;k++, j++) {
                list.set(j,list.get(j)+list.get(k));
                list.remove(k);
            }

        }
        System.out.println(list.get(0));
    }
}