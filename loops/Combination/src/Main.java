import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,r,ntotal=1,rtotal=1,a,atotal=1,c;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısı : ");
        n = scan.nextInt();
        System.out.print("Seçim sayısı : ");
        r = scan.nextInt();

        //n sayısının faktöriyelini hesaplamak için.
        for(int i= n; i>0; i--){
            ntotal = ntotal * i;
        }

        //n sayısının faktöriyelini hesapladık için.
        for(int i=r; i>0; i--){
            rtotal = rtotal * i;
        }

        a = n-r;
        //a = n-r sayısının faktöriyelini hesapladık için.
        for(int i=a; i>0; i--){
            atotal = atotal * i;
        }

        c = ntotal / (rtotal * atotal);
        System.out.print("Sonuç:" + c);

    }
}
