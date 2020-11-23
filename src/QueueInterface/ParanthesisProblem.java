package QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ParanthesisProblem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.next();
        Deque<Character> dq = new ArrayDeque<>();
        int i = 0;

        while(i != input.length() - 1) {
            switch(input.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    dq.offerLast(input.charAt(i));
                    break;
                case ')':
                    if (dq.peekLast() == '(') {
                        dq.pollLast();
                    } else {
                        System.out.println("false");
                        return;
                    }
                    break;
                case ']':
                    if (dq.peekLast() == '[') {
                        dq.pollLast();
                    } else {
                        System.out.println("false");
                        return;
                    }
                    break;
                case '}':
                    if (dq.peekLast() == '{') {
                        dq.pollLast();
                    } else {
                        System.out.println("false");
                        return;
                    }
                    break;
                default:
                    throw new Exception("Not expected value");
            }
            i++;
        }

        if (dq.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
