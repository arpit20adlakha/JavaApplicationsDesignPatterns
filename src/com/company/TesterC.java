package com.company;

import java.util.Arrays;

public class TesterC {


    enum types {
        PUBLICATION("Publication"),
        NEWSPAPER("Newspaper"),
        ARTICLE("Article"),
        ANNOUNCEMENT("Announcement");

        private String value;

        types(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) throws java.lang.InterruptedException{





        If inst = new implementingClass();
        inst.defaultMethod();
//        inst.instanceMethod1();
        inst.instanceMethod2();


        int lp =1;
        String a = String.valueOf(lp);

        new DoublePromotion().sayHello();

        SomeClass instance = new SomeClass(3000, "another-value");

        System.out.println(instance.val);
        System.out.println(instance.str);


        Promotion promotion = new Promotion(new Salary(9000));
        Promotion promotion1 = new Promotion(new Salary(8000));
        Promotion promotion2 = new Promotion(new Salary(4000));

        Promotion[] promoArray = {promotion, promotion1, promotion2};
        Promotion[] newPromoArray = new Promotion[3];

        for (int i = 0;  i < promoArray.length; i++) {
            newPromoArray[i] = new Promotion(promoArray[i]);
        }


        for(Promotion promo : promoArray) {
            System.out.println(promo.salary.income);
        }

        promoArray[0].salary.income = 5;
        for(Promotion promo : newPromoArray) {
            System.out.println(promo.salary.income);
        }


        for(Promotion promo : promoArray) {
            System.out.println(promo.salary.income);
        }


        System.out.println(promotion.salary.income);
        promotion.promote();
        System.out.println(promotion.salary.income);

        Person p = new Person();

        p.setMap(4, 10);

        System.out.println(p.map.get(4));
        Person t = new Person();
        System.out.println(t.map.get(5));

        String [] arr = new String[]{"Arpit", "Joe", "Sanders"};

        String []  newArr = Arrays.stream(arr).toArray(String[]:: new);


        int[] array = {12, 45, 55, 34};

        int length = array.length;


        int[] copiedArr = Arrays.copyOf(array, length);
        System.out.println(Arrays.toString(copiedArr));
        copiedArr[1] = 20;
        System.out.println(Arrays.toString(array));

        Thread thread1 = new Thread(new Tap(3));
        Thread thread2 = new Thread(new Tap(4));
        thread1.start();
        thread2.start();
//        thread1.sleep(4000);


    }



    public static class Tap implements  Runnable {
        int value ;

        public Tap(int value) {
            this.value = value;
        }

        @Override
        public void run() {
            System.out.println(this.value);
        }
    }
}
