package ru.mirea.task3.Raport;

import java.text.NumberFormat;

public class Report {

    static public void generateReport(Employee[] employees) {

        NumberFormat formatRus = NumberFormat.getCurrencyInstance();

        for (Employee e: employees) {
            System.out.printf("Employee: %30s\tSalary:\t%15s\n", e.getFullName(), formatRus.format(e.getSalary()));
        }
    }
}
