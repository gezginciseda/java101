
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarı Giriniz : ");
        tutar= input.nextDouble();

        if (tutar >= 0 && tutar <= 1000) {
            kdvOran = 0.18;
        } else {
            kdvOran = 0.08;
        }

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);


    }

}