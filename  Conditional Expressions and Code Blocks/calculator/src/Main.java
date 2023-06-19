import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 !=0){
                    System.out.println("Bölme: " + (n1 / n2));
                }else{
                    System.out.println("Bir sayı '0' a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.Tekrar deneyiniz.");

        }


    }
}