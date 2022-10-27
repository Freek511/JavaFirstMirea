package ru.mirea.task13;

import java.util.StringTokenizer;

public class Adress {
    String country;
    String region;
    String city;
    String street;
    String house;
    String corpus;
    String flat;

    public void setAdress(String address) {
        String [] add = address.split(",");

        country = add[0];
        region = add[1];
        city = add[2];
        street = add[3];
        house = add[4];
        corpus = add[5];
        flat = add[6];
    }
    public String getAdress()
    {
        return country + " " + region + " " + city + " " + street + " " + house + " " + corpus + " " + flat;
    }

    public static void main(String[] args) {
        String str1 = "Russia,MoscowRegion,Serpukhov,Osennyaya,7,a,67";
        String str2 = "USA,Texas,Arlington,CentralSt,12a,c2,123";
        Adress ad1 = new Adress();
        ad1.setAdress(str1);
        System.out.println(ad1.getAdress());
        ad1.setAdress(str2);
        System.out.println(ad1.getAdress());

    }
}