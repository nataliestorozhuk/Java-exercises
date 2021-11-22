import java.util.Scanner;

public class DemoTemperature {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature: ");
        double fahrenheitTemp = keyboard.nextDouble();
        keyboard.close();
        Temperature temperature = new Temperature(fahrenheitTemp);

        System.out.printf("The temperature in Celsius is: " + "%.2f", +temperature.getCelsius());

        System.out.printf("\nThe temperature in Kelvin is: " + "%.2f", +temperature.getKelvin());
    }
}
