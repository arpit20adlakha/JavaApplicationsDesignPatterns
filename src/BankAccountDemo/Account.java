package BankAccountDemo;

public abstract class Account {
    public abstract void interest();

    public abstract boolean isChequeAvailable();

    public String getName() {
        String accName = this.getClass().toString().replace("class", "");
        return accName;
    }
}
