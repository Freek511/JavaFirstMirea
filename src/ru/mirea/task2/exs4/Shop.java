package ru.mirea.task2.exs4;

import java.util.Scanner;

public class Shop
{
    private PC comps[];

    public Shop(int n)
    {
        comps = new PC[n];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            System.out.print("Введите имя: ");
            String name = in.nextLine();
            comps[i] = new PC(name);
        }
    }

    public void add()
    {
        PC tempComps[] = new PC[comps.length + 1];
        for(int i = 0; i < comps.length; i++)
            tempComps[i] = comps[i];
        System.out.print("Введите имя для добавления: ");
        String name;
        name = new Scanner(System.in).nextLine();
        tempComps[comps.length] = new PC(name);
        comps = tempComps;
    }

    public int find(String name)
    {
        int i = 0;
        for(PC x: comps)
        {
            if (x.getName().equals(name))
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void delete(String name)
    {
        PC tempArr[] = new PC[comps.length - 1];
        int n = find(name);
        if(n == -1)
        {
            System.out.println("Данного комрьютера не существует");
        }
        else
        {
            for (int i = 0; i < n; i++)
                tempArr[i] = comps[i];

            for (int i = n; i < comps.length - 1; i++)
                tempArr[i] = comps[i + 1];
            comps = tempArr;
        }
    }
    public void displayAll()
    {
        for(PC x: comps)
        {
            System.out.print(x.getName() + " ");
        }
        System.out.println();
    }

    public String getName(int n)
    {
        if(n< comps.length)
            return comps[n].getName();
        else
            return "Данного комрьютера не существует";
    }
}
