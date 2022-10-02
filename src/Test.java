import com.exception.StackException;
import com.practice.OverflowException;
import com.practice.UnderflowException;

//import com.abstraction.Abstract2;
//import com.practice.*;

//import com.practice.A;

public class Test {
    public static void main(String[] args) {
        // Computer computer1 = new Computer("8GB", "HP", "45456", 38000);
        // Computer computer2 = new Computer("8GB", "Lenovo", "T480", 50000);

        // computer1.start();
        // computer2.start();

        // B b = new B();
        // System.out.println(b.getA());
        // b.setA(56);
        // System.out.println(b.getString());
        // b.setString("qwerty");
        // b.a = new A();
        // System.out.println(b);

        // Student student1 = new Student();
        // student1.getGaurdianName();
        // student1.setGaurdianName("Parsuram Nayak");

        // student1.getName();
        // student1.setName("Swadhin Kumar Nayak");

        // student1.getRollNumber();
        // student1.setRollNumber(637001);

        // student1.getStandard();
        // student1.setStandard(12);

        // student1.getSchoolName();
        // student1.setSchoolName("DAV Public School");

       // System.out.println(student1);
       // System.out.println();
        // Employee employee1= new Employee("Swagat Kumar Nayak", 12345678, 987654, "Capgemini");
        // System.out.println(employee1);

        // Animal pug= new Dog(true);
        // System.out.println(pug.getAge());

       // Stack stack = new Stack();

        

        // System.out.println(stack.push(20));
        // System.out.println(stack.push(10));
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());

        // Rectangle rectangle1= new Rectangle(4,2);
        // rectangle1.setBreadth(4);
        // rectangle1.setLength(2);
        // System.out.println(rectangle1.area());
        // System.out.println(rectangle1.perimeter());

        // Abstract2 abst = new Concrete1();

        // abst.func();

        // Circles circle =  new Circles();
        // circle.radius= 24;
        // System.out.println(circle.area());
        // System.out.println(circle.perimeter());
        //char a = 'A';
        //System.out.println(++a);
        Stack stack= new Stack(2);
        try{
            System.out.println(stack);
            stack.push(30);
            stack.push(20);
            System.out.println(stack);
            System.out.println("poped "+stack.pop());
            System.out.println(stack);
            System.out.println("poped "+stack.pop()); 
            System.out.println("peeked "+stack.peek()); 
        }
        catch(StackException stackE){
            stackE.printStackTrace();
        }
    } 
}      
