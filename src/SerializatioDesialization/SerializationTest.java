package SerializatioDesialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class SerializationTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName="employee.ser";
        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("Arpit");
        emp.setSalary(5000);

        try {
            JavaSerializationUtil.serialize(emp, fileName);
        } catch(IOException e) {
            e.printStackTrace();
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(fileName);) {
            byte[] bytes = new byte[10];
            int numberOfBytes = inputStream.read(bytes);
            System.out.println(numberOfBytes);
            String string1 = new String(bytes);
            char[] ch = string1.toCharArray();
            System.out.println(Arrays.toString(ch));
            // this is a redundant thing to do
//            inputStream.close();
        } catch(IOException e) {
            e.printStackTrace();
        }





        Employee empNew = null;
        try {
            empNew = (Employee)JavaSerializationUtil.deserialize(fileName);
        } catch(ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("emp Object::" + emp);
        System.out.println("empNew Object::" + empNew);
    }
}
