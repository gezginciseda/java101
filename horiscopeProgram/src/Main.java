import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int month, day;
       String burc = "";

       Scanner input = new Scanner(System.in);

       System.out.print("Doğum gününüzün ayını girin (1-12) : ");
       month = input.nextInt();

       System.out.print("Doğum gününüzü girin (1-31) :");
       day = input.nextInt();

       if ((month == 1 && day >= 22) || (month == 2 && day <= 19 )) {
           burc = "Kova";
       } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
           burc = "Balık";
       } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
           burc = "Koç";
       } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
           burc = "Boğa";
       } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
           burc = "İkizler";
       } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
           burc = "Yengeç";
       } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
           burc = "Aslan";
       } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
           burc = "Başak";
       } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
           burc = "Terazi";
       } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
           burc = "Akrep";
       } else if ((month == 11 && day >=22) || (month == 12 && day <= 21)) {
           burc = "Yay";
       } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
           burc = "Oğlak";
       } else {
           System.out.println("Geçersiz tarih girdiniz.");
       }
        System.out.println("Burcunuz: " + burc);
    }
}
