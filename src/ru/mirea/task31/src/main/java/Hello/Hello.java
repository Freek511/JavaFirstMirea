package ru.mirea.task31.main.java.Hello;

public class Hello {
    public int calc(int n) {
        if (n == 0)
            throw new ArithmeticException();
        return n + n/2;
    }

    public int calculate(int n) {
        return n + n/4;
    }
}
