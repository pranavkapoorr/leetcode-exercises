package banking_scenario;

public class ATM {
    public static Bank atm = Bank.accessBank();

    public static void main(String[] args) {
        long account1 = atm.openAccount();
        atm.depositFunds(account1, 200);
        Thread t1 = new Thread(()->atm.withdrawFunds(account1, 200));
        Thread t2 = new Thread(()->atm.depositFunds(account1, 200));
        Thread t3 = new Thread(()->atm.withdrawFunds(account1, 200));
        Thread t4 = new Thread(()->atm.withdrawFunds(account1, 200));
        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}