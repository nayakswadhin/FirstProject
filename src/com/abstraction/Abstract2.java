package com.abstraction;

public interface Abstract2 {
    void run();

    default void func(){
        run();
    }
}
