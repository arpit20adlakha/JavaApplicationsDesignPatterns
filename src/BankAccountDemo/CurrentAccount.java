package BankAccountDemo;

public class CurrentAccount extends Account {

    @Override
    public boolean isChequeAvailable() {
        return true;
    }

    @Override
    public void interest() {
        System.out.println("No interest");
    }
}
