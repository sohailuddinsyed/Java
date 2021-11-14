package com.javapractice.Basics;

public class Inheritance {
    public static void main(String args[]){
        C c=new C();
        int sum= c.add(10,20);
        int diff=c.sub(100,50);
        int pro=c.mul(20,5);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(pro);

    }
}
class A{
    int add(int a,int b){
        int sum=a+b;
        System.out.println("Addition in parent: "+sum);
        return sum;
    }
}
class B extends A{
    int sub(int a,int b){
        return a-b;
    }

    int add(int a, int b){
       // super.add(a,b);
        return a+b+1;
    }
}
class C extends B{
    int mul(int a,int b){
        return a*b;
    }
}

//Dynamic method dispatch and run time polymorphism
class A1{
    void show(){
        System.out.println("Inside A");
    }
}
class B1 extends A1{
    void show(){
        System.out.println("Inside B");
    }
    void run(){}
}
class C1 extends B1{
    void show(){
        System.out.println("Inside c");
    }
}
class DynamicMethod{
    public static void main(String args[]){
        A1 obj=new B1();
        obj.show();

        A1 obj2=new C1();
        obj2.show();
    }
}
