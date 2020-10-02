package com.company;

public class grr {
    int getMiddle(Node head) {
        Node temp = head;
       int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }

        int value = count/2 + 1;
        for (int i = 1; i < value; i++) {
            temp = temp.next;
        }

        return temp.data;
    }


    public static void main() {

    }

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
