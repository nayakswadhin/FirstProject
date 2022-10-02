import java.util.Scanner;

public class Exercise_Function {
    static int add(int a, int b){
          return a+b;
    } 
    static int mini(int c,int d){
       return c<d?c:d;
    }
    static void operation (){
        float a= (7/4)*(9/2);
        System.out.println(a);
        return;
    }
    static boolean compare(int a){
        return a<10;
    }
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter number a: ");
    //    int a = sc.nextInt();
    //    System.out.print("Enter number b: ");
    //    int b = sc.nextInt();
    // System.out.println("Sum of two number is: "+add(a,b));
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter number a: ");
    // int a = sc.nextInt();
    // System.out.print("Enter number b: ");
    // int b = sc.nextInt();
    // System.out.println("Minimum of two number is: "+mini(a,b));

     //   operation();
        int a = sc.nextInt();
        boolean b = compare(a);
        System.out.println(b);
    }
}
