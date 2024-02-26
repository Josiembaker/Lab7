import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        do {
            System.out.print("Enter temperature in Celsius: ");
            while (!in.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                System.out.print("Enter temperature in Celsius: ");
                in.next();

            }
            celsius = in.nextDouble();

            if (celsius < -273.15) {
                System.out.println("Error: Temperature cannot be below absolute zero (-273.15°C).");
            }
        } while (celsius < -273.15);

        fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " Your temp in Celsius is " + fahrenheit + " in fahrenheit ");

        in.close();
    }
}
