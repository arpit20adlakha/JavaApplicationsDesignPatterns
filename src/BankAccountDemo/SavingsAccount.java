package BankAccountDemo;

abstract class SavingsAccount extends Account {
    @Override
    public boolean isChequeAvailable() {
        return false;
    }
}
