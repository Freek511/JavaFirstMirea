
package ru.mirea.task6.task11;

public class Convert implements Convertable{
    public double convertKel(int n)
    {
        return n + 273;
    }

    public double convertFar(int n)
    {
        return n*1.8 + 32;
    }
}
