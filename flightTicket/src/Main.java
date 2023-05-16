import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance,age,trip_type;
        double price,discounted_price;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km type : ");
        distance = input.nextInt();

        System.out.print("Enter your age : ");
        age = input.nextInt();

        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip) : ");
        trip_type = input.nextInt();

        price = distance * 0.10;
        discounted_price = price;

        if (distance <= 0 || age <= 0 || (trip_type != 1 && trip_type != 2)) {
            System.out.println("You have entered incorrectly!");
            return;
        }

        if (age < 12) {
            price -= price * 0.50;
        } else if (age >= 12 && age <= 24) {
            discounted_price -= price * 0.10;
        } else if (age >= 65) {
            discounted_price -= price * 0.30;
        }

        if (trip_type == 2) {
            discounted_price *= 0.80;
        }

        double total_price = trip_type == 2 ? discounted_price * 2 : discounted_price;

        System.out.println("Total Price = " + total_price );
    }
}
