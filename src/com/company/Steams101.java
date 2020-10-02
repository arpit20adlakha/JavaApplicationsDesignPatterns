package com.company;

import javax.naming.LinkRef;
import java.util.*;

public class Steams101 extends Main{
    private int b;
    public int sum() {
        return a+b;
    }

    public static void method(short s) {
        System.out.println("short");
    }

    public static void method(byte b) {
        System.out.println("byte");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }




    public static void main(String []args) {

        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(2);
        queue.add(0);
        queue.add(1);
        queue.add(7);
        System.out.println(queue);

        int _cat$6;
        int z = 'z';
//        char mystery = z-10;
        char c='1'+ '3';
        System.out.println(c);

        LinkedList<Integer> list = new LinkedList<>(new ArrayList<>());
        ArrayList<Integer> lisp = new ArrayList<>();
//        LinkedList<Integer> ll = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
map.get(0);
    method(10);
    map.keySet();

        Long val = new Long(4321);
        Long tatp = new Long("4321");

        Long tt = Long.parseLong("4321");
        System.out.println(tt);
        Long a = 4321L;
        System.out.println(tatp);
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        numbers.forEach(e-> {
            int count =0;
            for(int i=1; i<=e; i++) {
                if(e%i == 0) count++;
            }
            System.out.println(count);
        });



        numbers.forEach(e-> System.out.println(countFactors(e)));



    }

    public static Integer countFactors(Integer number) {
        int count = 0;
        for(int i=1; i<=number ; i++) {
            if(number%i == 0) count++;
        }
        return count;
    }
}
