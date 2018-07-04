import java.util.Scanner;

public class Taks2ExcellentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade;

        grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 5.5){
            System.out.println("Excellent!");
        }else{
            System.out.println("Not excellent.");
        }
    }
}
