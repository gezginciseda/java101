import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı girin : ");
        int n = input.nextInt();

        for (int i = 1; i<= n; i++) {
            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l = n-1; l >= 0; l--) {
            for (int m = 0; m < n-l; m++){
                System.out.print(" ");
            }
            for (int a = 1; a <= (2*l) - 1; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}