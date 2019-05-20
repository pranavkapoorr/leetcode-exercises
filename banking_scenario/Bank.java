package banking_scenario;

import java.util.HashMap;
import java.util.Random;

public class Bank {
    private static Bank singletonBank;
    private HashMap<Long,Long> accounts;
    
    private Bank(){
        this.accounts = new HashMap<>();
    }

    public void openAccount(){
        long accountNum = new Random().nextLong();
        accounts.put(accountNum, 0L);
        System.out.println("New Account opened with account number: " + accountNum + " and balance 0!");
    }

    public void depositFunds(long accountNumber, long amount) {
        if(accounts.containsKey(accountNumber)){
            long currAmount = accounts.get(accountNumber);
            currAmount += amount;
            accounts.replace(accountNumber, currAmount);
            System.out.println("New Balance is : " + currAmount);
        }else{
            System.out.println("Requested Account doesn't exist!");
        }
        
    }

    public void withdrawFunds(long accountNumber, long amount) {
        if(accounts.containsKey(accountNumber)){
            long currAmount = accounts.get(accountNumber);
            if((currAmount - amount) > 0){
                currAmount -= amount;
                accounts.replace(accountNumber, currAmount);
                System.out.println("New Balance is : " + currAmount);
            }else{
                System.out.println("Transaction Failed due to insufficient funds!");
            }
            
        }else{
            System.out.println("Requested Account doesn't exist!");
        }
    }
    public void closeAccount(long accountNum){
        accounts.remove(accountNum);
        System.out.println("Account closed: " + accountNum + " !");
    }

    public static Bank accessBank(){
        if(singletonBank == null){
            singletonBank = new Bank();
        }
        return singletonBank;
    }
}