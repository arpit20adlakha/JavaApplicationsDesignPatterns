package Tree;

import java.util.*;

class BinaryTree
{
    static ArrayList <Integer> verticalOrder(Node root) {

        SortedSet<ExtendedNode> set = new TreeSet<>(new Comparator<ExtendedNode>() {
            @Override
            public int compare(ExtendedNode node1, ExtendedNode node2) {
                if (node1.hd == node2.hd) {
                    return node1.level - node2.level;
                } else {
                    return node1.hd - node2.hd;
                }
            }
        });

        ArrayList<Integer> list = new ArrayList<Integer>();

        Queue<ExtendedNode> q = new LinkedList<>();

        q.add(new ExtendedNode(root, 0, 0));

        while (q.size() != 0) {
            int numberOfValues = q.size();
            while (numberOfValues > 0) {
                numberOfValues--;
                ExtendedNode temp = q.poll();

                if (temp.node.left != null) {
                    q.add(new ExtendedNode(temp.node.left, temp.hd -1, temp.level + 1));
                }

                if (temp.node.right != null) {
                    q.add(new ExtendedNode(temp.node.right, temp.hd + 1, temp.level + 1));
                }
            }
        }

        for (ExtendedNode e : set) {
            list.add(e.node.data);
        }
        return list;
    }

}

class ExtendedNode {
    int hd;
    int level;
    Node node;

    public ExtendedNode(Node node, int hd, int level) {
        this.node = node;
        this.level = level;
        this.hd = hd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtendedNode)) return false;
        ExtendedNode that = (ExtendedNode) o;
        return hd == that.hd &&
                level == that.level &&
                Objects.equals(node, that.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hd, level);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
