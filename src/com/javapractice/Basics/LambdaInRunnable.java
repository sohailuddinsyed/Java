package com.javapractice.Basics;

public class LambdaInRunnable {
    public static void main(String args[]) throws Exception{

//        Runnable a=()->
//             {
//                for (int i = 1 ; i <= 6; i++)
//                {
//                    System.out.println("Hi");
//                    try {Thread.sleep(1000);} catch (Exception e) {}
//                }
//            };
//
//        Runnable b=()->
//             {
//                for (int i = 1 ; i <= 6; i++) {
//                    System.out.println("Hello");
//                    try {Thread.sleep(1000);} catch (Exception e) {}
//                }
//            };


        Thread t1=new Thread(()->
        {
            for (int i = 1 ; i <= 6; i++)
            {
                System.out.println("Hi");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        },"Hi thread");
        Thread t2=new Thread(()->
        {
            for (int i = 1 ; i <= 6; i++) {
                System.out.println("Hello");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        },"Hello Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        t2.start();

        //Join and isAlive
        t1.join();
        t2.join();
        System.out.println("Bye");


        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
class Hi2 implements Runnable{
    public void run() {
        for (int i = 1 ; i <= 6; i++) {
            System.out.println("Hi");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
class Hello2 implements Runnable{
    public void run() {
        for (int i = 1 ; i <= 6; i++) {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
