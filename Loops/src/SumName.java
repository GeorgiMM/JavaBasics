import java.util.Scanner;

public class SumName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int sum = 0, charInt;

        input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char letters = input.charAt(i);
            charInt = (int) letters;
            sum += charInt;
        }
        System.out.println(sum);
    }
}
