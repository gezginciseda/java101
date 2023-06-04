import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int a = scanner.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;

        System.out.print(a + " Elemanlı Fibonacci Serisi: " + sayi1 + " " + sayi2);

        for (int i = 2; i < a; i++) {
            int sonrakiSayi = sayi1 + sayi2;
            System.out.print(" " + sonrakiSayi);

            sayi1 = sayi2;
            sayi2 = sonrakiSayi;
        }
    }
}
