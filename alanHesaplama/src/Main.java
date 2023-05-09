import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. kenar uzunluğunu giriniz : ");
        a = inp.nextInt();

        System.out.print("2. kenar uzunluğunu giriniz : ");
        b = inp.nextInt();

        System.out.print("3. kenar uzunluğunu giriniz : ");
        c = inp.nextInt();

        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı : " + alan);
    }

}