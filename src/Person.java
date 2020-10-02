import java.util.Hashtable;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age &&
//                firstName.equals(person.firstName) &&
//                lastName.equals(person.lastName);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Person)) return false;

        Person person = (Person) o;
        return age == person.age
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + firstName == null ? 0 : firstName.hashCode();
        result = 31 * result + lastName == null ? 0 : lastName.hashCode();
        result = 31* result + age;
//        return Objects.hash(firstName, lastName, age);
        return result;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public static void main(String[] args) {
//        Hashtable<Integer, Integer> t = new Hashtable<>();
        Person p1 = new Person("John", "Smith", 31);
        Person p2 = new Person("John", "Smith", 31);
        System.out.println(p2.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
