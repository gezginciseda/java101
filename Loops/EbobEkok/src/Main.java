import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin : ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int n2  = input.nextInt();

        int ebob = 1;
        int i = 1;

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("ebob: " + ebob);


        int ekok = (n1 * n2);
        int j = n1 * n2;
        while (j >= n1 && j >= n2) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
            }
            j--;
        }
        System.out.println("ekok: " + ekok);
    }
}