package com.company;
import com.fasterxml.jackson.databind.util.ISO8601Utils;
import org.jetbrains.annotations.NotNull;

import java.util.*;

class AsciiCharSequence implements java.lang.CharSequence {

    byte[] byteArray;

    public AsciiCharSequence( byte[] byteArray) {
        this.byteArray = byteArray.clone();
    }

    @Override
    public int length() {
        return this.byteArray.length;
    }

    @Override
    public char charAt(int var) {
        return (char)this.byteArray[var];
    }

    @Override
    public CharSequence subSequence(int var1, int var2) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.byteArray, var1, var2));

    }

    @Override
    public String toString() {
        System.out.println(new String(this.byteArray));
        return new String(this.byteArray);
    }


    public static  void main(String[] args) {
        byte[] arr = {'a','b', 'c'};
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : map.keySet()) {

        }
        System.out.println(new AsciiCharSequence(arr).toString());
    }
}