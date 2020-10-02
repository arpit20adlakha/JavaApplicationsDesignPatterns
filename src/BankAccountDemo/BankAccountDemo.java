package BankAccountDemo;

public class BankAccountDemo {
    public static void main(String[] args) {
        doStuff(new ChildrensSavingsAccount());
        doStuff(new CurrentAccount());
        doStuff(new GeneralSavingsAccount());
    }

    public static void doStuff(Account acc) {
        System.out.println("Account name: " + acc.getName());
        System.out.println("Is cheque available: " + acc.isChequeAvailable());
        acc.interest();
    }
}
