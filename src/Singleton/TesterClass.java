package Singleton;

import io.reactivex.Single;

public class TesterClass {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton1);
        System.out.println(singleton1 == singleton2);

        System.out.println();
    }
}
