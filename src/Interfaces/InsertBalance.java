/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author isuru
 */
public class InsertBalance 
{
    private int AccountNumber;
    private double balance;
    private double Balance = 1500.0;
    public int getAccountNumber()
    {
        return AccountNumber;
    }
    public double getBalance()
    {
        return Balance;
    }
    public void setAccount(int acc)
    {
        AccountNumber = acc;
    }
    public void setBalance()
    {
        Balance = balance;
    }
}
