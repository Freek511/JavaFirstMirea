package ru.mirea.task8;

public class exs14 {

    public static int reverse(int N, int temp)
    {
        if(N/10==0) return temp*10+N%10;
        else return reverse(N/10,temp*10+N%10);
    }
    public static void rec(int N) {
        if(N > 0) {
            System.out.println( N % 10);
            rec(N / 10);
        }
    }


    public static void main(String[] args){
      rec(reverse(2331,0));
    }
}
