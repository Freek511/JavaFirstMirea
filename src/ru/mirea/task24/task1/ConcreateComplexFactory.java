package ru.mirea.task24.task1;

import java.util.Random;

public class ConcreateComplexFactory implements ComplexAbstractFactory{


    public Complex createComplex() {
        return new Complex(new Random().nextInt(100), new Random().nextInt(100));
    }

    public Complex createComplex(int iReal, int iImage) {
        return new Complex(iReal, iImage);
    }
}
