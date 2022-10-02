import java.util.Scanner;

public class ArrayExercise {

    static void addition(int[] arr){
        int c= 0;
        for(int a=0; a< arr.length; a++){
           c= c+arr[a]; 
        }
        System.out.println(c);
    }
    static int multiplication(int[] arr){
        int c=1;
        for(int i=0; i< arr.length; i++){
            c=c*arr[i];

        }
        return c;
    }
    static int maximum(int[] arr){
        int max = arr[0];
        for(int i= 1; i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    static int minimum(int[] arr){
        int mini= arr[0];
        for(int i=1; i<arr.length; i++){
            if(mini>arr[i]){
                mini= arr[i];
            }
        }
        return mini;
    }
    static int linearSearch(int[] arr, int n){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //int[] arr = {1,2,3,4,5,8};
       //addition(arr);
       System.out.println("Kindly Enter Your Array Size: ");
       int size = sc.nextInt();
       int[] arr= new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Kindly Enter Your "+i+"th data: ");
            arr[i] = sc.nextInt();
        }
        
        

       //multiplication(arr2);
        
       //System.out.println(linearSearch(arr, 4));
        
    }
}
