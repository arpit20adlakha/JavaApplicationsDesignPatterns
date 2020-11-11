package AbstaractClassVsInterface;

import BankAccountDemo.BankAccountDemo;

public abstract class Abstraction implements abs {
    static Integer a = 33;
    final Integer b = 44;
    static final Integer t = 44;
    String temp = "Hello";
    String jump = "Hello";

    Abstraction(int a, int b) {
        this.a = a;
        temp = Integer.toString(b);
    }

    Abstraction() {

    }

    protected static void main(String[] args) {
        System.out.println("Hi from main method");
        Abstraction abs =  new Abstraction() {
            @Override
            public void checked() {

            }
            @Override
            public void marker() {

            }
        };

        abs.StringCheker();
    }

    private void StringCheker() {
        System.out.println(temp + jump);
    }

    public abstract void checked();

    public abstract void marker();
//
//    @Override
//    public void talk() {
//
//    }

//   You can't override this because this is a static method only default methods can be overriden
//    @Override
//    public void bolo() {
//
//    }
}
