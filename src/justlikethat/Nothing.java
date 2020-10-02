package justlikethat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Nothing {

    public static void main(String[] args) {
        int j = 97;
        char c = (char)j;
        System.out.println(c);


        List<Integer>[] arrayLists = new ArrayList[9];

        for(int i=0; i< 9; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        arrayLists[0].add(1);
        arrayLists[0].add(2);
        arrayLists[1].add(5);
        arrayLists[1].add(8);

        for(int i=0; i< 9;i++) {
            printList(arrayLists[i]);
        }


    }

    public static void printList(List<Integer> list){
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
