package com.practice;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0]= 2;
        arr[1]= 3;
        //int a= sc.nextInt();
        
        for(boolean x = true;x;){
            System.out.println("Enter Your Array Index Number: ");
            int number= sc.nextInt();
            try{
                System.out.println("Array Value is: "+ arr[number]);
                x= false;
                System.err.println("Thank u for Using My Application");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Array Index");
            }
        }
    }
}
