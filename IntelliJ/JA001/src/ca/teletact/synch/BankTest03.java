package ca.teletact.synch;

public class BankTest03 {

    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;
    public static Bank bank;

    public static void main(String[] args) {
        bank = new Bank(NACCOUNTS, INITIAL_BALANCE);

        Runnable r = () -> {
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
        };

        for (int i = 0; i < NACCOUNTS; i++) {
            var t = new Thread(r);
            t.start();
        }

//        for(int i=0; i<NACCOUNTS; i++){
//            System.out.printf("account["+i+"]:%10.2f\n"+bank.accounts[i]);
//        }

    }


}
