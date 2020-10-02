package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public static void cookVeganPizza() throws InterruptedException {
        Base base = new Base();
        Tomatoes tomatoes = new Tomatoes();
        Tofu tofu = new Tofu();
        Bake bake = new Bake();
        List<Thread> stepOfCook = new ArrayList<>();
        stepOfCook.add(base);
        stepOfCook.add(tomatoes);
        stepOfCook.add(tofu);
        stepOfCook.add(bake);
        for (Thread step : stepOfCook) {
            step.start();
            step.join();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        cookVeganPizza();
    }
}
