import java.util.*;
class Account
{
    double balance;
    void addBalance(double value)
    {
        balance+=value;
    }

    double getBalance()
    {
        return balance;
    }

    void withdraw(double amount)
    {
        if(balance-amount<1000)
        {
            System.out.println("Insufficient Funds");
            return;
        }
        balance-=amount;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        ac.addBalance(1000);
        while(true)
        {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance Check");
            System.out.println("4.Exit");
            System.out.println("Enter the choice");
            int ch = sc.nextInt();
            double amount;
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the amount");
                    amount=sc.nextDouble();
                    ac.addBalance(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount");
                    amount=sc.nextDouble();
                    ac.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Balance: "+ac.getBalance());
                    System.out.println("\n\n");
                    break;
                default:
                    return;
            }
        }
    }
}