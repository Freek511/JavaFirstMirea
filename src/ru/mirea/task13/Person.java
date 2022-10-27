package ru.mirea.task13;

public class Person{
    String name = "";
    String surname = "";
    String fathername = "";

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getFIO() {
        String fio = surname;
        if (!name.equals(""))
            fio = fio + " " + name.charAt(0) + ".";
        if (!fathername.equals(""))
            fio = fio + fathername.charAt(0) + ".";
        return fio;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Artem");
        p1.setFathername("Andreevich");
        p1.setSurname("Matveev");
        System.out.println(p1.getFIO());

        Person p2 = new Person();
        p2.setSurname("Smiths");
        System.out.println(p2.getFIO());
    }
}