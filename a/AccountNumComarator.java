import java.util.*;
/**
 * Write a description of class AccountNumComarator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccountNumComarator implements Comparator<BankAccount>
{
    public int compare( BankAccount b1, BankAccount b2)
     {
      return b1.getAccountNumber() - b2.getAccountNumber();
    }

}
