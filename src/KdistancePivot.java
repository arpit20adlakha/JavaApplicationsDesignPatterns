
import java.util.ArrayList;
import java.util.List;

public class KdistancePivot {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(4);
        t.right = new TreeNode(5);
        t.right.right = new TreeNode(20);
        t.left.left = new TreeNode(2);
        t.left.right = new TreeNode(10);

        t.left.left.left = new TreeNode(70);
        t.left.right.right = new TreeNode(80);
        List<TreeNode> nodes= getKDistanceNodes(t, t.left, 0);
        for ( TreeNode node : nodes) {
            System.out.println(node.val);
        }
    }

    static void downNodes(TreeNode target, int k, List<TreeNode> list) {
        if (target == null) {
            return;
        }
        if ( k == 0) {
            list.add(target);
            return;
        }

       downNodes(target.left, k-1, list);
       downNodes(target.right, k -1, list);
    }

    static int getKgetKDistanceNodesUtil(TreeNode root, TreeNode pivot, int k, List<TreeNode> treeNodes) {
        if (root == null) {
            return -1;
        }

        if (root == pivot) {
            downNodes(root, k, treeNodes);
            return 0;
        }

        int left = getKgetKDistanceNodesUtil(root.left, pivot, k, treeNodes);

        if (left != -1) {
            if(left + 1 == k) {
                treeNodes.add(root);
            } else {
                downNodes(root.right, k - 2, treeNodes);
            }
            return 1 + left;
        }


        int right = getKgetKDistanceNodesUtil(root.right, pivot, k, treeNodes);

        if (right != -1) {
           if (right + 1 == k) {
               treeNodes.add(root);
           } else {
               downNodes(root.left,k - 2, treeNodes);
           }
           return 1 + right;
        }
        return -1;
    }

    public static  List<TreeNode> getKDistanceNodes(TreeNode root, TreeNode pivot, int k) {
        List<TreeNode> listNodes = new ArrayList<>();
        getKgetKDistanceNodesUtil(root, pivot, k, listNodes);
        return listNodes;

    }



    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

}
