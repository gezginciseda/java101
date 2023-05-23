import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit number : ");
        n = input.nextInt();

        System.out.println("Powers of 4");
        for (int i = 1; i <=n; i*=4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5");
        for (int j = 1; j <=n; j*=5) {
            System.out.println(j);
        }
    }
}