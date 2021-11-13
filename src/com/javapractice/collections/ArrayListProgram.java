package com.javapractice.collections;

import java.util.ArrayList;

public class ArrayListProgram {
    private ArrayList <Integer> arrayList;

    public ArrayListProgram(ArrayList arrayList){
        this.arrayList = arrayList;
    }
    public ArrayListProgram(){}

    public void insert(Integer element){
        arrayList.add(element);
    }
    public void printArray(){
        for( Integer i : arrayList){
            System.out.println(i);
        }
    }
    public String toString(){
        System.out.println("custom tostring");
        return "Overridden";
    }
}
