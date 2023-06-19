import java.util.Scanner;
public class recursivePow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değerini giriniz: ");
        int a = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int b = input.nextInt();

        int sonuc = pow(a, b);
        System.out.println("Sonuc: " + sonuc);

    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }
    }
}