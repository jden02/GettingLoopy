import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempC = 0; // initially set to 0 to satisfy an error
        double tempF;
        boolean rep;
        do {
            System.out.println("Enter temperature in C: ");
            if (sc.hasNextDouble()) {
                tempC = sc.nextDouble();
                rep = false;
            } else {
                System.out.println("Invalid input. Please try again.");
                sc.next(); // consume invalid input
                rep = true;
            }
        } while (rep);

        tempF = tempC*(9.00/5.00) + 32;
        System.out.println(tempC + "C in Fahrenheit is " + tempF + "F.");

    }
}

