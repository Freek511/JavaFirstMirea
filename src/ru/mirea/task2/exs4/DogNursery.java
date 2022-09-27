package ru.mirea.task2.exs4;
import java.util.Scanner;

public class DogNursery {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name;
        int SIZE, age;

        System.out.println("Введите количество собак: ");
        SIZE = in.nextInt();
        Dog[] dogs = new Dog[SIZE];

        for(int i = 0; i < SIZE; i++)
        {
            System.out.println("Введите имя собаки и ее взраст: ");
            age = in.nextInt();
            name = in.nextLine();
            dogs[i] = new Dog(age, name);
        }
        for(int i = 0; i < SIZE; i++)
        {
            System.out.println(dogs[i].toString());
        }
    }
}
