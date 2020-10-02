package com.company;

public class Generriix<T> {
    private T t;

    public Generriix(T t) {
        this.t = t ;
    }

    public T get() {
        return this.t;
    }




    public static void main(String[] args) {
        Generriix<String>  strr = new Generriix<>("how are you");
        System.out.println(strr.get());
    }
}
