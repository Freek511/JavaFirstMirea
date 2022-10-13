
package ru.mirea.task6.task4;

public class Auto implements Priceable
{
    private int price;

    public Auto(int price)
    {
        this.price = price;
    }

    @Override
    public int getPrice()
    {
        return price;
    }
}
