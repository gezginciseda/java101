import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int choose;
        int price;

        while (right > 0) {
            System.out.print("Enter your username : ");
            userName = input.nextLine();
            System.out.print("Enter your password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw money\n" +
                            "3-Balance inquiry\n" +
                            "4-Log out");
                    System.out.println("Please select the action you want to take");
                    choose = input.nextInt();

                    switch (choose) {
                        case 1:
                            System.out.print("Your amount of money : ");
                            price = input.nextInt();
                            balance +=price;
                            break;
                        case 2:
                            System.out.print("The amount of money you want to withdraw : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.print("You have insufficient balance");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.print("Your balance: " + balance + "\n");
                            break;
                    }
                } while (choose != 4);
                System.out.println("See you again");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");

                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your remaining right  :" + right);
                }
            }
        }
    }
}