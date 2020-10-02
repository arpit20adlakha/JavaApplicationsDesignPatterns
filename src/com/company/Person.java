package com.company;

import java.util.HashMap;
import java.util.Map;

public class Person {

    public Integer Age;
    public String Name;
    public static Integer p;
    public Map<Integer, Integer> map = new HashMap<>();


    public void setMap(int key, int value) {
            map.put(key, value);
    }


}
