package ru.mirea.task3.Raport;

public class EmployeeReport {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivanov Ivan Ivanovich", 210000.0),
                new Employee("Matveev Atrem Abdreevich", 15000.0),

        };
        Report.generateReport(employees);
    }
}
