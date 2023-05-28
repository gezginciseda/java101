import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int basValue;
        int result = 0;

        while (number != 0) {
            basValue = number % 10;
            result +=basValue;
            number /=10;
        }

        System.out.print("Total : " + result);

    }
}