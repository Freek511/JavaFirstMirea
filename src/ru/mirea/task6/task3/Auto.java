
package ru.mirea.task6.task3;

public class Auto implements Nameable
{
    private String name;

    public Auto(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
