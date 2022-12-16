package ru.mirea.task2.exs7;

import ru.mirea.task2.exs4.PC;

import java.util.Scanner;

public class Bookshelf {
    private Book[] books;
    private int count;

    public Bookshelf(int count) {
        this.count = count;
        books = new Book[this.count];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < this.count; i++)
        {
            System.out.print("Введите название: ");
            String name = in.next();
            System.out.print("Введите имя автора: ");
            String author = in.next();
            System.out.print("Введите год издания: ");
            int year = in.nextInt();
            System.out.print("Введите количесвто страниц: ");
            int pages = in.nextInt();
            books[i] = new Book(name, author, year, pages);
        }
    }
    public Book latestBook() {
        Book tempBook = books[0];
        for(int i = 1; i < count; i++)
        {
            if(tempBook.getYear() > books[i].getYear())
                tempBook = books[i];
        }
        return tempBook;
    }
    public Book earliestBook() {
        Book earliestBook = books[0];
        for(int i = 1; i < count; i++)
        {
            if(earliestBook.getYear() < books[i].getYear())
                earliestBook = books[i];
        }
        return earliestBook;
    }
    public void sortByYear() {
        for(int i = 0; i < count - 1; i++)
        {
            for(int j = i + 1; j < count; j++)
            {
                if(books[i].getYear() > books[j].getYear())
                {
                    Book temp = books[i];
                    books[i]=books[j];
                    books[j] = temp;
                }
            }
        }
    }
    public void displayAll()
    {
        for(Book temp : books)
            System.out.println(temp.toString());
    }
}
