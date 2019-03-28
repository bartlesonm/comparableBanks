import java.util.*;
import java.io.*;
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
    private String bankName;
    private int numEmployees;
    private ArrayList<BankAccount> accounts;


    public Bank( String name, int emp )
    {
        bankName = name;
        numEmployees = emp;
        accounts = new ArrayList<BankAccount>();

    }

    public String getName()
    {
        return bankName;
    }

    public int getNumberOfEmployees()
    {
        return numEmployees;
    }

    public ArrayList<BankAccount> getAccounts()
    {
        return accounts;
    }

    public void addAccount( BankAccount b )
    {
        accounts.add(b);
    }

    public String toString()
    {
        String s = "";

        s += "BankName=" + bankName + "\n";
        s += "NumberOfEmployees=" + numEmployees + "\n";

        for( BankAccount ba : accounts )
        {
            if(ba instanceof SavingsAccount)
            {
                s += "SavingsAccount=" + ba.getName() + "\n";
                s += "AccountNumber=" + ba.getAccountNumber() + "\n";
                s+= "Balance=" + ba.getBalance() + "\n";
                s += "Rate=" + ((SavingsAccount) ba).getRate()  + "\n";
            }
            else 
            {
                s += "SavingsAccount=" + ba.getName() + "\n";
                s += "AccountNumber=" + ba.getAccountNumber() + "\n";
                s+= "Balance=" + ba.getBalance() + "\n";

            }
           
        }
        return s.trim();
    }
    
        public void updateAccounts(BankAccount[] arrr)
    {
      accounts = new ArrayList<BankAccount>();
      for(int i =0; i < arrr.length; i++)
      {
        accounts.add(arrr[i]);  
        }
    }
    
    
    
}
