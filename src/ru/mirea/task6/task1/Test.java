

package ru.mirea.task6.task1;

public class Test {
    public static void main(String[] args)
    {
        MovableCircle obj = new MovableCircle(10, 10, 5, 5, 4);
        System.out.println(obj);
        obj.moveUp();
        obj.moveLeft();
        System.out.println(obj.toString());
    }
}
