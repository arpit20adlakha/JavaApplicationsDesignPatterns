package BuilderPattern;

import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String geekName = scanner.nextLine();
        scanner.close();
        System.out.println("Geek " + geekName + " created.");
        GeekDirector director = new GeekDirector();
        GeekBuilder builder = new GeekBuilder();
        director.buildAdmin(builder);
        Geek geek = builder.getResult();
        System.out.println(geek);
    }
}
