package week_4;
public class Pg_62 {
    public static void main(String[] args)
    {
        week_4.Account acc = new week_4.Account(1122,20000);
        acc.setAnnualRate(4.5);
        acc.withdraw(2500.0);
        acc.deposit(3000.0);
        System.out.println("Balance: $"+acc.getBalance());
        System.out.println("Monthly Interest: "+acc.getMonthlyInterest());
    }
}
class Account
{
    private int id = 0;
    private double balance = 0.0;
    private double AnnualRate = 0.0;
    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }
    public int getID()
    {
        return this.id;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double getAnnualRate()
    {
        return AnnualRate;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void  setAnnualRate(double AnnualRate)
    {
        this.AnnualRate = AnnualRate;
    }
    public double getMonthlyInterest()
    {
        return (AnnualRate/100)/12;
    }
    public void withdraw(double amount)
    {
        this.balance -= amount;
    }
    public void deposit(double amount)
    {
        this.balance += amount;
    }

}

