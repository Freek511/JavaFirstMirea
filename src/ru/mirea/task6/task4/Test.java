
package ru.mirea.task6.task4;

public class Test
{
    public static void main(String[] args)
    {
        Priceable temp = new Auto(1000000);
        System.out.println(temp.getPrice());

        temp = new Ball(10);
        System.out.println(temp.getPrice());

        temp = new Pc(1000);
        System.out.println(temp.getPrice());
    }
}
