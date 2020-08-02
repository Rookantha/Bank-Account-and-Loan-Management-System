
package Code;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



    public class DbConnection 
    {
        
    public static Connection connect() 
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb?zeroDateTimeBehavior=convertToNull","root",""); 

        }
        catch(Exception e)
        {
            System.out.println(e);
        }   
        return conn;
    }
   
    
    public static void upBalance(int Accnumber,double balance)
    {
        try
        {
            java.sql.Connection con = connect();
            PreparedStatement ps = con.prepareStatement("update accountbalance SET Balance ='"+balance+"'where AccountNumber=?");
            ps.setInt(1,Accnumber);
            ps.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Transaction Completed Sucessfully...!");
        }
    }
    
    public static boolean checkAccount(int numAcc)
    {
        java.sql.Connection con = null;
        PreparedStatement pst= null;
        ResultSet rs = null;
        
        try
        {
        String sql="select * from account where AccountNumber=?";
        con = DbConnection.connect();
        pst=con.prepareStatement(sql);
        pst.setInt(1,numAcc);
        rs=pst.executeQuery();
        
        if(rs.next())
        {
            return true;     
        }
        }    
        catch(Exception e)
        {
            
        }
        return false;
    }
    
    public static void createAccount(int Accnumber, String Acctype, String bank ,String NIC, String Fname, String Lname,String address , String question, String answer, String DOB, String mobile)
        {
        try 
        {
            java.sql.Connection con = connect();
            PreparedStatement ps = con.prepareStatement("insert into account (AccountNumber,AccountType,Bank,NIC,FirstName,LastName,Address,Question,Answer,DOB,Phone) values ('"+Accnumber+"','" +Acctype+"','"+bank+"','"+NIC+"','"+Fname+"','"+Lname+"','"+address+"','"+question+"','"+answer+"','"+DOB+"','"+mobile+"')");
            ps.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
        }
        
    public static boolean checkLoan(int numLoan)
    {
        java.sql.Connection con = null;
        PreparedStatement pst= null;
        ResultSet rs = null;
         try
        {
        String sql="select * from loan where LoanNumber=?" ;
        con = DbConnection.connect();
        pst=con.prepareStatement(sql);
        pst.setInt(1,numLoan);
        rs=pst.executeQuery();
        
        if(rs.next())
        {
            return true;     
        }
        }    
        catch(Exception e)
        {
            
        }
        return false;
    }
    
    public static void createLoan(int accNumber,int loanNumber, String loanType, double amount,float interestRate,int instalment)
    {
        try {
            java.sql.Connection con = connect();
            PreparedStatement ps = con.prepareStatement("insert into loan (AccountNumber,LoanNumber, LoanType, Amount,IntrestRate,Installment) values ('"+ accNumber+ "','"+ loanNumber+ "','"+ loanType +"','"+ amount+"', '"+ interestRate+"','"+instalment +"')");
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public static void newUser(String Username,String Password)
    {
        try 
        {
            java.sql.Connection con = connect();
            PreparedStatement ps = con.prepareStatement("insert into user (Username,Password) values ('"+Username+"','" +Password+"')");
            ps.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }
    public static boolean userCreate(String username,String password) throws Exception 
    {
        java.sql.Connection con = null;
        PreparedStatement pst= null;
        ResultSet rs = null;
        
        try
    {
            con = DbConnection.connect();
            String sql="select UserName,Password from user WHERE UserName=? and Password=?" ;
            pst=con.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,password);
            rs=pst.executeQuery();
            if(rs.next())
            {
                 return true;
            }
    }
    catch(Exception e)
        {

        }
        return false;
    } 
     
    
    public static boolean manager(String username,String password) throws Exception 
    {
        java.sql.Connection con = null;
        PreparedStatement pst= null;
        ResultSet rs = null;
        
        try
    {
            con = DbConnection.connect();
            String sql="select UserName,Password from managerlogin WHERE UserName=? and Password=?" ;
            pst=con.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,password);
            rs=pst.executeQuery();
            if(rs.next())
            {
                 return true;
            }
    }
    catch(Exception e)
        {

        }
        return false;
    } 
    
    
    public static void createBalance(int Accnumber,double balance)
        {
        try 
        {
            java.sql.Connection con = connect();
            PreparedStatement ps = con.prepareStatement("insert into accountbalance (AccountNumber,Balance) values ('"+Accnumber+"','"+balance+"')");
            ps.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
        }
    
     public static void transaction(int number,String type,String depositePlace,double amount,String NIC,String tele) throws Exception {
        
        try
        {
            java.sql.Connection con = connect();
            
            PreparedStatement ps = con.prepareStatement("insert into transactions (AccountNumber,TransactionType,TransactionBank,TransactionAmount,TransactionNIC,TransactionContact)VALUES('"+ number+ "','"+ type +"','"+ depositePlace+"','"+ amount+"','"+ NIC+"','"+ tele+"')");
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Transaction Completed Sucessfully...!");
        }
    
    }
    }
    
    

    
   
    
       

         
