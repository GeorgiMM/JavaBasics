import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, mins, secs, temp;

        num1 = Integer.parseInt(scanner.nextLine());
        num2 = Integer.parseInt(scanner.nextLine());
        num3 = Integer.parseInt(scanner.nextLine());
        temp = num1 + num2 + num3;
        mins = temp / 60;
        secs = temp % 60;

        if (secs < 10 ){
            System.out.println(mins + ":0" + secs);
        }
        else {
            System.out.println(mins + ":" + secs);
        }
    }
}
