package com.company;

public class Promotion {
    Salary salary;

    Promotion(Salary salary) {
        this.salary = salary;
    }

    protected  void sayHello() {
        System.out.println("Hellooooo from parent class");
    }

    Promotion(Promotion promotion) {
        this.salary = new Salary(promotion.salary.income);

    }

    public void promote() {
        salary.income += 1500;
    }
}
