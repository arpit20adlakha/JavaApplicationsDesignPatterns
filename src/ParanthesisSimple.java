
import java.util.*;
import java.lang.*;
import java.io.*;
public class ParanthesisSimple {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while(t > 0) {
                t--;

                String s = scanner.next();
                Stack<Character> stack = new Stack<>();
                boolean imbalancedFound = false;
                for (int i = 0; i <s.length(); i++) {
                    if (imbalancedFound == true) {
                        System.out.println("not balanced");
                        break;
                    }
                    switch(s.charAt(i)) {
                        case '(':
                        case '{':
                        case '[':
                            stack.push(s.charAt(i));
                            break;
                        case '}':
                            if (!stack.isEmpty() && stack.peek() == '{') {
                                stack.pop();
                            } else {
                                imbalancedFound = true;
                                // stack.push(s.charAt(i));
                            }
                            break;
                        case ']':
                            if (!stack.isEmpty() && stack.peek() == '[') {
                                stack.pop();
                            } else {
                                imbalancedFound = true;
                                //  stack.push(s.charAt(i));
                            }
                            break;
                        case ')':
                            if (!stack.isEmpty() && stack.peek() == '(') {
                                stack.pop();
                            } else {
                                imbalancedFound = true;
                            }
                            break;

                    }
                }

                if (stack.isEmpty() && imbalancedFound == false) {
                    System.out.println("balanced");
                } else {
                    System.out.println("not balanced");
                }
            }
        }
}
