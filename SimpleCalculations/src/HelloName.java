import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);

        name  = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

    }
}
