public class LoopExercise {
    static void evenNumber1(int n){
        for(int a = 0; (2*a)<=n; a++)
        System.out.println(2*a);

       
    }
    static void evenNumber2(int n){
        System.out.println("Even numbers between 0-"+n);
        int i=1;
        while(i<=0){
            System.out.println(i);
            i+=2;
        }
    }
    static void evenNumber3(int n){
        System.out.println("Even numbers between 0-"+n);
        
        int i =0;
        while(i<=n){
          if (i%2==0){
            System.out.println(i);
          }
          i++;
        }
    }
    static void oddNumber1(int n){
        int i=0;
        while((2*i+1)<=n){
            System.out.println(2*i+1);
            i++;
        }
    }
    static void oddNumber2(int n){
        for(int a= 1 ; a<=n; a+=2 ){
            System.out.println(a);
        }
    }
    static void oddNumber3(int n){
        for(int a=0; a<=n;a++){
            if(a%2==1){
                System.out.println(a);
            }
        }
    }
    static void multiply(int n){
        System.out.println("Multiplication table of "+n+" is");
        for(int a=1; a<=10; a++){
          System.out.println(n+" * "+a+" = "+(a*n));        
        }
    }
    static void factorial(int n){
        int c= 1;
        for(int a=1; a<=n; a++){
          c=c*a;
        }
        System.out.println(c);    
        
    }
    static void power(int n, int pow){
        int c= n;
        for(int a= 2; a<=pow; a++  ){
            c=c*n;
        }
        System.out.println(c);
    }
    static void divisor(int n){
        int count = 0;
        for(int a= 1; a<=n; a++){
            if((n%a)==0){
                count++;
               
            }
        }
        System.out.println(count);
    }
    static boolean isPrime(int n){
       for(int a=2; a<=(n-1); a++ ){

        if(n%a==0){
            return false;
        }
        
    }
       return true;
    }
    static int fibonacci(int n){
        switch(n){
            case 0:
                return 0;
            case 1:
                return 1;
        }
        int fibo= fibonacci(n-1)+fibonacci(n-2);
        return fibo;
    }
    static void reversePrint(int n){
        for (int a= n; a>=0; a--){
            System.out.println(a);
        }
    }
    static int fibonacci1(int n){
        return 0;
    }
    public static void main(String[] args) {
       // evenNumber3(10);
        
        //oddNumber1(16);
        //oddNumber2(16);
       // oddNumber3(15);
       // multiply(7);
        // factorial(0);
        // power(2,5);
        // System.out.println(isPrime(113));
         // System.out.println(fibonacci(7));
        //divisor(16);
        //reversePrint(19);
    }
}
