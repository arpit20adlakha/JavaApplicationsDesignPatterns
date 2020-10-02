package com.company;

public class TestingAnonymousClass {

    private static String BYE_STRING = "Auf Wiedersehen!";


    public static void main(String[] args) {
        final String hello = "Guten Tag!";


        SpeakingEntity germanSpeakingPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println(hello);
            }

            @Override
            public void sayBye() {
                System.out.println(BYE_STRING);
            }
        };

        germanSpeakingPerson.sayBye();
        germanSpeakingPerson.sayHello();


        SpeakingEntity speakingEntity = new SpeakingEntity() {

            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };
        speakingEntity.sayBye();
        speakingEntity.sayHello();


        SpeakingEntity cat = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Meow!");
            }

            @Override
            public void sayBye() {
                System.out.println("Meow!");
            }
        };

        cat.sayHello();
        cat.sayBye();
    }

}
