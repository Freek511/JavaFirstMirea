package ru.mirea.task8;

public class exs14 {

    public static int reverse(int N, int temp)
    {
        if(N > 0) {
            temp = 10 * temp + (N % 10);
            reverse(N/10, temp);
        }
        return temp;
    }
    public static void rec(int N) {
        if(N > 0) {
            System.out.println( N % 10);
            rec(N / 10);
        }
    }


    public static void main(String[] args){
        System.out.println(reverse(2331,0));
    }
}
