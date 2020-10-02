package com.company;


import org.junit.internal.JUnitSystem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Cat {

    static List<ChargeBack> chargeBacks = new ArrayList<>();

    VehicleType i = VehicleType.CAR;


    String name;
    boolean sleeping;


    enum ChargeBackEnum {
        PENDING, COMPLETED, REVERSED;
    }

    public static String getChargebackStatus() {
        Set<String> chargeBackStatusSet = chargeBacks.stream().map(item -> item.getStatus().toLowerCase()).collect(Collectors.toUnmodifiableSet());
        List<String> statusList = Stream.of(ChargeBackEnum.values()).map(ChargeBackEnum::name).map(String::toLowerCase).collect(Collectors.toList());
        return statusList.stream().filter(chargeBackStatusSet::contains).findFirst().orElseGet(() -> chargeBacks.isEmpty() ?  "" : chargeBacks.get(0).status);
    }

    public void say() {
        List<String> strings = new ArrayList<>(List.of("pending", "chanding", "manding"));
        List<String> list2 = new ArrayList<>();

        if (sleeping) {
            System.out.println("zzz");
        } else {
            System.out.println("meow");

            if(Math.random() > 0.5) {
                sleeping = true;
            }
        }
    }

    public void wakeUp() {
        sleeping = false;
    }

    public static void main(String[] args) {
        chargeBacks.add(new ChargeBack("huala"));
//        chargeBacks.add(new ChargeBack("pending"));
//        chargeBacks.add(new ChargeBack("completed"));
//        chargeBacks.add(new ChargeBack("reversed"));
        System.out.println(getChargebackStatus());
        Generriix<String>  dff = new Generriix<>("I am cat");
        System.out.println(dff.get());

        Stream.of(1, 2, 4).filter(number -> number ==1 ).collect(Collectors.toList());

        Set<String> stringSet = Set.of();
        Set<String> suu = Set.of("arpit", "harry", "sejy");
//        suu.add("huy");
        System.out.println(suu.contains("arpit"));


        ArrayList<String> names = new ArrayList<>();

        System.out.println(names.size());
        names.add("Justin");
        names.add("Helen");
        names.add("Joshua");

        String[] a = {"1", "2"};
        List<Integer> arr = Stream.of(a).mapToInt(Integer::parseInt).mapToObj(Integer::valueOf).collect(Collectors.toList());
        Integer o = 23;
        Integer p = 43;
        if (o.equals(p)) {
            System.out.println("same value " +o);
        }
        System.out.println(arr);
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        names.add(0, "Teresa");
        names.remove("Helen");
        Collections.sort(arr);
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        });
//        names.clear();
        System.out.println(names.contains("Joshua"));
        System.out.println(names.indexOf("Justin"));
        List<Integer>  ne = Arrays.asList(1, 2, 3, 5);
        System.out.println(ne);
        for (String s : names) {
            System.out.println(s);
        }

        Generic<Integer>  g = new Generic<>(5);

        Generic<String> obj2 = new Generic<>("abc");
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        Integer[] intArr = new Integer[]{1, 2, 3, 5, 6};

        ImmutableArray<Integer> newArr = new ImmutableArray<>(intArr);
        System.out.println(newArr.get(1));
        System.out.println(Arrays.toString(intArr));
        intArr[1] = 39;

        System.out.println(newArr.get(1));


        var ob3 = new Generic<>("abc");
        int primitive = 100;
        Integer m = Integer.valueOf(primitive);
        int anotherInt = m.intValue();
        System.out.println(anotherInt);

        Boolean b = new Boolean("true");
        System.out.println(b);
        Cat pharaoh = new Cat();
        pharaoh.name = "pharaoh";

        for(int i =0; i< 5;i++) {
            pharaoh.say();
        }
        pharaoh.wakeUp();
        pharaoh.say();
    }
}
