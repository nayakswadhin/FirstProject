public class Program2 {
    public static void main(String[] args) {
        int a = 2, b = 5;
        boolean result = a<b;
        System.out.println("a<b: "+result);
        System.out.println("a>b: "+(a>b));
        System.out.println("a==b: "+(a==b));
        System.out.println("a>=b: "+(a>=b));
        System.out.println("a<=b: "+(a<=b));
        System.out.println("a!=b: "+(a!=b));

        System.out.println("!(a<b): "+!result);
        System.out.println("!(a>b): "+!(a>b));
        System.out.println("!(a==b): "+!(a==b));
        System.out.println("!(a>=b): "+!(a>=b));
        System.out.println("!(a<=b): "+!(a<=b));
        System.out.println("!(a!=b): "+!(a!=b));

        System.out.println((a<b)+"&&"+(a!=b)+": "+((a<b)&&(a!=b)));
        System.out.println((a<=b)+"&&"+(a==b)+": "+((a<=b)&&(a==b)));
        System.out.println((a==b)+"&&"+(a<=b)+": "+((a==b)&&(a<=b)));
        System.out.println((a>=b)+"&&"+(a==b)+": "+((a>=b)&&(a==b)));

        System.out.println((a<b)+"||"+(a!=b)+": "+((a<b)||(a!=b)));
        System.out.println((a<=b)+"||"+(a==b)+": "+((a<=b)||(a==b)));
        System.out.println((a==b)+"||"+(a<=b)+": "+((a==b)||(a<=b)));
        System.out.println((a>=b)+"||"+(a==b)+": "+((a>=b)||(a==b)));
    }
}
