package com.practice;

public class Circles implements Shapes {
    public int radius;

    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
