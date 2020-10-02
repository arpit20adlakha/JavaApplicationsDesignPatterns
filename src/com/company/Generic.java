package com.company;

public class Generic<T> {

    private T t;

    public Generic(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public T set(T t) {
        this.t = t;
        return this.t;
    }
}
