package com.javapractice.Basics;

public class OopsConcepts {
    int a, b;
    double c;

    //Initialising values with a constructor
    public OopsConcepts() {
        a = 10;
        b = 20;
    }

//    Parameterised Constructors
//    public OopsConcepts(int x, double z) {
//       a = x;
//       c = z;
//    }
    public OopsConcepts(int a, double c) {
       this.a = a;
       this.c = c;
    }


}
class ConstructorValue{
    public static void main(String args[]){
        //constructor overloading
        OopsConcepts ob1= new OopsConcepts(5,12.45);
        System.out.println(ob1.a);
        System.out.println(ob1.c);

        //method overloading
        Calculator cal1=new Calculator();
        cal1.add(1,2);
        cal1.add(12,12.5);
    }
}

//method overloading
class Calculator{
    public void add(int i,int j){
        System.out.println(i+j);
    }
    void add(int i,double k){
        System.out.println(i+k);
    }
}


//Static variable
class Company{
    int eid;
    int sal;
    static int att;
    void show(){
        System.out.println(eid+":"+sal+":"+att);
    }
    Company(){
        System.out.println("Constructor Created");
    }
    static{
        att=100;
        System.out.println("In Static block  ");
    }
    public static void main(String args[]){
        Company e1=new Company();
        e1.eid=10;
        e1.sal=2000;
       // e1.att=99;


        Company e2=new Company();
        e2.eid=20;
        e2.sal=4000;
        //e2.att=95;

        e1.show();
        e2.show();
    }
}

//Inner class and Static Inner class
class Outer{
    int a;
    class Inner{
        void display() {
            System.out.print("Inside Inner class IN Outer Class");
        }
    }
}

class InnerDemo{
    public static void main(String args[]){
        Outer o1=new Outer();
        o1.a=10;
        System.out.println(o1.a);
        Outer.Inner i1=o1.new Inner();
//        Outer.Inner i1=new Outer.Inner();
        i1.display();
    }
}

