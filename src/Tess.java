import java.util.*;

public class Tess<T> {
//    @SuppressWarnings("unchecked")

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        Set<Integer> se = new HashSet<>();
        se.add(2);
        se.remove(2);
        list.add("sonoo");
        list.add("vimal");
        ArrayList list2 = list;
        System.out.println(list2);
        System.out.println(list.toString());

        for(Object i : list) {
            System.out.println(i);
        }
        computation(5);
    }

    @Deprecated
    private static void computation(int n) {
        for (int i = 0; i < n; i++) {
             System.out.println(i);
        }
    }

}


