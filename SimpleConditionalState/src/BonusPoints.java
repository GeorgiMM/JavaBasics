import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double bonusPoints = 0, result;

        number = Integer.parseInt(scanner.nextLine());

        if (number <= 100){
            bonusPoints = bonusPoints + 5;
        }else  if (number <= 1000){
            bonusPoints = number * 0.2;
        }else  if (number > 1000){
            bonusPoints = number * 0.1;
        }

        if (number % 2 == 0){
            bonusPoints +=1;
        }else if (number % 5 == 0){
            bonusPoints += 2;
        }
        result = bonusPoints + number;

        System.out.println(bonusPoints);
        System.out.println(result);
    }
}
