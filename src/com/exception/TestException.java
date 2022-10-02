package com.exception;

public class TestException {
    static int divide(int a, int b) throws MyException {
        if(b==0)
            throw new MyException("Divided By 0.");
        return a/b;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        try{
            int c = divide(a,b);
            System.out.println(c);
            //
            // exception
            //
            // throw new ArrayIndexOutOfBoundsException();
        }
        catch(MyException e){
            System.out.println(e);;
        }
        finally{
            System.out.println("trtyry");
        }
        System.out.println("Harry");
    }
}
