
package program_2;

import java.time.Instant;
import java.util.Date;

public class Program_2 {
    public static void main(String[] args) {
        Account a = new Account();
        a.print();
        /////////////////
        Account a2 = new Account(1122 , 20000);
        a2.setAnnualInterestRate(4.5);
        a2.withdraw(2500);
        a2.setDateCreated(Date.from(Instant.now()));
        a2.print();
        a2.deposit(3000);
        a2.getMonthlyInterestRate();
        a2.setDateCreated(Date.from(Instant.now()));
        a2.print();
    }
    
}
