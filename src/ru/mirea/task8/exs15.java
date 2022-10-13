package ru.mirea.task8;

public class exs15 {
    public static void rec(int N) {
        if(N > 0) {
            System.out.println( N % 10);
            rec(N / 10);
        }
    }


    public static void main(String[] args){
        rec(2131);
    }
}

