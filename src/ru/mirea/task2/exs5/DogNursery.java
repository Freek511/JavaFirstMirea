package ru.mirea.task2.exs5;
import java.util.Scanner;

public class DogNursery {
    private Dog[] dogs;
    public void add()
    {
        Dog temp[] = new Dog[dogs.length + 1];
        for(int i = 0; i < dogs.length; i++)
        {
            temp[i] = dogs[i];
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя для добавления: ");
        String name = in.next();
        System.out.print("Введите возраст для добавления: ");
        int age = in.nextInt();
        temp[dogs.length ] = new Dog(age,  name);
        dogs = temp;
    }
    public DogNursery(int n)
    {
        dogs = new Dog[n];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            System.out.print("Введите имя: ");
            String name = in.next();
            System.out.print("Введите возраст: ");
            int age = in.nextInt();
            dogs[i] = new Dog(age, name);
        }
    }
    public void displayAll()
    {
        for(Dog x: dogs)
        {
            System.out.println(x.toString());
        }
    }
}
