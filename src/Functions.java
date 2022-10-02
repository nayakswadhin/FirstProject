import java.util.Scanner;

public class Functions {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(){
        if(true){
            return;
        }
        System.out.println(2+7);
    }
    static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
       // add(2,3);    
        //add();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an interger a: ");
        // int a = sc.nextInt();
        // System.out.println("Enter an interger b: ");
        // double b= sc.nextDouble();
        // System.out.println(add(a, b));
        // sc.close();
        System.out.println(4%2);
    }
}
