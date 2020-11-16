package AdvancedJavaAndGenerics;

public class Mainee {
    public static void main(String[] args) throws InterruptedException {

        ThreadImplementor implementor = new ThreadImplementor();
        System.out.println("I am running in the main thread");
        implementor.setName("My first Thread");
        implementor.start();
        Thread.sleep(2000);
        for (int i = 0; i< 500; i++) {
            System.out.println("Wohooo still able to run");
        }



        Runnable target = new RunnableExample();
        Thread thread1 = new Thread(target);
        thread1.start();


        Thread thread2 = new Thread(() -> {
            int i =0;
            while(i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });



        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello" + name);
            }
        };

        GreetingMessage gm2 = (name) -> System.out.println("Hello" + name);

        gm2.greet("Arpit");


        Square s = new Square(4);
//        Shapes shapes = (square) ->  square.calculateArea();
        Shapes shapes = Square::calculateArea;
        System.out.println("Area: " + shapes.getArea(s));

    }
}
