public class MainThreadDemo {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Name:" + t.getName());
        System.out.println("ID:" + t.getId());
        System.out.println("Alive:" + t.isAlive());
        System.out.println("Priority:" + t.getPriority());
        System.out.println("Deamon:" + t.isDaemon());

        t.setName("my-thread");
        System.out.println("New name:" + t.getName());
    }
}
