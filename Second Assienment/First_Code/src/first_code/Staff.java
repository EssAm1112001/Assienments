
package first_code;
public class Staff extends Employee{
    public String title;
    public Staff(String name, String address, String email, String phone, String office, double salary, MyDate dateHired , String title) {
        super(name, address, email, phone, office, salary, dateHired);
        this.title=title;
    }
     @Override
    public String toString()
    {
        System.out.println("In Employee class\nThe Name :"+name+"\nAddress : "+address+"\nEmail : "+email+"\nPhone : "+phone+"\nOffice :" +office
                +"\nSalary : "+salary+"\nDate Hired : "+dateHired.day+" / "+dateHired.month+" / "+dateHired.year+"\nThe staff title is : "+title+"\n=================");
        return "";
    }
}
