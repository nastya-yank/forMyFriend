package com.pomi.forthlabs.seventh;

import java.util.LinkedList;

public class Struct {
    private LinkedList<Integer> list;
    public Struct(int ...arr){
        list = new LinkedList<Integer>();
        for (int i : arr) {
            list.add(i);
        }
    }
    public Struct(){

        list = new LinkedList<Integer>();
    }
    public void add(int number){
        list.add(number);
    }
    public void remove(int index){
        list.remove(index);
    }
    public int getNumber(int index){
        return list.get(index);
    }
    public int min(int number){
        int min=Integer.MAX_VALUE;
        int result=0;
        for (int i = 0; i < list.size(); i++) {
            if(Math.abs(list.get(i)-number)<min){
                result= list.get(i);
                min = Math.abs(list.get(i)-number);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Struct" +
                "list=" + list;
    }

    public static void main(String[] args) {
        Struct struct = new Struct(2,8,20,100);
        struct.add(1);
        System.out.println(struct);
        struct.remove(1);
        System.out.println(struct);
        System.out.println(struct.getNumber(2));
        System.out.println(struct.min(4));
    }
}