import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        // Exchange rates
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.72);
        exchangeRates.put("JPY", 108.87);
        exchangeRates.put("RUB", 75.0);
        exchangeRates.put("CNY", 6.43);
        exchangeRates.put("CAD", 1.21);

        System.out.println("Currency Converter");
        System.out.println("------------------");

        while (shouldContinue) {
            // Display currency options
            System.out.println("1. USD to EUR");
            System.out.println("2. USD to GBP");
            System.out.println("3. USD to JPY");
            System.out.println("4. USD to RUB");
            System.out.println("5. USD to CNY");
            System.out.println("6. USD to CAD");
            System.out.println("7. Exit");

            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            if (option == 7) {
                shouldContinue = false;
                break;
            }

            System.out.print("Enter the amount in USD: ");
            double amount = scanner.nextDouble();

            double convertedAmount = 0.0;
            String currencyCode = "";

            // Perform currency conversion based on selected option
            switch (option) {
                case 1:
                    currencyCode = "EUR";
                    break;
                case 2:
                    currencyCode = "GBP";
                    break;
                case 3:
                    currencyCode = "JPY";
                    break;
                case 4:
                    currencyCode = "RUB";
                    break;
                case 5:
                    currencyCode = "CNY";
                    break;
                case 6:
                    currencyCode = "CAD";
                    break;
                default:
                    System.out.println("Invalid option selected.");
                    continue;
            }

            if (exchangeRates.containsKey(currencyCode)) {
                convertedAmount = amount * exchangeRates.get(currencyCode);
                System.out.println(amount + " USD = " + convertedAmount + " " + currencyCode);
            } else {
                System.out.println("Invalid currency code selected.");
            }
        }

        System.out.println("Thank you for using the Currency Converter.");
        scanner.close();
    }
}
