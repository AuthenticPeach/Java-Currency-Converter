# Currency Converter

A simple Java program that converts currency from USD to different units based on the current exchange rate.

## Description

The Currency Converter program allows users to convert an amount from US Dollars (USD) to various currencies including Euros (EUR), British Pounds (GBP), Japanese Yen (JPY), Russian Rubles (RUB), Chinese Yuan (CNY), and Canadian Dollars (CAD). The program fetches the current exchange rates for the selected currencies and performs the conversion accordingly.

## Features

- Converts USD to EUR, GBP, JPY, RUB, CNY, and CAD.
- Retrieves the latest exchange rates for the selected currencies.
- Provides an easy-to-use menu interface.
- Supports decimal values for the input amount.
- Displays the converted amount with the appropriate currency code.

## Usage

1. Clone the repository or download the source code files.

2. Make sure you have Java Development Kit (JDK) installed on your machine.

3. Compile the program using the following command:

javac CurrencyConverter.java


4. Run the program using the following command:

java CurrencyConverter


5. Follow the instructions on the screen to select the desired currency and enter the amount in USD.

6. The program will display the converted amount with the corresponding currency code.

## Customization

To modify the program or add more currencies, you can make the following changes:

- Update the exchange rates in the `exchangeRates` map inside the `main` method to reflect the latest rates or fetch them from a real-time API.

- Add more cases in the switch statement to support additional currency options.

- Customize the user interface or add error handling as per your requirements.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This program is licensed under the [MIT License](LICENSE).

