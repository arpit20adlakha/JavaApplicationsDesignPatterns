package AdvancedJavaAndGenerics;

import java.util.Scanner;

public class ThreadImplementor extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Integer inputInt = scanner.nextInt();
        System.out.println("I am running and I have taken the input" + inputInt);
    }
}
