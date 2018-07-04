import java.util.Scanner;

public class Task2SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entry;
        double summ = 0, number;

        entry = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < entry; i++){
            number = Double.parseDouble(scanner.nextLine());
            summ += number;
        }
        System.out.println(summ);
    }
}
