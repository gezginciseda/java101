import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int k = scanner.nextInt();

        int toplam = 0;
        for (int i = 1; i < k; i++) {
            if (k % i == 0) {
                toplam += i;
            }
        }

        if (toplam == k) {
            System.out.println(k + " mükemmel sayıdır.");
        } else {
            System.out.println(k + " mükemmel sayı değildir.");
        }
    }
}