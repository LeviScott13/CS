//**********************************************************************
//    Purpose:    Using methods to make bank accounts
//
//    Input:      none
//    Output:     Default Account, Account1, and Account2 information 
//    Author:     Levi Sutton
//    Date:       2/24/2017
//    Class:      CS1301 (Section B)
//    Program:    #6 (MyAccount.java)
//**********************************************************************

import java.text.DecimalFormat;
import java.util.Date;

public class MyAccount{
   private String name;
   private long accountNumber;
   private double originalBalance;
   private double currentBalance;
   private double totalDeposits;
   private double totalWithdrawals;
   private Date dateCreated;
   
   //-----------------------------------------------------------------
   // MyAccount:  Method containing default values 
   //-----------------------------------------------------------------
   public MyAccount()
   {
      name = "Unknown";
      accountNumber = 99999;
      originalBalance = 0;
      currentBalance = 0;
      totalDeposits = 0;
      totalWithdrawals = 0;
      dateCreated = new Date();
   }

   //-----------------------------------------------------------------
   // MyAccount:  Method containing values from a new object created
   //             in the tester. Name, accountNumeber, and originalBalance
   //             are changed to get values from the local variables not 
   //             from the global values
   //-----------------------------------------------------------------
   public MyAccount(String name, long account, double balance)
   {
      this.name = name;
      accountNumber = account;
      originalBalance = balance;
      this.dateCreated = new Date();
   }

   //-----------------------------------------------------------------
   //getName:  returns name from the new object (Account1)
   //-----------------------------------------------------------------
   public String getName()
   {
      return name; 
   }
   
   //-----------------------------------------------------------------
   //getAccountNumber:  returns account number from the new object (Account1)
   //-----------------------------------------------------------------
   public long getAccountNumber()
   {
      return accountNumber;
   }

   //-----------------------------------------------------------------
   //getBalance: Returns the current balance of the account (Account1)
   //-----------------------------------------------------------------
   public double getBalance()
   {
      currentBalance = originalBalance + totalDeposits - totalWithdrawals;   
      return currentBalance;
   }

   //-----------------------------------------------------------------
   // setName: Updates name from new object (Account2)
   //-----------------------------------------------------------------
   public void setName(String newName)
   {
      name = newName;
   
   }

   //-----------------------------------------------------------------
   // setAccountNumber: Updates account number from new object (Account2
   //-----------------------------------------------------------------
   public void setAccountNumber(long newAccountNumber)
   {
      accountNumber = newAccountNumber;
   
   }

   //-----------------------------------------------------------------
   //deposit: Deposits the specified amount into the account from the 
   //         objects (Account1, Account2). Returns the
   //         new balance.
   //-----------------------------------------------------------------
   public double deposit(double amount)
   {
      totalDeposits += amount;
      return totalDeposits;  
   }

   //-----------------------------------------------------------------
   // withdra: Withdraws the specified amount from the objecta 
   //          (Account1, Account2) and returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw(double amount)
   {  
      totalWithdrawals += amount;
      return totalWithdrawals; 
   }

   
   //-----------------------------------------------------------------
   //toString: Returns a one-line description of the objects 
   //          (Account1,Account2) as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("$###,##0.00");

                    
      return "\nName:             \t" + getName() +
             "\nAccount Number:   \t" + getAccountNumber() +
             "\nOriginal Balance: \t" + fmt.format(originalBalance) +
             "\nTotal Deposits:   \t" + fmt.format(totalDeposits) +
             "\nTotal Withdrawls: \t" + fmt.format(totalWithdrawals) +
             "\nCurrent Balance:  \t" + fmt.format(getBalance()) +
             "\nDate Created:     \t" + dateCreated;
   }
}
