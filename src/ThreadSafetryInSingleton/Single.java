package ThreadSafetryInSingleton;

public final class Single {
    private static Single single;

    private Single() {

    }

    public  synchronized static Single getInstance() {
        if (single == null) {
            return single = new Single();
        }
        else return single;
    }


    public void printSomething() {
        System.out.println("Howdy");
    }
}
