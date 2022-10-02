public class Loops {
    static void printNNumbers(int n){
        System.out.println("Using While");
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
    static void printUsingFor(int n){
        System.out.println("Using For");
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        //printUsingFor(100);
        int c= 4%2;
        System.out.println(c);
    }
}
