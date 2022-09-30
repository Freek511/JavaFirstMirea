package ru.mirea.task4.employeemanager;

public class Tester {
    public static void main(String[] args) {
        Employee man = new Manager("Artem", "Ivanov", 15000.0, 3000.0);
        System.out.println(man.getFullName() + ". Income: " + man.getIncome() + "\n");

        Employee[] employees = {
                new Employee("Ivan", "Matveev", 27000.0),

        };
        for (Employee e : employees) {
            System.out.println(e.getFullName() + ". Income: " + e.getIncome());
        }
    }
}