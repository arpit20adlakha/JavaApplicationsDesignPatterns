package com.company;

import org.mockito.internal.matchers.Null;

import java.util.Optional;

public class NullDemo {
    public static void main(String[] args) {
        String myname = null;
        boolean isString = myname instanceof String;
        System.out.println(isString);

        assert myname != null;
        System.out.println("End of my program");


        getMyname(null).isEmpty();
//        String name = null;
//        String uppercase = name.toLowerCase();
//        System.out.println(uppercase);
//        String resultFromMethod = getMyname();
//        System.out.println(resultFromMethod);
        System.out.println(getMyname(null));
    }

    private static Optional<String> getMyname(String myname) {
        return Optional.ofNullable(myname);
//        if (myname == null) {
////            throw new IllegalArgumentException("Hey firstname can not be null!");
////            myname = "Arpit Adlakha";
//
//        }
//        return Optiona.myname;
    }
}
