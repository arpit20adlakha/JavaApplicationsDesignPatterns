import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.sql.*;


public class JDBCConnection {
    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from teacher");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Integer k :map.values()) {

        }
    }

    private static void bottomViewUtil() {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.peek();
        s.pop();
        Queue<Node> q = new LinkedList<>();
        while(!q.isEmpty()) {
            Node temp = q.poll();

        }
    }

    private static class Node{

        int data; //data of the node
        int hd; //horizontal distance of the node
        Node left, right; //left and right references

         // Constructor of tree node
         public Node(int key)
         {
             data = key;
             hd = Integer.MAX_VALUE;
             left = right = null;
         }
    }
}
