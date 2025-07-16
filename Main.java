import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double bought = sc.nextDouble();

        double value = CurrencyConverter.conversor(dollar, bought);
        System.out.printf("Amount to be paid in reais = %.2f", value);

        sc.close();
    }
}
