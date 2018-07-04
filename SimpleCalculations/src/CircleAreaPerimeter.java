import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area, perimeter, r;

        r = Double.parseDouble(scanner.nextLine());
        area = Math.PI * r * r;
        perimeter = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
