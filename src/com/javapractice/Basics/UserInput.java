package com.javapractice.Basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println(a);

        System.out.println("Enter a number: ");
        double b=sc.nextDouble();
        System.out.print(b);
    }
}
