/*
 * 8. Create a program that simulates a banking application where updates on the account balance can happen 
 * simultaneously
*/
class Bank
{
    // Static member
    static double balance = 10000;

    // Synchronized methods
    static synchronized public void deposit(double amount)
    {
        balance += amount;
        System.out.println(amount + " Rs deposited in your account");
        System.out.println("Total balance : " + balance);
    }

    static synchronized  public void Withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient balance");
            System.out.println("Total balance : " + balance);
        }
        else{
            balance -= amount;
            System.out.println("Withdrawal amount " + amount);
            System.out.println("Total balance : " + balance);
        }
    }
}

class Deposit extends Thread
{
    // Instance Variables
    Bank b;
    double amount;

    // Parameterized Constructor
    Deposit(Bank obj, double amount)
    {
        this.b = obj;
        this.amount = amount;
    }

    // Override run method of Thread Class
    public void run()
    {
        b.deposit(amount);
    }
}

class Withdraw extends Thread
{
    // Instance Variables
    Bank b;
    double amount;

    // Parameterized Constructor
    Withdraw(Bank obj, double amount)
    {
        this.b = obj;
        this.amount = amount;
    }

    // Override run method of Thread Class
    public void run()
    {
        b.Withdraw(amount);   
    }
}

public class Banking
{
    // Main method
    public static void main(String[] args) {
        System.out.println("Initial bank balance : "+ Bank.balance);

        // Create an object of Bank Class
        Bank b = new Bank();

        // Create threads
        Deposit d1 = new Deposit(b, 1000); 
        Withdraw w1 = new Withdraw(b, 2000);
        Deposit d2 = new Deposit(b, 3000);
        Withdraw w2 = new Withdraw(b, 4000);

        // start all the threads
        w2.start();
        d1.start();
        w1.start();
        d2.start();
        
    }
}