import java.util.*;
/**
 * Write a description of class Tester2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester2
{
    public static void main(String[] args)
     {
      Bank b = new Bank("Bank of OSSM", 2);
      
      BankAccount[] accounts = new BankAccount[1];
      accounts = b.getAccounts().toArray(accounts);
      
      // sort using AArrays.sort and our comparator 
      AccountNumComarator anc = new AccountNumComarator();
      
      
      Arrays.sort(accounts, anc);
      
      for( int i = 0; i < accounts.length; i++)
      {
        System.out.println();  
        }
    }
    
}
