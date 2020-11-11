package Generics;

public class Calculation<K extends Person, V extends Person> {

    public void doubleAge(K person) {
        int newAge = person.getAge() * 2;
        person.setAge(newAge);
    }

    public String getNameString(V person) {
        return person.getName();
    }


}

