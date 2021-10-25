
package first_code;
public class Employee extends Person{
    public String office;
    public double salary;
    public MyDate dateHired;

    public Employee(String name, String address, String email, String phone , String office , double salary , MyDate dateHired) {
        super(name, address, email, phone);
        this.office=office;
        this.dateHired=dateHired;
        this.salary=salary;
    }
    @Override
    public String toString()
    {
        System.out.println("In Employee class\nThe Name :"+name+"\nAddress : "+address+"\nEmail : "+email+"\nPhone : "+phone+"\nOffice :" +office
                +"\nSalary : "+salary+"\nDate Hired : "+dateHired.day+" / "+dateHired.month+" / "+dateHired.year+"\n===============");
        return "";
    }
}
