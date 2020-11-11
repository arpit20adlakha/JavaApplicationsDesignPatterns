public class String_Builder_Tester {


    public static void main(String[] args) {

        String s = "Te2c";
        String p = s.replaceAll("[0-9]", "");
        System.out.println(p);
        StringBuilder empty = new StringBuilder();
        System.out.println(empty);

        StringBuilder sb = new StringBuilder("I use Java");
        System.out.println(sb.length());

        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(6));
        sb.setCharAt(1, 'm');
        System.out.println(sb.toString());

        StringBuilder st = new StringBuilder("start");
        st.setCharAt(1, 'm');
        System.out.println(st);

        StringBuilder sg = new StringBuilder("dessert");
        sg.deleteCharAt(2);
        System.out.println(sg);

        sg.append("123");
        System.out.println(sg);

        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder
                .append("From: Kate@gmail.com\n")
                .append("To: Max@gmail.com\n")
                .append("Text: I lost my keys.\n")
                .append("Please, open the door!");

        System.out.println(messageBuilder);

        sb.insert(2, "do not ");
        System.out.println(sb);

        String abc = "rerere";

        sb.replace(1, 4, "abcdww porche");
        System.out.println(sb);


        sb.delete(1, 5);
        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("A very long string");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("Because the earlier string was not enough so we can now append additional things to it to make it work");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Still it is not working");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

}
