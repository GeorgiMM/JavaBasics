import java.text.DecimalFormat;
import java.util.Scanner;

public class BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName;
        int volume, energy;
        double sugar, totalSugar, totalEnergy;

        productName = scanner.nextLine();
        volume = Integer.parseInt(scanner.nextLine());
        energy = Integer.parseInt(scanner.nextLine());
        sugar = Double.parseDouble(scanner.nextLine());
        totalEnergy = energy * volume / 100.0;
        totalSugar = volume * sugar / 100;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("%dml %s:%n", volume, productName);
        System.out.printf("%skcal, %sg sugars", df.format(totalEnergy), df.format(totalSugar));

    }
}
