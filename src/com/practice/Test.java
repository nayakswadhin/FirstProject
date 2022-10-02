package com.practice;

public class Test {
    static int func(int area) throws ClassNotFoundException{
        try{
            if(area<=0)
                throw new ClassNotFoundException();
            return area;
        }finally{
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Generic<Integer> gen = new Generic<>(23, 34);
        System.out.println(gen.sum);
        System.out.println(gen.num);
        try{
            System.out.println(func(-1));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
