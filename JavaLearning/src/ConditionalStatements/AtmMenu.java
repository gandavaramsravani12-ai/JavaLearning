import java.util.Scanner;

public class AtmMenu {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        System.out.print("-------ATM MENU------");
        System.out.println("1. check balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. exit");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("your balance is "+balance);
                break;
            case 2:
                System.out.println("Enter deposit amount:");
                int deposit=sc.nextInt();
                balance=balance+deposit;
                System.out.println("updated balance is "+balance);
                break;
            case 3:
                System.out.println("enter withdraw amount:");
                int withdraw=sc.nextInt();
                if(withdraw<=balance)
                {
                    balance=balance-withdraw;
                    System.out.println("Remaining balance is "+balance);
                }
                else {
                    System.out.println("Insufficient balance");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
