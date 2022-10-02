public class Array {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void func(int[] arr){
        arr[2] = 4;
    }
    public static void main(String[] args) {
        // int b[] = new int[7];
        // int[] c = {2,3,4,5,6,1};
        // int[] d = new int[]{4,5,6};
        // int[] a = new int[8];
        // a[4] = 34;
        // System.out.println(a[4]);
        // System.out.println(a.length);
        int[] arr = {3,5,1,5,7,2};
        printArray(arr);
        int a = 3;
        func(arr);
        System.out.println();
        printArray(arr);
    }
}
