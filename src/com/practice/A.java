package com.practice;

public class A {
    public int c;
    public Object string;

    public A(){}

    public A(int a){
        System.out.println("int");
    }
    public A(byte b){
        System.out.println("byte");
    }
    
    public int getA(){
        return c;
    }

    public void setA(int c){
        this.c = c;
    }
    public Object getString(){
        return string;
    }
    public void setString(String string){
        this.string = string;
    }
}

