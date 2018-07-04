import java.util.Scanner;

public class InchesToCM {
    public static void main(String[] args) {
        double cm, inch;
        Scanner scanner = new Scanner(System.in);

        inch = Double.parseDouble(scanner.nextLine());
        cm = inch * 2.54;
        System.out.println(cm);
    }
}
