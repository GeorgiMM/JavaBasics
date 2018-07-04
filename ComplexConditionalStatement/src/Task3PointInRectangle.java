import java.util.Scanner;

public class Task3PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1,x2,y1,y2,x,y;

        x1 = Double.parseDouble(scanner.nextLine());
        y1 = Double.parseDouble(scanner.nextLine());
        x2 = Double.parseDouble(scanner.nextLine());
        y2 = Double.parseDouble(scanner.nextLine());
        x = Double.parseDouble(scanner.nextLine());
        y = Double.parseDouble(scanner.nextLine());

        if (x >= x1 && x <= x2 && y >= y1 && y <= y2){
            System.out.println("Inside");
        }else {
            System.out.println("Outside");
        }
    }
}
