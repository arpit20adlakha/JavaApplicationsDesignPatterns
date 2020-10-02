package com.company;
import com.company.ChargeLevel;

import static com.company.ChargeLevel.LOW;
import static com.company.UserStatus.PENDING;
import static com.company.UserStatus.ACTIVE;
import static  com.company.UserStatus.BLOCKED;

public class TestingEnum {

    public static void main(String[] args) {
        System.out.println(LOW.getSections());
        System.out.println(LOW.getSections());

        System.out.println(ChargeLevel.findByColor("yellow"));


        UserStatus status = PENDING;

        switch(status) {
            case PENDING:
                System.out.println("You need to wait a little");
                break;
            case ACTIVE:
                System.out.println("No problems, you may pass here");
                break;
            case BLOCKED:
                System.out.println("Stop! You can't pass here");
                break;
            default:
                System.out.println("Unsupported enum constant");
        }


    }

}
// package private is available for access within the package