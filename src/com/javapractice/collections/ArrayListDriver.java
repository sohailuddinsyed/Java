package com.javapractice.collections;

import java.util.ArrayList;

public class ArrayListDriver {
    public static void driver(){
        ArrayListProgram arrayListProgram = new ArrayListProgram(new <Integer>ArrayList());
        arrayListProgram.insert(10);
        arrayListProgram.printArray();
    }
}
