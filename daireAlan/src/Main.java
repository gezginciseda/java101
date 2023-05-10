import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, a, area;

        Scanner input  = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez açısının ölçüsünü girin: ");
        a = input.nextDouble();

        area = (pi * (r*r) * a) / 360;

        System.out.println("Daire diliminin alanı: " + area);




    }

}