package DoctorAbstraction;

public abstract class Animal {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void treatment();

}
