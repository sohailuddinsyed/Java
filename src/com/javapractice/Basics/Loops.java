package com.javapractice.Basics;

public class Loops {
    public static void main(String args[]) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
           System.out.println(" ");
        }
        char a='A';
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            a='A';
            System.out.println("");
        }
        char b='$';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==2&&(j==2||j==3)){
                    System.out.print(" ");
                }
                else if(i==3&&(j==2||j==3)){
                    System.out.print(" ");
                }
                else
                    System.out.print(b);
            }
            System.out.println("");
        }

        //For each in 1D array
        int arr[]={1,2,3,4,5,6};
        for(int k:arr){
            System.out.println(k);
        }

        //For each in a 2D array
        int arr1[][]= {
                   {1,2,3,4},{4,5,6,7},{8,9,10,11}
          };

        for(int k[] :arr1){
            for(int l:k){
                System.out.print(" "+l);
            }
            System.out.println(" ");
        }
    }


}

