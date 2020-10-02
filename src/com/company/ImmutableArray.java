package com.company;

public class ImmutableArray<T> {

    private T[] items;

    public ImmutableArray(T []arr) {
        this.items = arr;
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
