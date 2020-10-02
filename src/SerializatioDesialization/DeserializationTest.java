package SerializatioDesialization;

import java.io.IOException;

public class DeserializationTest {
    public static void main(String[] args) {
        String filename="employee.ser";
        Employee employee = null;

        try {
            employee = (Employee) JavaSerializationUtil.deserialize(filename);
        }  catch (ClassNotFoundException| IOException e) {
            e.printStackTrace();
        }
        System.out.println("empNew Object::" + employee);
    }
}
