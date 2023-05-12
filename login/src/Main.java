import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullancı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız ");
        } else {
            System.out.println("Bilgileriniz Yanlış ! ");

            System.out.print("Şifrenizi sıfırlamak ister misisiniz? (evet/hayır): ");
            String cevap = inp.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi girin : ");
                String yeniSifre = inp.nextLine();

                if(!yeniSifre.equals(password)) {
                    System.out.println("Şifre oluşturuldu");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz");
                }
            }
        }
    }
}