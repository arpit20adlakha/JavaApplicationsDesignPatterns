package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintingFruitTypesAndThings implements Runnable {
    AtomicInteger i;

    @Override
    public void run () {
            i = new AtomicInteger(4);
            Orange orange = Orange.getInstance(3, "light orange", 9);
            System.out.println(orange);
            System.out.println(orange.getFruitType());
            System.out.println(orange.getColorOfFruit());
            System.out.println(orange.getNumberOfFruits());
            System.out.println(orange.getWeightOfFruit());
            System.out.println(i);
        }
}
