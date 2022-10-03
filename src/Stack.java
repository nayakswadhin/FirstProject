import com.exception.StackException;

public class Stack {

    private int[] arr;
    private int i = -1;

    Stack() {
        arr = new int[10];
    }

    Stack(int size) {
        arr = new int[size];
    }

    public void check() throws StackException {
        if (i == (arr.length - 1)) {
            throw new StackException("it's a overflow");
        }
    }

    public void push(int value) throws StackException {
        // handling overflow
        if (i == (arr.length - 1)) {
            throw new StackException("It's a Overflow");
        }
        i++;
        arr[i] = value;
    }

    public int pop() throws StackException {
        // handling underflow
        if (i <= -1) {
            throw new StackException("It's a Underflow");
        }
        return arr[i--];
    }

    public int peek() throws StackException {
        if (i >= 0) {
            return arr[i];
        }
        throw new StackException("It's a Underflow");
    }

    public String toString() {
        if (i == -1) {
            return "No elements found.";
        }
        String stack = "";
        for (int n = i; n >= 0; n--) {
            stack += arr[n] + "\n";
        }
        return stack;
    }

}
