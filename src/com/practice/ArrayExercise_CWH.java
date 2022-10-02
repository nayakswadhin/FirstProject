package com.practice;

import java.util.Scanner;

public class ArrayExercise_CWH {

    public static String checkingValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value to be checked: ");
        int check= sc.nextInt();
        int[] arr2= {2,3,5,90,7,6};
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]== check){
                return "Yes your given value is present in array";
            }
        } return "No, your given value is not present in array";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     // Sum in array   
        int[] arr= new int[6];
    System.out.println("Enter your array Elements: ");
        for(int i= 0; i< arr.length; i++ ){
            int value = sc.nextInt();
            arr[i]=value;
        }
        int a=0;
        for(int i=0; i< arr.length; i++){
            a+=(arr[i]);
        }
    System.out.println("Sum in array: "+a);

    // checking values present in array

     System.out.println(checkingValue());
       
    }
}
