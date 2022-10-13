package ru.mirea.task8;

import java.util.Scanner;

public class exs17 {

    public static int func()
    {
        int n = new Scanner(System.in).nextInt();
        if (n == 0)
        {
            return 0;
        } else
        {
            return Math.max(n, func());
        }
    }

    public static void main(String[] args)
    {
        System.out.println(func());
    }
}
