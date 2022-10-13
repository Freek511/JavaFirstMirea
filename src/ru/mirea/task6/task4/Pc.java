
package ru.mirea.task6.task4;

public class Pc implements Priceable
{
    private int price;

    public Pc(int price) {
        this.price = price;
    }

    @Override
    public int getPrice()
    {
        return price;
    }
}
