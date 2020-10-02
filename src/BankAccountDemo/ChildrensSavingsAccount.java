package BankAccountDemo;

class ChildrensSavingsAccount extends SavingsAccount {

    @Override
    public void interest() {
        System.out.println("Interest: 5.0%");
    }
}
