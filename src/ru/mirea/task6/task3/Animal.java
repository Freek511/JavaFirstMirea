

package ru.mirea.task6.task3;

public class Animal implements Nameable
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
