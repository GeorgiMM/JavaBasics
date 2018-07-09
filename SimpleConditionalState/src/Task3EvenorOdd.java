import java.util.Scanner;

public class Task3EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        number = Integer.parseInt(scanner.nextLine());

        if (number%2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
