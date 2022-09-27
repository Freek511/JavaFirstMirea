package ru.mirea.task2.exs8;
import java.util.Scanner;

public class ChangeStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 6;
        String[] arr = new String[SIZE];

        for(int i = 0; i < SIZE; i++)
        {
            arr[i] = in.nextLine();
        }
        System.out.println("Your array:");
        for(int i = 0; i < SIZE; i++)
        {
           System.out.print(arr[i]+' ');
        }

        for(int i = 0; i < SIZE/2; i++)
        {
            String temp = arr[i];
            arr[i] = arr[SIZE - i - 1];
            arr[SIZE - i - 1] = temp;
        }
        System.out.println("\nYour result:");
        for(int i = 0; i < SIZE; i++)
        {
            System.out.print(arr[i]+' ');
        }
    }
}
