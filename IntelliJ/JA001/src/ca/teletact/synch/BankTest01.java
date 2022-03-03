package ca.teletact.synch;

public class BankTest01 {

    public static void main(String[] args){
        Bank bk = new Bank(100, 1000);

        bk.transfer(5, 3, 200);

    }
}
