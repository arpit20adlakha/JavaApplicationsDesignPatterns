package test;

import java.util.HashMap;

public class AdditionLinkedList {

    static Node addLists(Node first, Node second) {
        // Base case

        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        Node newFirst = reverseList(first);
        Node newSecond = reverseList(second);

        Node head = null;
        int carry = 0;
        while (newFirst != null && newSecond != null) {
            int total = newFirst.data + newSecond.data + carry;
            carry = total/10;
            int number = total%10;
            Node temp = createNewNode(number);
            temp.next = head;
            head = temp;
            newFirst = newFirst.next;
            newSecond = newSecond.next;
        }

        Node further;
        if (newFirst != null) {
            further = newFirst;
        } else {
            further = newSecond;
        }
        while(further != null) {
                int total = further.data + carry;
                carry = total/10;
                int number = total%10;
                Node temp = createNewNode(number);
                temp.next = head;
                head = temp;
                further = further.next;
        }


        if (carry > 0) {
            Node temp = createNewNode(carry);
            head.next = temp;
            head = temp;
        }
        return head;
    }

    static Node reverseList(Node head) {
        Node prev = null;

        while(head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    static Node createNewNode(int data) {
        return new Node(data);
    }


    static Node segregate(Node head)
    {   if (head == null || head.next == null) {
            return head;
        }

        Node head0 = null;
        Node head1 = null;
        Node head2 = null;

        Node top0 = null;
        Node top1 = null;
        Node top2 = null;
        while(head != null) {
            switch(head.data) {
                case 1 :
                    if (head1 ==  null) {
                        head1 = head;
                        top1 = head;
                    } else {
                        head1.next = head;
                        head1 = head1.next;
                    }
                  break;
                case 2 :
                    if (head2 ==  null) {
                        head2 = head;
                        top2 = head;
                    } else {
                        head2.next = head;
                        head2 = head2.next;
                    }
                  break;
                case 0:
                    if (head0 == null) {
                        head0 = head;
                        top0 = head;
                    } else {
                        head0.next = head;
                        head0 = head0.next;
                    }
                  break;
            }
            head = head.next;
        }

        if (head0== null && head1 == null ) {
            head2.next = null;
            return top2;
        }

        if (head2 == null && head0 == null) {
            head1.next = null;
            return top1;
        }

        if (head1 == null && head2 == null) {
            head0.next = null;
            return top0;
        }

        if (head0 == null && head1 != null && head2 != null) {
            head1.next = top2;
            head2.next = null;
            return top1;
        } else if (head1 == null && head2 != null && head0 != null){
            head0.next = top2;
            head2.next = null;
            return top0;
        } else if (head2 == null && head1 != null && head0 != null){
            head0.next = top1;
            head1.next = null;
            return top0;
        } else {
            head0.next = top1;
            head1.next = top2;
            head2.next = null;
            return top0;
        }

    }

    static Node segregate1 (Node head) {
        int[] a = new int[3];
        HashMap<Integer, Integer> map = new HashMap<>();
        Node temp = head;

        while(temp != null) {
            switch (temp.data) {
                case 0:
                    a[0]++;
                    map.put(0, 1 + map.getOrDefault(0, 0));
                    break;
                case 1:
                    a[1]++;
                    map.put(1, 1 + map.getOrDefault(1, 0));
                    break;
                case 2:
                    a[2]++;
                    map.put(2, 1 + map.getOrDefault(2, 0));
                    break;
            }
        }

        Node top = head;
        while (head != null) {
            if (map.get(0) > 0) {
                head.data = 0;
                map.put(0, map.get(0) - 1);
            } else if (map.get(1) > 0) {
                head.data = 1;
                map.put(1, map.get(1) - 1);
            } else if(map.get(2) > 0){
                head.data = 2;
                map.put(2, map.get(2) - 1);
            }
            head= head.next;
        }


        return top;
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head1 = createNewNode(4);
        head1.next = createNewNode(5);
        head1.next.next = null;

        Node head2 = createNewNode(2);
        head2.next = createNewNode(2);

        head2.next.next = createNewNode(0);
        head2.next.next.next = createNewNode(1);
        head2.next.next.next.next = null;
        Node newList = segregate(head2);
//        Node newList = addLists(head1, head2);





        while(newList != null) {
            System.out.println(newList.data);
            newList = newList.next;
        }
    }
}

