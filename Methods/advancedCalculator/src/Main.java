import java.util.Scanner;

public class Main {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        float result,a,b;
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.print("Modunu almak istediğiniz sayıyı giriniz: ");
        a = c.nextFloat();
        System.out.print("Hangi sayıya göre modunu almak istiyorsunuz: ");
        b = d.nextFloat();
        result= a % b;
        System.out.print("Sonuç: " + result);
    }

    static void rectangle(){
        int shorte,longe,area,env;
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        longe = c.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        shorte = d.nextInt();
        area = longe * shorte;
        env = 2 * (shorte + longe);
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + env);
    }
    public static void main(String[] args) {
        int select;
        Scanner input = new Scanner(System.in);
        do {
            String menu = "1- Toplama İşlemi\n"
                    +"2- Çıkarma İşlemi\n"
                    +"3- Çarpma İşlemi\n"
                    +"4- Bölme işlemi\n"
                    +"5- Üslü Sayı Hesaplama\n"
                    +"6- Faktoriyel Hesaplama\n"
                    +"7- Mod Alma\n"
                    +"8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    +"0- Çıkış";

            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();

            switch(select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!");
            }

        }while(select!=0);
    }
}