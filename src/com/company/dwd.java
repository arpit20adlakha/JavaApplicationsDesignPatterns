package com.company;

import java.util.HashSet;
import java.util.Stack;

public class dwd {
    static class ReverseLL {
        // This function should reverse linked list and return
        // head of the modified linked list.
        Node reverseList(Node head) {
            Node temp = head.next;
            Node prev = head;
            head.next = null;
            head = temp;

            while (head.next != null) {
                temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }
            head.next = prev;
            return head;
        }

        public static Node reverse(Node node, int k) {
            if (k == 0 || node == null || node.next == null) {
                return node;
            }

            Node head = node;
            Node prev = node;
            node = node.next;

            int i = 1;
            while (i < k && node != null) {
                Node temp = node.next;
                node.next = prev;
                prev = node;
                node = temp;
                i++;
            }

            head.next = reverse(node, k);

            return prev;
        }

        Node compute(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Stack<Node> s = new Stack<>();

            s.push(head);
            head = head.next;
            while (head != null) {
                while (!s.isEmpty() && head.value > s.peek().value) {
                    s.pop();
                }
                s.push(head);
                head = head.next;
            }

            Node ans = null;
            while (!s.isEmpty()) {
                Node temp = s.pop();
                temp.next = ans;
                ans = temp;
            }

            return ans;
        }

        Node computeUsingRecursion(Node head) {
                if (head == null)
                    return null;
                head.next = compute(head.next);
                if(head.next != null && head.next.value > head.value)
                    return head.next;
                else
                    return head;
        }


    }


     static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public static void main(String[] args) {
        HashSet<Node> set = new HashSet<>();

        Node head = new Node(12);
        Node top = head;
        int arr[] = {15, 10, 11, 5, 6, 2, 3};

        for (int i = 0; i < 7; i++) {
            head.next = new Node(arr[i]);
            head = head.next;
        }

        ReverseLL r = new ReverseLL();
        Node newHead = r.compute(top);

        while(newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }

}
