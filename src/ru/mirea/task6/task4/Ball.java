
package ru.mirea.task6.task4;

public class Ball implements Priceable
{
    private int price;

    public Ball(int price) {
        this.price = price;
    }

    @Override
    public int getPrice()
    {
        return price;
    }
}
