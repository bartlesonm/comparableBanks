import java.util.*;
import java.io.*;

/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester 
{
    public static void main(String[] args)throws IOException
    {

        String arr[] = ReadFromFile.ReadFile("G:/temp_nerd/Bank of OSSM.txt");
        Bank a = new Bank("Bank of OSSM" ,2);
        FileWriter fw = new FileWriter("G:/temp_nerd/Bank of OSSM.out");
        PrintWriter pw = new PrintWriter(fw);
        for(int i = 0; arr.length; i++)
        {
            String s = arr[i];
            if(arr.contains("SavingsAccount"))
            {
                String name = s.substring(15);
                String accountnum = arr[i + 1].substring(14);
                int p = Integer.parseInt(accountnum);
                String balan = arr[i + 2].substring(8);
                double hi = Double.parseDouble(balan);
                String rat = arr[i + 3].substring(5);
                double bern = Double.parseDouble(rat);
                SavingsAccount c = new SavingsAccount(name, hi , bern, p );
                a.add(c);
            }
            else if ( arr.contians("BankAccount"))
            {
                String name = s.substring(12);
                String accountnum = arr[i + 1].substring(14);
                int p = Integer.parseInt(accountnum);
                String balan = arr[i + 2].substring(8);
                double hi = Double.parseDouble(balan);
                BankAccount b = new BankAccount(name, hi , p);
                a.add(b);
            }
        }




        while(true)
        {

            System.out.println("would you like to add an account.");
            Scanner scan = new Scanner(System.in);
            String ugh = scan.nextLine();

            if(ug.equalsIgnoreCase("yes") )
            {
                System.out.println("Will the account be a savings account or a bank account.");
                Scanner scanner = new Scanner(System.in);
                String howdy = scanner.nextLine();

                System.out.println(" Please enter your name");
                Scanner scann = new Scanner(System.in);
                String buzzlighter = scann.nextLine();

                System.out.println("Hello " + scan + " , Please enter your initial deposit");
                Scanner scanne = new Scanner(System.in);
                String woody = scanne.nextLine();
                if(woody.equalsIgnoreCase("Savings Account") )
                {

                    System.out.println("What is the rate.");
                    Scanner scanner1 = new Scanner(System.in);
                    String wheezy = scanner1.nextLine();
                    SavingsAccount gah = new SavingsAccount(howdy,buzzlighter, woody, wheezy);
                    gah.add();
                }
                else 
                {
                    BankAccount gahh = new BankAccount(howdy,buzzlighter, woody);    
                    gahh.add();   
                }
            }

            else
            { 
                break;
            }

        }

        System.out.println("Which way would you like to sort the accounts");

        System.out.println("A. Ascending sort by account number");
        System.out.println("B. Ascending sort by account name");
        System.out.println("C. Sort by account type");
        Scanner scan1 = new Scanner(System.in);

        String ren = scan1.next();
        BankAccount[] pot = new BankAccount[1];

        pot = a.getAccounts().toArray(pot);

        switch(Integer.parseInt(ren)){

            case 1: AccountNumComarator ac = new AccountNumComarator();
            Arrays.sort(pot, ac);
            break;

            case 2: AccountNameComparator acb = new AccountNameComparator();
            Arrays.sort(pot ,acb);
            break;

            case 3: AccountTypeComparator abc = new AccountTypeComparator();
            Arrays.sort(pot, abc);
            break;
        }

        
        a.updateAccounts(arr);

        fw.close();
        pw.close();
    }
}
