
package first_program;

import java.util.Scanner;

public class First_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your job : ");
        String job =input.nextLine();
        System.out.print("Enter Number of years in work : ");
        int year =input.nextInt();
        System.out.print("Enter Your Salary : ");
        int salary =input.nextInt();
        memberFactory m = new memberFactory();
        Staff s = m.member(job);
        s.yearsOfWork(year);
        s.getSalary(salary);
    }
    
}
