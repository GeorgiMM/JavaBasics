import java.util.Scanner;

public class DrawX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drawing = "";

        int input = Integer.parseInt(scanner.nextLine());
        String inputChar = scanner.nextLine();
        char symbol = inputChar.charAt(0);
        input *= 2;
        if (input % 2 == 0)
        {
            input++;
        }
        int middleSpaces = input * 2;

        for (int i = 0; i <= input; i++) {
            drawing += repeatDrawP(' ', i);
            drawing += symbol;
            drawing += repeatDrawN(' ',middleSpaces*2 -1 );
            middleSpaces -= 2;
            drawing += symbol;
            System.out.println(drawing);
            drawing = "";
        }
        middleSpaces = 0;

        for (int i = input; i >= 0; i--) {
            drawing += repeatDrawP(' ', i);
            drawing += symbol;
            drawing += repeatDrawP(' ',middleSpaces );
            middleSpaces += 2;
            drawing += symbol;
            System.out.println(drawing);
            drawing = "";
        }
    }

    static String repeatDrawP(char symbol, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += symbol;
        }
        return text;
    }

    static String repeatDrawN(char symbol, int count) {
        String text = "";

        for (int i = count; i >= 0; i-=2) {
            text += symbol;
        }
        return text;
    }
}
