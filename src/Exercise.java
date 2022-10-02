import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    /*System.out.print("Mark obtained in maths: ");
        double a = sc.nextDouble();
    System.out.print("Mark obtained in phy: ");
        double b = sc.nextDouble();
    System.out.print("Mark obtained in chem: ");    
        double c = sc.nextDouble();
    System.out.print("Mark obtained in biology: ");
        double d = sc.nextDouble();
    System.out.print("Mark obtained in english: ");
        double e = sc.nextDouble();
    System.out.println("Overall Percentage: "+ ((a+b+c+d+e)/500)*100);  */
    
   /*  System.out.println("Enter your name: ");
     String name = sc.nextLine();
    System.out.println("Hello!! "+name+" Have a nice day."); */

   /* System.out.println("Enter value in km: ");
        float a = sc.nextFloat();
        System.out.println(a+"km is equal to: "+(a*0.621371)+"miles"); */

        // Swap of 2 number using 3rd number
       /* int a = 17, b= 15;
        System.out.println("Before swaping a: "+a+" and b: "+b);

        int c = a;
        a=b;  b=c;
        System.out.println("After swaping a: "+a+" and b: "+b); */

        // Swaping 2 numbers using only that number
       /*  int a = 5, b= 89;
        System.out.println("Before swaping a: "+a+" and b: "+b);

        a=a+b; b=a-b; a=a-b;
        System.out.println("After swaping a: "+a+" and b: "+b); */

        // Minimum of three numbers
       // int a=56, b= -24, c=-34;
        //System.out.println((a<b)&&(a<c)?a:(b<c)&&(b<a)?b:c);
          //Method 02
        /* if(a<b&&a<c){
            System.out.println(a);
       } else if(b<a&&b<c){
        System.out.println(b);
       } else{
        System.out.println(c);
       }                              */

       // Addition/Subtration/multiplication/Division  of two numbers user input
      /* System.out.print("Enter number a: ");
       double a= sc.nextDouble();
       System.out.print("Enter number b: ");
       double b=sc.nextDouble();

       System.out.println("Addition a+b :"+(a+b));
       System.out.println("Subtraction a-b:"+(a-b));
       System.out.println("Multiplication a*b:"+(a*b));
       System.out.println("division a/b: "+(a/b));
       System.out.println("remainder a/b: "+(a%b));  */

       /*System.out.print("Enter number a: ");
       double a= sc.nextDouble();
       System.out.print("Enter number b: ");
       double b=sc.nextDouble();

       a=a+b; b=a-b; a=a-b;
       System.out.println("After swaping a,b: "+"("+a+", "+b+")"); */

       System.out.print("Enter number a: ");
       double a= sc.nextDouble();
       System.out.print("Enter number b: ");
       double b=sc.nextDouble();
       System.out.print("Enter number c: ");
       double c=sc.nextDouble();

       System.out.println((a<b)&&(a<c)?a:(b<c)&&(b<a)?b:c);
       



    










    }
}
