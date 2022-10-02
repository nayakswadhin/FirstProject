import com.practice.A;

public class B extends A{
    private int b;
    int c;
    int d;
    A a;

    B(){
        super((byte)2);
    }

    B(int c){
        this.c = c;
    }

    B(int d, int c){
        
        this.d = d;
    }
    public String toString(){
        return "Proerties in B are, b: "+b+", a: "+a;
    }
}
