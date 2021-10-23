
package program_2;

import java.util.Date;

public class Account {
   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated ;
   Account()
   {
       id = 0 ;
       balance = 0.0 ;
       annualInterestRate = 0.0 ;
   }
   Account(int id , double balance)
   {
       this.id = id;
       this.balance = balance;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   public double getAnnualInterestRate()
   {
       return annualInterestRate;
   }
   public void setAnnualInterestRate(double annualInterestRate)
   {
       this.annualInterestRate = annualInterestRate;
   }
   public void setDateCreated(Date dateCreated)
   {
       this.dateCreated = dateCreated;
   }
   public double getMonthlyInterestRate()
   {
       double newBalance = (annualInterestRate / 12);
       return newBalance ;
   }
   public void withdraw(double price)
   {
       if(price<balance)
       {
        balance = balance - price;
        System.out.println("New Balance after withdraw : " + balance);
       }
   }
   public void deposit (double price)
   {
       balance = balance + price;
       System.out.println("New Balance after deposit : " + balance);
   }
   public void print()
   {
       System.out.println("ID : " + id + "\nBalance : " + balance + "\nAnnual Interest Rate : " + annualInterestRate
       + "\nDate of creation : " + dateCreated + "\nThe Monthly Rate : " + getMonthlyInterestRate());
       System.out.println("=====================");
   }
}
