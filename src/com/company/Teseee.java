package com.company;

import javafx.scene.control.CheckBox;

import java.util.concurrent.CompletableFuture;

public class Teseee {

    public static void main(String[] args){
        Object result;
        CheckingObjects o1 = new CheckingObjects();
        CheckingObjects o2 = new CheckingObjects();
        o1.setString("krli tatti");
        System.out.println(o1);
        System.out.println(o1.getString());
        System.out.println(o2.getString());
        System.out.println(o2);
        ;
    }
}
