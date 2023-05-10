import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilogram? : ");
        armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilogram? : ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilogram? : ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilogram? : ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilogram? : ");
        patlicanKilo = input.nextDouble();

        double toplamTutar = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat)
                + (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam Tutar: " + toplamTutar);


    }

}