

package ru.mirea.task6.task12;

public class Test {
    public static void main(String... args)
    {
        StringBuilder2 str = new StringBuilder2("Hello");
        str.append("WWW");
        System.out.println(str.toString());
        str.undo();
        System.out.println(str.toString());

        str.append("LLL");
        System.out.println(str.toString());
        str.delete(2, 5);
        System.out.println(str.toString());
        str.undo();
        str.undo();
        System.out.println(str.toString());
    }
}
