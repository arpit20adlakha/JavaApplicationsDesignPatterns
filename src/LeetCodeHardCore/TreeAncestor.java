package LeetCodeHardCore;

import java.util.*;

public class TreeAncestor {

    static Character[] charArray = {'h', 'e', 'l'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static <T> List<T> arrayToList(T[] arr, List<T> list) {
        for (T t: arr) {
             list.add(t);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        System.out.println(intList.get(0));



        LinkedList<Integer> list = new LinkedList();
        list.add(5);
        list.add(1);
        list.add(10);
        System.out.println(list);

//        String[] array = {"abc", "2", "10", "0"};
////        List<String> list = Arrays.asList(array);
////        Collections.sort(list);
////        System.out.println(Arrays.toString(array));
////
////
////        System.out.println("apple".compareTo("banana"));


        Iterator it = list.iterator();

        for(;it.hasNext();) {
            System.out.println(it.next());
        }

        for (Object object : list) {
            System.out.println(object);
        }

        String message = "Hello";
        print(message);
        message += "World!";
        print(message);

//        List list = new ArrayList<>();
//        list.add("hello");
//        list.add(2);
//        System.out.println(list.get(0) instanceof Object);
//        System.out.println(list.get(1) instanceof Integer);
//
//        String message = "Hello world!";
//        System.out.println(message.substring(6, 12) + message.substring(12, 6));
//        TreeAncestor treeAncestor = new TreeAncestor(7, new int[]{-1, 0, 0, 1, 1, 2, 2});
//        System.out.println(treeAncestor.getKthAncestor(3, 1));

    }

    static void print(String message) {
        System.out.println(message);
        message += " ";
    }

    int[] pArray;
    int numberOfNodes;

    public TreeAncestor(int n, int[] parent) {

        pArray = new int[parent.length];
        int i = 0;
        for(int value : parent) {
            pArray[i++] = value;
        }

    }

    public int getKthAncestor(int node, int k) {
        if (node > numberOfNodes - 1  || node < 0 ) {
            return -1;
        }
        if ( k == 0) {
            return node;
        }

        return getKthAncestor(pArray[node], k - 1);
    }

}
