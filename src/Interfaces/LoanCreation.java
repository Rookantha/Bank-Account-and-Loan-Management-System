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

public class LoanCreation 
{
    private int LoanNumber;
    private int AccountNumber;
    private String AccountType;
    private Double Amount;
    private Float IntrestRate;
    private int Installment;
    
    //getters
    public int getLoanNumber()
    {
        return LoanNumber;
    }
    public int getAccountNumber()
    {
        return AccountNumber;
    }
    public String getAccountType()
    {
        return AccountType;
    }
    public Double getAmount()
    {
        return Amount;
    }
    public Float getIntrestRate()
    {
        return IntrestRate;
    }
    public int getInstallment()
    {
        return Installment;
    }
    
    //setters
    public void setLoanNumber(int Loan)
    {
        LoanNumber = Loan; 
    }
    public void setAccountNumber(int Account)
    {
        AccountNumber = Account;
    }
    public void setAccountType(String Type)
    {
        AccountType = Type;
    }
    public void setAmount(double Value)
    {
        Amount = Value;
    }
    public void setIntrestRate(float Rate)
    {
        IntrestRate = Rate;
    }
    public void setInstallment(int Install)
    {
        Installment = Install;
    }
    
}
