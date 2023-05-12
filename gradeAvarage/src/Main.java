import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz matematik notu girdiniz. Ortalamaya katılmayacak.");
            mat = 0; // Geçersiz not için 0 olarak kabul ediyoruz.
        }

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz fizik notu girdiniz. Ortalamaya katılmayacak.");
            fizik = 0; // Geçersiz not için 0 olarak kabul ediyoruz.
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz türkçe notu girdiniz. Ortalamaya katılmayacak.");
            turkce = 0; // Geçersiz not için 0 olarak kabul ediyoruz.
        }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz kimya notu girdiniz. Ortalamaya katılmayacak.");
            kimya = 0; // Geçersiz not için 0 olarak kabul ediyoruz.
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz müzik notu girdiniz. Ortalamaya katılmayacak.");
            muzik = 0; // Geçersiz not için 0 olarak kabul ediyoruz.
        }

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        if(avarage <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz");
        }

        System.out.println("Ortalamanız " + avarage);




    }
}