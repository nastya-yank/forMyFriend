package com.pomi.forthlabs.threetask;
import com.pomi.forthlabs.firsttask.Student;

import java.util.Arrays;
import java.util.LinkedList;


public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(-1,1,-1,1,-1,1,-1,1,-1));

        for(int i=0; i<list.size();i++){
            if(list.get(i)<0){
                Integer remove = list.get(i);
                list.addLast(list.get(i));
                list.remove(remove);

            }
        }



        System.out.println(list);
    }
}