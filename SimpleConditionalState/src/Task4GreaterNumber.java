import java.util.Scanner;

public class Task4GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum;

        firstNum = Integer.parseInt(scanner.nextLine());
        secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum < secondNum){
            System.out.println(secondNum);
        }else {
            System.out.println(firstNum);
        }
    }
}
