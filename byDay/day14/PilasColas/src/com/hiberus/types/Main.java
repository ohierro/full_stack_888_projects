package com.hiberus.types;

public class Main {

    public static void main(String[] args) {
        FIFO cola = new FIFO();
        FIFO cola1 = new FIFO(5);

        cola.push(5);
        cola.push(6);

        cola1.push(9);

        LIFO stack = new LIFO();
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int result = stack.pop();   // 5
        result = stack.pop();       // 4
        System.out.println(stack.pop());
    }
}
