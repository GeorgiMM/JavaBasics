import java.util.Scanner;

public class Task4SumVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int sum = 0;

        input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);

            switch (currentLetter){
                case 'a':
                    sum+=1;
                    break;
                case 'e':
                    sum+=2;
                    break;
                case 'i':
                    sum+=3;
                    break;
                case 'o':
                    sum+=4;
                    break;
                case 'u':
                    sum+=5;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}
