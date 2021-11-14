package com.javapractice.Basics;

public class WrapperClass {
    public static void main(String Args[]){
        int i=10,p=20;
        Integer ii=new Integer(i); //Boxing
        int j=ii.intValue();      //Unboxing
        System.out.println(j);

        Integer ii1=p;      //Auto-Boxing
        int q=ii1;          //Auto-Unboxing
        System.out.println(q);


        double a=10.20;
        Double dd=new Double(a);
        double b=dd.doubleValue();
        System.out.println(b);

        String s1="2167";
        int n=Integer.parseInt(s1);
        System.out.println("using parseInt method: "+n);

        String s2="2167.012";
        double d=Double.parseDouble(s2);
        System.out.println("using parseDouble method: "+d);

    }
}
