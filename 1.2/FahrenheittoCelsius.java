import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Fahrenheit: ");
        float intValue = Integer.parseInt(scanner.nextLine());

        float celsius = (float) (((intValue - 32) * 5) / 9);


        System.out.printf("Temp in Celsius %.1f %n", celsius);

        scanner.close();
    }
}
