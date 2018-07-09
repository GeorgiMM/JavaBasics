import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        double a, area;
        Scanner scanner = new Scanner(System.in);

        a = Double.parseDouble(scanner.nextLine());
        area = a * a;
        System.out.println(area);
    }
}
