
package ru.mirea.task7.task7_8;

public class Book implements Printable
{
    private String name;

    public Book(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println(name);
    }

    public static void printBooks(Printable[] printable)
    {
        for(int i = 0; i < printable.length; i++)
        {
            if (printable[i] instanceof Book)
             printable[i].print();
        }
    }
}
