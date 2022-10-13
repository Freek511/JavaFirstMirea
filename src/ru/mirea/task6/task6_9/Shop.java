

package ru.mirea.task6.task6_9;

public class Shop implements Printable
{
    public String name;

    public Shop(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println(name);
    }
}
