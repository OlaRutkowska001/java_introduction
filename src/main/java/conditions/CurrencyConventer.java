package conditions;

import java.util.Scanner;

public class CurrencyConventer {
    static final float EUR = 4.31F;
    static final float USD = 3.90F;

    public static void main(String[] args) {
        //deklaracja klasy = konstrukcja klasy
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile masz złotych.");
        int plnAmount = scanner.nextInt();
        System.out.println("podaj watości [EURO. USD]");
        scanner.nextLine();
        String currencySymbol = scanner.nextLine();
        float multiplier = 0.0F;
        switch (currencySymbol) {
            case "EUR":
                multiplier = EUR;
                break;
            case "USD":
                multiplier = USD;
                break;
            default:
                System.out.println("Podano nieznaną walutę.");

        }
        System.out.println(plnAmount + "PLN to " + (plnAmount / multiplier) + " " + currencySymbol);
    }

}
