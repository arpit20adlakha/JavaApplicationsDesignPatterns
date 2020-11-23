package QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueTesting {

    private static final Queue<String> q = new ArrayDeque<>();
    public static void main(String[] args) {
        String s = "qwuw";

        q.offer("first");
        q.offer("second");
        q.offer("third");
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.poll());

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println(q.isEmpty());

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerLast(5);
        dq.offerLast(7);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


        Deque<String> states = new ArrayDeque<>();

        states.add("Germany");
        states.add("France");
        states.push("UK");
        states.offerLast("Norway");

        String sFirst = states.pop();
        String p = states.peek();
        String sLast = states.peekLast();
        states.offer(sFirst);
        String s1 = states.pollLast();

        while (states.peek() != null) {
            System.out.println(states.pop());
        }


    }
}
