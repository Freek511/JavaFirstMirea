package ru.mirea.task24.task2;

public class MagicChairFactory implements AbstractChairFactory{

    public Chair createChair() {
        return new MagicChair();
    }

}
