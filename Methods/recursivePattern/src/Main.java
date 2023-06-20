import java.util.Scanner;

public class Main {
    static void pattern1(int number, int a) {
        if (number > 0) {
            System.out.print(number + " ");
            pattern1(number - 5, a);
        } else if (number <= 0) {
            pattern2(number, a);
        }
    }
    static void pattern2(int number, int a) {
        if (a >= number) {
            System.out.print(number + " ");
            pattern2(number + 5, a);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : " );
        int number = scan.nextInt();
        int a = number;
        pattern1(number, a);
    }
}