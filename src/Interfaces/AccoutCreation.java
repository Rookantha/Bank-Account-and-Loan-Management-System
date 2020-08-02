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
public class AccoutCreation 
{
        private int Accnumber;
        private String Acctype; 
        private String bank;
        private String NIC;
        private String Fname;
        private String Lname;
        private String address;
        private String question;
        private String answer;
        private String DOB;
        private String mobile;
    
    public int getAccountNumber()
    {
        return Accnumber;
    }
    public String getAccountType()
    {
        return Acctype;
    }
    public String getbank()
    {
        return bank;
    }
    public String getNIC()
    {
        return NIC;
    }
    public String getFirstname()
    {
        return Fname;
    }
    public String getLastname()
    {
        return Lname;
    }
    public String getAddress()
    {
        return address;
    }
    public String getQuestion()
    {
        return question;
    }
    public String getAnswer()
    {
        return answer;
    }
    public String getDOB()
    {
        return DOB;
    }
    public String getContact()
    {
        return mobile;
    }
    
    //setters
    
    public void setAccountNumber(int newAccnumber)
    {
        Accnumber = newAccnumber;
    }
    public void setAccountType(String newAcctype)
    {
        Acctype = newAcctype;
    }
    public void setbank(String newbank)
    {
        bank = newbank;
    }
    public void setNIC(String newNIC)
    {
        NIC = newNIC;
    }
    public void setFirstname(String newFname)
    {
        Fname = newFname;
    }
    public void setLastname(String newLname)
    {
        Lname = newLname;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public void setQuestion(String newQuestion)
    {
        question = newQuestion;
    }
    public void setAnswer(String newAnswer)
    {
        answer = newAnswer;
    }
    public void setDOB(String newDOB)
    {
        DOB = newDOB;
    }
    public void setContact(String newmobile)
    {
        mobile = newmobile;
    }
    
    
}
