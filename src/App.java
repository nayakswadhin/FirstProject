public class App {
    public static void main(String[] args) {
        int a = 12, b = 6;
        System.out.println(a+" + "+b+" = " +(a+b));
        System.out.println(a+ " - " + b + " = " +(a-b) );
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" % "+b+" = "+(a%b));
        System.out.println("Before swap- a = "+a+", b = "+b);

        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swap- a = "+a+", b = "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Again swaped now- a = "+a+", b = "+b);

        System.out.println("After incrementing a "+a++);
        System.out.println(a);

        int c = b+++b--+a+++b+++a++;

        System.out.println(b+", "+c+", "+a);

        a+=15; //30
        a/=2; // 15
        a-=b; // 8
        a*=3; // 24
        a%=5; // 4
        System.out.println(a);
        System.out.println("5&4 = "+(5&4));
        System.out.println("5|4 = "+(5|4));
        System.out.println("~5 = "+(~5));
        System.out.println("5^4 = "+(5^4));
        System.out.println("5>>1 = "+(5>>1));
        System.out.println("5<<1 = "+(5<<1));

        System.out.print("my name is\nswadhin ku nayak");
        System.out.println("mrs white: \"Are u in danger\"\nmr white: \"I am the danger\"");

    }
}