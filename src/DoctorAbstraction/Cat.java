package DoctorAbstraction;

public class Cat extends Animal {

    @Override
    public void treatment() {
        if (getAge() < 5) {
            System.out.println("Treatment C1");
        } else {
            System.out.println("Treatment C2");
        }
    }
}
