package com.javapractice.Basics;

public class IfElse {
    public static void main(String[]args){

        //TERENARY OPERATOR
        int a=6;
        int b=a%2==0?1:2;
        System.out.println(b);
        String c=a%2==0?"even":"odd";
        System.out.println(c);

        //IF-ELSE
        a=7;
        if(a%2==0)
            System.out.println("Even");
        else
            if (a==0)
                System.out.println("0 is neither even nor odd");
            else
                System.out.println("odd");

        //SWITCH
        a=3;
        String s="abc";
        switch(s){
            case "abc":
                System.out.println("ABC string");
                break;
            case "pqr":
                System.out.println("PQR string");
                break;
            default:
                System.out.println("Neither one nor two");
        }
    }
}
