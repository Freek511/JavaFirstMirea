package ru.mirea.task2.exs3;

import java.util.Scanner;

public class Tester {
    private int arrSize;
    private Circle[] circArr;

    public Tester(int n)
    {
        arrSize = n;
        circArr = new Circle[arrSize];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            int x = i, y = i, radius = i*2;
            circArr[i] = new Circle(x, y, radius);
        }
    }
    public void displayAll()
    {
        for(Circle x : circArr)
            System.out.println(x.toString());
    }
    public static void main(String [] args)
    {
        Tester obj = new Tester(3);
        obj.displayAll();
    }

}
