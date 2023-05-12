import java.util.*;

public class MainAtm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int balence = 100000;
        System.out.println("Welcome to ATM");
        System.out.println("Please enter your ATM ID");
        int id = s.nextInt();
        System.out.println("Enter your pin");
        int pin = s.nextInt();
        if (id == 987654321 && pin == 123456) {
            System.out.println("Login Sucessfull");
            System.out.println("");
            System.out.println("Select your choice");
            System.out.println("1.Balence Enquiry");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Teansfer Money");
            System.out.println("5.Exit the Transaction");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.println("The balence in the Account is " + balence);
                    break;
                case 2:
                    System.out.println("Enter the amount of money you want to Withdraw");
                    int w = s.nextInt();
                    if (w <= balence) {
                        System.out.println("Transaction Complete");
                        System.out.println("Your balence amount in account is" + (balence - w));
                    } else {
                        System.out.println("Insufficient balence");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount of money you want to Deposit");
                    int a = s.nextInt();
                    balence = balence + a;
                    System.out.println("Transaction Complete");
                    System.out.println("Your balence amount in account is" + balence);
                    break;
                case 4:
                    System.out.println("Enter the amount of money you want to Transfer");
                    int t = s.nextInt();
                    System.out.println("Enter the ID of the Account you want to Transfer money to");
                    int id2 = s.nextInt();
                    if (t <= balence) {
                        System.out.println("Transaction Complete");
                        System.out.println("Your balence in account is " + (balence - t));
                    } else {
                        System.out.println("Enter valid amount");
                    }
                    break;
                case 5:
                    System.out.println("Thankyou for considering have a nice day visit again");
                    break;

            }
        } else {
            System.out.println("Invalid ATM Id or Pin");
        }

    }
}