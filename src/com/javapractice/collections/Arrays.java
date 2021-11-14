package com.javapractice.collections;

public class Arrays {
    int a,b=20;
    double c=12.20;
    public static void main(String args[]) {
        //single dimensional array

        //int arr[]=new int[4];
//        int arr[] = {1, 3, 5, 2};
//        for (int i = 0; i < 4; i++)
//            System.out.println(arr[i]);
//
//        //2D Array
//        int arr1[]={1,2,3,4};
//        int arr2[]={4,5,6,7};
//        int arr3[]={8,9,10,11};
//
//        int arr4[][]= {
//                {1,2,3,4},{4,5,6,7},{8,9,10,11}
//        };
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                System.out.print(" "+arr4[i][j]);
//            }
//            System.out.println(" ");
//        }

        //Jagged Array
        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7,4};
        int arr3[]={8,9,10,11};

        int arr4[][]= {
                {1,2,3},{4,5,6,7,4},{8,9,10,11}
        };
        //System.out.println(arr4.length);
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                System.out.print(" "+arr4[i][j]);
            }
            System.out.println(" ");
        }
    }
}