package Generics;


import BankAccountDemo.Account;
import BankAccountDemo.CurrentAccount;

public class Testing {
    public static void main(String[] args) {

        Employee emp = new Employee("Arpit", 10000, 24);
        Manager mg = new Manager("Tapzo", 30, "Senior",  3000);
        Calculation<Employee, Manager> c = new Calculation<>();

        c.doubleAge(emp);
        System.out.println(emp.getAge());
        String na = c.getNameString(mg);
        System.out.println(na);
    }

    public static <T> String makeString(String incoming) {
        return incoming.toLowerCase();
    }
}
