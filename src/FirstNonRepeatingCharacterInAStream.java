import java.util.*;

public class FirstNonRepeatingCharacterInAStream {
    final static int MAX_SIZE = 26;
    public static void main(String[] args) {
        Queue<Character> dq = new LinkedList<>();
        HashSet<Character> set = new HashSet<>();

        String stream = "aabc";

        for (int i = 0 ; i < stream.length(); i++) {
             if (set.contains(stream.charAt(i))) {
                 dq.remove(stream.charAt(i));
             } else {
                 set.add(stream.charAt(i));
                 dq.add(stream.charAt(i));
             }
            if(dq.peek() == null) {
                System.out.print("-1 ");
            } else {
                System.out.print(dq.peek() + " ");
            }
        }

    }

}


