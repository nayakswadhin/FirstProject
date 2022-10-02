package com.practice;

public class Rectangle implements Shapes {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Rectangle(){
    }

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length= length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth= breadth;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
