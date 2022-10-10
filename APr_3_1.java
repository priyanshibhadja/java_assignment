 
import java.util.*;
public class APr_3_1
{
    public static void main(String[]args)
    {
        Arraylist<AC>l=new Arraylist<>();
        for(int i=0;i<10;i++)
        {
            l.add(new AC(AC.ID));
            AC.ID++;
        }
        int n;
        final boolean i=true;
        Scanner sc=new Scanner(System.in);
        while(i)
        {
            System.out.println("Enter your ID in digit:");
            n=sc.nextInt();
            if(n>(AC.ID-1) || n==0)
            {
                System.out.println("incoorect ID");
                continue;
            }
            else
            {
                AC b=l.get(--n);
                System.out.println("Enter your choice");
                int choice =sc.nextInt();
                switch(choice)
                {
                    case 1:
                    b.balanceInquiry();
                    break;

                    case 2:
                    System.out.println("Enetr the amount you withdrw:");
                    double money=sc.nextDouble();
                    b.withdrawMoney(money);
                    break;

                    case 3:
                    b.deposit();
                    break;

                    case 99:
                    System.exit(0);

                    default:
                    System.out.println("invalid input");
                }
            }
        }
}
class AC
{
    static int ID=1;//will have total number of Accounts
    int id;//will store ID of particular / indivudual Account.
 
    AC(int id)
    {
        this.id = id;
        //Constuctor For assigning id to each Account when they are created.
        //pass the static ID as an argument so that it can Assign the ids to Accounts in Ascending order.
        //suppose for the first Account ID will be 1 then rest will be Assigned as 2,3,4,5....
    }

    //gettes and setters for id and balance
    public int getId() {
        return this.id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public double balance=100;//initial balance 100
 
    public double getBalance() {
        return this.balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void printID() {
        System.out.printf("Your Account ID is :-  "+"AC"+"%03d\n",ID);
        //this will print the account numbers in the format AC001....AC010 when invoked
        //for id=1 --> %3d will left 2 spaces and print 1 at the end and %03d will fill those blank spaces with 0
        ID++;
    }
    
    public void balanceInquiry()
    {
        System.out.println("Balance of account id "+id+" is:- "+balance);
    }
    public void withdrawMoney(double money)
    {
        if(money>balance)
        {
            //for overwithdraw limit
            System.out.println("Not sufficient Balance");
        }
        else if(balance<=300)
        {
            //for maintaining minimum balance
            System.out.println("Soryy..You can not Withdraw money.. \n Maintain Proper Balance");
        }
        else
        {
            System.out.println("You have withdrawn "+money+" Rupees");
            balance = balance - money;
            System.out.println("Now you have "+balance+"  balance left");
        }
    }
    public void deposit()
    {
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount you want to deposit:-"); 
        money = sc.nextDouble();
        balance = balance + money;
        System.out.println("Your balance is:-"+balance);
        
    }
    public void moneyTransfer(ArrayList<AC> l)
    {
        //here money will be transferred to one account to another so pass whole arraylist as argument so it can get both the required ids...one for taking money and one for transferring money.
        double money;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("To  which account number do you want to transfer money?");
        id = sc.nextInt();
        System.out.println("Enter the amount of money you want to transfer to id "+id);
        money = sc.nextDouble();
        AC a = l.get(--id);
        if(money>=this.balance)
        {
            System.out.println("Can't Transfer Money \n Insufficient Balance...");
        }
        else if(this.balance<=300)
        {
            System.out.println("Soryy..You can not transfer money.. \n Maintain Proper Balance");
        }
        else
        {
        a.balance = a.balance + money;
        this.balance = this.balance - money;
        System.out.println(money+" Money has been Transfered from ID "+this.id+" to ID "+a.id);
        System.out.println("Remaining balance in ID "+this.id+" is "+this.balance+" Doller");
        System.out.println("\n Balance in ID "+a.id+" is "+a.balance);
        }
        
    }
    public void createAccount(ArrayList<AC> a)
    {
        //new account will be added in the Arraylist so pass it as the argument and add new object of AC class using add function.
        a.add(new AC(ID));
        AC.printID();
    }
    public void Deactivate(ArrayList<AC> a,int ID)
    {
        a.remove(--ID);//suppose for removing 10th ID ..it will be at 9th index --> --ID
        AC.ID--; // bcoz After removing we will have only 9 accounts left
    }


}
}