import java.util.*;
class Account
{
    private static int ID=0;
    private double balance;
    private double annualInterestRate=7;
    private Date date;

    public static int getID() {
        
        return ID;
        
    }
    public double getBalance() {
        return this.balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
 
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
 
    public Date getDate() {
        return this.date;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }
    public Account()
    {
        ID = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    public Account(int id,double b)
    {
        ID = id;
        balance = b;
    }
    public double getMonthlyInterestRate()
    {
        return ((float)annualInterestRate/12);
    }
 
    public double getMonthlyInterest()
    {
        return ((float)annualInterestRate/100)/12;
    }
    
    public void withdraw(double a)
    {
        balance-=a;
        System.out.println("Your current balance is:-"+balance);
    }
 
    public String toString()
    {
        Date d = new Date();
        System.out.println(d);
        setDate(d);
        return ("Account id is :- " + getID() + "\nYour Balance is:- " + getBalance() + "\n Account created on date:- " + d + "\nMonthly Interest is:-  "+getMonthlyInterest());
    }
}
class CheckAccount extends Account{
 
    private double OverdraftLimit;
    public double getOverdraftLimit() {
        return this.OverdraftLimit;
    }
 
    public void setOverdraftLimit(double OverdraftLimit) {
        this.OverdraftLimit = OverdraftLimit;
    }
    CheckAccount()
    {
        super();
        OverdraftLimit = -10;
    }
    CheckAccount(int id,double balance,double over)
    {
        super(id,balance);
        OverdraftLimit = over;
    }
    public void withdraw(double amount)
    {
        if(getBalance() - amount < OverdraftLimit)
        {
            System.out.println("Overdraft Limit warning..!! \n You Cannot withdraw Money");
        }
        else
        {
            amount = getBalance() - amount;
            setBalance(amount);
        }
    }
    public String toString()
    {
        return (super.toString() + "\nOverDraft Limit:- " + getOverdraftLimit());
    }
}
class SavingAccount extends Account{
 
    public SavingAccount() {
        super();
    }
 
    
    public SavingAccount(int id, double balance) {
        super(id, balance);
    }
 
    public void Withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else{
            System.out.println("Error! Savings account overdrawn transtaction rejected");
        }
    
    }
}
public class TestAccount_Main {
    public static void main(String[] args) {
    Account a =new Account(1,50000);
    SavingAccount s = new SavingAccount(1,50000);
    CheckAccount c = new CheckAccount(1,50000,10000);
 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount you want to Withdraw:-");
    double amount = sc.nextDouble();
 
    c.withdraw(amount);
    System.out.println(c.toString());
    a.withdraw(amount);
    System.out.println(a.toString());
    s.Withdraw(amount);
    System.out.println(s.toString());
System.out.println("21CE008");
 
    }
    
}
