package MultiThreading;

public class FunctionInterfaceTester {

    public static void main(String[] args) {
        getOutput((x, y) -> x+y);
    }

    private static void getOutput(Squaring s) {

        System.out.println(s.square(3, 4));
    }

}
