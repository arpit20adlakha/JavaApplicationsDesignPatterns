package FactoryPattern;

public class MotorStaticFactory {

    public static Motor make(char type, String model, long power) {
        Character c = Character.toUpperCase(type);

        switch(c) {
            case 'P':
                return new
        }
    }
}
