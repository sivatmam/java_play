package ca.teletact.synch;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    double accounts[];
    int number;
    private Lock bankLock;
    private Condition sufficientFunds;

    public Bank(int number, double initialbalance){
        this.number = number;
        accounts = new double[this.number];
        Arrays.fill(accounts, initialbalance);
        this.bankLock = new ReentrantLock();
        this.sufficientFunds = bankLock.newCondition();

    }

    public void transfer(int from, int to, double amount){
        // Caution: unsafe when called from multiple threads
        bankLock.lock();
        try {
            System.out.print(Thread.currentThread());
            //while(this.accounts[from] < amount)
            //    this.sufficientFunds.await();
            this.accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            this.accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
            //this.sufficientFunds.signalAll();
        }
        //catch (InterruptedException ex){}
        finally{
            bankLock.unlock();
        }
    }

    public double getTotalBalance(){
        double total=0d;
        for(int i = 0; i < this.number; i++)
            total += this.accounts[i];
        return total;
    }

    public int size() {return accounts.length;}

}
