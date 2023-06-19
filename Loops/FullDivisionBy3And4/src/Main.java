import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int k,count = 0, sum = 0;

       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       k = input.nextInt();


       for (int i = 0; i <= k; i++) {
           if (i % 3 == 0 && i % 4 == 0) {
               count++;
               sum += i;
           }
       }

       if (count > 0) {
           double average = (double) sum / count;
           System.out.println("Average: " + average);
       } else {
           System.out.println("Not found.");
       }
    }
}