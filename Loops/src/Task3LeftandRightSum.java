import java.util.Scanner;

public class Task3LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount, sumLeft = 0, sumRight = 0, numberScan, sum;

        numberCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberCount; i++) {
            numberScan = Integer.parseInt(scanner.nextLine());
            sumLeft += numberScan;
        }
        for (int i = 0; i < numberCount; i++) {
            numberScan = Integer.parseInt(scanner.nextLine());
            sumRight += numberScan;
        }
        if (sumLeft == sumRight){
            System.out.printf("Yes, sum = %d", sumRight);
        } else {
            sum = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d", sum);
        }
    }
}
