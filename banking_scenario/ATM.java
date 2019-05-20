package banking_scenario;

public class ATM {
    public static Bank myBank = Bank.accessBank();

    public static void main(String[] args) {
        myBank.openAccount();
        myBank.openAccount();

    }
}