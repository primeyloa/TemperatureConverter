import java.util.Scanner; //scanner class imported from Java library

public class TemperatureConverter {
    //Executing the main function
    public static void main(String[] args) {

    //Scanner object created from the imported scanner class. This enables us to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a Temperature Converter program");
        System.out.println("Choose (1) to convert from Celsius to Fahrenheit");
        System.out.println("Choose (2) to convert from Fahrenheit to Celsius.");
        System.out.println("Type in your choice: ");

    // a new variable is created and assigned the scanner method nextInt() which reads user input, the integer type
        int choice = scanner.nextInt();


    //A control logic introduced to cater for extreme cases and exceptions
        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        }
        System.out.print("Enter the temperature value: ");

        // assigning another variable to a scanner method to read user input of the double precision number type
        double temperature = scanner.nextDouble();

        //initialized a field
        double convertedTemperature;

        if (choice == 1) {
            // Conversion Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " degrees Celsius is " + convertedTemperature + " degrees Fahrenheit.");
        } else {
            // Conversion from Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " degrees Fahrenheit is " + convertedTemperature + " degrees Celsius.");
        }
        //exiting the scanner method operation (This is the end of the program)
        scanner.close();
    }
}