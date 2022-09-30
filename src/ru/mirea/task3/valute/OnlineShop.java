package ru.mirea.task3.valute;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        double laptopPrice = 15000.0;
        double pcPrice = 35000.0;
        double smartphonePrice = 11000.0;

        System.out.println("Choose the product:");
        NumberFormat formatRus = NumberFormat.getCurrencyInstance();
        System.out.println("1 - Laptop.\t\tPrice: " + formatRus.format(laptopPrice));
        System.out.println("2 - PC.\t\t\tPrice: " + formatRus.format(pcPrice));
        System.out.println("3 - Smartphone.\tPrice: " + formatRus.format(smartphonePrice));
        System.out.print("--> ");

        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        sc.skip("\n");

        System.out.print(" What currency do you want to pay in? 1 - Russian ruble. 2 - American dollar. 3 - Chinese yuan. 4 - Japanese jena. 5 - European euro. -->\040");
        int choice2 = sc.nextInt();
        sc.skip("\n");

        String choosenProduct = "";
        double choosenPrice = 0.0;
        switch (choice1) {
            case 1: {
                choosenProduct = "Laptop";
                choosenPrice = laptopPrice;
                break;
            }
            case 2: {
                choosenProduct = "PC";
                choosenPrice = pcPrice;
                break;
            }
            case 3 : {
                choosenProduct = "smartphone";
                choosenPrice = smartphonePrice;
                break;
            }
            default : { break;
            }
        }

        System.out.print("Your " + choosenProduct + " costs: ");
        switch (choice2) {
            case 1: {System.out.println(formatRus.format(choosenPrice)); break;}
            case 2: {
                NumberFormat formatUSA = NumberFormat.getCurrencyInstance(Locale.US);
                System.out.println(formatUSA.format(CurConverter.toDollars(choosenPrice)));
                break;
            }
            case 3: {
                NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
                System.out.println(formatChina.format(CurConverter.toYuan(choosenPrice)));
                break;
            }
            case 4 : {
                NumberFormat formatJapan = NumberFormat.getCurrencyInstance(Locale.JAPAN);
                System.out.println(formatJapan.format(CurConverter.toJena(choosenPrice)));
                break;
            }
            case 5 : {
                NumberFormat formatEurope = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                System.out.println(formatEurope.format(CurConverter.toEuro(choosenPrice)));
                break;
            }
            default : { break;
            }
        }
    }
}
