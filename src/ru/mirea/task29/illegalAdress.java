package ru.mirea.task29;

public class illegalAdress extends Error{
    public illegalAdress(String adress){
        super("There is no such adress " + adress + "");
    }
}
