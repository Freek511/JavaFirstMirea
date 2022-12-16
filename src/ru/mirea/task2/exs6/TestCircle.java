package ru.mirea.task2.exs6;

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle obj1 = new Circle(1, 1, 4);
        Circle obj2 = new Circle(2, 2, 4);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.calcArea() + " " + obj1.calcLenght());
    }
}
