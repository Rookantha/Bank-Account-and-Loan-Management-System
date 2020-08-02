// Encapulation
package plybank;

public class Account {
    
    private int balance,accNo;
    private double interstRate;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    // private String name,lName;
    public void setInterstRate(double interstRate) {
        this.interstRate = interstRate;
    }
    

    public int getBalance() {
        return balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getInterstRate() {
        return interstRate;
    }
    
}