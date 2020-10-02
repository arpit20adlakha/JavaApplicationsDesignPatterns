package com.company;

public class genericPrinterClass<T> {
    public void genericPrinter(T p, int times) {
        for(int i = 0; i< times; i++) {
            System.out.print(p + " ");
        }
    }
}
