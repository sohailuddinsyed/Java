package com.javapractice.Basics;

public class Interface {
        public static void main(String args[]){
            Human ob=new Gender();
            ob.man();
            ob.woman();

            Alien a=new GenderNotSpecified();
            a.alien();

            GenderNotSpecified b= new GenderNotSpecified();
            b.man();
            b.alien();
            b.woman();

            //creating an object of the interface
            Human h=new Human() {
                public void man(){
                    System.out.println("inside interface obj man");
                }
                public void woman(){
                    System.out.println("inside interface obj woman");

                }
            };
            h.woman();
            h.man();
        }
}
interface Human{
    void man();
    void woman();
}
interface Alien{
    void alien();
}
class Gender implements Human{
    public void man(){
        System.out.println("He is a man");
    }
    public void woman(){
        System.out.println("She is a woman");
    }
}
class GenderNotSpecified implements Human,Alien{
    public void man(){
        System.out.println("He is a man");
    }
    public void woman(){
        System.out.println("She is a woman");
    }
    public void alien(){
        System.out.println("This is an alien");
    }
}

//Functional Interface and Lambda expression

interface Abc{
    void display();
}
class LambdaExpression{
    public static void main(String args[]){
//        Abc obj=() -> System.out.println("This is a Lambda expression");
        Abc obj=() -> System.out.println("This is a lambda exp");
        
        obj.display();
    }
}

//Default method
interface DemoMethod{
    void display();
    default void show(){
        System.out.println("method defn INSIDE interface by DEFAULT");
    }
}
class Demo implements DemoMethod{
    public void display(){
        System.out.println("Method defn inside class");
    }
    public void show(){
        System.out.println("method defn overriden INSIDE class");
    }
}
class DemoInterface{
    public static void main(String args[]){
        DemoMethod obj=new Demo();
        obj.display();
        obj.show();
    }
}

//Multiple Inheritance issue in Interfaces

interface Demo1{
    default void show(){
        System.out.println("Inside interface Demo1");
    }
}

interface Demo2{
    default void show(){
        System.out.println("Inside interface Demo2");
    }
}

class DemoImp implements Demo1,Demo2{
//    public void show(){
//        System.out.println("Inside class ");
//    }
        public void show(){
                Demo2.super.show();
            }
    public static void main(String args[]){
        Demo1 obj=new DemoImp();
        obj.show();
    }
}