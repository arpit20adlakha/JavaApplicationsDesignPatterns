package AdvancedJavaAndGenerics;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
             StringWriter writer = new StringWriter()) {
            StringBuffer  str = new StringBuffer();
            str.append("abc");
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        } catch (IOException e) {

        }
    }
}
