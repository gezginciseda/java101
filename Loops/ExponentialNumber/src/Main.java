import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        a = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        b = input.nextInt();

        int total = 1;

        for (int i = 1; i<=b ; i++)
        {
            total *= a;
        }
        System.out.print("Sonuc : " + total);
    }
}