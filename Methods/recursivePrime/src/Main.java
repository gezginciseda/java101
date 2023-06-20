import java.util.Scanner;

public class Main {

    static void recursivePrime() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int a = scan.nextInt();

        int count = 0;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(a + " sayısı ASALDIR !");
        } else {
            System.out.println(a + " sayısı ASAL değildir !");
        }

        recursivePrime();

    }
    public static void main(String[] args) {
        recursivePrime();
    }

}