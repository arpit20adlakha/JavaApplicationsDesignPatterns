package com.company;

public class Employee extends Person1{

    protected long salary;

    public Employee(String name, long salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name=" + name + ",salary=" + salary + "}";
    }

    public static void main(String[] args) {
        Person1 person = new Person1("Helena");
        Employee employee = new Employee("Michael", 10_000);
        System.out.println(person.toString());
        System.out.println(employee.toString());
    }
}
