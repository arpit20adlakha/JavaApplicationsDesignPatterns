package DoctorAbstraction;

public class Dog extends Animal {

    @Override
    public void treatment() {
        if(getAge() < 5) {
            System.out.println("Treatment D1");
        } else {
            System.out.println("Treatment D2");
        }
    }
}
