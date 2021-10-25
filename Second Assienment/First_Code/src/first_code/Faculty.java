
package first_code;
public class Faculty extends Employee{
    public double officeHours;
    public int rank;
    public Faculty(String name, String address, String email, String phone, String office, double salary, MyDate dateHired , double officeHours , int rank) {
        super(name, address, email, phone, office, salary, dateHired);
        this.rank=rank;
        this.officeHours=officeHours;
    }
     @Override
    public String toString()
    {
        System.out.println("In Faculty class\nThe Name :"+name+"\nAddress : "+address+"\nEmail : "+email+"\nPhone : "+phone+"\nOffice :" +office
                +"\nSalary : "+salary+"\nDate Hired : "+dateHired.day+" / "+dateHired.month+" / "+dateHired.year+"\nThe rank : "+rank+"\nOffice Hours"+officeHours+"\n================");
        return "";
    }
}
