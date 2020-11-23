package Generics;

public class Employee extends Person{
    static int quality = 2;
    private int salary;
    public Employee(String name, int salary, int age) {
        super(age, name);
        this.salary = salary;
    }


}
