package AdvancedJavaAndGenerics;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, true);

        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 1234234);
        phonebook.put("Gary", 23223);

        for(Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }
}
