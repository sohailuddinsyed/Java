package com.javapractice.Basics;

public class VarArgs {
    public static void main(String args[]){
        Addition ob1=new Addition();
        System.out.println(ob1.add(10,20,30,40,50));
    }
}
class Addition{
    int add(int ...i){
        int sum=0;
        for(int k:i){
            sum+=k;
        }
        return sum;
    }

}
