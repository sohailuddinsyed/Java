package com.javapractice.Basics;

public class AnonymousClass   {
    public static void main(String Args[]){
    AnonymousDemo a=new AnonymousDemo() {
        public void show() {
            System.out.println("override Hello");
            }
         };
    a.show();

    }
}
class AnonymousDemo{
    public void show(){
        System.out.println("Hello");
    }
}