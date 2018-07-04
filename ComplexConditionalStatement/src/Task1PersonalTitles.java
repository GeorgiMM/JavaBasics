import java.util.Scanner;

public class Task1PersonalTitles {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);

        double age;
        char gender;

        age = Double.parseDouble(scnner.nextLine());
        gender = scnner.nextLine().charAt(0);

        if (gender == 'f'){
            if (age <16){
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            if (age < 16){
                System.out.println("Master");
            }else {
                System.out.println("Mr.");
            }
        }
    }
}
