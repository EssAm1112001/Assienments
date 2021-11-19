
package first_program;
public class Doctor implements Staff{
     @Override
    public int getSalary(int salary)
    {
        System.out.println("Your Salary : "+salary);
        return salary;
    }

    @Override
    public int yearsOfWork(int years) 
    {
        System.out.println("Number years of work in medicine: "+years);
        return years;
    }
}
