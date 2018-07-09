import java.util.Scanner;

public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, x1, x2, y1, y2, area, perimeter;

        x1 = Double.parseDouble(scanner.nextLine());
        y1 = Double.parseDouble(scanner.nextLine());
        x2 = Double.parseDouble(scanner.nextLine());
        y2 = Double.parseDouble(scanner.nextLine());

        a = Math.max(x1, x2) - Math.min(x1,x2);
        b = Math.max(y1, y2) - Math.min(y1, y2);
        area = a * b;
        perimeter = 2*a + 2*b;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
