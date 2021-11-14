package com.javapractice.Basics;

public abstract class AbstractClass {
     abstract void show();
     void Display(){
         System.out.println("Inside abstract class");
     }
}
class AbstractDemo extends AbstractClass{   //Concrete class
    void show(){
        System.out.println("Inside Abstract method");
    }

    public static void main(String args[]){
        AbstractClass ob=new AbstractDemo();
        ob.Display();
        ob.show();
     }
}
