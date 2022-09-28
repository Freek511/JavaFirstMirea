package ru.mirea.task2.exs7;

public class TestBook {
    public static void main(String [] args) {
        Bookshelf obj = new Bookshelf(3);
        System.out.println("Ваша полка:");
        obj.displayAll();
        System.out.println("Самая новая книга:" + obj.latestBook().toString());
        System.out.println("Самая старая книга:" + obj.earliestBook().toString());
        obj.sortByYear();
        System.out.println("Отсортированные книги: ");
        obj.displayAll();

    }
}
