package ru.mirea.task4.phone;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+8-916-362-16-82", "iphone", 210);
        Phone phone2 = new Phone("+8-926-334-27-27", "xiaomi", 180);


        System.out.println("\nPhone1: " + phone1);
        System.out.println("Phone2: " + phone2);

        System.out.println("\nFirst phone`s number: " + phone1.getNumber()); phone1.receiveCall("Dima");
        System.out.println("Second phone`s number: " + phone2.getNumber()); phone2.receiveCall("Daya");


        phone1.receiveCall("\nArtem", "+8-916-362-16-82");
        phone2.receiveCall("Mama", "+8-926-334-27-27");

        System.out.println();
        phone1.sendMessage("Hello family", new String[]{"+8-916-362-16-82", "+8-926-334-27-27"});
    }
}
