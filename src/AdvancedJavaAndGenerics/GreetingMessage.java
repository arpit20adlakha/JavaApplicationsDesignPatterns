package AdvancedJavaAndGenerics;

@FunctionalInterface
public interface GreetingMessage {
    void greet(String name);
    default void sayHello() {
        System.out.println("hello");
    }

    static void mewo() {
        System.out.println("I am the static method");
    }
}
