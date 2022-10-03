import java.util.Scanner;

import com.exception.StackException;

public class StackApplication {
    static void push(Stack stack, Scanner sc) {
        try {
            stack.check();
            System.out.println("Enter value to push: ");
            int value = sc.nextInt();
            stack.push(value);
            System.out.println("Successfully pushed " + value);
        } catch (StackException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Welcome to the stack\nEnter Size of the array: ");
            int size = sc.nextInt();
            Stack stack = new Stack(size);
            System.out.println("Stack created sucessfully with size: " + size);

            boolean exit = false;
            while (!exit) {
                System.out.println("\nCurrently in stack:");
                System.out.println(stack);
                System.out.println("Choose an option: \n1. Push\n2. Pop\n3. Peek\n4. Exit");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        push(stack, sc);
                        break;
                    case 2:
                        try {
                            System.out.println("Sucessfully poped " + stack.pop());
                        } catch (StackException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Your peeked number is: " + stack.peek());
                        } catch (StackException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        System.out.println("Thanks for using my application.\nHave a nice Day");
                        exit = true;
                }
            }
        } finally {
            sc.close();
        }
    }
}