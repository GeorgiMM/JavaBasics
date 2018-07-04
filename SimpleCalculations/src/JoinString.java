import java.util.Scanner;

public class JoinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName, town;
        int years;

        firstName = scanner.nextLine();
        lastName = scanner.nextLine();
        years = Integer.parseInt(scanner.nextLine());
        town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",
                firstName, lastName, years, town);
    }
}
