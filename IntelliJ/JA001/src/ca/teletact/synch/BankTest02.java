package ca.teletact.synch;

public class BankTest02 implements Runnable{

    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;
    public static Bank bank;

    public static void main(String[] args) {
        bank = new Bank(NACCOUNTS, INITIAL_BALANCE);

        for (int i = 0; i < NACCOUNTS; i++) {
            var bt = new BankTest02();
            var t = new Thread(bt);
            t.start();
        }

    }

    @Override
    public void run() {
        try {

            for (int i = 0; i < NACCOUNTS; i++) {
                int fromAccount = i;

                int toAccount = (int) (bank.size() * Math.random());
                double amount = MAX_AMOUNT * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (DELAY * Math.random()));

            }
        }
        catch(InterruptedException ex){}
    }
}
