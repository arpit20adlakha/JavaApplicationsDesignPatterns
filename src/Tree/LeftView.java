package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

    static void leftView(Node root)
    {
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        q.add(null);
        System.out.print(root.data  + " ");
        int flag = 0;
        while(!q.isEmpty()) {
            Node temp = q.peek();

            if (temp == null) {
                flag = 1;
                q.add(null);
                q.poll();
            } else {
                if (flag == 1) {
                    System.out.print(temp.data + " ");
                    flag = 0;
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                q.poll();
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(2);
//        node.left.left = new Node(40);
        leftView(node);
    }

    static  class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
}
/* if(root == null) return;
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()) {
        Node curr = null;
        int x = q.size();
        while(x-- > 0) {
        curr = q.remove();
        if(curr.right != null) q.add(curr.right);
        if(curr.left != null) q.add(curr.left);
        }
        System.out.print(curr.data + " ");
    } */