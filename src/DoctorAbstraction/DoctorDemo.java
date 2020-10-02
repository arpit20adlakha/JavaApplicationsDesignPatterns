package DoctorAbstraction;

public class DoctorDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        VeterinaryDoctor doctor = new VeterinaryDoctor();
        cat.setAge(4);
        dog.setAge(2);
        doctor.getTreatment(cat);
        doctor.getTreatment(dog);
    }
}
